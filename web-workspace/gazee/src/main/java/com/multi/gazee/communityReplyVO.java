package com.multi.gazee;

public class communityReplyVO {
	private int no;
	private String memID;
	private String content;
	private String date;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getMemID() {
		return memID;
	}
	public void setMemID(String memID) {
		this.memID = memID;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "communityReplyVO [no=" + no + ", memID=" + memID + ", content=" + content + ", date=" + date + "]";
	}
	
	
}
