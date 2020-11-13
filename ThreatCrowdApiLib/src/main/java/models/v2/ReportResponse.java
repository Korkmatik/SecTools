package models.v2;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class ReportResponse {

	private final String responseCode;
	private final String md5;
	private final String sha1;
	private final ArrayList<String> scans = new ArrayList<String>();
	private final ArrayList<String> ips = new ArrayList<String>();
	private final ArrayList<String> domains = new ArrayList<String>();
	private final ArrayList<String> references = new ArrayList<String>();
	private final String permalink;
	
	public ReportResponse(String jsonData) {
		JSONObject root = new JSONObject(jsonData);
		
		responseCode = root.getString("response_code");
		md5 = root.getString("md5");
		sha1 = root.getString("sha1");
		
		JSONArray scans = root.getJSONArray("scans");
		if (scans != null) {
			for (int i = 0; i < scans.length(); i++) {
				this.scans.add(scans.getString(i));
			}
		}
		
		JSONArray ips = root.getJSONArray("ips");
		if (ips != null) {
			for (int i = 0; i < ips.length(); i++) {
				this.ips.add(ips.getString(i));
			}
		}
		
		JSONArray domains = root.getJSONArray("domains");
		if (domains != null) {
			for (int i = 0; i < domains.length(); i++) {
				this.domains.add(domains.getString(i));
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

	public String getMd5() {
		return md5;
	}

	public String getSha1() {
		return sha1;
	}

	public ArrayList<String> getScans() {
		return scans;
	}

	public ArrayList<String> getIps() {
		return ips;
	}

	public ArrayList<String> getDomains() {
		return domains;
	}

	public ArrayList<String> getReferences() {
		return references;
	}

	public String getPermalink() {
		return permalink;
	}
	
}
