// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement.Data;


import java.util.HashMap;

import Transport4Future.TokenManagement.Data.Attributes.EMail;
import Transport4Future.TokenManagement.Data.Attributes.Reason;
import Transport4Future.TokenManagement.Data.Attributes.TokenValue;
import Transport4Future.TokenManagement.Data.Attributes.TypeOfRevocation;
import Transport4Future.TokenManagement.Exceptions.TokenManagementException;
import Transport4Future.TokenManagement.IO.TokenRevocationParser;
import Transport4Future.TokenManagement.Store.TokensRevocationStore;
import Transport4Future.TokenManagement.Store.TokensStore;

public class TokenRevoked {
	private TokenValue tokenValue;
	private TypeOfRevocation typeOfRevocation;
	private Reason reason;
	private EMail email;
	
	/**
	 * 
	 */
	public TokenRevoked(){
		
	}
	
	/**
	 * Receives a TokenRevoked JSON, parses it and stores it if possible
	 * 
	 * @param inputFile
	 * @throws TokenManagementException
	 */
	public TokenRevoked(String inputFile) throws TokenManagementException {
		
		TokenRevocationParser myParser = new TokenRevocationParser();
		HashMap<String, String> items = (HashMap<String, String>) myParser.Parse(inputFile); 
		
		this.tokenValue=new TokenValue (items.get(TokenRevocationParser.TOKEN_VALUE));
		this.typeOfRevocation=new TypeOfRevocation (items.get(TokenRevocationParser.TYPE_REVOCATION));
		this.reason=new Reason (items.get(TokenRevocationParser.REASON));
		
		
		TokensStore tokenStore = TokensStore.getInstance();
		Token token=new Token();
		
		String exceptionMessageNotExistence = "The token received does not exist.";
		token.Decode(this.tokenValue.getValue(), exceptionMessageNotExistence);
		
		
		String exceptionMessageExpiredToken = "The token received has expired.";
		
		token.isValid(exceptionMessageExpiredToken);
		checkNotRevoked();
		setEmail(token);
		this.Store();
	}
	
	/**
	 * Stores TokenRevoked
	 * @throws TokenManagementException
	 */
	private void Store() throws TokenManagementException {
		TokensRevocationStore myStore = TokensRevocationStore.getInstance();
		myStore.saveTokenRevoked(this, this.tokenValue.getValue());
	}
	

	

	/**
	 * Checks if the Token is already revoked
	 * @throws TokenManagementException
	 */
	private void checkNotRevoked() throws TokenManagementException {
		String exceptionMessage = "The token was previously revoked by this method";
		TokensRevocationStore revocationStore= TokensRevocationStore.getInstance();
		if(revocationStore.Find(this.tokenValue.getValue())) {
			
			throw new TokenManagementException(exceptionMessage);
		}
	}
	
	/**
	 * @param token
	 * @throws TokenManagementException
	 */
	private void setEmail(Token token) throws TokenManagementException {
		this.email = new EMail(token.getNotificationEmail());
	}
	
	/**
	 * @return TokenRevoked's email
	 */
	public String getEmail() {
		return this.email.getValue();
	}
}
