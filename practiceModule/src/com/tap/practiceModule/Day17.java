package com.tap.practiceModule;

import java.util.Scanner;

public class Day17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch=sc.next().charAt(0);
		String t="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				t=t+"*"+ch;
			}
			else {
				t+=s.charAt(i);
			}
		}
		System.out.print(t);
		
	}

}











