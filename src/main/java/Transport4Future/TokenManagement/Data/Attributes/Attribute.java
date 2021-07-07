// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement.Data.Attributes;

import java.util.regex.Pattern;

import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

public class Attribute {
	
	protected String value;
	protected String pattern;
	protected String errorMessage;
	
	/**
	 * Validates the format of an input string
	 * @param Value
	 * @return Value if correct
	 * @throws TokenManagementException
	 */
	protected String validate(String Value) throws TokenManagementException {
		Pattern pattern;
		pattern = Pattern.compile(this.pattern);
		if  (!pattern.matcher(Value).matches()) {
			throw new TokenManagementException(this.errorMessage);	
		}
		return Value;
	}
	
	/**
	 * @return
	 */
	public String getValue() {
		return this.value;
	}
}
