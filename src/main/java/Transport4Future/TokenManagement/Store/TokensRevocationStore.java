// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement.Store;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import Transport4Future.TokenManagement.Data.TokenRevoked;
import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

public class TokensRevocationStore {
	
	private static final String STOREPATH = System.getProperty("user.dir") + "/Store/tokenRevocationStore.json";
	
private static TokensRevocationStore store;
	
	/**
	 * Empty constructor for the TokensRevocationStore
	 */
	private TokensRevocationStore() {

	}
	
	/**
	 * Method used for the singleton
	 * @return
	 */
	public static TokensRevocationStore getInstance () {
		if (store == null) {
			store = new TokensRevocationStore();
		}
		return store;
	}
	
	/**
	 *Method to impede the creation of another TokensRevocationStore
	 */
	@Override
	public TokensRevocationStore clone() {
		try {
			throw new CloneNotSupportedException ();
		}
		catch (CloneNotSupportedException ex){
		}
		return null;
	}
	
	/**Method that saves a Token into the TokenRevokedStore
	 * @param req
	 * @param tokenValue
	 * @throws TokenManagementException
	 */
	public void saveTokenRevoked(TokenRevoked req, String tokenValue)
			throws TokenManagementException {
		HashMap<String, TokenRevoked> clonedMap = this.loadTokenRevokedRepository();
		// Guardar el Tokens Requests Store actualizado		
		if (clonedMap==null) {
        	clonedMap = new HashMap<String, TokenRevoked> ();
        	clonedMap.put (tokenValue, req);	        	
        }
        else if (!clonedMap.containsKey(tokenValue)){
        	clonedMap.put (tokenValue, req);
        }
		saveStore(clonedMap);
	}

	/**Method that stores the revokedTokens in the specified path for TokensRevocationStore
	 * @param clonedMap
	 * @throws TokenManagementException
	 */
	private void saveStore(HashMap<String, TokenRevoked> clonedMap) throws TokenManagementException {
		Gson gson = new Gson();
		String jsonString = gson.toJson(clonedMap);
        FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(STOREPATH);
	        fileWriter.write(jsonString);
	        fileWriter.close();
		} catch (IOException e) {
			String exceptionMessage="Error: Unable to save a new token in the internal licenses store";
			throw new TokenManagementException(exceptionMessage);
		}
	}

	/**Method that loooks for a token in the TokensRevocationSotre
	 * @param tokenValue
	 * @return
	 * @throws TokenManagementException
	 */
	public boolean Find (String tokenValue) throws TokenManagementException {
		TokensRevocationStore requestStore = TokensRevocationStore.getInstance();
		HashMap<String, TokenRevoked> clonedMap = requestStore.loadTokenRevokedRepository();
        if (clonedMap==null) {
			return false;	        	
        }
        else if (!clonedMap.containsKey(tokenValue)){
			return false;	        	
        }
        else {
        	return true;
        }
	}
	
	/**
	 * @return
	 */
	private HashMap<String, TokenRevoked> loadTokenRevokedRepository() {
		//Generar un HashMap para guardar los objetos
		//Tengo que cargar el almacen de tokens request en memoria y añadir el nuevo si no existe
		HashMap<String, TokenRevoked> clonedMap = null;
		try {
			Gson gson = new Gson();
			String jsonString;
			
			Object object = gson.fromJson(new FileReader(STOREPATH), Object.class);
			jsonString = gson.toJson(object);	
	        Type type = new TypeToken<HashMap<String, TokenRevoked>>(){}.getType();
	        clonedMap = gson.fromJson(jsonString, type);
		} catch (Exception e) {
			clonedMap=null;
		}
		return clonedMap;
	}
	
}
