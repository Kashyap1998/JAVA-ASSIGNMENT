package project6;
import java.util.Scanner;

public class ABC {

	public static void main(String[] args) {
		long binary_input_1 , binary_input_2 ;
	      System.out.println("Required packages have been imported");
	      Scanner input = new Scanner(System.in);
	      System.out.println("A reader object has been defined ");
	      System.out.print("Enter the first binary number : ");
	      binary_input_1 = input.nextLong();
	      System.out.print("Enter the second binary number : ");
	      binary_input_2 = input.nextLong();
	      int i, carry ;
	      i = 0;
	      carry = 0;
	      int[] binary_sum = new int[10];
	      while (binary_input_1 != 0 || binary_input_2 != 0) {
	         binary_sum[i++] = (int) (carry + (binary_input_1 % 10 + binary_input_2 % 10) % 2);
	         carry = (int) ((binary_input_1 % 10 + binary_input_2 % 10 + carry) / 2);
	         binary_input_1 = binary_input_1 / 10;
	         binary_input_2 = binary_input_2 / 10;
	      }
	      if (carry != 0) {
	         binary_sum[i++] = carry;
	      }

	
	 --i;
     System.out.print("\nThe sum of the binary numbers is: ");
     while (i >= 0) {
        System.out.print(binary_sum[i--]);
     }
     System.out.print("\n");
  }
}

