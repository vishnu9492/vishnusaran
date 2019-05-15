package controlstatments;

public class Nestedifexample { //here the inner if block condition executes only when outer if block condition  
//is true
	public static void main(String[] args) {
int age=20;
int weight=75;
if(age>18) {
if(weight>60) {
	System.out.println("you can have something");
}
else {
	System.out.println("you don't have anything");
}
}else {
	System.out.println("invalid");
}
}



}
	


