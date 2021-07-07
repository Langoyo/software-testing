// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement.Data.Attributes;

import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

public class TypeOfOperation extends Attribute{

	/**
	 * @param Value
	 * @throws TokenManagementException
	 */
	public TypeOfOperation (String Value) throws TokenManagementException {
		this.errorMessage = "Error: invalid type of operation.";
		this.value = this.validate(Value);
	}
	
	/**
	 * Verifies that the type of operation is send information from sensor, send request to actuator or check state
	 */
	protected String validate (String Value) throws TokenManagementException{
		if (!(Value.equalsIgnoreCase("Send Information from Sensor") || Value.equalsIgnoreCase("Send Request to Actuator") ||
			Value.equalsIgnoreCase("Check State"))) {
			throw new TokenManagementException(this.errorMessage);	
		} 
		return Value;
	}
}
