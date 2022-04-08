package coversion2;

public class Demo {

	public static void main(String[] args) {
		String octalString="121";
		char c1='a';
		char c2='1';
		int a=c1;
		int b=c2;
		System.out.println(a);
		System.out.println(b);
		boolean b1=true;
		boolean b2=false;
		long P = 8347674434L;
		String m=Long.toString(P);
		int k=65;
		char c=(char)k;
		System.out.println(c);
		System.out.println(m);
		String s="78333736745";
		double d=Double.parseDouble("23.6");
		long l=Long.parseLong(s);
		System.out.println(l);
		System.out.println(d);
		String s1=String.valueOf(b1);
		String s2=String.valueOf(b2);
		System.out.println(Integer.toOctalString(85));;
		System.out.println(Integer.parseInt("a",16));
		int decimal=Integer.parseInt(octalString,8);
		System.out.println(Integer.toOctalString(85));
		System.out.println(decimal);
		System.out.println(Integer.toBinaryString(15));
		System.out.println();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(decimal);
		System.out.println(decimal);
		System.out.println(decimal);
	}
}
