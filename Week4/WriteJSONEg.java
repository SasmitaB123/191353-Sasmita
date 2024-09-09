package com.egjson;
import java.io.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteJSONEg {
	
	public static void main(String args[]) throws Exception	{
		Address[] address = {new Address("Street1", "city1", 45651), new Address("street2", "city2", 45652)};
    
		Person obj = new Person("ravi", 46, address);
		ObjectMapper mapper = new ObjectMapper();
		
		FileOutputStream fos = new FileOutputStream("person.json");
		mapper.writeValue(fos, obj);
		
		String pjson = mapper.writeValueAsString(obj);
		System.out.println("JSON file has been created, pls check\n");
		
}
}
