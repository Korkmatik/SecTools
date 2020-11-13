package models.v2;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class AntivirusResponse {

	private final String responseCode;
	
	private final ArrayList<String> hashes = new ArrayList<String>();
	private final ArrayList<String> references = new ArrayList<String>();
	
	private final String permalink;
	
	public AntivirusResponse(String jsonData) {
		JSONObject root = new JSONObject(jsonData);
		
		responseCode = root.getString("response_code");
		
		JSONArray hashes = root.getJSONArray("hashes");
		if (hashes != null) {
			for (int i = 0; i < hashes.length(); i++) {
				this.hashes.add(hashes.getString(i));
			}
		}
		
		JSONArray references = root.getJSONArray("references");
		if (references != null) {
			for (int i = 0; i < references.length(); i++) {
				this.references.add(references.getString(i));
			}
		}
		
		permalink = root.getString("permalink");
	}

	public String getResponseCode() {
		return responseCode;
	}

	public ArrayList<String> getHashes() {
		return hashes;
	}

	public ArrayList<String> getReferences() {
		return references;
	}

	public String getPermalink() {
		return permalink;
	}

}
