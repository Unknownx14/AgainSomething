package Academy.AgainSomething;

import java.util.Iterator;

public class MultidimensionalArrays284 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		int a[][] = new int [2][3];
		a[0][0] = 5;
		a[0][1] = 10;
		a[0][2] = 15;
		a[1][0] = 20;
		a[1][1] = 25;
		a[1][2] = 30;
		
		System.out.println(a[1][0]);*/
		
		//Print all the values
	/*	int m=2;
		int n=3;
		
		int b[][] = new int [m][n];
		b[0][0] = 5;
		b[0][1] = 10;
		b[0][2] = 15;
		b[1][0] = 20;
		b[1][1] = 25;
		b[1][2] = 30;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				
				System.out.println(b[i][j]);
				
			}
		}*/
		
		
		//Print the smallest number from the matrix 3x3
/*		int m=3;
		int n=3;
		
		
		int b[][] = new int [m][n];
		b[0][0] = 5;
		b[0][1] = 10;
		b[0][2] = 15;
		b[1][0] = 20;
		b[1][1] = 25;
		b[1][2] = 30;
		b[2][0] = 1;
		b[2][1] = 11;
		b[2][2] = 111;
		
		int minimum=b[0][0];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				
				if (b[i][j] <= minimum)
				{
					minimum=b[i][j];
				}
				
			}
		}
		System.out.println(minimum);
		*/
		
		
		//Find the minimum number and for the same column(where this minimum number is located) extract the maximum number
		
		int m=3;
		int n=3;
		
		
		int b[][] = new int [m][n];
		b[0][0] = 5;
		b[0][1] = 10;
		b[0][2] = 15;
		b[1][0] = 20;
		b[1][1] = 25;
		b[1][2] = 30;
		b[2][0] = 1;
		b[2][1] = 11;
		b[2][2] = 111;
		
		int minimum=b[0][0];
		int minimumColumn = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				
				if (b[i][j] <= minimum)
				{
					minimum=b[i][j];
					minimumColumn=j;
				}
				
			}
		}
		System.out.println(minimum);
		System.out.println(minimumColumn);
		
		int maxValue=minimum;
		for (int k = 0; k< m; k++) {
			for (int l = minimumColumn; l<=minimumColumn; l++) {
				
				if(b[k][l]>=maxValue)
				{
					maxValue=b[k][l];
				}
			}
			
		}
		System.out.println(maxValue);
		
	}

}
