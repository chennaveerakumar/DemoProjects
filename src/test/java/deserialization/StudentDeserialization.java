package deserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojocls.Students;




public class StudentDeserialization {
public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
	String json ="{\"name\":\"John\",\"age\":\"24\",\"phoneno\":[\"98754\",\"54677\"]}";
	ObjectMapper map = new ObjectMapper();
	Students st=map.readValue(json,Students.class);
	System.out.println(st.getName());
	System.out.println(st.getAge());
	System.out.println(st.getPhoneno(0));
    }
}
