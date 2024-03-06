package org.kh.object2;

import org.kh.object1.Member;

public class PersonEx2 {
	public static void main(String args[])
	{
		Member a = new Member("adf","adsfa","ad@adfs.dfas",1111,"111111111");
		System.out.println(a.toString());
		System.out.println("pw:"+a.getPw());
	}
	
}
