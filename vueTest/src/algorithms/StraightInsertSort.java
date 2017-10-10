package algorithms;

public class StraightInsertSort {

	   public int[] sort(int[] a) {
		                int time = 0;
		                    int i, j;  
		                    for (i = 1; i < a.length; i++)  
		                        if (a[i] < a[i - 1])  
		                        {  
		                            int temp = a[i];  
		                            for (j = i - 1; j >= 0 && a[j] > temp; j--) {
		                            	a[j + 1] = a[j];
		                            	time++;
		                            }
		                            a[j + 1] = temp;
		                        }
                    System.out.println("--------------------------------------------------------------------------->time="+time);
                    System.gc();
 		         return a;
	   }
	public static void main(String[] args) {
                   StraightInsertSort sort = new StraightInsertSort();
                   int[] a = { 10, 0, -7, -5, 10, -4, -7, 0, 5, -6 };
                   /*int[] a = new int[10];
                   for(int i = 0;i<a.length;i++) {
                	                a[i] = RandomGenerator.randomNumber(-5, 5);
                	                if(i%10 == 0) {
                	                	  System.out.println();
                	                }
                	                System.out.print(a[i]+" ");
                   }*/
                                int[] result = sort.sort(a);
                                System.out.println();
                                for(int i = 0;i<result.length;i++) {
                                	      if(i%10 == 0) {
                                	    	   System.out.println();
                                	      }
                                	        System.out.print(result[i]+" ");
                                }
                                System.gc();
	}

}
