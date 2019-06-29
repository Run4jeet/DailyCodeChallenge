package com.test.basic;

public class Prime {

	public static void main(String[] args) {
		 System.out.println("17 is prime number?: "+isPrime(17)+Math.sqrt(17));
	}
	public static boolean isPrime(int number)
	 {
	  for (int i = 2; i <=Math.sqrt(number); i++) {
	   if(number%i==0)
	    return false;
	  }
	  return true;
	 }
}