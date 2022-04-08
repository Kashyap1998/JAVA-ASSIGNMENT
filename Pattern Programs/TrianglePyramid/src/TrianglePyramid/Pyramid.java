package TrianglePyramid;
import java.util.Scanner;
public class Pyramid {
public static void main(String[] args) {
	int n,i,b,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number of rows");
	n=sc.nextInt();
	for(i=1;i<=n;i++) {
		for(b=1;b<=n-i;b++) {
			System.out.print(" ");}
		
			for(j=1;j<2*i-1;j++) {
				System.out.print("*");}//Put i,i+j,j,kinds of values to check various outputs//
				System.out.println();
				
			}
		}
	}
	


