package com.multi.gazee;

public class serviceVO {
	private int no;
	private String memId;
	private String title;
	private String content;
	private String category;
	private String img;
	private String reply;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	@Override
	public String toString() {
		return "serviceVO [no=" + no + ", memId=" + memId + ", title=" + title + ", content=" + content + ", category="
				+ category + ", img=" + img + ", reply=" + reply + "]";
	}
	
	
}
