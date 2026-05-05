
package Arrays;
	import java.util.Scanner;
	 
	public class arrays5 {
	 
		public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Entre size");
			 int size = sc.nextInt();
		        double []price = new double[size];
		        System.out.println("Entre total no.of MRP's");
		        int ele = sc.nextInt();
		        System.out.println("Entre the MRP's");
		        for(int i = 0; i < ele; i++){
		            price[i] = sc.nextInt();
		            price[i] = (price[i] * 0.9);
		            System.out.print("Final Price after 10% discount " + price[i]);
		        }
		     
		}
	}


