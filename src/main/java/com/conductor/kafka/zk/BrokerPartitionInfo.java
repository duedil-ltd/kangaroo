package com.conductor.kafka.zk;

import java.util.List;
import java.util.Map;

public class BrokerPartitionInfo {

	private final Map<Integer, List<Integer>> partitions;

	public BrokerPartitionInfo(Map<Integer, List<Integer>> partitions) {
		this.partitions = partitions;
	}

	public Map<Integer, List<Integer>> getPartitions() {
		return partitions;
	}
}
