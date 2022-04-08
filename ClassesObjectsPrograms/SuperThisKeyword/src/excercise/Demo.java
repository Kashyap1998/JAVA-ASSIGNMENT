package excercise;

public class Demo extends Test {
	int a=20;
	void show(int a){
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);}


	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.show(40);

	}

}
