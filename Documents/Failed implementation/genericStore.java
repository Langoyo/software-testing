package Transport4Future.TokenManagement.Store;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

public class genericStore implements IStore {	
	private static genericStore store;
	protected String STOREPATH;
	public static genericStore getInstance () {
		if (store == null) {
			store = new genericStore();
		}
		return store;
	}
	@Override
	public void saveValue(Object req, String Value) throws TokenManagementException {
		
		HashMap<String, Object> clonedMap = this.loadRepository();	
		if (clonedMap==null) {
        	clonedMap = new HashMap<String, Object> ();
        	clonedMap.put (Value, req);	        	
        }
        else if (!clonedMap.containsKey(Value)){
        	clonedMap.put (Value, req);
        }
		saveStore(clonedMap);
	}

	@Override
	public void saveStore(HashMap<String, Object> clonedMap) throws TokenManagementException {
		Gson gson = new Gson();
		String jsonString = gson.toJson(clonedMap);
        FileWriter fileWriter;
		String storePath = STOREPATH;
		try {
			fileWriter = new FileWriter(storePath);
	        fileWriter.write(jsonString);
	        fileWriter.close();
		} catch (IOException e) {
			throw new TokenManagementException("Error: Unable to save a new token in the internal licenses store");
		}
		
	}


	@Override
	public HashMap<String, Object> loadRepository() {
		HashMap<String, Object> clonedMap = null;
		try {
			Gson gson = new Gson();
			String jsonString;
			String storePath = STOREPATH;
			
			Object object = gson.fromJson(new FileReader(storePath), Object.class);
			jsonString = gson.toJson(object);	
	        Type type = new TypeToken<HashMap<String, Object>>(){}.getType();
	        clonedMap = gson.fromJson(jsonString, type);
		} catch (Exception e) {
			clonedMap=null;
		}
		return clonedMap;
		
	}
	
	
}
