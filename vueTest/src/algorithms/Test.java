package algorithms;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Test {
	public int[] quickSort(int[] a, int low, int high) {
		if (low > high) {
			return null;
		}
		int i = low, j = high;
		int pivotKey = a[low];
		/*
		 * bottle = a[i]; a[i] = a[j]; a[j] = bottle;
		 */
		while (i < j) {
			while (a[j] >= pivotKey && i < j) {
				j--;
			}
			while (a[i] <= pivotKey && i < j) {
				i++;
			}
			if (i != j) {
				a[i] = a[i] + a[j];
				a[j] = a[i] - a[j];
				a[i] = a[i] - a[j];
			}
		}
		a[low] = a[i];
		a[i] = pivotKey;
		quickSort(a, low, i - 1);
		quickSort(a, i + 1, high);
		return a;
	}

	public int[] StraightInserSort(int[] a) {
		           int i,j;
		for (i = 1; i < a.length; i++) {
			if (a[i] < a[i - 1]) {
				         int temp = a[i];
				for (j = i - 1; j >= 0 && a[j]>temp; j--) {					  
						/*a[i] = a[i] + a[j];
						a[j] = a[i] - a[j];
						a[i] = a[i] - a[j];*/					        
						      a[j+1] = a[j];
				}
				a[j+1] = temp;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		/*
		 * SoftReference<String> str = new SoftReference<String>(new String("hello"));
		 * WeakReference<String> str2 = new WeakReference<String>("hello2");
		 * PhantomReference<String> str3 = new PhantomReference<String>(null, null);
		 * System.out.println(str.get()); System.out.println("before gc :"+str2.get());
		 * System.out.println(str3.get()); System.gc();
		 * System.out.println("after gc :"+str2.get()); System.out.println(str3.get());
		 */
		int[] a = { 4, 0, -1, -3, -1, 0, 2, -3, 2, -1 };
		int low = 0;
		int high = a.length - 1;
		int[] result = (new Test()).StraightInserSort(a);
		System.out.println();
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + "\t");
		}
	}
}
