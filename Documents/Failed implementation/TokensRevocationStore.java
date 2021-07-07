package Transport4Future.TokenManagement.Store;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import Transport4Future.TokenManagement.Data.TokenRevoked;
import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

public class TokensRevocationStore extends genericStore implements IStore{
	
	
	
private static TokensRevocationStore store;
	
	private TokensRevocationStore() {
		STOREPATH = System.getProperty("user.dir") + "/Store/tokenRevocationStore.json";
	}
	
	public static TokensRevocationStore getInstance () {
		if (store == null) {
			store = new TokensRevocationStore();
		}
		return store;
	}
	
	@Override
	public TokensRevocationStore clone() {
		try {
			throw new CloneNotSupportedException ();
		}
		catch (CloneNotSupportedException ex){
//			System.out.println("Token Store Object cannot be cloned");
		}
		return null;
	}
	
/**	public void saveTokenRevoked(TokenRevoked req, String tokenValue)
			throws TokenManagementException {
		HashMap<String, TokenRevoked> clonedMap = this.loadTokenRevokedRepository();
		// Guardar el Tokens Requests Store actualizado		
		if (clonedMap==null) {
        	clonedMap = new HashMap<String, TokenRevoked> ();
        	clonedMap.put (tokenValue, req);	        	
        }
        else if (!clonedMap.containsKey(tokenValue)){
        	clonedMap.put (tokenValue, req);
        }
		saveStore(clonedMap);
	}
 * @throws TokenManagementException 
*/
	
	public void saveValue(TokenRevoked req, String Value) throws TokenManagementException {
		super.saveValue(req, Value);
	}
	
	public void saveStore(HashMap<String, Object> clonedMap) throws TokenManagementException {
		super.saveStore(clonedMap);
	}
	
	/**private void saveStore(HashMap<String, TokenRevoked> clonedMap) throws TokenManagementException {
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
	}*/

	public boolean Find (String tokenValue) throws TokenManagementException{
		TokensRevocationStore requestStore = TokensRevocationStore.getInstance();
		HashMap<String, Object> clonedMap = requestStore.loadRepository();
        if (clonedMap==null) {
			return false;	        	
        }
        else if (!clonedMap.containsKey(tokenValue)){
			return false;	        	
        }
        else {
        	return true;
        }
	}
	
	/*public boolean Find (String tokenValue) throws TokenManagementException {
		TokensRevocationStore requestStore = TokensRevocationStore.getInstance();
		HashMap<String, TokenRevoked> clonedMap = requestStore.loadTokenRevokedRepository();
        if (clonedMap==null) {
			return false;	        	
        }
        else if (!clonedMap.containsKey(tokenValue)){
			return false;	        	
        }
        else {
        	return true;
        }
	}*/
	
	public HashMap<String, Object> loadRepository(){
		return super.loadRepository();
	}
	
	/*private HashMap<String, TokenRevoked> loadTokenRevokedRepository() {
		//Generar un HashMap para guardar los objetos
		//Tengo que cargar el almacen de tokens request en memoria y añadir el nuevo si no existe
		HashMap<String, TokenRevoked> clonedMap = null;
		try {
			Gson gson = new Gson();
			String jsonString;
			String storePath = STOREPATH;
			
			Object object = gson.fromJson(new FileReader(storePath), Object.class);
			jsonString = gson.toJson(object);	
	        Type type = new TypeToken<HashMap<String, TokenRevoked>>(){}.getType();
	        clonedMap = gson.fromJson(jsonString, type);
		} catch (Exception e) {
			clonedMap=null;
		}
		return clonedMap;
	}*/
	
}
