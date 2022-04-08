package MethodOverloading;

public class Test {
	public void show(int a) {
		System.out.println("Kashyap");
		}
	
		public void show(int a,String b) {
			System.out.println("Shivam");
		}
	public static void main(String[] args) {
		Test t=new Test();
		t.show(3);
		t.show(9,"Vaghela");
	}

}
