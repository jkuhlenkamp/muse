package de.tu_berlin.ise.muse.analyzer.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Trace {

	private final Metric metric;
	private final Resource resource;
	/**
	 * Offset that must be applied to internally stored <code>Integer</code>
	 * values. Example: offset=1 => 100 -> 10.0
	 */
	private final Integer valueOffset;
	
	// TODO Is this really required or does LocalDateTime sovle this?
	/**
	 * Offset that must be applied to internally stored <code>LocalDateTime</code>
	 * values. 
	 */
	private final Integer timeOffset;

	/**
	 * Ordered List of <code>LocalDateTime</code> and <code>Integer</code>
	 * tupels that represent measurements of the trace.
	 */
	private final List<Map.Entry<LocalDateTime, Integer>> measurements;

	public Trace(Metric metric, Resource resource, Integer offset, Integer timeOffset) {
		super();
		this.metric = metric;
		this.resource = resource;
		this.valueOffset = offset;
		this.timeOffset = timeOffset;
		this.measurements = new ArrayList<Map.Entry<LocalDateTime, Integer>>();
	}

	public Metric getMetric() {
		return metric;
	}

	public Resource getResource() {
		return resource;
	}

}