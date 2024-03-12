package lastexam;

public class Subject {
	private int code;
	private String type;
	private String subname;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public Subject() {}
	public Subject(int code, String type, String subname) {
		super();
		this.code = code;
		this.type = type;
		this.subname = subname;
	}
	@Override
	public String toString() {
		return "Subject [code=" + code + ", type=" + type + ", subname=" + subname + "]";
	}
	
	
}
