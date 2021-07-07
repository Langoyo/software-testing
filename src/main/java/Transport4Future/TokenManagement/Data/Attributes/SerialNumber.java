// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement.Data.Attributes;

import Transport4Future.TokenManagement.Exceptions.TokenManagementException;


public class SerialNumber extends Attribute {
	/**
	 * Verifies the format of a serial number
	 * 
	 * @param Value
	 * @throws TokenManagementException
	 */
	public SerialNumber (String Value) throws TokenManagementException{
		this.pattern = "([A-Za-z0-9-]{1,})";
		this.errorMessage = "Error: invalid String length for serial number.";
		this.value = validate(Value);
	}
}
