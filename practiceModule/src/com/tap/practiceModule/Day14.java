package com.tap.practiceModule;

import java.util.Scanner;

public class Day14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
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
		String t ="";
		for (int i = si; i <= ei; i++) {
			if (s.charAt(i) != ' ' || (s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				t += s.charAt(i);
			}
		}
		System.out.println(t);
	}

}
