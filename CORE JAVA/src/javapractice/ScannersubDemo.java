package javapractice;

import java.util.Scanner;

public class ScannersubDemo {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int k=sc.nextInt();
System.out.println("Enter another number");
int l=sc.nextInt();
int m=k-l;
System.out.println(m);
sc.close();
	}

}
