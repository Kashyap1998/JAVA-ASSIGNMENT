package list3;
import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Demo {
	public static Integer findMin(List<Integer>list) {
		if(list==null || list.size()==0) {
			return Integer.MAX_VALUE;
		}
		return Collections.min(list);
	}
	public static Integer findMax(List<Integer>list){
		if(list==null || list.size()==0) {
			return Integer.MIN_VALUE;
		}
		return Collections.max(list);
}

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(45);
		list.add(56);
		list.add(22);
		list.add(33);
		System.out.println("Min: " +findMin(list));
		System.out.println("Max:" +findMax(list));}
	

}
