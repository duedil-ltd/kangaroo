package com.conductor.kafka.zk;

import java.lang.reflect.Type;

import com.conductor.kafka.Broker;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class BrokerDeserializer implements JsonDeserializer<Broker> {

	@Override
	public Broker deserialize(JsonElement json, Type type,
			JsonDeserializationContext context) throws JsonParseException {
		JsonObject jsonObj = json.getAsJsonObject();
		
		Broker broker = new Broker();
		
		broker.setHost(jsonObj.get("host").getAsString()); 
		broker.setPort(jsonObj.get("port").getAsInt());
		
		return broker;
	}

}
