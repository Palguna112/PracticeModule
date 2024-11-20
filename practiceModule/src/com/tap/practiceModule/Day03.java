package com.tap.practiceModule;

import java.util.Scanner;

public class Day03 {
	public static boolean paliandrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i <= j) {
			if (s.charAt(i++) != s.charAt(j--)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(paliandrome(s) ? "palian" : "not Palian");
	}
}
