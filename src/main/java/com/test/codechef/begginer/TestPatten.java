package com.test.codechef.begginer;



public class TestPatten {

	public static void main(String[] args) {

		String s = "05:03:02PM";
		String ar[] = s.split(":");
		
		int hh = Integer.parseInt(ar[0]);
		int mm = Integer.parseInt(ar[1]);
		int ss = Integer.parseInt( ar[2].substring(0,2));
		String aMPm = ar[2].substring(2);
		
		int h = hh;
		if(aMPm.equals("AM") && hh==12) {
			h=0;
		}
		else if(aMPm.equals("AM") && hh<12) {
			
			h=h+12;
		}
		System.out.printf("%02d:%02d:%02d",h,mm,ss);
		
		/*
		StringBuilder sb = new StringBuilder();
		

		 * if(aMPm.equals("AM")) {
		 * 
		 * if(hh==12) { sb.append("00").append(":"); sb.append(String.format("%02d",
		 * mm)).append(":"); sb.append(String.format("%02d", ss));
		 * 
		 * } else { sb.append(String.format("%02d", hh)).append(":")
		 * .append(String.format("%02d", mm)).append(":") .append(String.format("%02d",
		 * ss)); } } else { if(hh!=12) { sb.append(String.format("%02d",
		 * hh+12)).append(":"); sb.append(String.format("%02d", mm)).append(":");
		 * sb.append(String.format("%02d", ss)); } else {
		 * sb.append(String.format("%02d", hh)).append(":");
		 * sb.append(String.format("%02d", mm)).append(":");
		 * sb.append(String.format("%02d", ss));
		 * 
		 * } }
		 */
		//System.out.println(sb.toString());
		//String formatted2 = String.format("%02d", 2);
		//System.out.println(formatted2);
 }
}

	
	/*	int n =4;
		int t=n-1;
		boolean c=false;
		int stairs =n;

	
		int ar[] = {1,5,5};
		int min=ar[0];
		int sum =0;
		int max=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
				sum = sum+1;
			}
			else if(ar[i]==max) {
				sum=sum+1;
			}
			
		
		}
		System.out.println(sum +" " + max);
	}
	
}*/
		
		/*for (int i = 0; i < stairs; i++) 
	        System.out.printf("%" + (stairs + 1) + "s",  new String(new char[i + 1]).replace("\0", "#") + "\r");
	    }*/

		/*
		 * for (int i=0;i<n;i++) { c=true; for (int j=0;j<=i;j++) { for(int k=t
		 * ;k>j&c!=false;k--) { System.out.print("$");
		 * 
		 * } System.out.print("#"); c=false; } System.out.println(""); t=t-1; }
		 */
	            //System.out.println("");
		
		/*StringBuilder builder = new StringBuilder();
	    for (int i = 0; i <n ; i++) 
	        builder.append(" ");
	    int j = 0;

	    for (int i = 1; i <=n; i++) {
	        builder.replace(builder.length()-i,          
	        builder.length() - j, "#");
	        System.out.println(builder);
	        j++;
	    }
	        }
		}*/
	
//   		###
//    		 ##
//			  4
// int j=n;j!=i;j--