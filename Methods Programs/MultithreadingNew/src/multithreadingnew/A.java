package multithreadingnew;

public class A extends Thread {
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println("Thread A:"+i);
		}
	}
}
