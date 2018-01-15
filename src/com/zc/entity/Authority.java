package com.zc.entity;

public class Authority {
	//权限类
	private String displayName;
	private String url;
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Authority(String displayName, String url) {
		super();
		this.displayName = displayName;
		this.url = url;
	}
	public Authority() {
		super();
	}
	
}
