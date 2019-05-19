package strings;

public class Insert {

	public static void main(String[] args) {
String s1="Test";
s1.concat("56Test");
System.out.println(s1);
StringBuffer sb =new StringBuffer("Test");
sb.append("56Test");
System.out.println(sb);
sb.insert(1, 100);
System.out.println(sb);



	}

}
