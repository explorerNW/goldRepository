package algorithms;

import java.util.Scanner;

public class QuickSort {
		            
	             int time;
	             int change;
                 public int[] quickSort(int[] n,int low,int high) {      //快排
                	 int i,j,t,pivotKey; 
                	    if(low>high) 
                	       return null; 
                	                                
                	    pivotKey=n[low]; //pivotKey中存的就是基准数 
                	    i=low; 
                	    j=high; 
                	    while(i<j) 
                	    { 
                	                   //顺序很重要，要先从右边开始找 
                	                   while(n[j]<=pivotKey && i<j) {
                	                	     j--;
                	                	     time++;
                	                   }
                	                        
                	                   //再找右边的 
                	                   while(n[i]>=pivotKey && i<j) {
                	                	     i++;
                	                	     time++;
                	                   }
                	                        
                	                   //交换两个数在数组中的位置 
                	                   if(i!=j) 
                	                   { 
                	                            t=n[i]; 
                	                            n[i]=n[j]; 
                	                            n[j]=t; 
                	                            change++;
                	                   } 
                	    } 
                	    //最终将基准数归位 
                	    n[low]=n[i]; 
                	    n[i]=pivotKey; 
                	                             
                	    this.quickSort(n, low, i-1);//继续处理左边的，这里是一个递归的过程 
                	    this.quickSort(n, i+1,high);//继续处理右边的 ，这里是一个递归的过程
                	   
                	    return n;
                 }
                 
                 
                 public static void main(String[] args) {
					          QuickSort quickSort = new QuickSort();
					          Scanner reader = new Scanner(System.in);
					          System.out.println("Please enter the value of size, max, min:");
					                  int size = reader.nextInt();
					                  int max = reader.nextInt();
					                  int min = reader.nextInt();
					                  reader.close();
					                  int[] a = new int[size];
					          for(int i = 0;i<size;i++) {             //给数组赋值
					        	         a[i] = RandomGenerator.randomNumber(max, min);
					        	         if(i%10 == 0) {
				        	        	     System.out.println();
				        	          }
					        	         System.out.print(a[i]+"\t");
					          }
					          int low = 0;
					          int high = size-1;
					          int[] result = quickSort.quickSort(a, low, high);
					          System.out.println();
					          for(int i = 0;i<result.length;i++) {
					        	          if(i%10 == 0) {
					        	        	     System.out.println();
					        	          }
					        	          System.out.print(result[i]+"\t");
					          }
					          System.out.println("totalTime = "+quickSort.time);
					          System.out.println("totalChange = "+quickSort.change);
					          System.gc();
				}
}
