package com.test.codechef.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCOng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>list = new ArrayList<Integer>();
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(7);
	
		Collections.sort(list);
		int count=0;
		for(int i=0;i<list.size()-1;i++) {
		
			
			if(list.get(i)<list.get(i+1) && list.get(i) +1 ==list.get(i+1) ) {
				count++;
			}
				
		}
		System.out.println(list);
		System.out.println(count);
		
	}

}
