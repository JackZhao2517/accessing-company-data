package com.example.accessingcompanydata.utils;

import com.fasterxml.jackson.databind.JsonNode;

import java.io.Serializable;
import java.util.LinkedHashMap;

public class ResponseBean {
	 private int status;
	  private String message;
	  private LinkedHashMap<String, JsonNode> data = new LinkedHashMap<String, JsonNode>();

	  public ResponseBean(int status, String msg) {
	    this.status = status;
	    this.message = msg;
	  }

	  public static final ResponseBean status(int status) {
	    return new ResponseBean(status, "");
	  }

	  public ResponseBean data(String name, Object value) throws Exception {
	    this.data.put(name, JSONUtil.toJsonNode(value));
	    return this;
	  }

	  public ResponseBean data(Object value) throws Exception {
	    this.data.put("result", JSONUtil.toJsonNode(value));
	    return this;
	  }

	  public ResponseBean error(Object value) throws Exception {
	    this.data.put("error", JSONUtil.toJsonNode(value));
	    return this;
	  }

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LinkedHashMap<String, JsonNode> getData() {
		return data;
	}

	public void setData(LinkedHashMap<String, JsonNode> data) {
		this.data = data;
	}
	  
	  
}
