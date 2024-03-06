package sec2;

import java.util.StringTokenizer;

public class StringTokenizerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names = "장인범,김민아,김민석,이희훈,이예린,이연정"; //구분기호(delim)을 "토큰"이라 함
		String anis = "개새끼 \f 소새끼 \n 말새끼 \t 꿩새끼 \r 쥐새끼";
		System.out.println(anis);
		
		StringTokenizer st = new StringTokenizer(anis);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println();
		
		StringTokenizer sk = new StringTokenizer(names, ",");
		while(sk.hasMoreTokens()) {
			System.out.println(sk.nextToken().trim());
		}
	}

}
