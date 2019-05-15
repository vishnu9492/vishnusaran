package javaoops;
class Calculator
{
	public int add(int i,int j)
	{
		return i+j;
	}
}
	class CalcAdv extends Calculator
	{
		public int sub(int i,int j)
		{
			return i-j;
		}
	}
	class CalcVeryAdv extends CalcAdv
	{
		public int multi(int i,int j)
		{
			return i*j;
		}
	}

public class Inheritance { //which one object acquires all the properties and behaviour of a parent object

	public static void main(String[] args) {
		CalcVeryAdv obj=new CalcVeryAdv();
		int result1=obj.add(10, 35);
		int result2=obj.sub(45, 68);
		int result3=obj.multi(20, 25);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
