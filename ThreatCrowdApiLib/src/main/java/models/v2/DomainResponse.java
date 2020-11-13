package models.v2;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import models.v2.abstractResponses.Response;
import models.v2.abstractResponses.ResponseWithHashes;
import models.v2.helperObjects.Resolution;

public class DomainResponse extends ResponseWithHashes {
	
	private final ArrayList<Resolution> resolutions = new ArrayList<Resolution>();
	
	private final ArrayList<String> emails = new ArrayList<String>();
	private final ArrayList<String> subdomains = new ArrayList<String>();
	
	private final int votes;
	
	public DomainResponse(String jsonData) {
		super(jsonData);
		
		JSONArray resolutions = root.getJSONArray("resolutions");
		if (resolutions != null) {
			for (int i = 0; i < resolutions.length(); i++) {
				Resolution resolution = new Resolution((JSONObject) resolutions.get(i));
				this.resolutions.add(resolution);
			}	
		}
		
		JSONArray emails = root.getJSONArray("emails");
		if (emails != null) {
			for (int i = 0; i < emails.length(); i++) {
				this.emails.add(emails.getString(i));
			}
		}
		
		JSONArray subdomains = root.getJSONArray("subdomains");
		if (subdomains != null) {
			for (int i = 0; i < subdomains.length(); i++) {
				this.subdomains.add(subdomains.getString(i));
			}
		}
		
		votes = root.getInt("votes");
	}

	public ArrayList<Resolution> getResolutions() {
		return resolutions;
	}
	
	public ArrayList<String> getEmails() {
		return emails;
	}
	
	public ArrayList<String> getSubdomains() {
		return subdomains;
	}

	public int getVotes() {
		return votes;
	}
	
}
