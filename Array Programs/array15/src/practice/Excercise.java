package practice;
import java.util.*;

public class Excercise {

	 
		public static void sortbycolumn(int arr[][],int col) {
			Arrays.sort(arr,new Comparator<int[]>() {
				public int compare(final int[] entry1,final int[] entry2) {
					if (entry1[col]>entry2[col])
						return 1;
					else
						return -1;
				}
			
		});
		
}
			
		
		
public static void main(String args[]) {
    int matrix[][]= {{39,27,11,42},
			{10,93,91,90},{54,78,56,89},
			{24,64,20,65}};
			int col=3;
			sortbycolumn(matrix,col-1);
			for(int i=0;i<matrix.length;i++) {
				for(int j=0;j<matrix[i].length;j++)
					System.out.println();
			
	}
}
}

