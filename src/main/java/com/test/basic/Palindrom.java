package com.test.basic;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =121;
		String s = "abccba ";
		if(s.charAt(0)==s.charAt(s.length()-1))
		{
			System.out.println(s + " is a palindrom ");
		}
		
		
		boolean isPalan= checkPal(n);
		
		if(isPalan) {
			System.out.println(n + "  is a palindrom");
			System.out.println("Next palindrom is  "+nextPalin(n) );
		}
			
		else {
			System.out.println("Not a palindorm");
		}	
	}

	public static boolean checkPal(int n) {
		
		int last = n%10;
		int first = n/10;
		boolean pal=false;
		if (first >=10 ) {
		
			int middle  =first%10;
			int ffirst = first/10;
			if(ffirst==last)
			pal= true;
			else
				System.out.println("not a palandrom");
		}
		return pal;
	}

	public static int nextPalin(int n) {

		int last = n%10;
		int first = n/10;
		
		int nextPal = (first+1)*10+last;
		int f = nextPal%10;
		int s = nextPal/10;
		int m = 0;
		int ff = 0;
		if(s>=10) {
		 m = s%10;
		 ff = s/10;
		}
		if(ff!=f) {
			nextPal = (first+1)*10+last+1; 
		}
		return nextPal;
	}

}

