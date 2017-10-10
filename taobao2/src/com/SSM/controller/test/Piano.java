package com.SSM.controller.test;

public class Piano implements Play {
                   P p = new P();
	public Piano() {
		               System.out.println("Piano!");
	}

	@Override
	public void playing() {
		System.out.println("playing!");
	}

	public void say() {

	}

	public void say(String name) {

	}

}

class P{
	        public P(){
	        	         System.out.println("P class");
	        }
}
