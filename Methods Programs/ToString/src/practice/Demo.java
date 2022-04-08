package practice;

public class Demo {
	int rollno;
	String name;
	String city;
	
	Demo(int rollno,String name,String city){
		this.rollno=rollno;
		this.name=name;
		this.city=city;
	}
     public String toString() {
    	 return rollno+ " "+name+" "+city;
     }
	public static void main(String[] args) {
		Demo s1=new Demo(101,"Raj","Lucknow");
		Demo s2=new Demo(102,"Vijay","Ahmedabad");
		System.out.println(s1);
		System.out.println(s2);

	}

}
