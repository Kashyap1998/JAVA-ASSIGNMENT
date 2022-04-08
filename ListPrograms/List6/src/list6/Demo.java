package list6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Demo {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,4,4,1,3));
        System.out.println("ArrayList with duplicatenelements: " +numbers);
        Stream<Integer> stream=numbers.stream();
        stream=stream.distinct();
        numbers=(ArrayList<Integer>)stream.collect(Collectors.toList());
	  System.out.println("ArrayList Without duplicate elements:" + numbers);

}
}