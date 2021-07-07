// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement;

import Transport4Future.TokenManagement.Exceptions.TokenManagementException;


public interface ITokenManagement {
	
	/**
	 * Receives and stores a TokenRequest
	 * @param InputFile
	 * @return MD5 signature
	 * @throws TokenManagementException
	 */
	String TokenRequestGeneration (String InputFile) throws TokenManagementException;

	/**
	 * Receives and stores Token
	 * @param InputFile
	 * @return encoded base64 token value
	 * @throws TokenManagementException
	 */
	String RequestToken (String InputFile) throws TokenManagementException;

	/**
	 * Tests whether a token is valid
	 * @param Token
	 * @return true if valid, false if not
	 * @throws TokenManagementException
	 */
	boolean VerifyToken (String Token) throws TokenManagementException;

	/**
	 * Checks whether a operation can be performed on a Token
	 * 
	 * @param FilePath
	 * @return true if it can be performed or false if not
	 * @throws TokenManagementException
	 */
	boolean ExecuteAction (String FilePath) throws TokenManagementException;
	
	/**
	 * Revokes a token
	 * 
	 * @param FilePath
	 * @return true if it could be done
	 * @throws TokenManagementException if it could not be performed
	 */
	String RevokeToken (String FilePath) throws TokenManagementException;

}
