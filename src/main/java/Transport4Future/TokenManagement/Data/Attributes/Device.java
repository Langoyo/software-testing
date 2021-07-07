// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement.Data.Attributes;

import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

public class Device extends Attribute {
	/**
	 * Checks validity of Device
	 * @param Value
	 * @throws TokenManagementException
	 */
	public Device (String Value) throws TokenManagementException{
		this.pattern = "([A-Fa-f0-9]{32})";
		this.errorMessage = "Error: invalid Device in token request.";
		this.value = validate(Value);
	}
}
