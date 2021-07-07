// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement.Data.Attributes;

import Transport4Future.TokenManagement.Exceptions.TokenManagementException;


public class TypeOfDevice extends Attribute {

	/**
	 * Verifies the format of a type of device
	 * 
	 * @param Value
	 * @throws TokenManagementException
	 */
	public TypeOfDevice (String Value) throws TokenManagementException {
		this.errorMessage = "Error: invalid type of sensor.";
		this.value = this.validate(Value);
	}
	
	/**
	 * Verifies if the type is actuator or sensor
	 */
	protected String validate (String Value) throws TokenManagementException{
		if (!(Value.equalsIgnoreCase("Sensor") || Value.equalsIgnoreCase("Actuator"))) {
			throw new TokenManagementException(this.errorMessage);	
		} 
		return Value;
	}
}
