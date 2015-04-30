package de.tu_berlin.ise.muse.analyzer.model;

import java.util.ArrayList;
import java.util.List;

import de.tu_berlin.ise.muse.analyzer.enums.resources.EnumResourceType;
import de.tu_berlin.ise.muse.analyzer.enums.resources.ResourceName;

public class Resource {

	private final String id;
	private final ResourceName name;
	private final String provider;
	private final EnumResourceType type;
	
	private List<Trace> traces;
	private List<Metric> metrics;

	public Resource(String id, ResourceName name, String provider, EnumResourceType type) {
		super();
		this.id = id;
		this.name = name;
		this.provider = provider;
		this.type = type;
		this.traces = new ArrayList<Trace>();
		this.metrics = new ArrayList<Metric>();
	}

	public List<Metric> getMetrics() {
		return metrics;
	}

	public void setMetrics(List<Metric> metrics) {
		this.metrics = metrics;
	}

	public String getProvider() {
		return provider;
	}

	public EnumResourceType getType() {
		return type;
	}

	public List<Trace> getTraces() {
		return traces;
	}

	public ResourceName getName() {
		return name;
	}

	public void setTraces(List<Trace> traces) {
		this.traces = traces;
	}

	public String getId() {
		return id;
	}
	
}
