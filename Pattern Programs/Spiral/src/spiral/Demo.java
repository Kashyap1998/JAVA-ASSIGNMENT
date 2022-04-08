package spiral;
import java.util.Scanner;
import java.lang.Math;
public class Demo {
	public static void main(String args[]) {
		int my_input,i,j,my_pattern_size;
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter the size: ");
		my_input=sc.nextInt();
		System.out.print("The spiral pattern");
		System.out.println();
		my_pattern_size=2*my_input-1;
		for(i=1;i<=my_pattern_size;i++) {
			for(j=1;j<=my_pattern_size;j++) {
				System.out.print(Math.max(Math.abs(i-my_input),Math.abs(j-my_input)));
			}
			System.out.println();
		}
	}

}
