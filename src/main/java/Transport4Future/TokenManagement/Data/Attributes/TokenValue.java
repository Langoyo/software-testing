// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement.Data.Attributes;


import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

/**
 * @author Carlos Gallego
 *
 */
public class TokenValue extends Attribute {
		/**
		 * Verifies the format of a Token Value
		 * 
		 * @param Value
		 * @throws TokenManagementException
		 */
		public TokenValue (String Value) throws TokenManagementException{
			this.pattern = "^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)?$";
			this.errorMessage = "Error: TokenValue must contain a Base64Url String.";
			this.value = validate(Value);
		}
		
		
}
