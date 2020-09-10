package de.bkukr.student.paul.hornig;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] list = new int[12];
		
		BubbleSort bs = new BubbleSort();
		
		randArray(list, 1200);
		printArray(list);
		
		System.out.print("\n");
		
		bs.sort(list);
		printArray(list);
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + "; "); 
		}
	}
	
	public static void randArray(int[] arr, int max) {
		Random rand = new Random();
		
		for(int i = 0; i <= arr.length - 1; i++) {
			arr[i] = rand.nextInt(max);
		}
	}

}
