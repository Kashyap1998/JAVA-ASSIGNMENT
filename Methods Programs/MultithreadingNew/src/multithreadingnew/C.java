package multithreadingnew;


public class C extends Thread {
	public void run() {
	for(int i=1;i<10;i++) {
		System.out.println("Thread C:"+i);
	}
	}
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		C c=new C();
		a.start();
		b.start();
		c.start();
	
}
}
