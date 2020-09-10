package de.bkukr.student.paul.hornig;

public class BubbleSort {
	
	public void sort(int[] arr) {
		int memory, i = arr.length;
		
		while(i > 0) {
			for(int j = 0; j <= arr.length - 2; j++) {
				if(arr[j] > arr[j+1]) {
					memory = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = memory;
				}
			}
			
			i--;
		}
	}
	
	

}
