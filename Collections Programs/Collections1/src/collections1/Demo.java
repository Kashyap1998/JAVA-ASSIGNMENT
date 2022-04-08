package collections1;
import java.util.*;

public class Demo {
	String name;
	int id;
	Demo(String s,int n){
		name=s;
		id=n;
	}
	public String toString() {
		return "Language :" +name+ "| Language_id:" +id;
	}
	static void print(ArrayList<Demo> input_array){
	      System.out.println("The Elements of the collection are: ");
	      for (Demo element : input_array)
	         System.out.println(element);
	}
	public static void main(String[] args) {
		ArrayList<Demo> input_array=new ArrayList<Demo>();
        Demo object_1=new Demo("Java",101);
        Demo object_2=new Demo("Scala",102);
        Demo object_3=new Demo("Python",103);
        Demo object_4=new Demo("Mysql",104);
        input_array.add(object_1);
        input_array.add(object_2);
        input_array.add(object_3);
        input_array.add(object_4);
        print(input_array);
        
	}

}
