package com.tap.practiceModule;

import java.util.Scanner;

public class Day11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch >= 'a' && ch <= 'z')) {
				t += (char) (ch - 32);
			} else if ((ch >= 'A' && ch <= 'Z')) {
				t += ch;
			}
		}
		System.out.print(t);

	}
}














