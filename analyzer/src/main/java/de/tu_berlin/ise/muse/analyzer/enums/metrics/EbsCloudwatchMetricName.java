package de.tu_berlin.ise.muse.analyzer.enums.metrics;

public enum EbsCloudwatchMetricName implements CloudwatchMetricName {

	/**
	 * Contains names of all metrics that are exposed by AWS CloudWatch for the AWS EBS service:
	 * - Throughput: VolumeReadBytes, VolumeWriteBytes, VolumeReadOps, VolumeWriteOps
	 * - Latency: VolumeTotalReadTime, VolumeTotalWriteTime
	 * - VolumeIdleTime
	 * - VolumeQueueLength
	 * - VolumeThroughputPercentage
	 * - VolumeConsumedReadWriteOps;
	 */
	VOLUMEREADBYTES, VOLUMEWRITEBYTES, VOLUMEREADOPS, VOLUMEWRITEOPS, VOLUMETOTALREADTIME, VOLUMETOTALWRITETIME, VOLUMEIDLETIME, VOLUMEQUEUELENGTH, VOLUMETHROUGHPUTPERCENTAGE, VOLUMECONSUMEDREADWRITEOPS;
}
