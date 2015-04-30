package de.tu_berlin.ise.muse.analyzer.enums.resources.aws;

import de.tu_berlin.ise.muse.analyzer.enums.resources.NetworkResourceName;

public enum AwsNetworkResourceName implements NetworkResourceName {

	// TODO add descriptions
	/**
	 * Contains names of all network related virtualized infrastructure resources that are exposed by the AWS services:
	 * - instance_to_device: 
	 * - instance_to_instance
	 */
	
	DEV_OPT_ON, DEV_OPT_OFF, NET_OPT_ON, NET_OPT_OFF;
}
