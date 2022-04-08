package practice;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		/*int a=45,b=56,c=67;
		if(a>=b && a>=c) //using if//
			System.out.println(a+ "is the largest number");
			else if(b>=a && b>=c) 
			System.out.println(b+ "is the largest number");
		else
			System.out.println(c+ "is the largest number");*/
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter all the numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		d=c>(a>b?a:b)?c:((a>b)?a:b);
		System.out.println("Largest Number:"+d);

}}
