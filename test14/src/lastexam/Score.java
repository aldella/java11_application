package lastexam;

public class Score {
	private int no; //학번
	private Subject code; //과목코드
	private int point; //점수
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
