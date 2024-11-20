package com.tap.practiceModule;

import java.util.Scanner;

public class Day13 {
	public static void trim(String s) {
		int si = 0, ei = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				si = i;
				break;
			}
		}
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				ei = i;
				break;
			}
		}
		String t = "";
		for (int i = si; i <= ei; i++) {
			t+=s.charAt(i);
		}
		System.out.println(t);
		System.out.println(t.length());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s.length());
		trim(s);
	}

}























