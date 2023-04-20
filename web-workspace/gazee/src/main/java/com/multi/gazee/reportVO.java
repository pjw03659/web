package com.multi.gazee;

public class reportVO {
	private int no;
	private String title;
	private String content;
	private String memId;
	private String date;
	private int view;
	private String img;
	private String reply;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
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
		return "reportVO [no=" + no + ", title=" + title + ", content=" + content + ", memId=" + memId + ", date="
				+ date + ", view=" + view + ", img=" + img + ", reply=" + reply + "]";
	}
	
}
