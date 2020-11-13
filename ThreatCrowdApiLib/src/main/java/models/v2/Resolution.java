package models.v2;

import org.json.JSONObject;

public class Resolution {

	private final String lastResolved;
	private final String ipAddress;
	
	public Resolution(JSONObject data) {
		lastResolved = data.getString("last_resolved");
		ipAddress = data.getString("ip_address");
	}

	@Override
	public String toString() {
		return "Resolution [lastResolved=" + lastResolved + ", ipAddress=" + ipAddress + "]";
	}
	
}
