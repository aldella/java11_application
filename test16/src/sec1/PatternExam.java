package sec1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Pattern : Ư�� �����Ͱ� ������ �´��� ���Ϸ��� �� ��� ������������ �����ϴ� Ŭ����
//Matcher : Ư�� ������ ���°� �´��� ���ϴ� Ŭ����
//���Խ�(Reg Expression) -> regex

public class PatternExam {
	public static void main(String arge[]) {
		
		String[] dt = {"beg","ty","9to6","8to5","single","Mom","ABC","���¿�","������","546654"};
//		Pattern p = Pattern.compile("[a-z]*"); //���� �ҹ��ڷθ� ������ ������
//		Pattern p = Pattern.compile("[0-9a-z]*"); //���ڿ� ���� �ҹ��ڷθ� ������ ������
//		Pattern p = Pattern.compile("[A-Za-z]*"); //���� �빮��,�ҹ��ڷθ� ������ ������
//		Pattern p = Pattern.compile("s[A-Za-z]*"); //s�� �����ϰ�, ���� �빮��/�ҹ��ڷθ� ������ ������
//		Pattern p = Pattern.compile("[��-�R]*"); //�ѱ۷θ� ������ ������. ���� ǥ�ؿ��� �ѱ� ������ �� ���� ù��° �����ʹ� "��", ���� ������ �����ʹ� "�R"�̱⶧��.
//		Pattern p = Pattern.compile("e$*"); //Ư�� ���ڷ� ������ ��� ���� �ڿ� $ -> ������ ��밡��
//		Pattern p = Pattern.compile("^b*"); //Ư�� ���ڷ� �����ϴ� ��� ���� �տ� ^ -> ������ ��밡��
		Pattern p = Pattern.compile("^[0-9]*"); //��� ���� ������ ������2

		for(int i=0; i<dt.length; i++) {
			Matcher m= p.matcher(dt[i]);
			if(m.matches()) {
				System.out.println("���� ��ġ : " + dt[i]);
			}
		}

	}
}
