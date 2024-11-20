package com.tap.practiceModule;

import java.util.Scanner;

public class Day02{
	public static void printLongestConsecutiveSubarray(int[] arr) {
		int count=1;
		int max=0,startIndex=0,endIndex=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]-arr[i]==1) {
				count++;                     
			}                                  
			else {
				if(count > max) {              
					max=count;                
					endIndex=i;					 
				}				
				count=1;
			}
		}
		if(count > max) {
			max=count;
			endIndex=arr.length-1;
		}
		startIndex=endIndex-max+1;
		for(int i=startIndex;i<=endIndex;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		printLongestConsecutiveSubarray(arr);
		
	}

}
