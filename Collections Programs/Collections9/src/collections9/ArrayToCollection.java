package collections9;
import java.util.*;

public class ArrayToCollection {

	public static void main(String[] args) {
           String playersArray[]= {"Virat","Sachin","Rohit","Bumrah"};
           System.out.println("Array input:" +Arrays.toString(playersArray));
           List playersList=Arrays.asList(playersArray);
           System.out.println("Converted Elements: "+playersList);
	}

}
