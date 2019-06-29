/*
 * package com.test.codechef.begginer;
 * 
 * import java.io.BufferedReader; import java.io.FileReader; import
 * java.io.IOException; import java.io.InputStream; import
 * java.io.InputStreamReader; import java.util.ArrayList; import java.util.List;
 * import java.util.Scanner;
 * 
 * public class ATM {
 * 
 * 
 * public static void main(String args[]) throws IOException {
 * 
 * //Scanner sc = new Scanner(System.in);
 * 
 * 
 * int f = sc.nextInt(); int s = sc.nextInt(); int t = sc.nextInt(); int fr =
 * sc.nextInt();
 * 
 * int ar[]=null; int i=6; int j=9; //ar.length List list = new ArrayList();
 * list.add(10); list.add(20); list.add(30);
 * 
 * 
 * 
 * String line = sc.nextLine(); String line2 = sc.nextLine(); String line3 =
 * sc.nextLine(); String line5 = sc.nextLine();
 * 
 * 
 * BufferedReader bufferedReader = new BufferedReader(new
 * InputStreamReader(System.in)); BufferedWriter bufferedWriter = new
 * BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
 * 
 * String[] aItems = bufferedReader.readLine().replaceAll("\\s+$",
 * "").split(" ");
 * 
 * List<Integer> a = new ArrayList<>();
 * 
 * for (int i = 0; i < 3; i++) { int aItem = Integer.parseInt(aItems[i]);
 * a.add(aItem); }
 * 
 * String[] bItems = bufferedReader.readLine().replaceAll("\\s+$",
 * "").split(" ");
 * 
 * List<Integer> b = new ArrayList<>();
 * 
 * for (int i = 0; i < 3; i++) { int bItem = Integer.parseInt(bItems[i]);
 * b.add(bItem); }
 * 
 * List<Integer> result = compareTriplets(a, b);
 * 
 * for (int i = 0; i < result.size(); i++) {
 * bufferedWriter.write(String.valueOf(result.get(i)));
 * 
 * if (i != result.size() - 1) { bufferedWriter.write(" "); } }
 * 
 * bufferedWriter.newLine();
 * 
 * bufferedReader.close(); bufferedWriter.close(); }
 * 
 * 
 * //FileReader fr=new FileReader("D:\\testout.txt"); //BufferedReader br = new
 * BufferedReader(fr); //BufferedReader br = new BufferedReader(new
 * InputStreamReader(System.in));
 * 
 * 
 * String line; while( (line = br.readLine())!=null) { System.out.println(line);
 * 
 * }
 * 
 * 
 * 
 * 
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * String s[] = br.readLine().split(","); int amount =Integer.parseInt(s[0]);
 * double balance = Double.parseDouble(s[1]);
 * 
 * if((amount%5==0 && balance >=amount+0.5)) { double withdraw = balance -
 * amount -0.5; System.out.println(String.format("%.2f" ,withdraw)); } else {
 * System.out.println(String.format("%.2f",balance)); }
 * 
 * }
 * 
 * }
 * 
 */