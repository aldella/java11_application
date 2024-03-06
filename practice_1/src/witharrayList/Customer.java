package witharrayList;

public class Customer {
	int customerID;
	String customerName;
	String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	private void initCustomer()
	{
		customerGrade="SILVER";
		bonusRatio=0.01;
	}
	
	public Customer()
	{
		initCustomer();
	}
	public Customer(int customerID, String customerName)
	{
		this.customerID=customerID;
		this.customerName=customerName;
		initCustomer();
	}
	public int calcPrice(int price)
	{
		this.bonusPoint +=price*bonusRatio;
		return price;
	}
	public String showCustomerInfo()
	{
		return ("회원 이름 : "+this.customerName+", 회원 등급 : "+this.customerGrade+", 보너스포인트 : "+this.bonusPoint);
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
}
