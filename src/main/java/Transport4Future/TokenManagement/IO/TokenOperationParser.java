// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement.IO;

import java.util.HashMap;

import javax.json.JsonObject;

import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

public class TokenOperationParser extends JSONParser implements ITokenManagementParser {

	public static final String TOKEN_VALUE = "Token Value";
	public static final String TYPE_OPERATION = "Type of operation";
	
	
	/**
	 *	Method to parse a TokenOperation
	 */
	public HashMap<String, String> Parse (String FileName) throws TokenManagementException{
		HashMap<String, String> items = new HashMap<String, String>();
		
		
		try {
			JsonObject jsonObject = (JsonObject) super.Parse(FileName);
			items.put(TOKEN_VALUE, jsonObject.getString(TOKEN_VALUE));
			items.put(TYPE_OPERATION, jsonObject.getString(TYPE_OPERATION));
		} catch (Exception pe) {
			throw new TokenManagementException("The input file has any problem related to its format or to its access.");
		}
		return items;
	}
	
}
