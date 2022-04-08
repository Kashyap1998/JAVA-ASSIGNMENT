package collections1;
import java.util.*;

public class Demo1 {

	public static void main(String[] args) {
		 List<Integer> list1 = new ArrayList<>();
	      list1.add(300);
	      list1.add(500);
	      list1.add(180);
	      list1.add(450);
	      list1.add(610);
	      System.out.println("The list is defined as: " +list1);
	      int minimum_value = Collections.min(list1);
	      int maximum_value = Collections.max(list1);
	      if (minimum_value == maximum_value) {
	         System.out.println("All the elements of the list are equal");
	      }
	      else {
	         System.out.println("\nMin value of our list : " + minimum_value);
	         System.out.println("Max value of our list : " + maximum_value);
	      }
	   }
	

   


	}


