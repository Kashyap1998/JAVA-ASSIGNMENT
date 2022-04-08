package practice;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner("Hello World");
		System.out.println("Delimiter:" + scan.delimiter());
		while(scan.hasNext()) {
			System.out.println(scan.next());
		}
		
		scan.close();
	}


	}


