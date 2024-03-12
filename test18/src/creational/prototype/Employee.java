package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{
	private List<String> empList;
	public Employee() {
		empList = new ArrayList<String>();
	}
	public Employee(List<String> empList) {
		this.empList = empList;
	}
	public void loadData() {
		empList.add("丑丑丑");
		empList.add("中中中");
		empList.add("之之之");
		empList.add("予予予");
	}
	public List<String> getEmpList() {
		return empList;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		List<String> tmp = new ArrayList<String>();
		for(String s:empList) {
			tmp.add(s);
		}
		return new Employee(tmp);
	}
	
}