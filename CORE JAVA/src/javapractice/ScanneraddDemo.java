package javapractice;

import java.util.Scanner;

public class ScanneraddDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println("Enter another number");
		int m = sc.nextInt();
		int k = n + m;
		System.out.println(k);
		sc.close();

	}

}
