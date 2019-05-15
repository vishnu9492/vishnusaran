package accessmodifiers;

public class Example1 {
public int i=10; //instance variable
int j=20;
private int k=30;
protected int p=40;
public void test1() {
	System.out.println("public method");
}
void test2() {
	System.out.println("default method");
}
private void test3() {
	System.out.println("private method");
}
protected void test4() {
	System.out.println("protected method");
}
	public static void main(String[] args) {
		Example1 obj=new Example1();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
System.out.println(obj.i);
System.out.println(obj.j);
System.out.println(obj.k);
System.out.println(obj.p);


	}

}
