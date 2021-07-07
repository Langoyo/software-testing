// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests for tokenVerify
// Version 1.0

package Transport4Future.TokenManagement;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

class VerifyTokenTest {
	private TokenManager myManager;
	/**
	 * Method to verify a token
	 */
	public VerifyTokenTest () {
		 myManager = TokenManager.getInstance();
	}
	/**
	 * Method to empty a TokenStore
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
	 * Method to insert a token
	 * @throws TokenManagementException
	 */
	private void insertFirstToken () throws TokenManagementException {
		this.resetTokenStore();
		String InputFile = System.getProperty("user.dir") + "/TestData/TokenRequestTest/CorrectTokenRequest.json";
		myManager.RequestToken(InputFile);
	}
	/**
	 * Method to insert a token
	 * @throws TokenManagementException
	 */
	private void insertSecondToken () throws TokenManagementException {
		String InputFile = System.getProperty("user.dir") + "/TestData/TokenRequestTest/SecondCorrectTokenRequest.json";
		myManager.RequestToken(InputFile);		
	}
	/**
	 * Test for a token in an empty store
	 * @throws TokenManagementException
	 */
	@Test
	@DisplayName("RF03 - TC01 - Buscar un token en un almacén de tokens vacío")
	void VerifyTokenEmptyTokenStore() throws TokenManagementException {
		this.resetTokenStore();
		String tokenToVerify = "ABxnPUhTMjU2XG4gVHlwPVBEU1xuRGV2PTI3OGU3ZTI3NzMyYzRlNTM5NDZjZjIwMDU4YWQ4MTM4XG4gaWF0PTE4LTAzLTIwMjAgMTA6MjI6MjBcbiBleHA9MjUtMDMtMjAyMCAxMDoyMjoyMGIzYWMwYjRkNjQyOTE1OGRhMTI4NzYxZTk4Y2U4MzE3ZmE5MjhkNDJjNzEwYTlkMDZmNjRjOTY2N2JkZDM3MWM=";
		boolean result = myManager.VerifyToken(tokenToVerify);
		assertEquals (false,result);
	}
	/**
	 * Test to search a token that does not exist in store that contains one element
	 * @throws TokenManagementException
	 */
	@Test
	@DisplayName("RF03 - TC02 - Buscar un token que no existe en un almacén de registros que contiene un elemento")
	void VerifyTokenNonExistingToken() throws TokenManagementException {
		this.insertFirstToken();
		String tokenToVerify = "ABxnPUhTMjU2XG4gVHlwPVBEU1xuRGV2PTI3OGU3ZTI3NzMyYzRlNTM5NDZjZjIwMDU4YWQ4MTM4XG4gaWF0PTE4LTAzLTIwMjAgMTA6MjI6MjBcbiBleHA9MjUtMDMtMjAyMCAxMDoyMjoyMGIzYWMwYjRkNjQyOTE1OGRhMTI4NzYxZTk4Y2U4MzE3ZmE5MjhkNDJjNzEwYTlkMDZmNjRjOTY2N2JkZDM3MWM=";
		boolean result = myManager.VerifyToken(tokenToVerify);
		assertEquals (false,result);
	}
	/**
	 * Test to search a token in the Store
	 * @throws TokenManagementException
	 */
	@Test
	@DisplayName("RF03 - TC03 - Buscar un token que existe en almacén con registros")
	void VerifyTokenCorrectTest() throws TokenManagementException {
		this.insertFirstToken();
		String tokenToVerify = "QWxnPUhTMjU2XG4gVHlwPVBEU1xuRGV2PTI3OGU3ZTI3NzMyYzRlNTM5NDZjZjIwMDU4YWQ4MTM4XG4gaWF0PTE4LTAzLTIwMjAgMTA6MjI6MjBcbiBleHA9MjUtMDMtMjAyMCAxMDoyMjoyMGIzYWMwYjRkNjQyOTE1OGRhMTI4NzYxZTk4Y2U4MzE3ZmE5MjhkNDJjNzEwYTlkMDZmNjRjOTY2N2JkZDM3MWM=";
		boolean result = myManager.VerifyToken(tokenToVerify);
		assertEquals (false,result);
	}
	/**
	 * Test to search a Token when there is no Store
	 * @throws TokenManagementException
	 */
	@Test
	@DisplayName("RF03 - TC04 - Buscar un token cuando el almacén no existe")
	void VerifyTokenNonExitingTokenStore() throws TokenManagementException {
		String storePath = System.getProperty("user.dir") + "/Store/tokenStore.json";
		File file = new File(storePath);
        file.delete();
		String tokenToVerify = "ABxnPUhTMjU2XG4gVHlwPVBEU1xuRGV2PTI3OGU3ZTI3NzMyYzRlNTM5NDZjZjIwMDU4YWQ4MTM4XG4gaWF0PTE4LTAzLTIwMjAgMTA6MjI6MjBcbiBleHA9MjUtMDMtMjAyMCAxMDoyMjoyMGIzYWMwYjRkNjQyOTE1OGRhMTI4NzYxZTk4Y2U4MzE3ZmE5MjhkNDJjNzEwYTlkMDZmNjRjOTY2N2JkZDM3MWM=";
		boolean result = myManager.VerifyToken(tokenToVerify);
		assertEquals (false,result);
	}
	/**
	 * Test to search a valid Token
	 * @throws TokenManagementException
	 */
	@Test
	@DisplayName("RF03 - TC05 - Buscar un token válido")
	void VerifyValidToken() throws TokenManagementException {
		this.insertFirstToken();
		this.insertSecondToken();
		String tokenToVerify = "QWxnPUhTMjU2XG4gVHlwPVBEU1xuRGV2PTZjODgzZjFjYjJlNmUxNTQ0N2RkMWM1MDg3YzU3ZjBkXG4gaWF0PTE4LTAzLTIwMjAgMTA6MjI6MjBcbiBleHA9MTYtMDQtMjAyMiAxODo1NTo0MDc3NDU5ZjFlOWQ2MmVmNTBhMzk1YmY1YjdiYjZlZmY4NTIwMTU5ZTdiNTA0YTZiNDJjZGY2OWMwZGEyNTAxMjE=";
		boolean result = myManager.VerifyToken(tokenToVerify);
		assertEquals (true,result);
	}
}
