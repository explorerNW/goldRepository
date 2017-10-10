package algorithms;

import java.util.Arrays;

public class Test2 {// ShellSort
	public static void main(String[] args) {
		//int[] arr = new int[10];
		int[] arr = {10,0,-7,-5,10,-4,-7,0,5,-6};
		/*for (int i = 0; i < arr.length; i++) {
			arr[i] = RandomGenerator.randomNumber(10, -10);
		}*/
		for (int i = 0; i < arr.length; i++) {
			if (i % 10 == 0) {
				System.out.println();
			}
			System.out.print(arr[i] + "\t");
		}
		Test2 test = new Test2();
		test.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (i % 10 == 0) {
				System.out.println();
			}
			System.out.print(arr[i] + "\t");
		}
		// System.out.println(Arrays.toString(arr));
		/*for (int i = 0; i < arr.length; i++) {
			arr[i] = RandomGenerator.randomNumber(10, -10);
		}*/
		int[] arr2 = {10,0,-7,-5,10,-4,-7,0,5,-6};
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
		for (int i = 0; i < arr2.length; i++) {
			if (i % 10 == 0) {
				System.out.println();
			}
			System.out.print(arr2[i] + "\t");
		}
		test.sort1(arr2);
		for (int i = 0; i < arr2.length; i++) {
			if (i % 10 == 0) {
				System.out.println();
			}
			System.out.print(arr2[i] + "\t");
		}
		// System.out.println(Arrays.toString(arr));
	}

	/**
	 * 希尔排序 针对有序序列在插入时采用交换法
	 * 
	 * @param arr
	 */
	int time = 0;

	public void sort(int[] arr) {
                System.out.println("switch mode!");
		// 增量gap，并逐步缩小增量
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			// 从第gap个元素，逐个对其所在组进行直接插入排序操作
			for (int i = gap; i < arr.length; i++) {
				int j = i;
				while (j - gap >= 0 && arr[j] < arr[j - gap]) {
					// 插入排序采用交换法
					swap(arr, j, j - gap);
				    j -= gap;
				}
				time++;
			}
		}
		System.out.println(
				"--------------------------------------------------------------------------------------------------->time="
						+ time);
	}

	/**
	 * 希尔排序 针对有序序列在插入时采用移动法。
	 * 
	 * @param arr
	 */
	int time2 = 0;

	public void sort1(int[] arr) {
		System.out.println("move mode!");
		// 增量gap，并逐步缩小增量
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			// 从第gap个元素，逐个对其所在组进行直接插入排序操作
			for (int i = gap; i < arr.length; i++) {
				int j = i;
				int temp = arr[j];
				if (arr[j] < arr[j - gap]) {
					while (j - gap >= 0 && temp < arr[j - gap]) {
						// 移动法
						arr[j] = arr[j - gap];
						j -= gap;
						
					}
					arr[j] = temp;
				}
				time2++;
			}
		}
		System.out.println(
				"---------------------------------------------------------------------------------------------------->time2="
						+ time2);
	}

	/**
	 * 交换数组元素
	 * 
	 * @param arr
	 * @param a
	 * @param b
	 */
	public static void swap(int[] arr, int a, int b) {
		/*arr[a] = arr[a] + arr[b];
		arr[b] = arr[a] - arr[b];
		arr[a] = arr[a] - arr[b];*/
		arr[a] ^= arr[b];
		arr[b] ^= arr[a];
		arr[a] ^= arr[b];
	}
}