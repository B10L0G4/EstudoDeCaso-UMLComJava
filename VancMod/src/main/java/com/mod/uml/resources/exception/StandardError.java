package com.mod.uml.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer status;
	private String msg;
	private Long timeStand;
	
	
	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public Long getTimeStand() {
		return timeStand;
	}


	public void setTimeStand(Long timeStand) {
		this.timeStand = timeStand;
	}


	public StandardError(Integer status, String msg, Long timeStand) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStand = timeStand;
	} 
		
}
