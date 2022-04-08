package patterns;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		int n,i=1,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		n=sc.nextInt();
		for(i=n;i>=1;i--) {
			for(j=1;j<=i;j++) {
			System.out.print("*");
			
			
		}
		System.out.println();
	}

}

	}


