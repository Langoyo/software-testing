// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement.Data.Attributes;

import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

public class Reason extends Attribute{
	
	/**
	 * Checks the validity of Reason
	 * 
	 * @param Value
	 * @throws TokenManagementException
	 */
	public Reason (String Value) throws TokenManagementException{
		this.errorMessage = "Error: invalid String length for reason field.";
		this.value = validate(Value);
	}
	@Override
	protected String validate (String Value) throws TokenManagementException {
		if(Value.length()>100||Value.length()<1) {
			throw new TokenManagementException(this.errorMessage);
		}
		return Value;
	}
}
