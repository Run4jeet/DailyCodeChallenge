package com.test.codechef.begginer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StudentGrade_HR {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\testout.txt"));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < gradesCount; i++) {
            int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
            grades.add(gradesItem);
        }

        List<Integer> result = StudentGrade_HR.gradingStudents(grades);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
	  public static List<Integer> gradingStudents(List<Integer> grades) {
		    // Write your code here
		  int test=0;
		  int p=0;
		  
		  for(int grade: grades) {
			
			  if(((grade/5)+1)*5-grade<3 && grade>=38 ) {
			 test = (grade/5+1)*5;
				  
			  }else {
				  test=grade;
			  }
			  
		  }
		  
		  System.out.println("test "+test );
		  	return new ArrayList();
		    }
}
