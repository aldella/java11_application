package sec2;

public class StringBuilderExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Java Programmer");
		str += " Junier Level ";
		str += " Develope";
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Java");
		sb.append(11);
		sb.append(" Programmer ");
		sb.insert(6, " Web"); //중간에 끼워넣기
		sb.insert(0, "KH "); //처음에 끼워넣기
		System.out.println(sb);
	}

}
