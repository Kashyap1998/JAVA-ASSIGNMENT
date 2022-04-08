package Mt4;

public class RunnableDemo {
   public static void main(String[] args) {
	   Thread th1=new Thread(new B());
	   Thread th2=new Thread(new C());
	   Thread th3=new Thread(new D());
	   th1.start();
	   th2.start();
	   th3.start();
	   System.out.println("Main ends");
   }
   
}
