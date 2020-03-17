import java.util.Arrays;
import java.io.*;
import java.util.Scanner;
import java.util.*; 
import java.lang.*;  

public class MyUtilities {
	public void SplitArray(int[]z ,int n) {
		Scanner s = new Scanner(System.in);
		int[] a = new int[5];
		for(int i = 0; i<a.length;i++) {
			System.out.println("Insert number["+i+"]: ");
			a[i] = s.nextInt();
			}
		int[] b = new int[a.length+1];
		int highest = a[0];
		int second_highest = a[0];
		int j = 0;
		for (int i=0;i<a.length;i++) {
			if(a[i]>highest) {
				highest = a[i];
				j = i;
			}
		}
		for(int i = 0; i<a.length;i++) {
			if(a[i]<highest && a [i]>second_highest) {
				
			}
		}
		for(int i = 0;i<j;i++) {
			b[i] = a[i];
		}
		b[j] = second_highest;
		b[j+1] = highest-second_highest;
		for (int i = j+2;i<b.length;i++) {
			b[i] = a[i-1];
		}
		for(int i = 0; i<b.length;i++) {
			System.out.print(b[i] + " ");
		}
		
	}
	
	static void arrRotate(int arr[], int n, int k)
	{ 
		/* To get the starting point of  
		rotated array */
		int mod = k % n; 

		// Prints the rotated array from  
		// start position 
		for(int i = 0; i < n; ++i) 
		System.out.print(arr[(i + mod) % n] 
		 + " ");  

		System.out.println(); 
		} 

    public void generateSquare(int n) 
    { 
        int[][] magicSquare = new int[n][n]; 
          
        // Initialize position for 1 
        int i = n/2; 
        int j = n-1; 
   
        // One by one put all values in magic square 
        for (int num=1; num <= n*n; ) 
        { 
            if (i==-1 && j==n) //3rd condition 
            { 
                j = n-2; 
                i = 0; 
            } 
            else
            { 
                //1st condition helper if next number  
                // goes to out of square's right side 
                if (j == n) 
                    j = 0; 
                      
                //1st condition helper if next number is  
                // goes to out of square's upper side 
                if (i < 0) 
                    i=n-1; 
            } 
              
            //2nd condition 
            if (magicSquare[i][j] != 0)  
            { 
                j -= 2; 
                i++; 
                continue; 
            } 
            else
                //set number 
                magicSquare[i][j] = num++;  
                  
            //1st condition 
            j++;  i--;  
        } 
   
        // print magic square 
        System.out.println("The Magic Square for "+n+":"); 
        System.out.println("Sum of each row or column "+n*(n*n+1)/2+":"); 
        for(i=0; i<n; i++) 
        { 
            for(j=0; j<n; j++) 
                System.out.print(magicSquare[i][j]+" "); 
            System.out.println(); 
        } 
    } 
    static int  MAX = 100; 
    
 // Fills transpose of mat[N][N] in tr[N][N] 
    static void transpose(int mat[][], int tr[][], int N) 
    { 
        for (int i = 0; i < N; i++) 
            for (int j = 0; j < N; j++) 
                tr[i][j] = mat[j][i]; 
    } 
      
    // Returns true if mat[N][N] is symmetric, else false 
     static boolean isSymmetric(int mat[][], int N) 
    { 
        int tr[][] = new int[N][MAX]; 
        transpose(mat, tr, N); 
        for (int i = 0; i < N; i++) 
            for (int j = 0; j < N; j++) 
                if (mat[i][j] != tr[i][j]) 
                    return false; 
        return true; 
    } 
   

}
