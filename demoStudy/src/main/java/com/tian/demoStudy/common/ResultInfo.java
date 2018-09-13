package com.tian.demoStudy.common;

import java.util.List;

public class ResultInfo<T> {
	
	private String name;
	
	private String msg;
	
	private List<T> resultList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<T> getResultList() {
		return resultList;
	}

	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}
	
	
}
