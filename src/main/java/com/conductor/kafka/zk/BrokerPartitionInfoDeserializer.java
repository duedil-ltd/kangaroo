package com.conductor.kafka.zk;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import com.google.common.reflect.TypeToken;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class BrokerPartitionInfoDeserializer implements JsonDeserializer<BrokerPartitionInfo> {

	@Override
	public BrokerPartitionInfo deserialize(JsonElement json, Type type,
			JsonDeserializationContext context) throws JsonParseException {
		JsonObject jsonObj = json.getAsJsonObject();
		
		Map<Integer, List<Integer>> partitions = context.deserialize(
				jsonObj.get("partitions").getAsJsonObject(), 
				new TypeToken<Map<Integer, List<Integer>>>(){}.getType());
		
		return new BrokerPartitionInfo(partitions);
	}

}
