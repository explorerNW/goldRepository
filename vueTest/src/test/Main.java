package test;

public class Main{
	           
	           private int count = 0;
	           public void deliverMoney(int money){
	        	                  for(int i = 0;i<2;i++)
	        	                	         for(int j = 0;j<6;j++)
	        	                	        	 for(int k = 0;j<11;k++)
	        	                	        		 for(int l = 0;j<21;l++)
	        	                	        			 for(int m = 0;j<51;m++)
	        	                	        				 for(int n = 0;n<101;n++){
	        	                	        					         if(i*1+j*5+k*10+l*20+m*50+n*100 == money){
	        	                	        					        	      count++;      
	        	                	        					         }
	        	                	        				 }
	           }
	
	           public static void main(String[] args) {
				             Main test = new Main();
				                  System.out.println();
			}
}