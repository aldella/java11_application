package creational.prototype;

import java.util.List;

//Prototype(����)Pattern : 
public class PrototypePattern {
	public static void main(String[] arge) throws CloneNotSupportedException {
		Employee emp = new Employee(); //Employee�� ����(Prototype)
		emp.loadData();
		
		Employee emp2 = (Employee) emp.clone();
		List<String> list = emp2.getEmpList(); //prototype���� ����� ����ǰ
		list.add("������"); //����  : emp2.add �̷������� �߰��ϸ� �߰��ȵ� �翬�� emp2���� add�޼ҵ尡 ���� �׸��� �� emp2���� list�����ʹ� private��
		//�׷��� emplyeeŬ������ getEmpList�� privateó���� list �������� �ּҸ� ��ȯ���ְ� �װ� list�� �ٿ��ֱ��ؼ� �ű⿡ add
	}
}
