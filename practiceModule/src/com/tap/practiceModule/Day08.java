package com.tap.practiceModule;

import java.util.Scanner;

public class Day08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int vc = 0, cc = 0, sc = 0, nc = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
						|| ch == 'O' || ch == 'U') {
					vc++;
				} else {
					cc++;
				}
			} else if (ch >= '0' && ch <= '9') {
				nc++;
			} else {
				sc++;
			}
		}
		System.out.println(vc);
		System.out.println(cc);
		System.out.println(nc);
		System.out.println(sc);
	}
	

}





























