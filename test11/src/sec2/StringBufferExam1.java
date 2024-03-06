package sec2;

public class StringBufferExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Java Programmer");
		str += " Junier Level ";
		str += " Develope";
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer(); //스택(Stack)구조
		byte[] b = str.getBytes();
		for(byte c:b) {
			char k = (char) c;
			sb.append(k);
		}
		System.out.println(sb);
		
		CharStack cs = new CharStack();
		cs.push('V');
		cs.push('I');
		cs.push('C');
		cs.push('T');
		cs.push('O');
		cs.push('R');
		cs.push('Y');
		System.out.println(cs.list());
		System.out.println(cs.toString());
		System.out.println((char) cs.pop());
		System.out.println((char) cs.pop());
		System.out.println((char) cs.pop());
	}

}
