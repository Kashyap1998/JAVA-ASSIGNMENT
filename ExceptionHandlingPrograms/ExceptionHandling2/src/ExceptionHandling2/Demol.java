package ExceptionHandling2;
public class Demol {
	public static void main(String[] args) {
		int a,b,c;
		
		
		a=0;
		b=10;
		c=b/a;
		System.out.println("This line will not be executed");
	
		try
		{
			Integer in=new Integer("abc");
			in.intValue();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic"+ e);
		
		}
		catch (NumberFormatException e)
		{
			System.out.println("Number Format Exception" +e);
		}
	}
}
		
		
	



