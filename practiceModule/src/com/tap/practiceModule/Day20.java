package com.tap.practiceModule;

import java.util.Scanner;

public class Day20 {
	public static void printSubstring(String s, int k) {
		for (int i = 0; i <= s.length()-k; i++) {
			String t = "";
			for (int j = i; j < i + k; j++) {
				t += s.charAt(j);
			}
			System.out.println(t);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int k = sc.nextInt();
		printSubstring(s, k);
	}
}
