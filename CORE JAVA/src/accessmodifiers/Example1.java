package accessmodifiers;

public class Example1 {
public int i=10; //instance variable//any where we can access
int j=20;//within package
private int k=30;//within class only
protected int p=40;//we access protected access modifier through inheritance
public void test1() {//from outside package,within package we can access 
	System.out.println("public method");//protected
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
