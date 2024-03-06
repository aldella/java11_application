package sec4;
//구현클래스
public class Staff extends User {
	private int level;
	private String part;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("출근하였습니다.\n ID : " + name + ", PW : ********");
	}
	@Override
	public String toString() {
		return "Staff [level=" + level + ", part=" + part + "]";
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	
}
