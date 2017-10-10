package algorithms;

import java.util.Arrays;

public class ShellSort {
	public int[] sort(int[] a) {                              //switchMode
		         int count = 0;
		         for(int dk = a.length/2;dk > 0;dk /= 2) {
		        	       for(int i = dk;i<a.length;i++) {
		        	    	             int j = i;
		        	    	             while(j-dk>=0 && a[j]<a[j-dk]) {
		        	    	            	        a[j] = a[j]+a[j-dk];
		        	    	            	        a[j-dk] = a[j]-a[j-dk];
		        	    	            	        a[j] = a[j]-a[j-dk];
		        	    	            	        count++;
		        	    	            	        j -= dk;
		        	    	            	        //System.out.println(Arrays.toString(a));
		        	    	             }
		        	    	             //System.out.println(Arrays.toString(a));
		        	       }
		         }
		         System.out.println("count="+count);
		return a;
	}

	public static void main(String[] args) {
		//int[] a = { 10, 0, -7, -5, 10, -4, -7, 0, 5, -6,-10 };
		int[] a = new int[100];
		         for(int i = 0;i<a.length;i++) {
		        	         a[i] = RandomGenerator.randomNumber(-10, 10);
		         }
		      System.out.println(Arrays.toString(a));
		ShellSort sort = new ShellSort();
		      a = sort.sort(a);             //use switchMode
		      System.out.println(Arrays.toString(a));

	}

}
