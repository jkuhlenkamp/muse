package de.tu_berlin.ise.muse.analyzer.enums.metrics;

public enum Ec2CloudwatchMetricName implements CloudwatchMetricName {

	/**
	 * Contains names of all metrics that are exposed by AWS CloudWatch for the AWS EC2 service:
	 * - Cpu: CPUUtilization, CPUCreditUsage, CPUCreditBalance, 
	 * - Disk: DiskReadOps, DiskWriteOps, DiskReadBytes, DiskWriteBytes, 
	 * - Network: NetworkIn, NetworkOut, 
	 * - Status: StatusCheckFailed, StatusCheckFailed_Instance, StatusCheckFailed_System;
	 */
	CPUCREDITUSAGE, CPUCREDITBALANCE, CPUUTILIZATION, DISKREADOPS, DISKWRITEOPS, DISKREADBYTES, DISKWRITEBYTES, NETWORKIN, NETWORKOUT, STATUSCHECKFAILED, STATUSCHECKFAILED_INSTANCE, STATUSCHECKFAILED_SYSTEM;
}
