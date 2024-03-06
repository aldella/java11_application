package org.kh.app;

import java.util.Scanner;

public class Condition5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int rank = scan.nextInt();
		String sang = "";
		switch(rank)
		{
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				sang = "우등생";
				break;
			default:
				sang = "default";
		}
		System.out.println(sang);
	}

}
