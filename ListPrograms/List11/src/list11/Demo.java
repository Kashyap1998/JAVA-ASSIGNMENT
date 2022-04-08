package list11;

import java.util.ArrayList;



public class Demo {

	public static void main(String[] args) {
		ArrayList<String>list1=new ArrayList<String>();
		list1.add("CSK");
		list1.add("MI");
		list1.add("KKR");
		list1.add("SRH");
		System.out.println("List1"+list1);
		ArrayList<String>list2=new ArrayList<String>();
		list2.add("PWI");
		list2.add("MI");
		System.out.println("List2"+list2);
		ArrayList<String>list3=new ArrayList<String>(list1);
		list3.retainAll(list2);
		System.out.println("Common Elements"+ list3);
		

	}

}
