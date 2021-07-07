// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement.Data.Attributes;

import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

public class TypeOfRevocation extends Attribute {
	/**
	 * @param Value
	 * @throws TokenManagementException
	 */
	public TypeOfRevocation (String Value) throws TokenManagementException{
		this.errorMessage = "Error: invalid type of revocation.";
		this.value = this.validate(Value);
	}
	/**
	 *	Checks whether the type of revocation is temporal or final
	 */
	protected String validate (String Value) throws TokenManagementException{
		if (!(Value.equalsIgnoreCase("Temporal") || Value.equalsIgnoreCase("Final"))) {
			throw new TokenManagementException(this.errorMessage);	
		} 
		return Value;
	}
}
