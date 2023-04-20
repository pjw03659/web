package com.multi.gazee;

public class productVO {
	private int no;
	private String title;
	private String category;
	private int price;
	private String img;
	private int view;
	private String memID;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	public String getMemID() {
		return memID;
	}
	public void setMemID(String memID) {
		this.memID = memID;
	}
	@Override
	public String toString() {
		return "productVO [no=" + no + ", title=" + title + ", category=" + category + ", price=" + price + ", img="
				+ img + ", view=" + view + ", memID=" + memID + "]";
	}
	
	
}
