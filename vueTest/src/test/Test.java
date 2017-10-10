package test;

class A {
	        public void show(D d){
	        	       System.out.println("A and D");
	        }
	        public void show(A a){
	        	       System.out.println("A and A");
	        }
}

class B extends A {
	       public void show(C c){
	    	   System.out.println("A and a");
	       }
	       public void show(B b){
	    	   System.out.println("B and B");
	        }
}
class C extends B{
	public void show(){
		System.out.println("A and D");
    }
	public void show(C c){
		System.out.println("C and c");
    }
}
class D extends C{
	public void show(D d){
		System.out.println("D and c");
    }
}


public class Test {
       
	private int count = 0;
	public  int step(int n){			
		          if(n < 1){
		        	  return 1;
		          }else{	
		        	  count++;  
		        	  step(n-1);
		        	  step(n-2);
		        	  step(n-3);
		        	  step(n-4);
		        	  step(n-5);
		        	  step(n-6);
		        	           return count;		        	          
		          }
	}
	
	
	  
	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}



	public static void main(String[] args) {
		Test test = new Test();		     		     
		         for(int i = 1;i<=6;i++){
		        	 test.setCount(0);
		        	 System.out.println("n = "+i+" , "+test.step(i));   	 
		         }		
	}

}
