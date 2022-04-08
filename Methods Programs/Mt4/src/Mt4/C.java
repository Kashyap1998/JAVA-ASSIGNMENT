package Mt4;

public class C implements Runnable {
	public void run() {
		for(int i=1;i<20;i++) {
			System.out.println("Thread C:");
		}
	}

}
