package pascal;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
	int n,c=1,blk,i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of rows");
	n=sc.nextInt();
	for(i=0;i<n;i++) 
	{
		for(blk=1;blk<=n-i;blk++)
		System.out.print(" ");
		for(j=0;j<=i;j++)
		{
			if(j==0|| i==0)
				c=1;
			else
				c=c*(i-j+1)/j;
			System.out.print(" " +c);
		}
		System.out.print("\n");
	}
	
	
	

}
}