package practice;

public class MovieBookApp {

	public static void main(String[] args) throws InterruptedException {
		TotalEarnings te=new TotalEarnings();
		te.start();
 synchronized(te)
 {
    	  te.wait();
    	System.out.println("TotalEarnings:"+te.total+"rs");
      }
	}

}
