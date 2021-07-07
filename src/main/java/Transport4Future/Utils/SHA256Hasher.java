// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.Utils;

import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

public class SHA256Hasher extends GenericHasher implements IHash {
	
	/**
	 * Parameters for the SHA256
	 */
	public SHA256Hasher() {
		this.algorithm = "SHA-256";
		this.format = "%064x";
	}
	
	/**
	 *Hash method for the SHA
	 */
	@Override
	public String Hash(String text) throws TokenManagementException {
		return super.Hash(text);
	}
}
