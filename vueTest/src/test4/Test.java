package test4;

import java.util.Scanner;

public class Test {
	
			      public int f1(int a,int b) {
				        return a+b;
				  }
	              public int f1(int a,int b, int c) {
	            	        return a+b+c;
	              }
                  public static void main(String[] args) {
                         Test test = new Test();
                              System.out.println(test.f1(10, 20));
                              System.out.println(test.f1(10, 20, 30));
				}
}
