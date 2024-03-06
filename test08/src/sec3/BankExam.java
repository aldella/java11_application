package sec3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//10개까지 은행계좌를 개설할 수 있는 Account의 배열을 선언, 은행계좌관리 시스템 구축
//금융기관(bankName)은 1. 국민은행 2.기업은행 3.농협은행 으로한다
//계좌번호는 다섯자리 숫자 정수로 입력받는다
//1. 입금 처리 : 계좌번호, 입금액 입력받아 처리
//2. 출금 처리 : 계좌번호, 출금액 입력받아 처리
//3. 잔액 조회 : 계좌번호 입력 시 계좌정보(은행명, 예금주, 계좌번호, 잔액) 출력
//0 : 작업 종료
//1-3 작업은 계속해서 반복 수행, 0 입력시 프로그램 종료

public class BankExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Account> accountList = new ArrayList<Account>();
		Scanner scan = new Scanner(System.in);
		for(;;)
		{
			System.out.println("메뉴를 입력하세요.");
			int menuSelect = scan.nextInt();
			if(menuSelect==0)
			{
				break;
			} else if (menuSelect==1)
			{
				Account account = new Account();
				System.out.println("계좌번호를 입력하세요");
				account.setAccountNum(scan.nextInt());
				System.out.println("은행명을 입력하세요");
				account.setBank(scan.next());
				System.out.println("예금주명을 입력하세요");
				account.setName(scan.next());
				System.out.println("잔액을 입력하세요");
				account.setMoney(scan.nextInt());
				accountList.add(account);
			} else if (menuSelect==2)
			{
				System.out.println("계좌번호를 입력하세요");
				int num = scan.nextInt();
				System.out.println("입금할 금액을 입력하세요");
				int cash = scan.nextInt();
				for(Account acc : accountList)
				{
					if (num == acc.getAccountNum()) acc.deposit(num, cash);
				}
			}else if (menuSelect==3)
			{
				System.out.println("계좌번호를 입력하세요");
				int num = scan.nextInt();
				System.out.println("출금할 금액을 입력하세요");
				int cash = scan.nextInt();
				for(Account acc : accountList)
				{
					if (num == acc.getAccountNum()) acc.withdraw(num, cash);
				}
			}
			else if (menuSelect==4)
			{
				System.out.println("계좌번호를 입력하세요");
				int num = scan.nextInt();
				for(Account acc : accountList)
				{
					if (num == acc.getAccountNum()) acc.check();
				}
			}
		}
	}

}
