package models.v2.abstractResponses;

import java.util.ArrayList;

import org.json.JSONArray;

public abstract class ResponseWithHashes extends Response {
	
	private final ArrayList<String> hashes = new ArrayList<String>();

	public ResponseWithHashes(String jsonData) {
		super(jsonData);
		
		JSONArray hashes = root.getJSONArray("hashes");
		if (hashes != null) {
			for (int i = 0; i < hashes.length(); i++) {
				this.hashes.add(hashes.getString(i));
			}
		}
	}
	
	public ArrayList<String> getHashes() {
		return hashes;
	}
} 
