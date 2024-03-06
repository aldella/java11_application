package org.kh.object1;

public class Member {
	private String id;
	private String pw;
	private String email;
	private int birth;
	private String tel;
	
	public void setID(String id)
	{
		this.id = id;
	}
	
	public void setPw(String pw)
	{
		this.pw = pw;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public void setBirth(int birth)
	{
		this.birth = birth;
	}
	public void setTel(String tel)
	{
		this.tel = tel;
	}
	
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getEmail() {
		return email;
	}

	public int getBirth() {
		return birth;
	}

	public String getTel() {
		return tel;
	}

	public Member() {}
	public Member(String id, String pw, String email, int birth, String tel) {
		System.out.println("확인");
		this.id = id; this.pw=pw; this.email=email; this.birth=birth; this.tel=tel;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", email=" + email + ", birth=" + birth + ", tel=" + tel + "]";
	}

}
