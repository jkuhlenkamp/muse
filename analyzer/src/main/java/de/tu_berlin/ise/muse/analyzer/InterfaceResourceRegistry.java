package de.tu_berlin.ise.muse.analyzer;

import de.tu_berlin.ise.muse.analyzer.model.Resource;

public interface InterfaceResourceRegistry {
	
	public Resource getResource(String id);
		
	public void addResource(Resource resource);
		
}
