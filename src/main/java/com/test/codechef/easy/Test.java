package com.test.codechef.easy;

import java.util.Scanner;

public class Test {

	 private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int sum =0;
		int firstDiSum=0;
		int secondDiSum=0;
		int n = sc.nextInt();
		  sc.skip("(\r\n)");

		int arr  [] [] = new int [n][n]  ;
		int k= n-1;
        
		for (int i =0;i<n;i++ ) {
			String arRowItem [] = sc.nextLine().split(" ");
			//System.out.println(n);
			
			for(int j=0;j<n;j++) {
				
				int item = Integer.parseInt(arRowItem[j]);
				arr[i][j] = item;
			}
		}
		
		/*
		 * for (int i=0;i<arr.length;i++) {
		 * 
		 * for(int j=0;j<arr.length;j++) {
		 * 
		 * System.out.print( " " + arr[i][j]); } System.out.println(); }
		 */
		
		for (int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				
				System.out.print( " " + arr[i][j]);
				
				if(i==j) {
					firstDiSum = firstDiSum+arr[i][j];
				}
				if(j==k) {
					
					 secondDiSum = secondDiSum+arr[i][j];
					 k= k-1;
				}
			}
			System.out.println();
		}
		
		System.out.println("secondDiSum " + secondDiSum);
		System.out.println("firstDiSum " + firstDiSum);
		
	}

}
