package org.kh.app;

import java.util.Scanner;

public class Condition3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char result;
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력[0~100] : ");
		int point = scan.nextInt();
		if(point >= 90)
		{
			result = 'A';
		} else if (point >= 80) {
			result = 'B';
		} else if (point >= 70) {
			result = 'C';
		} else if (point >= 60) {
			result = 'D';
		} else {
			result = 'F';
		}
		System.out.printf("\n점수는 %3d점, 학점은 %c", point, result);
		
		/////////////////////////////////////
		
		String result2;
		String result3_1="";
		String result3_2="";
		String award="";
		Scanner scan2 = new Scanner(System.in);
		System.out.print("\n점수 입력[0~100] : ");
		int point2 = scan.nextInt();
		if(point2 >= 90)
		{
			result3_1 = "A";
//			if(point2 >=97)			result2 = "A+";
//			else if (point2 >= 93)	result2 = "A0";
//			else 					result2 = "A-";
			if(point2%10>=7 || point2==100)		result3_2 = "+";
			else if(point2%10>=3)	result3_2 = "0";
			else					result3_2 = "-";
		} else if (point2 >= 80) {
			result3_1 = "B";
//			if(point2 >=87)			result2 = "B+";
//			else if (point2 >= 83)	result2 = "B0";
//			else 					result2 = "B-";
			if(point2%10>=7)		result3_2 = "+";
			else if(point2%10>=3)	result3_2 = "0";
			else					result3_2 = "-";
		} else if (point2 >= 70) {
			result3_1 = "C";
//			if(point2 >=77)			result2 = "C+";
//			else if (point2 >= 73)	result2 = "C0";
//			else 					result2 = "C-";
			if(point2%10>=7)		result3_2 = "+";
			else if(point2%10>=3)	result3_2 = "0";
			else					result3_2 = "-";
		} else if (point2 >= 60) {
			result3_1 = "D";
//			if(point2 >=67)			result2 = "D+";
//			else if (point2 >= 63)	result2 = "D0";
//			else 					result2 = "D-";
			if(point2%10>=7)		result3_2 = "+";
			else if(point2%10>=3)	result3_2 = "0";
			else					result3_2 = "-";
		} else {
			result3_1 = "F--";
		}
		switch (result3_1+result3_2)
		{
		case "A+":
			award = "학업우수상";
			break;
		case "A0":
			award = "노력상";
			break;
		case "A-":
			award = "아차상";
			break;
		default:
			award = "";
		}
		System.out.printf("\n점수는 %3d점, 학점은 %s, 상은 %s", point2, result3_1+result3_2, award);
	}

}
