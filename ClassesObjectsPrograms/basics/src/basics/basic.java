package basics;

public class basic {
	public void m1()
	{
		System.out.println("I am working");
	}
	basic()
	{
		System.out.print("Constructor called...");
	}
	public static void main(String args[])
	{
		basic obj=new basic();
		obj.m1();
	}
}
