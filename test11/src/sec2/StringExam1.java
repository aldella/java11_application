package sec2;

public class StringExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "최태영";
		String name2 = new String("최태영");
		String name3 = "최태영";
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		
		String str = "강범준/박동빈/이성하/조대신/배곤희/권민지";
		String[] names = new String[6];
		names = str.split("/");
		for(String n : names)
		{
			System.out.println(n);
		}
		
		String str2=String.join("/", names);
		System.out.println(str2);
		
		String data = "   IvE\'s beaUty grOup\nnewJeans is girlGroup Top  ";
		char ten = data.charAt(9); // 10번째 문자(인덱스가 9인 문자)
		System.out.println(ten);
		
		String trimData = data.trim(); // 앞 뒤의 공백을 제거하여 trimData에 저장
		System.out.println(trimData);
		
		int size = data.trim().length(); //글자수를 size에 저장
		System.out.println(size);
		
		int n = data.trim().indexOf("n"); //n의 글자위치(인덱스)를 n에 저장
		System.out.println(n);
		
		String up = data.toUpperCase(); //모두 대문자로 변환하여 up에 저장
		System.out.println(up);
		
		String down = data.toLowerCase(); //모두 소문자로 변환하여 down에 저장
		System.out.println(down);
		
		String sub1 = data.substring(20,27); //공백을 제거하고, 모두 대문자로 변경하여 20번째 글자부터 27번째 직전(26번째)까지만 추출
		System.out.println(sub1);
		
		String sub2 = data.replace("newJeans", "Kepler");; //newJeans의 단어를 Kepler로 변경하여 sub2에 저장
		System.out.println(sub2);
		
		byte[] girl = data.getBytes(); //문자열을 girl 문자열로 변환하여 저장
		for(byte g : girl) {
			System.out.print((char)g);
		}
		System.out.println();
		System.out.println(data.substring(10,17));
		
		String girlgroup = data.substring(data.lastIndexOf('g'), data.lastIndexOf('g')+9);
		girlgroup += data.substring(22,  30);
		System.out.println(girlgroup);
		
		String str4 = new String(girl);
		System.out.println(str4);
	}

}
