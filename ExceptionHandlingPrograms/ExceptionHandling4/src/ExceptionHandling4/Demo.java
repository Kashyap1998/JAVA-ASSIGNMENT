package ExceptionHandling4;
public class Demo {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		try {
			int arr[]= {1,2};
			arr[2]=3/0;
		}
		catch(Exception e)
		{
			System.out.println("Generic exception");
		}
		
	}

}
