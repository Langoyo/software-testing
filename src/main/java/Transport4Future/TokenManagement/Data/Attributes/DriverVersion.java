// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement.Data.Attributes;

import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

public class DriverVersion extends Attribute {
	/**
	 * Checks the validity of the DriverVersion
	 * 
	 * @param Value
	 * @throws TokenManagementException
	 */
	public DriverVersion (String Value) throws TokenManagementException{
		this.pattern = "([a-zA-Z0-9]{1}[A-Za-z0-9\\.]{0,24})";
		this.errorMessage = "Error: invalid String length for driver version.";
		this.value = validate(Value);
	}
}
