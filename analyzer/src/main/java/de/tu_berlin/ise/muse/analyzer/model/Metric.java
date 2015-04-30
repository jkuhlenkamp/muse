package de.tu_berlin.ise.muse.analyzer.model;

import java.util.ArrayList;
import java.util.List;

import de.tu_berlin.ise.muse.analyzer.enums.metrics.MetricName;
import de.tu_berlin.ise.muse.analyzer.enums.metrics.MetricUnit;

public class Metric {

	private final MetricName name;
	private final MetricUnit unit;
	private final List<Resource> resources;
	private final List<Trace> traces;

	public Metric(MetricName name, MetricUnit unit) {
		super();
		this.name = name;
		this.unit = unit;
		this.resources = new ArrayList<Resource>();
		this.traces = new ArrayList<Trace>();
	}

	public MetricName getName() {
		return name;
	}
	
}
