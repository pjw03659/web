package com.multi.gazee;

public class memberVO {
	private String id;
	private String pw;
	private String name;
	private String tel;
	private int seed;
	private String nickname;
	private String address;
	private String email;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getSeed() {
		return seed;
	}
	public void setSeed(int seed) {
		this.seed = seed;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "memberVO [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + ", seed=" + seed
				+ ", nickname=" + nickname + ", address=" + address + ", email=" + email + "]";
	}
	
	
}
