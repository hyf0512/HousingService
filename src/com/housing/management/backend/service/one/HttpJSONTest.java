package com.housing.management.backend.service.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.io.*;  

import org.json.JSONException;
import org.json.JSONObject;





public class HttpJSONTest {


	public static String loadJSON (String url) {
        StringBuilder json = new StringBuilder();
        try {
            URL oracle = new URL(url);
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                                        yc.getInputStream()));
            String inputLine = null;
            while ( (inputLine = in.readLine()) != null) {
                json.append(inputLine);
            }
            in.close();
        } catch (MalformedURLException e) {
        } catch (IOException e) {
        }
        return json.toString();
    }
	
	
	
	public static String getUserIdFromJson(String return_msg)
	{
		System.out.print(return_msg);
		String result="";
		JSONObject object;
		try {
			object = new JSONObject(return_msg);
			
			result=object.optString("userId");
		} catch (JSONException e) {
			e.printStackTrace();
			System.out.print(e.toString());
		}
        System.out.print(result+"00");
        return result;
	}
	
	
}
