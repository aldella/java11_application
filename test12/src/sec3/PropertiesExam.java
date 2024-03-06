package sec3;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties pro = new Properties();
		pro.setProperty("job", "developer"); //얘네들은, entry라고 하지 않고 element 라고 이른다
		pro.setProperty("name", "choetaeyeong"); // key가 아니라 속성 이라고 부른다
		pro.setProperty("age", "26");
		pro.setProperty("local", "의정부");
		
		System.out.println(pro);
		System.out.println("엘리먼트 수 : "+pro.size());
		System.out.println("pro의 name 엘리먼트의 값 : " + pro.getProperty("name"));
		
		//properties의 순회 : 열거형으로 해당 엘리먼트의 속성을 가져와 처리해야함
		Enumeration e = pro.propertyNames();
		while(e.hasMoreElements()) {
			String e1  = (String)e.nextElement();
			System.out.println(e1 + " " + pro.getProperty(e1));
		}
	}

}
