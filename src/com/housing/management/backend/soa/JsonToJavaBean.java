package com.housing.management.backend.soa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonToJavaBean<T extends Base> {
	
	private T t;
	
	public JsonToJavaBean(T t){
		this.t = t;
	}

	public List<T> getJsonToJavaBean(String restURL,String requestMethod, String requestData) throws IOException {

		URL url = null;
	    HttpURLConnection httpurlconnection = null;

	      url = new URL(restURL);
	      httpurlconnection = (HttpURLConnection) url.openConnection();
	      httpurlconnection.setDoOutput(true);
	      httpurlconnection.setRequestMethod(requestMethod);
	      httpurlconnection.setRequestProperty("Content-type","application/json");

	      if("POST".equals(requestMethod) || "PUT".equals(requestMethod)){
		      httpurlconnection.getOutputStream().write(requestData.getBytes());
		      httpurlconnection.getOutputStream().flush();
		      httpurlconnection.getOutputStream().close();
	      }

	      
	      InputStream in = httpurlconnection.getInputStream();
	      BufferedReader rd = new BufferedReader(new InputStreamReader(in));
	      String tempLine = rd.readLine();
	      StringBuffer temp = new StringBuffer();
	   
	      while (tempLine != null)
	      {                temp.append(tempLine);
	                       tempLine = rd.readLine();
	      }
	      String jsonData = temp.toString();
	      rd.close();
	      in.close();
	      if(httpurlconnection!=null){
	    	  httpurlconnection.disconnect();
	      }
	      
		 JSONObject jsonobject = JSONObject.fromObject(jsonData);
	
			// 获取一个json数组
			JSONArray array = jsonobject.getJSONArray("items");
			// 将json数组 转换成 List<T>泛型
			List<T> list = new ArrayList<T>();
			for (int i = 0; i < array.size(); i++) {
				JSONObject object = (JSONObject) array.get(i);
				// 转换T实体类
				@SuppressWarnings("unchecked")
				T items = (T) JSONObject.toBean(object, t.getClass(), t.getClassMap());
				if (items != null) {
					list.add(items);
				}
			}

		return list;
	}
}
