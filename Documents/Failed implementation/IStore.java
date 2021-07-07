package Transport4Future.TokenManagement.Store;

import java.util.HashMap;

import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

public interface IStore {
	
	void saveValue(Object req, String Value)
			throws TokenManagementException;
	
	void saveStore(HashMap<String, Object> clonedMap) throws TokenManagementException;
	
	
	 HashMap<String, Object>  loadRepository();
	
}
