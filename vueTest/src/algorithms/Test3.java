package algorithms;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		float[] a = {1,-1,2,1,3,1,4,1,-1,1};// 1,2,8,7,5,6,3,9,4,10 10,2,4,5,6,7,8,3,9,1  1,2,8,7,5,6,3,9,4,10
		int count = 0;

		/*for (int i = 1; i < a.length; i++) {
			if (a[i] > a[i - 1]) {
				for (int j = 0; j < i; j++) {
					if (a[j] < a[i]) {
						
						 //a[j] ^= a[i]; a[i] ^= a[j]; a[j] ^= a[i]; 
						 
						a[i] = a[i] + a[j];
						a[j] = a[i] - a[j];
						a[i] = a[i] - a[j];
						
					}
					count++;
				}
			}
		}*/

		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
					a[i] = a[i] + a[min];
					a[min] = a[i] - a[min];
					a[i] = a[i] - a[min];
					count++;
				}
			}
		}

		System.out.println(Arrays.toString(a) + "  ,count=" + count);
	}

}
