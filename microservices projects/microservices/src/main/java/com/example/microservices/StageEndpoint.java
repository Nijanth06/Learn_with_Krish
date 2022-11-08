/*package com.example.microservices;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="stage")
public class StageEndpoint {
	
	Map<String,Stage> stages= new ConcurrentHashMap<>();
	
	@ReadOperation
	public Map<String, Stage> getAllStages(){
		return stages;
	}
	
	@ReadOperation
	public Stage getStage(@Selector String name) {
		return stages.get(name);
		
	}
	
	@WriteOperation
	public void setValue(@Selector String name, int stage) {
		stages.put(name, new Stage(stage));
		
	}
	
	static class Stage{
		int values;

		public Stage(int values) {
			this.values = values;
		}

		public int getValues() {
			return values;
		}

		public void setValues(int values) {
			this.values = values;
		}
		
		
		
		
	}

}*/
