package Arrays;


	import java.util.Scanner;
	public class arrays9 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	 
	        System.out.print("Enter size: ");
	        int n = sc.nextInt();
	 
	        int arr[] = new int[n];
	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	 
	        System.out.print("Enter K: ");
	        int k = sc.nextInt();
	 
	        k = k % n;
	 
	        for (int i = k; i < n; i++)
	            System.out.print(arr[i] + " ");
	 
	        for (int i = 0; i < k; i++)
	            System.out.print(arr[i] + " ");
	    }
	}
	 

