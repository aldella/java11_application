package sec2;

class PwFormatException extends Exception {
	public PwFormatException(String msg) {
		System.out.println("msg : "+msg);
		System.out.println("��ȣ��� ����ġ");
	}
}

class Member {
	private String id;
	private String pw;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) throws PwFormatException{
		if(pw==null) throw new PwFormatException("��ȣ�� ����ֽ��ϴ�");
		else if(pw.length()<8||pw.length()>20) throw new PwFormatException("���ڼ��� �°� �Է��Ͽ��ֽʽÿ�");
		this.pw = pw;
	}
	
}

public class UserExceptionExam2 {
	public static void main(String[] args) {
		Member mem = new Member();
		try {
			mem.setPw("123");
			mem.setPw("19023809123892018392189321");
		} catch(PwFormatException e) {
			e.printStackTrace();
		}
		try {
			mem.setPw(null);
		} catch(PwFormatException e) {
			e.printStackTrace();
		}
	}
}
