package exception;

public class ExDemo {
	private static String[] ar;

	public static void main(String[] args) {
		int c,b[] = null;
		
		
		int a=Integer.parseInt(ar[0]);
		try
		{
			if(a%2==0)
			{
				c=10/0;
			}
			else
			{
				b[15]=20;
			}
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Exception is :" +e1);
			
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("Exception is:" + e2);
		}
		System.out.println("Out of all try catch blocks");
	}

}
