package de.tu_berlin.ise.muse.analyzer.enums.resources.aws;

import de.tu_berlin.ise.muse.analyzer.enums.resources.InstanceResourceName;

public enum AwsInstanceResourceName implements InstanceResourceName {

	// TODO add missing instance descriptions
	/**
	 * Contains names of all virtualized infrastructure resources that are exposed by the AWS EC2 service:
	 * - t2: t2.micro, t2.small, t2.medium
	 * - m3: m3.medium, m3.large, m3.xlarge, m3.2xlarge
	 */
	
	// TODO add missing instance types
	T2_MICRO, T2_SMALL, T2_MEDIUM, M3_MEDIUM, M3_LARGE, M3_XLARGE, M3_2XLARGE; 
}