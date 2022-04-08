package practice;

public class Singleton {
private static Singleton single_instance=null;
public String s;
private Singleton()
{
	s="Hello I am a string part of Singleton Classes";
}
public static Singleton getInstance()
{
	if(single_instance==null)
		single_instance =new Singleton();
	return single_instance;
}

	public static void main(String[] args) {
		Singleton x= Singleton.getInstance();
		Singleton y= Singleton.getInstance();
		Singleton z= Singleton.getInstance();
		System.out.println("Hashcode of x is " + x.hashCode());
		System.out.println("Hashcode of y is " + y.hashCode());
		System.out.println("Hashcode of z is " + z.hashCode());
		
		if(x==y && y==z) {
			System.out.println("Three objects point to the same memory location on the heap");
		}
		else {
			System.out.println("Not Same location");
		}

	}

}
