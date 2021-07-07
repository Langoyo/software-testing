// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement;




import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

public class ExecutionTest {
	private TokenManager myManager;
	/**
	 * This method is used for the singleton
	 */
	public ExecutionTest() {
		myManager = TokenManager.getInstance();
		
	}
	
	/**Method used to prepare the tests execution
	 * @throws TokenManagementException
	 */
	@BeforeAll
	public static void FA_PREP() throws TokenManagementException {
		String fileToken = "TestData/TokenRequestTest/CorrectTokenRequest.json";
		TokenManager tm = TokenManager.getInstance();
		String tmep = tm.RequestToken(fileToken);
	
		}
	
	


	/*
	 * Test Case: FA-EXEC-01 
	 * Derivation tree node: 1 
	 * Testing method: Syntax analysis
	 * Expected result: Error
	 */
	@Test
	void FA_EXEC_01() {
		String filePath = "JsonTestFiles/Execution/FA-EXEC-01.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		

	}

	/*
	 * Test Case: FA-EXEC-02 
	 * Derivation tree node: 1 
	 * Testing method: Syntax analysis
	 * Expected result: Error
	 */
	@Test
	void FA_EXEC_02() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-02.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-03
	 * Derivation tree node: 2
	 * Testing method: Syntax analysis
	 * Expected result: Error
	 */
	@Test
	void FA_EXEC_03() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-03.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-04 
	 * Derivation tree node: 2 
	 * Testing method: Syntax analysis
	 * Expected result: Error
	 */
	@Test
	void FA_EXEC_04() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-04.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-05 
	 * Derivation tree node: 3 
	 * Testing method: Syntax analysis
	 * Expected result: Error
	 */
	@Test
	void FA_EXEC_05() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-05.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-06 
	 * Derivation tree node: 3 
	 * Testing method: Syntax analysis
	 * Expected result: Error
	 */
	@Test
	void FA_EXEC_06() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-06.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-07 
	 * Derivation tree node: 4 
	 * Testing method: Syntax analysis
	 * Expected result: Error
	 */
	@Test
	void FA_EXEC_07() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-07.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-08 
	 * Derivation tree node: 4 
	 * Testing method: Syntax analysis
	 * Expected result: Error
	 */
	@Test
	void FA_EXEC_08() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-08.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-09 
	 * Derivation tree node: 5 
	 * Testing method: Syntax analysis
	 * Expected result: Error
	 */
	@Test
	void FA_EXEC_09() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-09.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-10 
	 * Derivation tree node: 6 
	 * Testing method: Syntax analysis
	 * Expected result: Error
	 */
	@Test
	void FA_EXEC_10() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-10.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-11 
	 * Derivation tree node: 6 
	 * Testing method: Syntax analysis
	 * Expected result: Error
	 */
	@Test
	void FA_EXEC_11() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-11.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-12 
	 * Derivation tree node: 7 
	 * Testing method: Syntax analysis
	 * Expected result: Error
	 */
	@Test
	void FA_EXEC_12() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-12.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-13 
	 * Derivation tree node: 7 
	 * Testing method: Syntax analysis
	 * Expected result: Error
	 */
	@Test
	void FA_EXEC_13() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-13.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-14 
	 * Derivation tree node: 8 
	 * Testing method: Syntax analysis
	 * Expected result: Error
	 */
	@Test
	void FA_EXEC_14() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-14.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-15 
	 * Derivation tree node: 8 
	 * Testing method: Syntax analysis
	 * Expected result: Error
	 */
	@Test
	void FA_EXEC_15() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-15.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-16 
	 * Derivation tree node: 1 
	 * Testing method: Syntax analysis
	 * Expected result: Error
	 */
	@Test
	void FA_EXEC_16() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-16.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-17 
	 * Derivation tree node: 10 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_17() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-17.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-18 
	 * Derivation tree node: 10 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_18() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-18.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-19 
	 * Derivation tree node: 11, 15 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_19() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-19.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-20 
	 * Derivation tree node: 11, 15 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_20() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-20.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-21 
	 * Derivation tree node: 12 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_21() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-21.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-22 
	 * Derivation tree node: 12 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_22() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-22.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-23 
	 * Derivation tree node: 13 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_23() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-23.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-24 
	 * Derivation tree node: 14 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_24() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-24.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-25 
	 * Derivation tree node: 14 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_25() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-25.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-26 
	 * Derivation tree node: 16 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_26() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-26.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-27 
	 * Derivation tree node: 16 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_27() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-27.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-28 
	 * Derivation tree node: 17, 24 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_28() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-28.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-29 
	 * Derivation tree node: 17, 24 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_29() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-29.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-30 
	 * Derivation tree node: 18 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_30() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-30.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-31 
	 * Derivation tree node: 18 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_31() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-31.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-32 
	 * Derivation tree node: 19, 26 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_32() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-32.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-33 
	 * Derivation tree node: 19, 26 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_33() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-33.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-34 
	 * Derivation tree node: 20, 27 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_34() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-34.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-35 
	 * Derivation tree node: 21, 28 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_35() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-35.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-36 
	 * Derivation tree node: 21, 28 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_36() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-36.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-37 
	 * Derivation tree node: 23, 30 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_37() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-37.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-38 
	 * Derivation tree node: 23, 30 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_38() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-38.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-39 
	 * Derivation tree node: 22 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_39() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-39.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"Error: TokenValue must contain a Base64Url String.");
		}

	}

	/*
	 * Test Case: FA-EXEC-40 
	 * Derivation tree node: 22 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_40() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-40.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The token received does not exist or is not valid.");
		}

	}

	/*
	 * Test Case: FA-EXEC-41 
	 * Derivation tree node: 25 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_41() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-41.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-42 
	 * Derivation tree node: 25 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_42() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-34.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-43 
	 * Derivation tree node: 29 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_43() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-43.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"Error: invalid type of operation.");
		}

	}

	/*
	 * Test Case: FA-EXEC-44 
	 * Derivation tree node: 29 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_44() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-44.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"Error: invalid type of operation.");
		}

	}

	/*
	 * Test Case: FA-EXEC-45 
	 * Derivation tree node: 31, 38 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_45() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-34.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-46 
	 * Derivation tree node: 33, 39 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_46() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-46.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-47 
	 * Derivation tree node: 34, 40 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_47() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-47.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-48 
	 * Derivation tree node: 39, 42 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_48() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-48.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}

	/*
	 * Test Case: FA-EXEC-49 
	 * Derivation tree node: 41 
	 * Testing method: Syntax
	 * analysis Expected result: Error
	 */
	@Test
	void FA_EXEC_49() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-49.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"Error: invalid type of operation.");
		}

	}

	/*
	 * Test Case: FA-EXEC-50 
	 * Derivation tree node: 20, 27 
	 * Testing method: Syntax
	 * analysis Expected result: Pass
	 */
	@Test
	void FA_EXEC_50() {
		String filePathRequest1 = "TestData/TokenRequestGenerationTest/CorrectFileActuator.json";
		String filePathRequest2 = "TestData/TokenRequestGenerationTest/CorrectFileSensor.json";
		String fileToken = "TestData/TokenRequestTest/CorrectTokenRequest.json";
		
		String filePathRevocation = "JsonTestFiles/Execution/FA-EXEC-50.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			//tm.TokenRequestGeneration(filePathRequest1);
			//tm.TokenRequestGeneration(filePathRequest2);
			//String tmep = tm.RequestToken(fileToken);
			Boolean res = tm.ExecuteAction(filePathRevocation);
			
			Assertions.assertEquals(true, res);
			} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}


	
	/*
	 * Test Case: FA_EXEC_SEMANTICS_01 
	 * Equivalence class, boundary limit : FA-EC-NV02 
	 * Testing method: Equivalence Class
	 * Expected result: Error
	 */
	@Test
	void FA_EXEC_SEMANTICS_01() {
		
		String filePath = "Invalid";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}
	
	/*
	 * Test Case: FA_EXEC_SEMANTICS_02 
	 * Equivalence class, boundary limit : FA-EC-NV12 
	 * Testing method: Equivalence Class
	 * Expected result: Error
	 */
	@Test
	void FA_EXEC_SEMANTICS_02() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-SEMANTICS-02.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"Error: invalid type of operation.");
		}

	}
	
	/*
	 * Test Case: FA_EXEC_SEMANTICS_03 
	 * Equivalence class, boundary limit : FA-EC-NV16 
	 * Testing method: Equivalence Class
	 * Expected result: Error
	 */
	@Test
	void FA_EXEC_SEMANTICS_03() {
		
		String filePath = "JsonTestFiles/Execution/FA-EXEC-SEMANTICS-03.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"Error: TokenValue must contain a Base64Url String.");
		}

	}
	
	/*
	 * Test Case: FA_EXEC_SEMANTICS_04 
	 * Equivalence class, boundary limit : FA-EC-V01 FA-EC-V13 FA-EC-V15
	 * Testing method: Equivalence Class
	 * Expected result: Pass
	 */
	@Test
	void FA_EXEC_SEMANTICS_04() {
		String fileToken = "TestData/TokenRequestTest/CorrectTokenRequest.json";
		String filePath = "JsonTestFiles/Execution/FA-EXEC-SEMANTICS-04.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			Boolean res = tm.ExecuteAction(filePath);
			Assertions.assertEquals(res, true);
		} catch (TokenManagementException exception) {
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}

	}
	
}
