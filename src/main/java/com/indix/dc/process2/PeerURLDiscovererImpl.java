package com.indix.dc.process2;

import org.springframework.stereotype.Component;

import com.indix.distributedcache.PeerURLDiscoverer;

@Component
public class PeerURLDiscovererImpl implements PeerURLDiscoverer {

	@Override
	public String getPeerURLToKeyLookup() {
		return "http://localhost:38001/cache/miss/get?key=%s";
	}
}
