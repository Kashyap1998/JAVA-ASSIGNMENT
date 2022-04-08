package list9;
import java.util.ArrayList;
import java.io.*;
public class Demo {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
   list.add("TCS");
   list.add("KCS");
   list.add("HCL");
   list.add("INFOSYS");
   list.add("TECH-MAHINDRA");
   list.add("CYGNET");
   System.out.println("Contents of the list:\n" +list);
   System.out.println("The first element of the list is "+list.get(0));
   System.out.println("The last element of the list is:" +list.get(list.size()-1));
   
   
	}

}
