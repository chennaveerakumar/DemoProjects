package deserialization;

import java.io.File;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.json.JsonMapper;

import pojocls.KotakComplexPojo;

public class DeserialiozationKotakPojo {
	@Test
   public void DeserialKotakPojoclsTest() throws Throwable {
	  // ObjectMapper objMap = new ObjectMapper();
		JsonMapper jsonMap = new JsonMapper();
		KotakComplexPojo objMapper = jsonMap.readValue(new File(".\\kotakJSON1.json"), KotakComplexPojo.class);
		System.out.println(objMapper.getTime().getUpdated());
	}
}
