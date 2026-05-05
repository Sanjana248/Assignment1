package Arrays;
	import java.util.Scanner;
	 
	public class arrays4 {
	 
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int size = 0;
			System.out.println("Entre Size");
			size = sc.nextInt();
			int a[] = new int[size];
			int evenco = 0, oddco = 0;
			System.out.println("Entre values into array");
			for (int i = 0; i < size; i++) {
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < size; i++) {
				if (a[i] % 2 == 0) {
					evenco++;
				} else {
					oddco++;
				}
			}
			System.out.println("No of even digits " + evenco);
			System.out.println("No of Odd digits " + oddco);
	 
		}
	 
	}
