package Abstraction;
class Truck extends Car {

	@Override
	void show() {
		System.out.println("I am working");
	}
	public static void main(String[] args) {
		Truck t=new Truck();
		t.show();
	}
	

}
