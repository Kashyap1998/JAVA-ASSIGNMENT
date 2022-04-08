package ExceptionHandling5;
public class Demo {
	static void avg() {
		try
		{
			throw new ArithmeticException("demo");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Caught");
		}
	}
public static void main(String[] args) {
	avg();
	
}
}
