package Arrays;
import java.util.Scanner;
 
public class arrays8 {
 
	public static void main(String[] args) {
 
		System.out.println("Enter the size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array in Reverse order");
		for (int j = size-1; j >= 0; --j) {
			System.out.println(a[j]);
	
 
		}
 
	}
 
}