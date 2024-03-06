package sec3;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {
	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length) return s1;
		else 	return s2;
	}
}

public class StreamExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		reduce() : 차원축소
//		여러 문자열(String)의 배열에서 가장 글자 수가 많은(이진수 값이 가장 큰) 문자열을 찾아 반환하는 예제
//		BinaryOperator : 문자든 숫자든 모두 2진수로 변환하여 비교 혹은 처리할 때 활용되는 인터페이스
		String[] arr = {"ㄴ아리ㅓ", "마아너리ㅏㅁ", "ㅣㄹ마어리마너ㅣㄴ미", "ㄹㄴㅇ넘라ㅣㅓ나ㅣㄻㄴㅁㅇㄻ"};
		
		System.out.println("람다식을이용하여 처리한 reduce");
		System.out.println(Arrays.stream(arr).reduce(			"", (s1,s2) -> {
			if(s1.getBytes().length >= s2.getBytes().length) return s1;
			else 	return s2;
		})); //문자열 배열이니까 Arrays 사용가능 -> 2개씩 비교하는건데, 배열안엔 4개가 들어가있으므로 2개씩 선택해서 비교하고 넣어주고 reduce 적용해주기위해 람다식활용, (s1,s2)이런식으로지정해주면 컴파일러가 알아서 2개씩 들어가게 지정해줌
		
		
		System.out.println("BinaryOperator을 활용한 reduce");
		System.out.println(Arrays.stream(arr).reduce(			new CompareString()         ).get()); //위에서 BinaryOperator을 만들었는데 왜 굳이 안쓰고 위에 람다식써서 귀찮게만드냐 나는 저거 활용하겠다 하는문장...이게더간결함
	}

}
