package com.tap.practiceModule;

import java.util.Scanner;

public class Day07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int lowerCaseCount=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z') {
				lowerCaseCount++;
			}
		}
		System.out.println(lowerCaseCount);
		
		
	}

}
