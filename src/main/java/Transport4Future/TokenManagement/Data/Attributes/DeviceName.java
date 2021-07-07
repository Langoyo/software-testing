// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement.Data.Attributes;

import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

public class DeviceName extends Attribute {
	/**
	 * Checks the format of DeviceName
	 * 
	 * @param Value
	 * @throws TokenManagementException
	 */
	public DeviceName (String Value) throws TokenManagementException{
		this.pattern = "([A-Za-z0-9\\s]{1,20})";
		this.errorMessage = "Error: invalid String length for device name.";
		this.value = validate(Value);
	}
	
}
