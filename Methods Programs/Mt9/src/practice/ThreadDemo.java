package practice;

public class ThreadDemo {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		A a=new A();
		B b=new B();
		C c=new C();
		a.setPriority(5);
		b.setPriority(6);
		c.setPriority(9);
		a.start();
		b.start();
		c.start();
		System.out.println("Main Ends");
	}

}
