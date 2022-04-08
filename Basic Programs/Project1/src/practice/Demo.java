package practice;
import java.io.*;

public class Demo {
	public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a number");
int number=Integer.parseInt(input.readLine());
System.out.print("You have entered:"+number);
}
}
