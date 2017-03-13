package com.housing.management.backend.service.one;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Random;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Service;

import sun.misc.BASE64Decoder;

import com.housing.management.backend.domain.Picture;

@Service
public class PictureuploadService {

	public Picture uploadpicture(Picture picture){
		String path = this.getClass().getClassLoader().getResource("/").getPath()+"uploads";
		path = URLDecoder.decode(path);
		//System.out.println(path);
		File f = new File(path);
		if(!f.exists()){  
			//System.out.println("1不存在");
            f.mkdir();  
        }
		path = path+"/"+picture.getSlbh();
		f = new File(path);
		if(!f.exists()){  
			//System.out.println("1不存在");
            f.mkdir();  
        }
		String fileData = picture.getFileData();
		String string = "abcdefghijklmnopqrstuvwxyz";
		StringBuffer sb = new StringBuffer();
		int len = string.length();
		Random random = new Random();//随机类初始化
	    for (int i = 0; i < 3; i++) {
	        sb.append(string.charAt(random.nextInt(len-1)));
	    }   
		String fileName = sb.toString();
		path = path + "/" + fileName + ".jpg"; //生成随机名字，避免重复 
		System.out.println(path);
        f = new File(path);  
        if(!f.exists()){
        	System.out.println("2不存在");
            f.mkdir();  
        }
        BASE64Decoder decoder = new BASE64Decoder();  
        try {  
            //通过Base64解密，将图片数据解密成字节数组  
            byte[] bytes = decoder.decodeBuffer(fileData);  
            //构造字节数组输入流  
            ByteArrayInputStream bais = new ByteArrayInputStream(bytes);  
            //读取输入流的数据  
            BufferedImage bi = ImageIO.read(bais);  
            //将数据信息写进图片文件中  
            ImageIO.write(bi, "jpg", f);// 不管输出什么格式图片，此处不需改动  
            bais.close();
            picture.setResult("true");
        } catch (IOException e) {
        	picture.setResult("false");
            System.out.println(e); 
        }  
		return picture;
	}
}
