package Arrays;

import java.util.Scanner;
public class arrays2 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int size, ind = 0;
		int max = 0;
		System.out.println("Entre the Size");
		size = sc.nextInt();
		int[] a = new int[size];
		int ele = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Entre the valaue a[" + i);
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			if (a[i] > max) {
				max = a[i];
				ind = i;
			}
		}
		System.out.println("Highest Value = " + max);
		System.out.println("Highest valued index = " + ind);
	}
}