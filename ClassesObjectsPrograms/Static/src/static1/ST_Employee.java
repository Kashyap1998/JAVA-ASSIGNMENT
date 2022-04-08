package static1;



public class ST_Employee {
	int eid;
	String name;
	static String company_name;
	static {
		company_name="Krish Compusoft Services";
	}
	public void show() {
		System.out.println(eid+" "+name+" "+company_name);
	}

	public static void main(String[] args) {
		ST_Employee se1=new ST_Employee();
		se1.eid=20056;
		se1.name="Kashyap";
		ST_Employee se2=new ST_Employee();
		se2.eid=20045;
		se2.name="Vishal";
		se1.show();
		se2.show();

	}

}
