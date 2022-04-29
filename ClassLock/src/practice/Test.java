package practice;

public class Test implements Runnable{
	
	public void run()
	{
		Lock();
	}
public static synchronized void Lock()
{
	System.out.println(Thread.currentThread().getName());
synchronized(Test.class) {
	System.out.println("in block" + Thread.currentThread().getName());
	System.out.println("in block" + Thread.currentThread().getName()+"end");
}
}


public static void main(String[] args) {
	Test t1=new Test();
	Thread s1=new Thread(t1);
	Thread s2=new Thread(t1);
	Test t2=new Test();
	Thread s3=new Thread(t1);
	s1.setName("KCS");
	s2.setName("IBM");
	s3.setName("XYZ");
	s1.start();
	s2.start();
	s3.start();
}
}
	
