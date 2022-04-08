package MethodOverriding;

public class Test2 extends Test1{
	public void show() {
		System.out.println("I am giving test2");
	}
	public static void main(String[] args) {
		Test1 obj=new Test1();
		obj.show();
		Test2 obj2=new Test2();
		obj2.show();
	}

}
