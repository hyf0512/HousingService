package com.housing.management.backend.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/version" })
public class VersionRestService {

	@RequestMapping(method = { RequestMethod.GET })
	@ResponseBody
	public String version() {
		return "V0.1_2014_12_18 ";
	}
}