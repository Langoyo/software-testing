// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement.Data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;

import Transport4Future.TokenManagement.Data.Attributes.Device;
import Transport4Future.TokenManagement.Data.Attributes.EMail;
import Transport4Future.TokenManagement.Data.Attributes.RequestDate;
import Transport4Future.TokenManagement.Exceptions.TokenManagementException;
import Transport4Future.TokenManagement.IO.TokenParser;
import Transport4Future.TokenManagement.Store.TokensRequestStore;
import Transport4Future.TokenManagement.Store.TokensStore;
import Transport4Future.Utils.SHA256Hasher;

public class Token {
	private String alg;
	private String typ;
	private Device device;
	private RequestDate requestDate;
	private EMail notificationEmail;
	private long iat;
	private long exp;
	private String signature;
	
	
	/**
	 * Parses and store a Token JSON
	 * 
	 * @param FileName
	 * @throws TokenManagementException
	 */
	public Token (String FileName) throws TokenManagementException {
		TokenParser myParser = new TokenParser();
		HashMap<String, String> items = myParser.Parse(FileName);
		this.alg = "HS256";
		this.typ = "PDS";
		this.device = new Device(items.get(TokenParser.TOKEN_REQUEST));
		this.requestDate = new RequestDate(items.get(TokenParser.REQUEST_DATE));
		this.notificationEmail = new EMail(items.get(TokenParser.NOTIFICATION_E_MAIL));
		this.checkTokenRequestEmmision();
		testIATEXP();
		this.signature = this.generateSignature();
		Store();
	}

	/**
	 * 
	 */
	public Token() {

	}

	private void Store() throws TokenManagementException {
		TokensStore myStore = TokensStore.getInstance();
		myStore.Add(this);
	}

	/**
	 * Decodes a tokenValue in base64, searches it and stores it
	 * 
	 * @param TokenStringRepresentation
	 * @return true if it could be found, false if not
	 */
	public boolean Decode (String TokenStringRepresentation) {
		
		TokensStore myStore = TokensStore.getInstance();		
		byte[] bytes  = Base64.getUrlDecoder().decode(TokenStringRepresentation.getBytes());
		String result = new String(bytes);
		
		return saveDecoded(myStore, result);
	}

	/**
	 * Searches and finds a token in the store in the current token
	 * 
	 * @param myStore
	 * @param result
	 * @return
	 */
	private boolean saveDecoded(TokensStore myStore, String result) {
		Token tokenFound = myStore.Find(result);
		
		if (tokenFound != null) {
			this.alg = tokenFound.alg;
			this.typ = tokenFound.typ;
			this.device = tokenFound.device;
			this.requestDate = tokenFound.requestDate;
			this.notificationEmail = tokenFound.notificationEmail;
			this.iat = tokenFound.iat;
			this.exp = tokenFound.exp;
			this.signature = tokenFound.signature;
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	 * 
	 */
	private void testIATEXP() {
		this.iat = 1584523340892l;
		if ((this.device.getValue().startsWith("5"))){
			this.exp = this.iat + 604800000l;
		}
		else {
			this.exp = this.iat + 65604800000l;
		}
	}
	
	/**
	 * Generates a SHA256 hash of the token
	 * 
	 * @return SHA256 hash
	 * @throws TokenManagementException
	 */
	private String generateSignature () throws TokenManagementException {
		SHA256Hasher myHasher = new SHA256Hasher();
		return (myHasher.Hash(this.getHeader() + this.getPayload()));
	}
	
	/**
	 * Checks if there is a tokenRequest for this Token
	 * 
	 * @throws TokenManagementException
	 */
	private void checkTokenRequestEmmision() throws TokenManagementException {
		TokensRequestStore myStore = TokensRequestStore.getInstance(); 
		String messageNotRegistered = "Error: Token Request Not Previously Registered";
		if (myStore.Find(this.getDevice())==null) {
			throw new TokenManagementException(messageNotRegistered);
        }
	}
	
	/**
	 * @return device
	 */
	public String getDevice() {
		return device.getValue();
	}

	/**
	 * @return requestDate
	 */
	public String getRequestDate() {
		return requestDate.getValue();
	}

	/**
	 * @return notificationEmail
	 */
	public String getNotificationEmail() {
		return notificationEmail.getValue();
	}
	
	/**
	 * Checks whether the token is expired or issued
	 * @return true if valid
	 */
	public boolean isValid () {
		if ((this.iat < System.currentTimeMillis()) && (this.exp > System.currentTimeMillis())){
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * Checks whether the token is valid
	 * @param exceptionMessage
	 * @throws TokenManagementException
	 */
	public void isValid(String exceptionMessage) throws TokenManagementException {
		if(!this.isValid()) {
			throw new TokenManagementException(exceptionMessage);
		}
	}
	/**
	 * Decodes a valid
	 * @param tokenValue
	 * @param exceptionMessage
	 * @throws TokenManagementException
	 */
	public void Decode(String tokenValue,String exceptionMessage) throws TokenManagementException {
		if(!this.Decode(tokenValue)) {
			throw new TokenManagementException(exceptionMessage);
		}
	}
	
	/**
	 * 
	 * @return Token's header
	 */
	public String getHeader () {
		return	"Alg=" + this.alg + "\\n Typ=" + this.typ + "\\n";
	}
	
	/**
	 * @return Token's Payload
	 */
	public String getPayload () {
		Date iatDate = new Date(this.iat);
		Date expDate = new Date(this.exp);
		
		String dateFormat = "dd-MM-yyyy HH:mm:ss";
		DateFormat df = new SimpleDateFormat(dateFormat);
		
		return	"Dev=" + this.device.getValue() 
				+ "\\n iat=" + df.format(iatDate)
				+ "\\n exp=" + df.format(expDate);
	}

	/**
	 * @return Token's signature
	 */
	public String getSignature() {
		return this.signature;
	}
	
	/**
	 * @return TokenValue
	 */
	public String getTokenValue() {
		return this.getHeader() + this.getPayload() + this.getSignature();	
	}
	/**
	 * @return TokenValue in base64
	 */
	public String getTokenValueCod(){
		byte[] bytes  = Base64.getUrlEncoder().encode(getTokenValue().getBytes());
		String result = new String(bytes);
		return result;
	}
	
	/**
	 *  sets the signature of the token
	 * @param signature
	 */
	public void setSignature(String value) {
		this.signature = value;
	}
}
