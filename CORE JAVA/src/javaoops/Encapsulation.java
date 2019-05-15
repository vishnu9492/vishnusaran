package javaoops;
class Student{
	private int rollno;
    private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
}
public class Encapsulation { //wrapping the code and data in a single unit 

	public static void main(String[] args) {
		Student obj=new Student();
		obj.setRollno(35);
		obj.setName("vishnu");
		System.out.println(obj.getRollno());
		System.out.println(obj.getName());
	}

} 
