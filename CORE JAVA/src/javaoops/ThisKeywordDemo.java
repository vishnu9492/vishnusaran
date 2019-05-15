package javaoops;

public class ThisKeywordDemo {//this is a reference variable which refers the current object
 public void test1() {
	 System.out.println("test1");
 }
 public void test2() {
	 System.out.println("test2");
	 this.test1();
 }
	public static void main(String[] args) {
		ThisKeywordDemo obj=new ThisKeywordDemo();
		obj.test2();
	}

}
