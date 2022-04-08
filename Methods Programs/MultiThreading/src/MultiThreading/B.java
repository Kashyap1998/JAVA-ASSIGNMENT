package MultiThreading;

public class B extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	    
		System.out.println("This is another Thread");
	}
public static void main(String[] args) {
	A a=new A();
	B b=new B();
	b.setPriority(10);
	a.start();
	b.start();
	System.out.println(Thread.currentThread().getPriority());
	System.out.println(Thread.currentThread().getName());
    Thread.currentThread().setName("Kashyap");
    System.out.println(Thread.currentThread().getName());
    System.out.println(Thread.currentThread().isAlive());
    System.out.println(b.isAlive());
    
	
}
}
