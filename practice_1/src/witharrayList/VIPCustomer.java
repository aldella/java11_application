package witharrayList;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	//VIPCustomer생성자정의, calc에 saleRatio 반영, CustomerInfo에 상담직원도 나오게재정의
	public VIPCustomer(int customerID, String customerName, int agentID)
	{
		super(customerID, customerName);
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int calcPrice(int price)
	{
		this.bonusPoint +=price*bonusRatio;
		return (int)(price*(1-saleRatio));
	}
	
	public String showCustomerInfo()
	{
		return (super.showCustomerInfo()+", 담당 직원 ID : "+ this.agentID + ", 보너스포인트 : " + this.bonusPoint);
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
}
