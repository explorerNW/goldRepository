package algorithms;

public class BubbleSort {
	public int[] sort(int[] a) {
		int bottle = 0, time = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] < a[i]) {
				for (int j = 0; j < i; j++) {
					if (a[j] < a[i]) {
						bottle = a[i];
						a[i] = a[j];
						a[j] = bottle;
						time++;
					}
				}
			}
		}
		System.out.println("----------------------------------------------------------->time = " + time);
		return a;
	}

	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = RandomGenerator.randomNumber(-5, 5);
		}
		int[] result = sort.sort(a);
		for (int i = 0; i < result.length; i++) {
			if (i % 10 == 0) {
				System.out.println();
			}
			System.out.print(result[i] + " ");
		}
		System.gc();
	}

}
