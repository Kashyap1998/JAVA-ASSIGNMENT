package Mt5;

public class PrintMessage {
	public static void main(String[] args) {
	Thread Th1=new Thread(new A());
	Thread Th2=new Thread(new B());
	Th1.start();
	Th2.start();
	

}
}