package javaoops;//super keyword is a reference variable which refers to immediate parent 
//class object
class Colour
{
	public String colour="White";
}

public class SuperKeyword extends Colour{
      public String colour="Black";
      void display() {
    	  System.out.println("colour:"+colour);
    	  System.out.println("colour:"+super.colour);
      }

	public static void main(String[] args) {
		SuperKeyword obj=new SuperKeyword();
		obj.display();

	}

}
