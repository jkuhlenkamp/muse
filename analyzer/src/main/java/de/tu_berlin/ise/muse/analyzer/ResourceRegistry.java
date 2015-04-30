package de.tu_berlin.ise.muse.analyzer;

import java.util.HashMap;
import java.util.Map;

import de.tu_berlin.ise.muse.analyzer.model.Resource;

public class ResourceRegistry implements InterfaceResourceRegistry {

	private static ResourceRegistry instance;
	
	private final Map<String, Resource> resources;
	
	private ResourceRegistry() {
		super();
		this.resources = new HashMap<String, Resource>();
	}

	public static synchronized InterfaceResourceRegistry getInstance() {
		if (ResourceRegistry.instance == null) {
			ResourceRegistry.instance = new ResourceRegistry();
		}
		return ResourceRegistry.instance;
	}
	
	public Resource getResource(String id) {
		return resources.get(id);
	}

	public void addResource(Resource resource) {
		resources.put(resource.getId(), resource);
	}

}
