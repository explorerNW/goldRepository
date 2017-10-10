package test;

public class CompareNumber {
	
                 public static int[] getMin_Max(int[] numbers){                	        
                	 int min = 0,max = 0;
                	        int positionMin = 0,positionMax = 0;
                	        min = numbers[0];
                	        max = numbers[0];
                	        int[] result = new int[2]; 
                	              for(int i =1;i<numbers.length;i++){                	            	            
                	            	         if(numbers[i]<min){
                	            	        	        min = numbers[i];
                	            	        	        positionMin = i;
                	            	         }
                	            	         if(numbers[i]>max){
                	            	        	        max = numbers[i];
                	            	        	        positionMax = i;
                	            	         }
                	              }
                	              result[0] = positionMin;
                	              result[1] = positionMax;
                	              return result;
                 }
                                  
                 
                 public static int randomNum(int max, int min){
                	          return ((int)(Math.random()*(max-min)+min));
                 }
                 
                 public static void main(String[] args) {
                	 //int[] numbers = {};
                	 int numbers[] = new int[300];
                	 for(int i = 0;i<300;i++){
                		         numbers[i] = CompareNumber.randomNum(-10000, 10000);
                	 }
                	                	 
                	 int[] min_maxPositon = new int[2];
                	       min_maxPositon = CompareNumber.getMin_Max(numbers);
					         System.out.println("the position of min value = "+(min_maxPositon[0]+1)+", and the value is "+numbers[min_maxPositon[0]]+" .");
					         System.out.println("the position of max value = "+(min_maxPositon[1]+1)+", and the value is "+numbers[min_maxPositon[1]]+" .");
				}
}
