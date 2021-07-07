// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement.Data.Attributes;

import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

public class MACAddress extends Attribute {
	/**
	 * Checks the format of an email Address
	 * 
	 * @param Value
	 * @throws TokenManagementException
	 */
	public MACAddress (String Value) throws TokenManagementException{
		this.pattern = "([a-fA-F0-9]{2}[:-]){5}[a-fA-F0-9]{2}$";
		this.errorMessage = "Error: invalid MAC Address data in JSON structure.";
		this.value = validate(Value);
	}
}
