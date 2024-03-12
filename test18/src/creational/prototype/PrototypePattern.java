package creational.prototype;

import java.util.List;

//Prototype(원형)Pattern : 
public class PrototypePattern {
	public static void main(String[] arge) throws CloneNotSupportedException {
		Employee emp = new Employee(); //Employee는 원본(Prototype)
		emp.loadData();
		
		Employee emp2 = (Employee) emp.clone();
		List<String> list = emp2.getEmpList(); //prototype으로 얻어진 복제품
		list.add("가가가"); //주의  : emp2.add 이런식으로 추가하면 추가안됨 당연함 emp2에는 add메소드가 없음 그리고 그 emp2안의 list데이터는 private임
		//그래서 emplyee클래스의 getEmpList로 private처리된 list 데이터의 주소를 반환해주고 그걸 list에 붙여넣기해서 거기에 add
	}
}
