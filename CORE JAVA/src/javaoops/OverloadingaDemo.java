package javaoops;
class Casio
{
	public void add(int i, int j)
	{
		System.out.println(i+j);
	}
	public void add(int i, int j,int k)
	{
		System.out.println(i+j+k);
	}
	public void add(double d, double e)
	{
		System.out.println(d+e);
	}
	
}

public class OverloadingaDemo { //multiple methods having same name with different parameters

	public static void main(String[] args) {
		Casio obj=new Casio();
		obj.add(10, 15);
		obj.add(5, 6, 8);
		obj.add(4.5, 5.5);
	}

}
