package practice;

public class Demo {
	int real,image;
	
	public Demo(int r,int i)
	{
		this.real=r;
		this.image=i;
		
	}
	public void showC()
	{
		System.out.print(this.real + " +i" + this.image);
	}
  public static Demo add(Demo n1,Demo n2) {
	  Demo res=new Demo(0,0);
	  res.real=n1.real+n2.real;
	  res.image=n1.image+n2.image;
	  return res;
  }
	public static void main(String[] args) {
		Demo d1=new Demo(4,5);
		Demo d2=new Demo(10,5);
		System.out.print("first Complex number: ");
		d1.showC();
		System.out.print("\nSecond Complex number: ");
		d2.showC();
		Demo res=add(d1,d2);
		System.out.println("\nAddition is :");
		res.showC();
		
		

	}

}
