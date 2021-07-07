// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.Utils;

import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

public interface IHash {
	/**
	 * Interface method for hash implementation
	 * @param text
	 * @return
	 * @throws TokenManagementException
	 */
	public String Hash (String text) throws TokenManagementException;
}
