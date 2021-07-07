// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement.Store;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import Transport4Future.TokenManagement.Data.Token;
import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

public class TokensStore {

	
	private static TokensStore store;
	private List<Token> tokensList;
	
	
	/**
	 * Constructor for TokensStore that loads the store
	 */
	private TokensStore() {
		this.Load();
	}
	
	/**
	 * Method used for the singleton
	 * @return
	 */
	public static TokensStore getInstance () {
		if (store == null) {
			store = new TokensStore();
		}
		return store;
	}
	
	/**
	 *Method used for the singleton when creating another instance
	 */
	@Override
	public TokensStore clone() {
		try {
			throw new CloneNotSupportedException ();
		}
		catch (CloneNotSupportedException ex){
//			System.out.println("Token Store Object cannot be cloned");
		}
		return null;
	}
	
	/**
	 * Method used to load a TokenStore from a path in which there are Tokens
	 */
	private void Load () {
		try
		{
			JsonReader reader = new JsonReader(new FileReader(System.getProperty("user.dir") + "/Store/tokenStore.json"));
			Gson gson = new Gson();
			Token [] myArray = gson.fromJson(reader, Token[].class);
			this.tokensList = new ArrayList<Token>();
			for (Token token: myArray) {
				this.tokensList.add(token);
			}
		}
		catch (Exception ex)
		{		
			this.tokensList = new ArrayList<Token>();
		}	
	}
	
	/**
	 * Method used to add a new Token to the TokenStore
	 * @param newToken
	 * @throws TokenManagementException
	 */
	public void Add (Token newToken) throws TokenManagementException {
		if (Find(newToken.getTokenValue())==null) {
			tokensList.add(newToken);
			this.Save();
		}
	}
	
	/**Method to save the new contents of the TokenStore in the path
	 * @throws TokenManagementException
	 */
	private void Save () throws TokenManagementException {
		Gson gson = new Gson();  
		String jsonString = gson.toJson(this.tokensList);
        FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(System.getProperty("user.dir") + "/Store/tokenStore.json");
	        fileWriter.write(jsonString);
	        fileWriter.close();
		} catch (IOException e) {
			throw new TokenManagementException("Error: Unable to save a new token in the internal licenses store");
		}
	}
	
	/**Method to find a specific Token in the TokenStore
	 * @param tokenToFind
	 * @return
	 */
	public Token Find (String tokenToFind) {
		Token result = null;
	    for (Token token : this.tokensList) {
	        if (token.getTokenValue().equals(tokenToFind)) {
	        	return token;
	        }
	    }
		return result;
	}
}
