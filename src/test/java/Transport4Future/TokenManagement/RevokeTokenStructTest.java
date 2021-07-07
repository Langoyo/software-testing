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

public class RevokeTokenStructTest {
	
	
	/**
	 * Method to empty a TokenRevocationStore
	 * @throws TokenManagementException
	 */
	private void resetTokenRevocationStore () throws TokenManagementException {
		String storePath = System.getProperty("user.dir") + "/Store/tokenRevocationStore.json";
        FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(storePath);
	        fileWriter.close();
		} catch (IOException e) {
			throw new TokenManagementException("Error: Unable to save a new token in the internal licenses store");
		}		
	}
	/**
	 * Method to change the contents of a file
	 * @param originalTokenRevocationStore
	 * @param modifiedTokenRevocationStore
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private void overwriteFile(String originalTokenRevocationStore, String modifiedTokenRevocationStore)
			throws FileNotFoundException, IOException {
		// Opening the file that the TokensRevocationStore uses by default
		
		File outfile = new File(originalTokenRevocationStore);

		// Opening a file that contains  one expired token
		
		File infile = new File(modifiedTokenRevocationStore);

		// The contents of the infile are copied into the outfile so that TokensRevocationStore
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
	
	/** Test Case: FA_REV_STRUCTURAL_01
	* RevokeToken: 1-3-4
	* Construc.TRevoked: 1-2-3-4-5-6-7-12-13
	*
    * Decode:1-2-4-5
    * isValid:
    * checkNotRevoked:
    * Store:
    * saveTokenRevoked:
    * saveStore:
	* Testing method:Structural Testing
	* Expected result: Failure
	*/
	@Test
	public void FA_REV_STRUCTURAL_01() {
		TokenManager myManager = TokenManager.getInstance();
		String filePath = "JsonTestFiles/Revocation/FA-REVOC-59.json";
		try {
		    myManager.RevokeToken(filePath);
			Assertions.fail("Error expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(), "The token received does not exist.");
		}
	}
	/** Test Case: FA_REV_STRUCTURAL_02
	* RevokeToken: 1-3-4
	* Construc.TRevoked: 1-2-3-4-5-6-7-8-12-13
    * Decode:1-2-3-5
    * isValid:1-2-3-4
    * checkNotRevoked:
    * Store:
    * saveTokenRevoked:
    * saveStore:
	* Testing method:Structural Testing
	* Expected result: Failure
	*/
	@Test
	public void FA_REV_STRUCTURAL_02() throws FileNotFoundException, IOException {
		TokenManager myManager = TokenManager.getInstance();
		overwriteFile("Store/tokenStore","JsonTestFiles/Structural/ExpiredTokenStore.json");
		 
		String filePath ="JsonTestFiles/Structural/expiredRevoked.json";
		try {
			myManager.RevokeToken(filePath);
			Assertions.fail("Error expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(), "The token received does not exist.");
		}
	}
	/** Test Case: FA_REV_STRUCTURAL_03
	* RevokeToken: 1-3-4
	* Construc.TRevoked: 1-2-3-4-5-9-10
	* Decode:1-2-4-5
	* isValid:1-2-4
	* checkNotRevoked:1-2-3-4
	* Store:
	* saveTokenRevoked:
	* saveStore:
	* Testing method:Structural Testing
	* Expected result: Failure
	*/
	@Test
	public void FA_REV_STRUCTURAL_03() throws TokenManagementException {
		TokenManager myManager = TokenManager.getInstance();
		myManager.TokenRequestGeneration("JsonTestFiles/Structural/CorrectFileActuator.json");
		myManager.RequestToken("JsonTestFiles/Structural/CorrectTokenRequestActuator.json");
		
		String filePath ="JsonTestFiles/Structural/RevokeActuator.json";
		try {
			 myManager.RevokeToken(filePath);
			 myManager.RevokeToken(filePath);
			Assertions.fail("Error expected");
		} catch (TokenManagementException exception) {
			Assertions.assertEquals(exception.getMessage(), "The token was previously revoked by this method");
		}
		
	}
	/** Test Case: FA_REV_STRUCTURAL_04
	* RevokeToken: 1-3-4
	* Construc.TRevoked: 1-2-3-4-5-9-10
	* Decode:1-2-4-5
	* isValid:1-2-4
	* checkNotRevoked:1-2-4
	* Store:1-2-3-4
	* saveTokenRevoked: 1-2-3-4-5-6-7-8
	* loadTokenRevokedRepo:1-2-3-4-5
	* saveStore:1-2-3-4
	* Testing method:Structural Testing
	* Expected result: Failure
	*/
	@Test
	public void FA_REV_STRUCTURAL_04() throws TokenManagementException, IOException {
		TokenManager myManager = TokenManager.getInstance();
		this.resetTokenRevocationStore();
		myManager.TokenRequestGeneration("JsonTestFiles/Structural/CorrectFileActuator.json");
		myManager.RequestToken("JsonTestFiles/Structural/CorrectTokenRequestActuator.json");
		String filePath ="JsonTestFiles/Structural/RevokeActuator.json";
		overwriteFile("Store/tokenRevocationStore","JsonTestFiles/Structural/STRUCT_03_tokenRequestStore.json");
		try {
			
			String res = myManager.RevokeToken(filePath);
			Assertions.assertEquals(res, "autonomous@vehicle.com");
		} catch (TokenManagementException exception) {
			Assertions.fail("Error not expected");
		}
	}
	
}
