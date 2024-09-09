package com.egjson;

import java.io.FileOutputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class WriteJSONEg2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ObjectMapper omapper = new ObjectMapper();
		ObjectNode onode = omapper.createObjectNode();
		
		onode.put("name", "Ravi");
		onode.put("age", 25);
		
		FileOutputStream fos = new FileOutputStream("./operson.json");
		
		omapper.writeValue(fos, onode);

	}

}
