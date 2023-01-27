package serialization;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class StdSerialization {
    public static void main(String[] args) {
		ObjectMapper map = new ObjectMapper();
		practiespojocls.Std stdobj = new practiespojocls.Std();
		stdobj.name="cvk";
		stdobj.age="24";
		try {
			map.writeValue(new File("./Login.json"), stdobj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
