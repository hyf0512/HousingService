package com.housing.management.backend.service.one;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.housing.management.backend.dao.FcbzyyDAO;
import com.housing.management.backend.domain.Fcbzyy;

@Service
public class FcbbyyLoginService {
	@Autowired
	private FcbzyyDAO fcbzyyDAO;
	
	/**
	 * 房产办证预约登录
	 * 
	 * @param username
	 * @param password
	 * @return 
	 */

	public Fcbzyy login(String username,String password){
		Fcbzyy fcbzyy = new Fcbzyy();
		username.trim();
		password.trim();
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
			md.update(password.getBytes());
			byte b[] = md.digest();
			int i;
			 
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            password = buf.toString();
            String temp1 = password.substring(0, 12);
            String temp2 = password.substring(12, 18);
            String temp3 = password.substring(18);
            String a = temp2.substring(3, 4);
            String a1;
            char[] chars = a.toCharArray();
            int as = (int)chars[0];
            if(as<100){
            	a1 = "0"+String.valueOf(as);
            }
            else{
            	a1 = String.valueOf(as);
            }
            temp3 = temp3 + a1;
            password = temp2 + temp3 + temp1;
			System.out.println(password);
			fcbzyy.setUserId(username);
			fcbzyy.setPassword(password);
			fcbzyy = fcbzyyDAO.login(fcbzyy);
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return fcbzyy;
	}
}
