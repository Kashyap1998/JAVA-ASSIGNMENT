package practice;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static String removeLeadingZeroes(String str) {
	      String strPattern = "^0+(?!$)";
	      str = str.replaceAll(strPattern, "");
	      return str;}
	
	public static void main(String[] args) {
		String b ="Kashyap";
		String t ="Kashyap";
		String u="Vaghela";
		boolean x=(b==t);
		System.out.println(x);
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer");
		String num=sc.next();
		String f =Test.removeLeadingZeroes(num);
		System.out.println(f);
		String s1="hello People";  
		String p="KASHYAP";
		System.out.println("The string is:" +s1);
		int z=s1.codePointAt(5);
		System.out.println("The unicode point at index 5 is:" +z);
		 Pattern o = Pattern.compile("\\b[a-zA-Z]");
         
	        Matcher m1 = o.matcher(s1);
	        Matcher m2 = o.matcher(p);
	        System.out.println("First letter of each word from string\""+ s1 + "\" : ");
	       
	        while(m1.find())
	        	System.out.println(m1.group());
	        System.out.println();
	        System.out.println("First letter of each word from string\""+ p + "\" : ");
	        while(m2.find()) {
	        	System.out.println(m2.group());
	        }
		int index=4;
		System.out.println("Initial String= "+ s1);
		System.out.println("Initial where new string is inserted="+ index);
		 StringBuffer resString = new StringBuffer(s1);
	      resString.insert(index, p);
	      System.out.println("Resultant String = "+resString.toString());
		
		
		String[] countries= {"America","Africa","Canada","India"};
		System.out.println(Arrays.toString(countries));
		Arrays.sort(countries);
		String s2="";  
		String s3="me";  
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));  
		String s4="Krish Compusoft Services";
		System.out.println(s4.charAt(3));
		String s5="Kashyap Vaghela";
		System.out.println(s5.charAt(9));
		String s6="BCM";
		System.out.println(s6.replace('C','V'));
		String k="My name is KASHYAP";
		String g="Hi I am playing";
		int l=k.compareTo(g);
		if(l<0) {
			System.out.println("k is greater then g");
		} else if(l==0) {
			System.out.println("Both are equal");
		}else {
			System.out.println("k is less than g");
		}
		System.out.println("The String is defined as: " +k);
		int i=3,j=k.length()-4;
		char character[]=k.toCharArray();
		char temp=character[i];
		character[i]=character[j];
		character[j]=temp;
		String result=new String(character);
		System.out.println("\n The string after swapping is:"+result);
		System.out.println("\nThe words with even lengths are: ");
		for(String word :k.split(" ")) {
			if(word.length()%2==0)
				System.out.println(word);}
			String reverse=new StringBuffer(s1).reverse().toString();
			System.out.println("String after reverse: " +reverse);
}
}
		