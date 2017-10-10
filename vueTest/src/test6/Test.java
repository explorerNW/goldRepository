package test6;

public class Test {
	            
	            public int[] quickSort(int[] array, int low, int high) {
	            	                if(low>high) {
	            	                	 return null;
	            	                }
	            	                int i = low;
	            	                int j = high;
	            	                int dk = array[low];
	            	                while(i<j) {
	            	                	     while(i<j && array[j] <= dk) {
	            	                	    	             j--;
	            	                	     }
	            	                	     while(i<j && array[i] >= dk) {
	            	                	    	             i++;
	            	                	     }
	            	                	     if(i!=j) {
	            	                	    	   array[i] = array[i]+array[j];
	            	                	    	   array[j] = array[i]-array[j];
	            	                	    	   array[i] = array[i]-array[j];
	            	                	     }
	            	                }
	            	                array[low] = array[i];
	            	                array[i] = dk;
	            	                this.quickSort(array, low, i-1);
	            	                this.quickSort(array, i+1, high);
	            	    return array;
	            }

	public static void main(String[] args) {
		          /*int[] a = new int[10];		          		          
                  int[] b = new int[] {};
                  int[] c = {1};
                  
                  
                  int[] array1 = new int[] {1,2};
                  int num1 = 10;
                  int num2 = 1;
                      num2 ^= num1;
                      num1 ^= num2;
                      num2 ^= num1;
                      System.out.println(num1+" "+num2);
                      num1 = num1 + num2;
                      num2 = num1 - num2;
                      num1 = num1 - num2;
                      System.out.println(num1+" "+num2);*/
                  /*int[] a1 = {num1, num2};
                  int[] a2 = {num2, num1};
                        a1 = a2;
                        System.out.println(a1[0]+" "+a1[1]); 
                        System.out.println(a2[0]+" "+a2[1]); */
		       Test test = new Test();
		             int[] array = {5,3,1,6,3,2};
		             int[] result = {};
 		            result = test.quickSort(array, 0, array.length-1);
 		            for(int i : result) {
 		            	      System.out.print(i+"\t");
 		            }
                           
	}

}
