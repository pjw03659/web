package com.multi.gazee;

public class reprotVO {
	private int no;
	private String title;
	private String content;
	private String mem_id;
	private String date;
	private int view;
	private String img;
	private String reply;
	private String category;
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
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "reprotVO [no=" + no + ", title=" + title + ", content=" + content + ", mem_id=" + mem_id + ", date="
				+ date + ", view=" + view + ", img=" + img + ", reply=" + reply + ", category=" + category + "]";
	}
	
}
