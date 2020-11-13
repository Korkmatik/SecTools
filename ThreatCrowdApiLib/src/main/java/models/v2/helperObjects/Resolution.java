package models.v2.helperObjects;

import org.json.JSONObject;

public class Resolution {

	private final String lastResolved;
	private final String ipAddress;
	
	public Resolution(JSONObject data) {
		lastResolved = data.getString("last_resolved");
		if (data.has("ip_address")) {
			ipAddress = data.getString("ip_address");
		} else {
			String addr = data.getString("domain");
			if (addr.endsWith("\r")) {
				ipAddress = addr.substring(0, addr.length()-1);
			} else {
				ipAddress = addr;
			}
		}
	}

	@Override
	public String toString() {
		return "Resolution [lastResolved=" + lastResolved + ", ipAddress=" + ipAddress + "]";
	}
	
}
