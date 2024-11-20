package com.tap.practiceModule;

import java.util.Scanner;

public class Day06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int ccount = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
						|| ch == 'I' || ch == 'O' || ch == 'U')) {
					ccount++;
				}
			}

		}
		System.out.println(ccount);
	}

}
