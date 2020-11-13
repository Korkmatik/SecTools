package models.v2;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import models.v2.abstractResponses.Response;

public class EmailResponse extends Response {

	private final ArrayList<String> domains = new ArrayList<String>();
	private final ArrayList<String> references = new ArrayList<String>();
	
	public EmailResponse(String jsonData) {
		super(jsonData);
		
		JSONObject root = getJSONObject();
		
		JSONArray domains = root.getJSONArray("domains");
		for (int i = 0; i < domains.length(); i++) {
			this.domains.add(domains.getString(i));
		}
		
		JSONArray references = root.getJSONArray("references");
		for (int i = 0; i < references.length(); i++) {
			this.references.get(i);
		}
	}

	public ArrayList<String> getDomains() {
		return domains;
	}

	public ArrayList<String> getReferences() {
		return references;
	}
	
}
