package list7;
import java.util.*;

public class ABC {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>(
				Arrays.asList("Virat",null,"Dhoni","Sachin",null));
		System.out.println("Initial List:" +list);
		while(list.remove(null)) {
			
		}
      System.out.println("Modified List: " + list);   
	}

}
