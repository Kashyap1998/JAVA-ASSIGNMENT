package Demo;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int a[]= new int[5],n,count=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
System.out.println("Array Elemenys");
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]+ " ");
}
	System.out.println("Enter search Elements");
	n=sc.nextInt();
	for(int i=0;i<a.length;i++) {
		if(a[i]==n) {
			count++;
		}
	}
if(count>0) {
	System.out.print("Item Found");
}else {
	System.out.print("Item not found");
}
}
}