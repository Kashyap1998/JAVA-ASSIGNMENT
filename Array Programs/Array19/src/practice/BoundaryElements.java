package practice;

public class BoundaryElements {

	public static void main(String[] args) {
		int arr[][]=new int[][] {
			{9,8,9,8},{8,7,8,7},{7,6,7,6},
			{6,5,6,5}
		};
		System.out.println("The matrix is defined as:");{
			
		for(int x=0;x<arr.length;x++) {
			for(int y=0;y<arr[x].length;y++) {
				System.out.print(arr[x][y] + " ");
			}
			System.out.println();
			}
		}
		BoundaryElements border_values=new BoundaryElements();
		System.out.println("The border elemnts of the  matrix is:");
		for(int x=0;x<arr.length;x++) {
			for(int y=0;y<arr[x].length;y++) {
				if(x==0 || y==0|| x==arr.length-1||y==arr[x].length-1) {
					System.out.print(arr[x][y] + " ");
				}else {
					System.out.print(" ");
				}
				}
			System.out.println();
			}

	}

}
