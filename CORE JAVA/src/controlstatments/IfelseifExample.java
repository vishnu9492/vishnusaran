package controlstatments;

public class IfelseifExample {   // executes one condition for multiple statements

	public static void main(String[] args) {
		int i=60;
		if(i<50) {
			System.out.println("i value is greater than 50");
		}
		else if(i>=50 && i<60){
				System.out.println("i value is less than 60");
		}
			else if(i>=60 && i<70) {
				System.out.println("i value is less than 70");
			}
			else if(i>=70 && i<80) {
				System.out.println("i value is less than 80");
			}
			else{
		System.out.println("invalid");
			}
		
	}

}
