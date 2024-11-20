package com.tap.practiceModule;

import java.util.Scanner;

public class Day19 {
	public static boolean method(String str1,String str2) {
		int i=0,j=0;
		while(i<str1.length() && j<str2.length()) {
			if(str1.charAt(i)==str2.charAt(j)) {
				i++;
				j++;
			}
			else {
				i++;
			}
		}
	return j==str2.length()?true:false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		System.out.println( method(str1,str2));
	}

}
