package com.tap.practiceModule;

import java.util.Scanner;

public class Day09 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String t="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')||(ch>='0' && ch<='9')) {
				t+=ch;
			}
		}
		System.out.println(t);
	}
}
