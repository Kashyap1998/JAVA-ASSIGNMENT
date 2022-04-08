package list8;
import java.util.*;

public class SortArrayList {

	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
    list.add("Volkswagen");
    list.add("Toyota");
    list.add("Porsche");
    list.add("Ferrari");
    list.add("Mercedes-Benz");
    list.add("Audi");
    list.add("Rolls-Royce");
    list.add("BMW");
    System.out.println("Before Sorting:" +list);
    Collections.sort(list);
    System.out.println("After Sorting:" +list);
    
	}

}
