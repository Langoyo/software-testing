// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement.IO;

import java.util.HashMap;

import javax.json.JsonObject;

import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

public class TokenParser extends JSONParser implements ITokenManagementParser {
	
	public static final String REQUEST_DATE = "Request Date";
	public static final String NOTIFICATION_E_MAIL = "Notification e-mail";
	public static final String TOKEN_REQUEST = "Token Request";
	private static final String ERROR_INVALID_INPUT_DATA_IN_JSON_STRUCTURE = "Error: invalid input data in JSON structure.";
	

	/**
	 *	Method to parse a Token
	 */
	public HashMap<String, String> Parse (String FileName) throws TokenManagementException
	{
		JsonObject myJSON = (JsonObject) super.Parse(FileName);
		HashMap<String, String> items = new HashMap<String, String>();
		
		try {	
			items.put(TOKEN_REQUEST, myJSON.getString(TOKEN_REQUEST));
			items.put(NOTIFICATION_E_MAIL, myJSON.getString(NOTIFICATION_E_MAIL));
			items.put(REQUEST_DATE, myJSON.getString(REQUEST_DATE));			
		} catch (Exception pe) {
			throw new TokenManagementException(ERROR_INVALID_INPUT_DATA_IN_JSON_STRUCTURE);
		}
		return items;
	}

}
