package Arrays;
import java.util.Scanner;
	 
	import java.util.Arrays;
	 
	public class arrays1 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			int ele = sc.nextInt();
			int[] a = new int[size];
			for (int i = 0; i < size; i++) {
				System.out.println("Entre value for a[" + i);
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			int result = Arrays.binarySearch(a, ele);
			if (result < 0) {
				System.out.println("Element not found");
			} else {
				System.out.println("Element found " + result);
			}
		}
	}
	 
	
