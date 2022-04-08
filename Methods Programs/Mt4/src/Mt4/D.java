package Mt4;

public class D implements Runnable {
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Thread C:" +i);
			
		}
	}

}
