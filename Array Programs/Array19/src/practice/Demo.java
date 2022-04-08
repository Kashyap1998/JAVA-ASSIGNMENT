package practice;
import java.io.*;

public class Demo {
static int MAX=10;
static int calculateNormal(int matrix[][],int n)
{
	int sum=0;
	for(int i=0;i<n;i++)
		for(int j=0;j<n;j++)
			sum=sum  + matrix[i][j]*matrix[i][j];
	return(int)Math.sqrt(sum);
}
	public static void main(String[] args) {
		int matrix[][]= {{6,3,2,1,4},
				{7,8,3,12,9},
				{1,11,10,5,8},
				{5,18,6,9,14},
				{19,23,3,12,11},
		};
		System.out.println("Normal of the given matrix is:"+calculateNormal(matrix,5));
	}

}
