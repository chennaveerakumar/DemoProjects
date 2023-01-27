package deserialization;

import java.io.File;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;

import pojoclsassignment2.ComplextData;

public class DeserializationAssinment2 {
	@Test
   public void deserializationmethod() throws Throwable, JsonProcessingException {
	   JsonMapper jsonObj = new JsonMapper();
	   ComplextData jsonBody = jsonObj.readValue(new File("./ComplexJson.json"),ComplextData.class);
	   String topic = jsonBody.getSource().get(0).getAnnotations().getTopic();
	   System.out.println(topic);
	   String yearIndex2 = jsonBody.getData().get(2).getID_Year();
	   System.out.println(yearIndex2);
   }
}