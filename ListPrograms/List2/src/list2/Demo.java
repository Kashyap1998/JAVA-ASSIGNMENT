package list2;
import java.util.LinkedList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		int index_start=3;
		int index_end=6;
		List<Integer> input_list=new LinkedList<>();
		for(int i=1;i<=9;i++) {
			input_list.add(i+100);
		}
		System.out.println("The list is defined as: "+input_list);
		input_list.subList(index_start, index_end);
		System.out.println("The Elements from" +index_start + "index position to" +index_end +"index position are: "+input_list.subList(3,6));
		}

}
