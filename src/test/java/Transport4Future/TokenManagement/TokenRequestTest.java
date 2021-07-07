// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

class TokenRequestTest {

	private TokenManager myManager;
	
	public TokenRequestTest () {
		 myManager = TokenManager.getInstance();
	}
	/**
	 * Method to pass the tests
	 * @param InputFilePath
	 * @param expectedMessage
	 */
	@DisplayName ("Invalid Test Cases")
	@ParameterizedTest(name = "{index} - {2}") 
	@CsvFileSource(resources = "/invalidTestCasesRequestTokenTestReduced.csv")
	void InvalidTestCases(String InputFilePath, String expectedMessage) {
		TokenManagementException ex = Assertions.assertThrows(TokenManagementException.class, ()-> {
			myManager.RequestToken(InputFilePath);
		});
		assertEquals (expectedMessage,ex.getMessage());
	}
	/**
	 * Method to pass the tests
	 * @param InputFilePath
	 * @param Result
	 * @throws TokenManagementException
	 */
	@DisplayName ("Valid Test Cases")
	@ParameterizedTest(name = "{index} - {2}")
	@CsvFileSource(resources = "/validTestCasesRequestTokenTest.csv")
	void ValidTestCases(String InputFilePath, String Result) throws TokenManagementException {
		String myResult = myManager.RequestToken(InputFilePath);
		assertEquals (Result,myResult);
	}
}
