package deserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.format.InputAccessor.Std;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StdDeserialization {
   public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
	String s="{\"name\":\"cvk\",\"age\":\"24\"}";
	ObjectMapper map = new ObjectMapper();
	Std readStd = map.readValue(s,Std.class);
	System.out.println(readStd);
	
}
}
