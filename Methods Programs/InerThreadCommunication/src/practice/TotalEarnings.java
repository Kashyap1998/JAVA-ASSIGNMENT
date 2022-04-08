package practice;

public class TotalEarnings extends Thread {
	int total=0;
	public void run() {
		synchronized(this) {
		for(int i=1;i<=10;i++) {
			total=total+100;
		}
		}
		this.notifyAll();
	}

	public static void main(String[] args) {
	

	}

}
