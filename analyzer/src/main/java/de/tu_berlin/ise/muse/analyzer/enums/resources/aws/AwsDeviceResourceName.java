package de.tu_berlin.ise.muse.analyzer.enums.resources.aws;

import de.tu_berlin.ise.muse.analyzer.enums.resources.DeviceResourceName;

public enum AwsDeviceResourceName implements DeviceResourceName {

	/**
	 * Contains names of all virtualized infrastructure resources that are exposed by the AWS EBS service:
	 * - gp2		General purpose volumes
	 * - io1		Provisioned IOPS volumes
	 * - standard	Deprecated volumes based on magnetic spindles
	 */
	
	GP2, IO1, STANDARD;
}
