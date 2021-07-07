// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


import org.junit.jupiter.api.Assertions;


import org.junit.jupiter.api.Test;

import Transport4Future.TokenManagement.Exceptions.TokenManagementException;


public class ExecuteActionStructural {
	
	/**
	 * 	Method used for testing, erases the contents of TokenStore
	 * @throws TokenManagementException
	 */
	private void resetTokenStore () throws TokenManagementException {
		
		String storePath = System.getProperty("user.dir") + "/Store/tokenStore.json";
        FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(storePath);
	        fileWriter.close();
		} catch (IOException e) {
			throw new TokenManagementException("Error: Unable to save a new token in the internal licenses store");
		}		
	}
	/**
	 * Method used for testing, erases the contents of TokenRequestStore
	 * @throws TokenManagementException
	 */
	private void resetTokenRequestStore () throws TokenManagementException {
		 
		String storePath = System.getProperty("user.dir") + "/Store/tokenRequestsStore.json";
        FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(storePath);
	        fileWriter.close();
		} catch (IOException e) {
			throw new TokenManagementException("Error: Unable to save a new token in the internal licenses store");
		}		
	}

	/**
	 * Method used for testing it changes the content of a file
	 * @param originalFile
	 * @param modifiedFile
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private void overwriteFile(String originalFile, String modifiedFile)
			throws FileNotFoundException, IOException {
		// Opening the file that the TokensStore uses by default
		
		File outfile = new File(originalFile);

		// Opening a file that contains  one expired token
		
		File infile = new File(modifiedFile);

		// The contents of the infile are copied into the outfile so that TokensStore
		// can work with the tokens
		FileInputStream instream = new FileInputStream(infile);
		FileOutputStream outstream = new FileOutputStream(outfile);

		byte[] buffer = new byte[1024];

		int length;
		// The contents are copied here
		while ((length = instream.read(buffer)) > 0) {
			outstream.write(buffer, 0, length);
		}

		// Closing the input/output file streams
		instream.close();
		outstream.close();
	}
	

	/** Test Case: FA-EXEC-STRUCTURAL-01
	 * Paths:
	 * ExecuteAction: 1-3-4
	 * TokenOperation: 1-2-3-4-5-9-10
	 * Decode:1-2-4-5 
	 * Testing method: Structural Basic paths
	 * Expected result: Error
	 * 
	 * Tries to find a Token not contained in the store
	 */
	@Test
	void FA_EXEC_STRUCTURAL_01() throws Exception {
		TokenManager myManager = TokenManager.getInstance();
		
		String filePath = "JsonTestFiles/Structural/ExecuteExpired.json";

		resetTokenStore();
		try {
			Boolean res = myManager.ExecuteAction(filePath);
			Assertions.fail("Error expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(), "The token received does not exist or is not valid.");
		}
		
		myManager = null;
	}
	

	/** Test Case: FA-EXEC-STRUCTURAL-02
	 * Paths:
	 * ExecuteAction: 1-3-4
	 * TokenOperation: 1-2-3-4-5-6-9-10
     * Decode:1-2-3-5
     * isValid:1-2-3
	 * Testing method: Structural Basic paths
	 * Expected result: Error
	 * 
	 * Tries to execute a token which is expired
	 */
	@Test
	void FA_EXEC_STRUCTURAL_02() throws Exception {
		TokenManager myManager = TokenManager.getInstance();
		String token = "JsonTestFiles/Structural/CorrectTokenRequestActuator.json";
		String request = "JsonTestFiles/Structural/CorrectFileActuator.json";
		// Token exection Json revoked which corresponds to ExpiredTokenStore
		String execution = "JsonTestFiles/Structural/ExecuteExpired.json";

		resetTokenStore();
		resetTokenRequestStore();
		
		

		String originalTokenStore = "Store/tokenStore.json";
		// TokenStored modified that contains the token expired
		String modifiedTokenStore = "JsonTestFiles/Structural/ExpiredTokenStore.json";

		overwriteFile(originalTokenStore, modifiedTokenStore);

		try {

			Boolean res = myManager.ExecuteAction(execution);
			Assertions.fail("Error expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(), "The token received does not exist or is not valid.");
		}
		myManager = null;
	}

	
	
	/* Test Case: FA-EXEC-STRUCTURAL-03
	 * Paths:
	 * ExecuteAction: 1-3-4
	 * TokenOperation:1-2-3-4-5-6-7-9-10
     * Decode:1-2-3-5
     * isValid:1-2-4
     * Request Find:1-2-4-5
	 * Testing method: Structural Basic paths
	 * Expected result: Error
	 * 
	 * Exception is thrown because an error opening the tokensRequest store
	 */
	@Test
	void FA_EXEC_STRUCTURAL_03() throws Exception {
		TokenManager myManager = TokenManager.getInstance();
		String token = "JsonTestFiles/Structural/CorrectTokenRequestActuator.json";
		String request = "JsonTestFiles/Structural/CorrectFileActuator.json";
		String execution = "JsonTestFiles/Structural/ExecuteActuator.json";
		
		
		String sign = myManager.TokenRequestGeneration(request);
		String temp = myManager.RequestToken(token);
		
		//modifying the store so that the parser crashes when trying to read it
		overwriteFile("Store/tokenRequestsStore.json","JsonTestFiles/Structural/STRUCT_03_tokenRequestStore.json");

		try {
			
			Boolean res = myManager.ExecuteAction(execution);
			Assertions.fail("Error expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(), "The token received does not exist or is not valid.");
		}
		myManager = null;
	}
	
	/* Test Case: FA-EXEC-STRUCTURAL-04
	 * Paths:
	 * ExecuteAction: 1-3-4
	 * TokenOperation:1-2-3-4-5-6-7-9-10
	 * Decode:1-2-3-5
	 * isValid:1-2-4
	 * Request Find:1-2-3-4-6 
	 * Testing method: Structural Basic paths
	 * Expected result: Error
	 * 
	 * An token actuator is saved and a tokenExecution is performed over a sensor, which is not stored
	 */
	@Test
	void FA_EXEC_STRUCTURAL_04() throws Exception {
		TokenManager myManager = TokenManager.getInstance();
		String token = "JsonTestFiles/Structural/CorrectTokenRequestActuator.json";
		String request = "JsonTestFiles/Structural/CorrectFileActuator.json";
		String execution = "JsonTestFiles/Structural/ExecuteSensor.json";

		resetTokenStore();
		resetTokenRequestStore();



		try {
			String sign = myManager.TokenRequestGeneration(request);
			String temp = myManager.RequestToken(token);
			Boolean res = myManager.ExecuteAction(execution);
			Assertions.fail("Error expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(), "The token received does not exist or is not valid.");
		}
		myManager = null;
	}
	
	/* Test Case: FA-EXEC-STRUCTURAL-05
	 * Paths:
	 * ExecuteAction: 1-3-4
	 * TokenOperation:1-2-3-4-6-7-8-9-10
	 * Decode:1-2-3-5
	 * isValid:1-2-4
	 * Request Find:1-2-3-5-6
	 * SetExecution:1-3-4
	 * Testing method: Structural Basic paths
	 * Expected result: Error
	 */
	@Test
	void FA_EXEC_STRUCTURAL_05() throws Exception {
		TokenManager myManager = TokenManager.getInstance();
		resetTokenStore();
		resetTokenRequestStore();
		String token = "JsonTestFiles/Structural/CorrectTokenRequestActuator.json";
		String token2 ="JsonTestFiles/Structural/CorrectTokenRequestSensor.json";
		String request2 ="JsonTestFiles/Structural/CorrectFileSensor.json";
		String request = "JsonTestFiles/Structural/CorrectFileActuator.json";
		String execution = "JsonTestFiles/Structural/ExecuteSensor.json";

		try {
			
			myManager.TokenRequestGeneration(request);
			myManager.TokenRequestGeneration(request2);
			myManager.RequestToken(token);
			myManager.RequestToken(token2);
			Boolean res = myManager.ExecuteAction(execution);
			Assertions.fail("Error was expected.");

		} catch (TokenManagementException exception) {
			Assertions.assertEquals("The device represented by the token cannot execute the requested operation", 
					exception.getMessage());
			
		}
		myManager = null;
	}
	/* Test Case: FA-EXEC-STRUCTURAL-06
	 * Paths:
	 * ExecuteAction: 1-3-4
	 * TokenOperation:1-2-3-4-6-7-8-9-10
	 * Decode:1-2-3-5
	 * isValid:1-2-4
	 * Request Find:1-2-3-5-6
	 * SetExecution:1-2-3-4
	 * Testing method: Structural Basic paths
	 * Expected result: Error
	 */
	@Test
	void FA_EXEC_STRUCTURAL_06() throws Exception {
		TokenManager myManager = TokenManager.getInstance();
		resetTokenStore();
		resetTokenRequestStore();
		String token = "JsonTestFiles/Structural/CorrectTokenRequestActuator.json";
		String token2 ="JsonTestFiles/Structural/CorrectTokenRequestSensor.json";
		String request2 ="JsonTestFiles/Structural/CorrectFileSensor.json";
		String request = "JsonTestFiles/Structural/CorrectFileActuator.json";
		String execution = "JsonTestFiles/Structural/ExecuteActuator.json";

		try {
			
			myManager.TokenRequestGeneration(request);
			myManager.TokenRequestGeneration(request2);
		String temp = 	myManager.RequestToken(token);
		String temp2 =	myManager.RequestToken(token2);
			Boolean res = myManager.ExecuteAction(execution);
			Assertions.fail("Error was expected.");

		} catch (TokenManagementException exception) {
			Assertions.assertEquals("The device represented by the token cannot execute the requested operation", 
					exception.getMessage());
			
		}
		myManager = null;
	}
	




}
