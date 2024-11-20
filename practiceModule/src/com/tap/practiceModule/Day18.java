package com.tap.practiceModule;

import java.util.Scanner;

public class Day18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch=sc.next().charAt(0);
		boolean find=false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				System.out.print(i);
				find=true;
				break;
			}
		}
		if(!find) {
			System.out.println("0");
		}
		
	}

}























