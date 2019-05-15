package javaoops;
class Emp
{
	int eid;
	int salary;
	static String ceo;
	public void show()
	{
		System.out.println(eid+":"+salary+":"+ceo);
	}
	
	
}
public class StatickeywordDemo {

	public static void main(String[] args) {
		Emp vishnu = new Emp();
		vishnu.eid=52;
		vishnu.salary=8000;
		vishnu.ceo="Suman";
		Emp kiran = new Emp();
		kiran.eid=82;
		kiran.salary=10000;
		kiran.ceo="lucky";
		
		kiran.ceo="Mahesh";
		
		vishnu.show();
		kiran.show();

	}

}
