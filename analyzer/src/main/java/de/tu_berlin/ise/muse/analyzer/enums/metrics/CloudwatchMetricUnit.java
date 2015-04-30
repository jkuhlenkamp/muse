package de.tu_berlin.ise.muse.analyzer.enums.metrics;

public enum CloudwatchMetricUnit implements MetricUnit {

	/**
	 * Contains names of all units that are used to expose metrics by AWS CloudWatch:
	 * - absolute: Count 
	 * - relative: Percent
	 * - time: Seconds
	 * - datasize: Bytes
	 */
	COUNT, PERCENT, SECONDS, BYTES;
}