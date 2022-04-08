package fibonacciseries;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);{
			int x=0,y=1,z=0,n;
			System.out.println("Enter a number");
			n=sc.nextInt();
			while(z<=n) {
				System.out.print(z+" ");
				x=y;
				y=z;
				z=x+y;

	}

}}}
