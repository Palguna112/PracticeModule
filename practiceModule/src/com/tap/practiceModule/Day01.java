package com.tap.practiceModule;

import java.util.Scanner;

public class Day01 {
	public static void printConsecutiveSubarrays(int[]arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]-arr[i]==1) {
				System.out.print(arr[i]+" ");
			}
			else {
				System.out.print(arr[i]+" ");
				System.out.println();
			}
		}
		System.out.println(arr[arr.length-1]+" ");
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		printConsecutiveSubarrays(arr);
		
	}

}
