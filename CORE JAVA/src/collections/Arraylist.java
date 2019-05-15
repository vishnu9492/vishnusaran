package collections;

import java.util.ArrayList;
import java.util.Iterator;


public class Arraylist {

	public static void main(String[] args) {
ArrayList<String> list=new ArrayList<String>();
list.add("vishnu");
list.add("smabhu");
list.add("suman");
list.add("vishnu");
Iterator itr=list.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}


	}

}
