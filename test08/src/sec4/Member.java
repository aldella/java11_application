package sec4;

public class Member extends User {
	private String id;
	private String pw;
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("회원으로 연결하였습니다.\n ID : " + id + ", PW : ********");
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + "]";
	}
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
	
}
