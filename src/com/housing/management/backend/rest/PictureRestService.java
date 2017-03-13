package com.housing.management.backend.rest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.housing.management.backend.domain.Picture;
import com.housing.management.backend.service.one.PictureuploadService;

@Controller
@RequestMapping({ "/picture" })
public class PictureRestService {
	private static final Logger logger = Logger.getLogger(ByfzRestService.class);
	@Autowired
	private PictureuploadService upload = new PictureuploadService();
	
	@RequestMapping(value = { "/send/uplode" } , method = { RequestMethod.POST })
	@ResponseBody
	public Picture UploadService(@RequestBody Picture picture){
		logger.info("上传图片开始");
		picture=upload.uploadpicture(picture);
		logger.info("上传图片结束");
		return picture;
	}
}
