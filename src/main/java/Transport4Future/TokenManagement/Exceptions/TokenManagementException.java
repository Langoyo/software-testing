// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement.Exceptions;

public class TokenManagementException extends Exception {
	



		private static final long serialVersionUID = 1L;
		String message;

		/**Constructor for the exception
		 * @param message
		 */
		public TokenManagementException(String message) {

			this.message = message;
		}

		/**
		 *Method to retrieve the message of the exception
		 */
		public String getMessage() {

			return this.message;
		
	}

}
