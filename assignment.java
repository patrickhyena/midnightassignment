import java.util.*;

public class assignment {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter size of array : ");
		
		int myArray[] = new int[5];
		MyUtilities m = new MyUtilities();
		
		m.SplitArray(myArray, 5);
		
	}
}
