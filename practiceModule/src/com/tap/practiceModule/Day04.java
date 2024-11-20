package com.tap.practiceModule;

import java.util.Scanner;

public class Day04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count =0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		System.out.print(count);
	}

}
