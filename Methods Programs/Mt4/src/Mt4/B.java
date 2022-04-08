package Mt4;
public class B implements Runnable{
	public void run() {
		for(int i=1;i<20;i++) {
			System.out.println("Thread B:" +i);
		}
	}
	

}
