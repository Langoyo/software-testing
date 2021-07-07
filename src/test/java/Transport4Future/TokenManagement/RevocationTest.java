// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement;



import Transport4Future.TokenManagement.Exceptions.TokenManagementException;


import java.io.FileWriter;
import java.io.IOException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RevocationTest {
	private TokenManager myManager;
	/**
	 * Method used for the singleton
	 */
	public RevocationTest() {
		 myManager = TokenManager.getInstance();
	}
	/**
	 * Method to prepare the tests
	 * @throws TokenManagementException
	 */
	@BeforeAll
	public static void FA_PREP() throws TokenManagementException {
		String fileToken = "TestData/TokenRequestTest/CorrectTokenRequest.json";
		TokenManager tm = TokenManager.getInstance();
		tm.RequestToken(fileToken);
	
		}
	/**
	 * Method to assure the tests correction
	 * @throws IOException
	 */
	@AfterEach
	public void cleanUpEach() throws IOException{
		
		FileWriter myStore = new FileWriter(System.getProperty("user.dir") + "/Store/tokenRevocationStore.json", false);
	}
	
	/** Test Case: FA_REVOC_01
	* Equivalence class, boundary limit OR related derivation tree node: 1
	* Testing method:Syntax analysis
	* Expected result: Failure
	*/
	@Test
	public void FA_REVOC_01()
	{
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-01.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}
	/* Test Case: FA_REVOC_02
	* Equivalence class, boundary limit OR related derivation tree node: 1
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_02() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-02.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}
	/* Test Case: FA_REVOC_03
	* Equivalence class, boundary limit OR related derivation tree node: 2
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_03() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-03.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_04
	* Equivalence class, boundary limit OR related derivation tree node: 2
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_04() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-04.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_05
	* Equivalence class, boundary limit OR related derivation tree node: 3
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_05() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-05.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_06
	* Equivalence class, boundary limit OR related derivation tree node: 3
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_06() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-06.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_07
	* Equivalence class, boundary limit OR related derivation tree node: 4
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_07() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-07.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_08
	* Equivalence class, boundary limit OR related derivation tree node: 4
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_08() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-08.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_09
	* Equivalence class, boundary limit OR related derivation tree node: 5
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_09() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-09.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_10
	* Equivalence class, boundary limit OR related derivation tree node: 6
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_10() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-10.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_11
	* Equivalence class, boundary limit OR related derivation tree node: 6
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_11() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-11.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_12
	* Equivalence class, boundary limit OR related derivation tree node: 7,9
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_12() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-12.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_13
	* Equivalence class, boundary limit OR related derivation tree node: 7,9
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_13() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-13.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_14
	* Equivalence class, boundary limit OR related derivation tree node: 8
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_14() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-14.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_15
	* Equivalence class, boundary limit OR related derivation tree node: 8
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_15() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-15.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_16
	* Equivalence class, boundary limit OR related derivation tree node: 10
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_16() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-16.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_17
	* Equivalence class, boundary limit OR related derivation tree node: 10
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_17() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-17.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_18
	* Equivalence class, boundary limit OR related derivation tree node: 111
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_18() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-18.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_19
	* Equivalence class, boundary limit OR related derivation tree node: 12
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_19() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-19.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_20
	* Equivalence class, boundary limit OR related derivation tree node: 12
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_20() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-20.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_21
	* Equivalence class, boundary limit OR related derivation tree node: 13,21
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_21() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-21.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_22
	* Equivalence class, boundary limit OR related derivation tree node: 13,21
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_22() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-22.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_23
	* Equivalence class, boundary limit OR related derivation tree node: 14
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_23() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-23.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_24
	* Equivalence class, boundary limit OR related derivation tree node: 14
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_24() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-24.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_25
	* Equivalence class, boundary limit OR related derivation tree node: 15,19
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_25() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-25.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_26
	* Equivalence class, boundary limit OR related derivation tree node: 16
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_26() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-26.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_27
	* Equivalence class, boundary limit OR related derivation tree node: 16
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_27() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-27.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case: FA_REVOC_28
	* Equivalence class, boundary limit OR related derivation tree node: 18
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_28() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-28.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case:  FA_REVOC_29
	* Equivalence class, boundary limit OR related derivation tree node: 18
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_29() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-29.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case:  FA_REVOC_30
	* Equivalence class, boundary limit OR related derivation tree node: 20
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_30() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-30.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case:  FA_REVOC_31
	* Equivalence class, boundary limit OR related derivation tree node: 20
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_31() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-31.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case:  FA_REVOC_32
	* Equivalence class, boundary limit OR related derivation tree node: 22
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_32() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-32.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case:  FA_REVOC_33
	* Equivalence class, boundary limit OR related derivation tree node: 22
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_33() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-33.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case:  FA_REVOC_34
	* Equivalence class, boundary limit OR related derivation tree node: 23,30,37
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_34() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-34.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}/* Test Case:  FA_REVOC_35
	* Equivalence class, boundary limit OR related derivation tree node: 23,30,37
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_35() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-35.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}
	/* Test Case:  FA_REVOC_36
	* Equivalence class, boundary limit OR related derivation tree node: 24
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_36() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-36.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}
	/* Test Case:  FA_REVOC_37
	* Equivalence class, boundary limit OR related derivation tree node: 24
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_37() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-37.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}
	/* Test Case:  FA_REVOC_38
	* Equivalence class, boundary limit OR related derivation tree node: 25,32,39
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_38() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-38.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}
	/* Test Case:  FA_REVOC_39
	* Equivalence class, boundary limit OR related derivation tree node: 25,32,39
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_39() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-39.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}
	/* Test Case:  FA_REVOC_40
	* Equivalence class, boundary limit OR related derivation tree node: 26,33,40
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_40() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-40.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}
	/* Test Case:  FA_REVOC_41
	* Equivalence class, boundary limit OR related derivation tree node: 27,34,41
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_41() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-41.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}
	/* Test Case:  FA_REVOC_42
	* Equivalence class, boundary limit OR related derivation tree node: 27,34,41
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_42() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-42.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}
	/* Test Case:  FA_REVOC_43
	* Equivalence class, boundary limit OR related derivation tree node: 28
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_43() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-43.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The token received does not exist.");
		}
		
	}
	/* Test Case:  FA_REVOC_44
	* Equivalence class, boundary limit OR related derivation tree node: 28
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_44() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-44.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"Error: TokenValue must contain a Base64Url String.");
		}
		
	}
	/* Test Case:  FA_REVOC_45
	* Equivalence class, boundary limit OR related derivation tree node: 29,36,43
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_45() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-45.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}
	/* Test Case:  FA_REVOC_46
	* Equivalence class, boundary limit OR related derivation tree node: 29,36,43
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_46() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-46.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}
	/* Test Case:  FA_REVOC_47
	* Equivalence class, boundary limit OR related derivation tree node: 31
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_47() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-47.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}
	/* Test Case:  FA_REVOC_48
	* Equivalence class, boundary limit OR related derivation tree node: 31
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_48() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-48.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}
	/* Test Case:  FA_REVOC_49
	* Equivalence class, boundary limit OR related derivation tree node: 35
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_49() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-49.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"Error: invalid type of revocation.");
		}
		
	}
	/* Test Case:  FA_REVOC_50
	* Equivalence class, boundary limit OR related derivation tree node: 35
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_50() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-50.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"Error: invalid type of revocation.");
		}
		
	}
	/* Test Case:  FA_REVOC_51
	* Equivalence class, boundary limit OR related derivation tree node: 38
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_51() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-51.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}
	/* Test Case:  FA_REVOC_52
	* Equivalence class, boundary limit OR related derivation tree node: 38
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_52() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-52.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}
	/* Test Case:  FA_REVOC_53
	* Equivalence class, boundary limit OR related derivation tree node: 42
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_53() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-53.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"Error: invalid String length for reason field.");
		}
		
	}
	/* Test Case:  FA_REVOC_54
	* Equivalence class, boundary limit OR related derivation tree node: 42
	* Testing method: Syntax analysis
	* Expected result: Pass
	*/
	@Test 
	void FA_REVOC_54() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-54.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			String result=tm.RevokeToken(filePath);
			Assertions.assertEquals(result,
					"autonomous@vehicle.com");
		}catch(TokenManagementException exception) {
			Assertions.fail("Error not expected");
		}
		
	}
	/* Test Case:  FA_REVOC_55
	* Equivalence class, boundary limit OR related derivation tree node: 44,50,56
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_55() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-55.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}
	/* Test Case:  FA_REVOC_56
	* Equivalence class, boundary limit OR related derivation tree node: 45
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_56() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-56.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}
	/* Test Case:  FA_REVOC_57
	* Equivalence class, boundary limit OR related derivation tree node: 46,52,58
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_57() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-57.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}
	/* Test Case:  FA_REVOC_58
	* Equivalence class, boundary limit OR related derivation tree node: 47,53,59
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_58() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-58.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}
	/* Test Case:  FA_REVOC_59
	* Equivalence class, boundary limit OR related derivation tree node: 48
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_59() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-59.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The token received does not exist.");
		}
		
	}
	/* Test Case:  FA_REVOC_60
	* Equivalence class, boundary limit OR related derivation tree node: 49,55,61
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_60() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-60.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}
	/* Test Case:  FA_REVOC_61
	* Equivalence class, boundary limit OR related derivation tree node: 51
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_61() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-61.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}
	/* Test Case:  FA_REVOC_62
	* Equivalence class, boundary limit OR related derivation tree node: 54
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_62() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-62.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"Error: invalid type of revocation.");
		}
		
	}
	/* Test Case:  FA_REVOC_63
	* Equivalence class, boundary limit OR related derivation tree node: 57
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_63() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-63.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}
		
	}
	/* Test Case:  FA_REVOC_64
	* Equivalence class, boundary limit OR related derivation tree node: 60
	* Testing method: Syntax analysis
	* Expected result: Failure
	*/
	@Test 
	void FA_REVOC_64() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-64.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}catch(TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"Error: invalid String length for reason field.");
		}
		
	}
	/* Test Case:  FA_REVOC_65
	* Equivalence class, boundary limit OR related derivation tree node: All
	* Testing method: Syntax analysis
	* Expected result: Pass
	*/
	@Test 
	void FA_REVOC_65() {
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-65.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			String result = tm.RevokeToken(filePath);
			Assertions.assertEquals(result,
					"autonomous@vehicle.com");
			
		}catch(TokenManagementException exception) {
			Assertions.fail("Error was not expected");
					
		}
		
	}
	
	
	/*
	 * Test Case: FA_REVOC_SEMANTICS_01 
	 * Equivalence class, boundary limit : FA-EC-NV02
	 * Testing method: Equivalence Class
	 * Expected result: Fail
	 */
	@Test
	void FA_REVOC_SEMANTICS_01() {
		
		String filePath = "JsonTestFiles/wawa.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"The input file has any problem related to its format or to its access.");
		}

	}
	
	/*
	 * Test Case: FA_REVOC_SEMANTICS_02 
	 * Equivalence class, boundary limit : FA-EC-NV02
	 * Testing method: Equivalence Class FA-EC-V03
	 * Boundary values: FA-BV-V05
	 * Expected result: Fail
	 */
	@Test
	void FA_REVOC_SEMANTICS_02() {
		
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-SEMANTICS-02.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			String email  = tm.RevokeToken(filePath);
			Assertions.assertEquals(email, "autonomous@vehicle.com");
		} catch (TokenManagementException exception) {
			Assertions.fail("Error was not expected");
		}

	}
	
	/*
	 * Test Case: FA_REVOC_SEMANTICS_03 
	 * Testing method: 
	 * Equivalence Class FA-EC-V03
	 * Boundary values: FA-BV-V06
	 * Expected result: Fail
	 */
	@Test
	void FA_REVOC_SEMANTICS_03() {
		
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-SEMANTICS-03.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			String res = tm.RevokeToken(filePath);
			Assertions.assertEquals(res, "autonomous@vehicle.com");
		} catch (TokenManagementException exception) {
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}

	}
	
	/*
	 * Test Case: FA_REVOC_SEMANTICS_04 
	 * Testing method: Equivalence class, boundary limit
	 * Equivalence Class FA-EC-NV04
	 * Boundary values: FA-BV-NV07
	 * Expected result: Fail
	 */
	@Test
	void FA_REVOC_SEMANTICS_04() {
		
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-SEMANTICS-04.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"Error: invalid String length for reason field.");
			}

	}
	
	/*
	 * Test Case: FA_REVOC_SEMANTICS_05 
	 * Equivalence class, boundary limit : FA-EC-V03
	 * Testing method: 
	 * Equivalence Class FA-EC-NV04
	 * Boundary values: FA-BV-NV08
	 * Expected result: Fail
	 */
	@Test
	void FA_REVOC_SEMANTICS_05() {
		
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-SEMANTICS-05.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"Error: invalid String length for reason field.");
		}

	}
	
	/*
	 * Test Case: FA_REVOC_SEMANTICS_06 
	 * Testing method: Equivalence class, boundary limit
	 * Equivalence Class FA-EC-V03
	 * Boundary values: FA-BV-V09
	 * Expected result: Fail
	 */
	@Test
	void FA_REVOC_SEMANTICS_06() {
		
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-SEMANTICS-06.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			String res = tm.RevokeToken(filePath);
			Assertions.assertEquals(res, "autonomous@vehicle.com");
		} catch (TokenManagementException exception) {
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}

	}
	
	/*
	 * Test Case: FA_REVOC_SEMANTICS_07 
	 * Testing method: Equivalence class, boundary limit
	 * Equivalence Class FA-EC-V03
	 * Boundary values: FA-BV-V10
	 * Expected result: Fail
	 */
	@Test
	void FA_REVOC_SEMANTICS_07() {
		
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-SEMANTICS-07.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			String res = tm.RevokeToken(filePath);
			Assertions.assertEquals(res, "autonomous@vehicle.com");
		} catch (TokenManagementException exception) {
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		}

	}
	
	/*
	 * Test Case: FA_REVOC_SEMANTICS_08 
	 * Testing method: Equivalence class, boundary limit
	 * Equivalence Class FA-EC-V12
	 * Expected result: Fail
	 */
	@Test
	void FA_REVOC_SEMANTICS_08() {
		
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-SEMANTICS-08.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"Error: invalid type of revocation.");
		}

	}

	/*
	 * Test Case: FA_REVOC_SEMANTICS_09 
	 * Testing method: Equivalence class, boundary limit
	 * Equivalence Class FA-EC-NV16
	 * Expected result: Fail
	 */
	@Test
	void FA_REVOC_SEMANTICS_09() {
		
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-SEMANTICS-09.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			tm.RevokeToken(filePath);
			Assertions.fail("Error: invalid input data in JSON structure exception was expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"Error: TokenValue must contain a Base64Url String.");
		}

	}
	
	/*
	 * Test Case: FA_REVOC_SEMANTICS_10 
	 * Testing method: Equivalence class, boundary limit
	 * Equivalence Class FA-EC-V01 FA-EC-V03 FA-EC-V11 FA-EC-V15
	 * Expected result: Pass
	 */
	@Test
	void FA_REVOC_SEMANTICS_10() {
		
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-SEMANTICS-10.json";
		TokenManager tm = TokenManager.getInstance();
		try {
			String res = tm.RevokeToken(filePath);
			Assertions.assertEquals(res, "autonomous@vehicle.com");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(),
					"Error: TokenValue must contain a Base64Url String.");
		}

	}
}

