package com.simplilearn.mavenproject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.ArrayList;



import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;




/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String args[]) throws FileNotFoundException, IOException, ParseException {
	readFile("D:/jsonOutput.json",3);		
	}
	
	public static void readFile(String fileName, int semitone) throws FileNotFoundException, IOException, ParseException {
	JSONParser parser = new JSONParser();
	Object output =  parser.parse(new FileReader(fileName));
    JSONObject json = (JSONObject) output;
    
	transposition(json, semitone);  	
	
	}
	
	public static void transposition(JSONObject json,int semiTone) {
		Set arr = json.keySet();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>(); 
		arr.forEach(k -> {
        list.add(Map.of((String)k,(int)semiTone));
		
		});
	System.out.println(list);
	  
		
		
	
		
	}
	

    
}
