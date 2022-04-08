package primenumbers;

public class Prime {

	public static void main(String[] args) {
		int i,count;int j;
		System.out.println("The Prime numbers betwwen 1 to 100 is:");
		for(i=1;i<=100;i++) {
			count=0;
			
			for(j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}{
				if(count==2) {
					System.out.println(i);
					}
			
			}}}
}


