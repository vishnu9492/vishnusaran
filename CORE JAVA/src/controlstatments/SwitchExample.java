package controlstatments;

public class SwitchExample { //executes one statement from multiple conditions

	public static void main(String[] args) {
int number=20;
switch(number) {
case 10:System.out.println(10);
break;
case 20:System.out.println(20);
break;
case 30:System.out.println(30);
break;//if break is not there all the values gets printed
default:System.out.println("not in 10 20 30" );
}
	}

}
