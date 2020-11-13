package models.v2.abstractResponses;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public abstract class Response {

	protected final JSONObject root;
	
	private final String responseCode;
	private final String permalink;
	
	private final ArrayList<String> references = new ArrayList<String>();
	
	public Response(String jsonData) {
		root = new JSONObject(jsonData);
		
		responseCode = root.getString("response_code");
		permalink = root.getString("permalink");
		
		JSONArray references = root.getJSONArray("references");
		if (references != null) {
			for (int i = 0; i < references.length(); i++) {
				this.references.add(references.getString(i));
			}
		}
	}
	
	public String getResponseCode() {
		return responseCode;
	}
	
	public String getPermalink() {
		return permalink;
	}

	public ArrayList<String> getReferences() {
		return references;
	}
	
	protected JSONObject getJSONObject() {
		return root;
	}
}
