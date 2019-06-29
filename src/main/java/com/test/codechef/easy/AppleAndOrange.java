package com.test.codechef.easy;

import java.util.Scanner;

public class AppleAndOrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =  new Scanner(System.in);
			
		
		String [] st = sc.nextLine().split(" ");
		int s = Integer.parseInt(st[0]);
		int t = Integer.parseInt(st[1]);
		
		String [] ab = sc.nextLine().split(" ");
		int a = Integer.parseInt(ab[0]);
		int b = Integer.parseInt(ab[0]);
		
		String [] mn = sc.nextLine().split(" ");
		int m =Integer.parseInt(mn[0]);
		int n =Integer.parseInt(mn[0]);
		
		int [] apples = new int[m];
		int [] oranges=new int[n];
		
		String appleItem[] = sc.nextLine().split(" ");
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		for (int i=0;i<m;i++) {
			apples[i]=Integer.parseInt(appleItem[i]);
		}
		
		String orangeItem[] = sc.nextLine().split(" ");
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		
		for (int i=0;i<n;i++) {
			oranges[i]=Integer.parseInt(orangeItem[i]);;
		}
		
		countApplesAndOranges(s, t, a, b, apples, oranges);
		
		
		for(int i=0;i<apples.length;i++) {
		System.out.println("s " +apples[i]);
		System.out.println("a " +oranges[i] );
		}
		
	}

	private static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		
		int count =0;
		for(int i=0;i<apples.length;i++) {
			int temp = apples[i] + a;
			if(temp>= s && temp<=t) {
				
				count ++;
				
			}
			
		}
		System.out.println("count " + count);
		
	}

}
