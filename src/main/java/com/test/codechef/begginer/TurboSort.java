package com.test.codechef.begginer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TurboSort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int a[] = {1,2,9,8,5,1};
		

		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String s [] =b.readLine().split(",");
		
		for(int j =0;j<a.length;j++)
		for(int i=0;i < a.length-1;i++)	
		{
			if(a[i]>a[i+1]) {
				int temp = a[i];	
				a[i]=a[i+1];
				a[i+1] =temp;
			}
			
		}
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
	}

}
