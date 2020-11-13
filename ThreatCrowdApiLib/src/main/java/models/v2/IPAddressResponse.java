package models.v2;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import models.v2.abstractResponses.ResponseWithHashes;
import models.v2.helperObjects.Resolution;

public class IPAddressResponse extends ResponseWithHashes {
	
	private final ArrayList<String> references = new ArrayList<String>();
	private final ArrayList<Resolution> resolutions = new ArrayList<Resolution>();
	
	private final int votes;
	
	public IPAddressResponse(String jsonData) {
		super(jsonData);
		
		JSONObject root = getJSONObject();
		
		JSONArray references = root.getJSONArray("references");
		if (references != null) {
			for (int i = 0; i < references.length(); i++) {
				this.references.add(references.getString(i));
			}
		}
		
		JSONArray resolutions = root.getJSONArray("resolutions");
		if (resolutions != null) {
			for (int i = 0; i < resolutions.length(); i++) {
				Resolution resolution = new Resolution((JSONObject) resolutions.get(i));
				this.resolutions.add(resolution);
			}	
		}
		
		votes = root.getInt("votes");
	}

	public ArrayList<Resolution> getResolutions() {
		return resolutions;
	}
	
	public int getVotes() {
		return votes;
	}
}
