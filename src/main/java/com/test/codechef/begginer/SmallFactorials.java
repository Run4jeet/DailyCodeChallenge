package com.test.codechef.begginer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SmallFactorials {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine().toString());
		
		System.out.println("the Factorial of " +n +" Is " +fact(n)	);
	}
public static int fact(int n) {
		if(n<2){
			return 1;
		}
		else
		
		return  n * fact(n-1);
	}

}




