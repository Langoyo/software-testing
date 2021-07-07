// Copyright (C) 2020 Transport4Future
// Author: Carlos Gallego and Andrés Langoyo
// All rights reserved 
// Description: Tests to verify second functionality
// Version 1.0

package Transport4Future.TokenManagement.IO;

import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

public interface ITokenManagementParser {
	/**General method of the interface used to Parse
	 * @param FileName
	 * @return
	 * @throws TokenManagementException
	 */
	public Object Parse (String FileName) throws TokenManagementException;
}
