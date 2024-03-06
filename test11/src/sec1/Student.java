package sec1;

public class Student {
	private int sno;
	String name;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student clone = new Student();
		clone.sno = this.sno;
		clone.name = this.name;
		return clone;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student su1 = (Student) obj;
			if (su1.name == this.name && su1.sno == this.sno)
			{
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
