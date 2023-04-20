package com.multi.gazee;

public class reportTempVO {
	private String memID;
	private String title;
	private String content;
	private String img;
	public String getMemID() {
		return memID;
	}
	public void setMemID(String memID) {
		this.memID = memID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "reportTempVO [memID=" + memID + ", title=" + title + ", content=" + content + ", img=" + img + "]";
	}
	
	
}
