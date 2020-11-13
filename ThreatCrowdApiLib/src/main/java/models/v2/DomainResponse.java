package models.v2;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONObject;

public class DomainResponse {

	private final String responseCode;
	
	private final ArrayList<Resolution> resolutions = new ArrayList<Resolution>();
	private final ArrayList<String> hashes = new ArrayList<String>();
	private final ArrayList<String> emails = new ArrayList<String>();
	private final ArrayList<String> subdomains = new ArrayList<String>();
	private final ArrayList<String> references = new ArrayList<String>();
	
	private final int votes;
	private final String permalink;
	
	public DomainResponse(String jsonData) {
		System.out.println(jsonData);
		
		
		JSONObject jo = new JSONObject(jsonData);
		
		responseCode = jo.getString("response_code");
		
		JSONArray resolutions = jo.getJSONArray("resolutions");
		for (int i = 0; i < resolutions.length(); i++) {
			Resolution resolution = new Resolution((JSONObject) resolutions.get(i));
			this.resolutions.add(resolution);
		}
		
		JSONArray hashes = jo.getJSONArray("hashes");
		if (hashes != null) {
			for (int i = 0; i < hashes.length(); i++) {
				this.hashes.add(hashes.getString(i));
			}
		}
		
		JSONArray emails = jo.getJSONArray("emails");
		if (emails != null) {
			for (int i = 0; i < emails.length(); i++) {
				this.emails.add(emails.getString(i));
			}
		}
		
		JSONArray subdomains = jo.getJSONArray("subdomains");
		if (subdomains != null) {
			for (int i = 0; i < subdomains.length(); i++) {
				this.subdomains.add(subdomains.getString(i));
			}
		}
		
		JSONArray references = jo.getJSONArray("references");
		if (references != null) {
			for (int i = 0; i < references.length(); i++) {
				this.references.add(references.getString(i));
			}
		}
		
		votes = jo.getInt("votes");
		permalink = jo.getString("permalink");
	}

	public String getResponseCode() {
		return responseCode;
	}

	public ArrayList<Resolution> getResolutions() {
		return resolutions;
	}

	public ArrayList<String> getHashes() {
		return hashes;
	}
	
	public ArrayList<String> getEmails() {
		return emails;
	}
	
	public ArrayList<String> getSubdomains() {
		return subdomains;
	}

	public ArrayList<String> getReferences() {
		return references;
	}

	public int getVotes() {
		return votes;
	}

	public String getPermalink() {
		return permalink;
	}
	
}
