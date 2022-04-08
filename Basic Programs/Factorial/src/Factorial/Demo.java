package Factorial;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		int n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to find factorial");
		n=sc.nextInt();
		while(n>0) {
			fact=fact*n;
			n=n-1;
		}
		System.out.println("Factorial="+fact);
		
	}

}
