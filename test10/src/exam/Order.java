package exam;

public class Order {
	private long orderNo;
	private String id;
	private String date;
	private String name;
	private String productNum;
	private String address;
	public Order() {}
	public Order(long ordernum, String id, String date, String name, String productNum, String address) {
		this.orderNo = ordernum;
		this.id = id;
		this.date = date;
		this.name = name;
		this.productNum = productNum;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", id=" + id + ", date=" + date + ", name=" + name + ", productNum="
				+ productNum + ", address=" + address + "]";
	}
	

}
