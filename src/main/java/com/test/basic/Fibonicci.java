package com.test.basic;

public class Fibonicci {

	public static void main(String[] args) {
		
		int pre =0;
		int next =1;
		System.out.println(pre + "" +next);
		for (int i=0;i<10;i++) {
			int sum=0;
			sum = sum +pre+next;
			System.out.println(sum);
			pre = next;
			next =sum;
		}
		
	}
	
}