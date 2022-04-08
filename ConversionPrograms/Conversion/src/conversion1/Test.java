package conversion1;
import java.util.Scanner;

public class Test {
int num;
void getVal() {
	System.out.println("Binary to octal");
	Scanner sc=new Scanner(System.in);
	System.out.println("\n Enter the number");
	num=Integer.parseInt(sc.nextLine(),2);
}
void convert() {
	String octal=Integer.toOctalString(num);
	System.out.println("Octal value is:" +octal);
}
	public static void main(String[] args) {
		Test obj=new Test();
		obj.getVal();
		obj.convert();

	}

}
