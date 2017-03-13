package com.housing.management.backend.service.one;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;

import sun.misc.BASE64Encoder;

@Service
public class FileService {
	
	/**
    *上传组件
    *
    * @param fileName
    * @param is
    * @return
	* @throws IOException 
    */
   public String uploadComponent(String host, String fileName,InputStream is) throws IOException {
      
       File dir = new File(host+"download");
       if (!dir.exists()) {
           dir.mkdirs();
       }
       
       // TODO
//       File file = new File(host + "download/" + fileName);
//       file.createNewFile();

       File file = new File(host + "download/" + fileName);
       
  
       byte[] contents = IOUtils.toByteArray(is);
       RandomAccessFile infile = new RandomAccessFile(file, "rw");
       infile.write(contents);
       infile.close();
	
       //return "download/" + fileName;
       return "/" + fileName;
   }
   
	/**
    *上传图片
    *
    * @param fileName
    * @param is
    * @type
    * 
    * @return
	* @throws IOException 
    */
   public String uploadImage(String host, String fileName,InputStream is,String type) throws IOException {
	   
	   byte[] data = null;  
	   data = new byte[is.available()];  
	   is.read(data);  
	   is.close();
	     
	   // 对字节数组Base64编码  
	   BASE64Encoder encoder = new BASE64Encoder();
	   //获取文件扩展名
	   int nameExIndex = fileName.lastIndexOf(".");
	   if(nameExIndex == -1){
		   //文件名错误
		   return null;
	   }
	   String nameEx = fileName.substring(nameExIndex+1);
	   return "data:image/" + nameEx + ";base64,"+encoder.encode(data);// 返回Base64编码过的字节数组字符串  
   }
}
