// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement.Data;

import java.util.HashMap;

import Transport4Future.TokenManagement.Data.Attributes.DeviceName;
import Transport4Future.TokenManagement.Data.Attributes.DriverVersion;
import Transport4Future.TokenManagement.Data.Attributes.EMail;
import Transport4Future.TokenManagement.Data.Attributes.MACAddress;
import Transport4Future.TokenManagement.Data.Attributes.SerialNumber;
import Transport4Future.TokenManagement.Data.Attributes.TypeOfDevice;
import Transport4Future.TokenManagement.Exceptions.TokenManagementException;
import Transport4Future.TokenManagement.IO.TokenRequestParser;
import Transport4Future.TokenManagement.Store.TokensRequestStore;
import Transport4Future.Utils.MD5Hasher;

public class TokenRequest {
	

	private DeviceName deviceName;
	private TypeOfDevice typeOfDevice;
	private DriverVersion driverVersion;
	private EMail supportEMail;
	private SerialNumber serialNumber;
	private MACAddress macAddress;
	private String hash;
	
	/**
	 * Receives a tokenRequest JSON and stores it
	 * 
	 * @param InputFile
	 * @throws TokenManagementException
	 */
	public TokenRequest (String InputFile) throws TokenManagementException {
		TokenRequestParser myParser = new TokenRequestParser();
		HashMap<String, String> items = (HashMap<String, String>) myParser.Parse(InputFile);
		this.deviceName = new DeviceName (items.get(TokenRequestParser.DEVICE_NAME));
		this.typeOfDevice = new TypeOfDevice (items.get(TokenRequestParser.TYPE_OF_DEVICE));
		this.driverVersion = new DriverVersion(items.get(TokenRequestParser.DRIVER_VERSION));
		this.supportEMail = new EMail(items.get(TokenRequestParser.SUPPORT_E_MAIL));
		this.serialNumber = new SerialNumber(items.get(TokenRequestParser.SERIAL_NUMBER));
		this.macAddress = new MACAddress(items.get(TokenRequestParser.MAC_ADDRESS));		
		this.hash = generateHash();
		this.Store();
	}
	
	/**
	 * Generates a MD5 hash f the token
	 * 
	 * @return MD5 hash
	 * @throws TokenManagementException
	 */
	private String generateHash() throws TokenManagementException {
		MD5Hasher myHasher = new MD5Hasher();
		return myHasher.Hash(this.toString());	
	}
	
	/**
	 * Saves the tokenRequest in the store
	 * 
	 * @throws TokenManagementException
	 */
	
	private void Store () throws TokenManagementException {
		TokensRequestStore myStore = TokensRequestStore.getInstance();
		myStore.saveTokenRequest(this, this.hash);
	}
	
	/**
	 * @return TokenRequest's deviceName
	 */
	public String getDeviceName() {
		return deviceName.getValue();
	}

	/**
	 * @return TokenRequest's type of device
	 */
	public String getTypeOfDevice() {
		return typeOfDevice.getValue();
	}

	/**
	 * @return TokenRequest's driverVersion
	 */
	public String getDriverVersion() {
		return driverVersion.getValue();
	}

	/**
	 * @return TokenRequest's supportEmail
	 */
	public String getSupportEMail() {
		return supportEMail.getValue();
	}

	/**
	 * @return TokenRequest's serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber.getValue();
	}

	/**
	 * @return TokenRequest's macAddress
	 */
	public String getMacAddress() {
		return macAddress.getValue();
	}
	
	/**
	 * @return TokenRequest's MD5 hash
	 */
	public String getHash() {
		return this.hash;
	}
	
	/**
	 * String representing the tokenRequest
	 */
	@Override
	public String toString() {
		return "TokenRequest [\\n\\" + TokenRequestParser.DEVICE_NAME + "=" + this.getDeviceName() +
				",\n\t\\" + TokenRequestParser.TYPE_OF_DEVICE + "=" + this.getTypeOfDevice() +
				",\n\t\\" + TokenRequestParser.DRIVER_VERSION + "=" + this.getDriverVersion() +	
				",\n\t\\" + TokenRequestParser.SUPPORT_E_MAIL + "=" + this.getSupportEMail() +	
				",\n\t\\" + TokenRequestParser.SERIAL_NUMBER + "=" + this.getSerialNumber() +
				",\n\t\\" + TokenRequestParser.MAC_ADDRESS + "=" + this.getMacAddress() + "\n]";
	}
}
