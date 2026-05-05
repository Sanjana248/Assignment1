package Arrays;
	import java.util.Arrays;
	import java.util.Scanner;
	 
	public class arrays3 {
	 
		public static void main(String[] args) {
	 
			Scanner sc = new Scanner(System.in);
			int size;
			size = sc.nextInt();
			int a[] = new int[size];
			int value = 0;
			for (int j = 0; j < size; j++) {
				a[j] = sc.nextInt();
			}
			Arrays.sort(a);
			for (int i = 0; i < size; i++) {
				if (i == 1) {
					value = a[i];
				}
			}
			System.out.println("The Second Smallest number among the array is" + value);
			System.out.println("The position is a[1]");
		}
	}


