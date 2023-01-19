package serialization;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import pojocls.Std;

public class StdSerialization {
    public static void main(String[] args) {
		ObjectMapper map = new ObjectMapper();
		Std std = new Std();
		std.name="cvk";
		std.age="24";
		try {
			map.writeValue(new File("./Login.json"), std);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
