package search2;

import java.util.Scanner;

public class Demo {
		int a[]=new int[10];
		int key;
		void getData() {
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<10;i++) {
				System.out.println("Enter Number");
				a[i]=sc.nextInt();
			}
			System.out.println("Enter Number to search");
			key=sc.nextInt();
		}
		void Search() {
			int i,j,flag,mid,pos=0;
			i=0;
			j=9;
			flag=0;
			while(i<=j&&flag==0) {
				mid=(i+j/2);
				if(a[mid]==key) {
					flag=1;pos=mid+1;
				}
				if(a[mid]>key)
					j=mid-1;
				if(a[mid]<key)
					i=mid+1;
			}
			if(flag==0)
				System.out.println("Found");
			else {
				System.out.println("NoFoundAt" +pos);
			}
		}
	



	}


