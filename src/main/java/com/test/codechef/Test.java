package com.test.codechef;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Test {

public static void main(String arg[]) {
	int [] arr = {1,2,-1,3,-5,0,0,-3};
	int p=0;
	int n=0;
	int z=0;
	float arrl = arr.length;
	
	for (int i=0;i<arr.length;i++) {
		if(arr[i]>0) {
			
			p=p+1;
		}
		else if(arr[i]<0) {
			
			n= n+1;
		}
		else {
			z = z+1;
		}
	}
	
	
	
	
   
     
     double  frP= (double)2/6;
	double frN= n/arr.length;
	double frZ= z/arr.length;
	
	//System.out.println(new DecimalFormat("##.##").format(frP));
	//System.out.println( frN );
	//printf("%.6f "+ (p/arrl));
	System.out.println( String.format("%.5g%n", (p/arrl)) );
	String.format("%.5g%n", (p/arrl));
}
	
}
