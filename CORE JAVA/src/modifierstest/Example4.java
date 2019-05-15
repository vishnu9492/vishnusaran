package modifierstest;

import accessmodifiers.Example1;

public class Example4 extends Example1 {

	public static void main(String[] args) {
		Example4 obj=new Example4();
		obj.test1();
		obj.test4();
		System.out.println(obj.i);
		System.out.println(obj.p);
	}

}
