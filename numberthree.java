import java.io.*; 
public class numberthree {
	public static void main(String[] args) {
		MyUtilities m = new MyUtilities();
		 
		int mat[][] = { { 1, 3, 5 }, 
                 { 3, 2, 4 }, 
                 { 5, 4, 1 } }; 
		if (m.isSymmetric(mat, 3)) 
		     System.out.println( "Yes"); 
		 else
		     System.out.println ( "No"); 
		   
		 } 
}
