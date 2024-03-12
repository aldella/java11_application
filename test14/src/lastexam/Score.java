package lastexam;

public class Score {
	private int no; //�й�
	private Subject code; //�����ڵ�
	private int point; //����
	public Score() {}
	public Score(int no, Subject code, int point) {
		super();
		this.no = no;
		this.code = code;
		this.point = point;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Subject getCode() {
		return code;
	}

	public void setCode(Subject code) {
		this.code = code;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Score [no=" + no + ", code=" + code + ", point=" + point + "]";
	}
	
}
