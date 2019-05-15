package javapractice;

import java.util.Scanner;

public class ScannermultiDemo {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a value");
int s=sc.nextInt();
System.out.println("enter one more value");
int l=sc.nextInt();
int y=s*l;
System.out.println(y);
sc.close();

	}

}
