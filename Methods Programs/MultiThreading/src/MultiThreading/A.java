package MultiThreading;
 class A extends Thread{
	 public void run() {
		 System.out.println(Thread.currentThread().getName());
		    
		 System.out.println("The run thread without any parameter");
	 }
	 

}
