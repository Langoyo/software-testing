// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.Utils;

import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

public class MD5Hasher extends GenericHasher implements IHash {

	private String key = "Stardust-";

	/**
	 * Parameters for the MD5
	 */
	public MD5Hasher () {
		this.algorithm="MD5";
		this.format = "%32x";
	}
	
	/**
	 *	Hash method for the MD5
	 */
	@Override
	public String Hash(String text) throws TokenManagementException {

		String input =  key + text;
		
		return super.Hash(input);
	}
}
