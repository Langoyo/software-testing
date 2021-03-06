package Transport4Future.TokenManagement.Store;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import Transport4Future.TokenManagement.Data.Token;
import Transport4Future.TokenManagement.Exceptions.TokenManagementException;

public class TokensStore {

	private List<Token> tokensList;
	private static TokensStore store;
	
	private TokensStore() {
		this.Load();
	}
	
	public static TokensStore getInstance () {
		if (store == null) {
			store = new TokensStore();
		}
/*		else {
			System.out.println("There a Token Store object already created");
		}*/
		return store;
	}
	
	@Override
	public TokensStore clone() {
		try {
			throw new CloneNotSupportedException ();
		}
		catch (CloneNotSupportedException ex){
//			System.out.println("Token Store Object cannot be cloned");
		}
		return null;
	}
	
	private void Load () {
		try
		{
			JsonReader reader = new JsonReader(new FileReader(System.getProperty("user.dir") + "/Store/tokenStore.json"));
			Gson gson = new Gson();
			Token [] myArray = gson.fromJson(reader, Token[].class);
			this.tokensList = new ArrayList<Token>();
			for (Token token: myArray) {
				this.tokensList.add(token);
			}
		}
		catch (Exception ex)
		{		
			this.tokensList = new ArrayList<Token>();
		}	
	}
	
	public void Add (Token newToken) throws TokenManagementException {
		if (Find(newToken.getTokenValue())==null) {
			tokensList.add(newToken);
			this.Save();
		}
	}
	
	private void Save () throws TokenManagementException {
		Gson gson = new Gson();  
		String jsonString = gson.toJson(this.tokensList);
        FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(System.getProperty("user.dir") + "/Store/tokenStore.json");
	        fileWriter.write(jsonString);
	        fileWriter.close();
		} catch (IOException e) {
			throw new TokenManagementException("Error: Unable to save a new token in the internal licenses store");
		}
	}
	
	public Token Find (String tokenToFind) {
		Token result = null;
	    for (Token token : this.tokensList) {
	    	String temp = token.getTokenValue();
	        if (temp.equals(tokenToFind)) {
	        	return token;
	        }
	    }
		return result;
	}
}
