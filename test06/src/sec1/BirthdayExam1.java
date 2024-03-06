package sec1;

public class BirthdayExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Birthday bth = new Birthday();
		bth.setName("최태영");
		bth.setDay(29);
		bth.setMonth(12);
		bth.setYear(1999);
		bth.birth();
		bth.birthAddr();
		
		Birthday bth2 = new Birthday();
		bth2.setName("김김김");
		bth2.setYear(1111);
		bth2.setMonth(11);
		bth2.setDay(1);
		bth2.birth();
		bth2.birthAddr();
	}

}
