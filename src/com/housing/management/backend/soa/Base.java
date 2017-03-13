package com.housing.management.backend.soa;

import java.util.HashMap;
import java.util.Map;

public class Base {
	@SuppressWarnings("rawtypes")
	protected Map<String, Class> classMap = new HashMap<String, Class>();

	@SuppressWarnings("rawtypes")
	public Map<String, Class> getClassMap() {
		return classMap;
	}

	@SuppressWarnings("rawtypes")
	public void setClassMap(Map<String, Class> classMap) {
		this.classMap = classMap;
	}
}
