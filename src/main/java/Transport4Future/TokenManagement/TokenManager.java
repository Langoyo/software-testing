// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement;

import Transport4Future.TokenManagement.Data.Token;
import Transport4Future.TokenManagement.Data.TokenOperation;
import Transport4Future.TokenManagement.Data.TokenRequest;
import Transport4Future.TokenManagement.Data.TokenRevoked;
import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

public class TokenManager implements ITokenManagement {
	
	private static TokenManager manager;
	
	private TokenManager () {
		
	}
	/**
	 * This method is used for the Singleton
	 * @return
	 */
	public static TokenManager getInstance() {
		if (manager == null) {
			manager = new TokenManager();
		}

		return manager;
	}
	
	@Override
	public TokenManager clone () {
		try {
			throw new CloneNotSupportedException();
		}
		catch (CloneNotSupportedException ex) {

		}
		return null;
	}

	/**
	 *
	 */
	public String TokenRequestGeneration (String InputFile) throws TokenManagementException{
		TokenRequest req = new TokenRequest(InputFile);
		return req.getHash();
	} 
	
	/**
	 *
	 */
	public String RequestToken (String InputFile) throws TokenManagementException{	
		Token myToken = new Token (InputFile);
		
		return myToken.getTokenValueCod();
	}
	
	/**
	 *
	 */
	public boolean VerifyToken (String TokenString) throws TokenManagementException{
		Token token = new Token ();
		if (token.Decode(TokenString)) {
			return token.isValid();	
		}
		else {
			return false;
		}
	}

	/**
	 *
	 */
	
	public boolean ExecuteAction(String FilePath) throws TokenManagementException {
		TokenOperation operation = new TokenOperation(FilePath);
		return true;	
	}

	/**
	 *
	 */
	public String RevokeToken(String FilePath) throws TokenManagementException {
		TokenRevoked revoke = new TokenRevoked(FilePath);
		return revoke.getEmail();
	}
}