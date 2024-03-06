package witharrayList;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		int price = 10000;
		
		// TODO Auto-generated method stub
		//Customer 객체 생성(김, 이) -> 각각 하나는 실버고객, 하나는 VIp
		//물건 하나 샀을 때 지불한 가겨과 showCustomerInfo()한번씩출력하기
//		Customer kim = new Customer(1, "김");
//		Customer lee = new VIPCustomer(2,"이", 11111);
//		Customer choe = new VIPCustomer(3,"최", 11111);
//		System.out.println("물건구매가격 : " + kim.calcPrice(price));
//		System.out.println(kim.showCustomerInfo());
//		System.out.println("물건구매가격 : " + lee.calcPrice(price));
//		System.out.println(lee.showCustomerInfo());
//		System.out.println("물건구매가격 : " + choe.calcPrice(price));
//		System.out.println(choe.showCustomerInfo());
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		Customer kim = new Customer(1, "김");
		Customer lee = new Customer(2,"이");
		Customer choe = new GoldCustomer(3,"최");
		Customer park = new GoldCustomer(4,"박");
		Customer sin = new VIPCustomer(5,"신",1111);
		customerList.add(kim);
		customerList.add(lee);
		customerList.add(choe);
		customerList.add(park);
		customerList.add(sin);
		System.out.println("======고객정보출력======");
		for(Customer c : customerList)
		{
			System.out.println(c.showCustomerInfo());
		}
		System.out.println("======할인률과 보너스 포인트 계산======");
		for(Customer c : customerList)
		{
			System.out.println(c.getCustomerName()+"님의");
			System.out.println("결제금액 : " + c.calcPrice(price));
			System.out.println("누적보너스포인트 : " + c.getBonusPoint());
		}
	}
}
