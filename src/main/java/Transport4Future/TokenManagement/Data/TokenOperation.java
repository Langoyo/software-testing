// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement.Data;

import java.util.HashMap;

import Transport4Future.TokenManagement.Data.Attributes.TokenValue;
import Transport4Future.TokenManagement.Data.Attributes.TypeOfOperation;
import Transport4Future.TokenManagement.Exceptions.TokenManagementException;
import Transport4Future.TokenManagement.IO.TokenOperationParser;

import Transport4Future.TokenManagement.Store.TokensRequestStore;



public class TokenOperation {
	
	private TokenValue tokenValue;
	private TypeOfOperation operationType;
	/**
	 * 
	 */
	public TokenOperation() {
	}
	
	/**
	 * Parses and store a tokenExecute JSON, checking the validity of the operation
	 * 
	 * @param inputFile
	 * @throws TokenManagementException
	 */
	public TokenOperation(String inputFile) throws TokenManagementException {
		TokenOperationParser parser = new TokenOperationParser();
		HashMap<String, String> items = (HashMap<String, String>) parser.Parse(inputFile);
		this.tokenValue=new TokenValue (items.get(TokenOperationParser.TOKEN_VALUE));
		this.operationType=new TypeOfOperation (items.get(TokenOperationParser.TYPE_OPERATION));
		
		//Get tokenValue decodified
		Token token = new Token();
		token.Decode(this.tokenValue.getValue(), "The token received does not exist or is not valid.");
		token.isValid("The token received does not exist or is not valid.");
		
		//Search for the TokenRequest value
		TokenRequest tokenRequest = findTokenRequest(token);
		
		setExecution(tokenRequest);
		
	}

	/**
	 * Tries to find the corresponding tokenRequest of a Token
	 * 
	 * @param token
	 * @return
	 * @throws TokenManagementException
	 */
	private TokenRequest findTokenRequest(Token token) throws TokenManagementException {
		TokensRequestStore tokenReqStore = TokensRequestStore.getInstance();
		TokenRequest tokenRequest = tokenReqStore.Find(token.getDevice());
		if(tokenRequest == null) {
			throw new TokenManagementException("The token received does not exist or is not valid.");
		}
		return tokenRequest;
	}

	/**
	 * Checks whther the token and token request coincide in the type of device
	 * 
	 * @param tokenRequest
	 * @throws TokenManagementException
	 */
	private void setExecution(TokenRequest tokenRequest) throws TokenManagementException {
		String messageException;
		if(this.operationType.getValue().compareTo("Send Information from Sensor")== 0 &&
				tokenRequest.getTypeOfDevice().compareTo("Sensor")!=0) {
			messageException="The device represented by the token cannot execute the requested operation";
			throw new TokenManagementException(messageException);
		}
		else if(this.operationType.getValue().compareTo("Send Request to Actuator")==0&&
				tokenRequest.getTypeOfDevice().compareTo("Actuator")!=0) {
			messageException="The device represented by the token cannot execute the requested operation";
			throw new TokenManagementException(messageException);	
		}
	}

	
	
	
	
	
	

	

	
}
