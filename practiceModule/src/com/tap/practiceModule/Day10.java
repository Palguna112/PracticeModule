package com.tap.practiceModule;

import java.util.Scanner;

public class Day10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int sum=0;
		String t="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')) {
				t+=ch;
			}
			else if(ch>='0' && ch<='9') {
				sum+=ch-48;
				
			}
		}
		System.out.print(t+sum);
	}

	
	
	
	
	
	
	
	
}
