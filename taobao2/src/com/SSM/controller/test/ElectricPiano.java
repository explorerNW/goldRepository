package com.SSM.controller.test;

public class ElectricPiano extends Piano{
	                        public ElectricPiano() {
							               super();
							}
	                        @Override
	                        public void playing() {
	                                     super.playing();
	                        	         System.out.println("electric piano playing!");
	                        }
	                        	                        
	                        public void playing(String str){
	                        	          System.out.println(str);
	                        }
                    public static void main(String[] args) {
						          ElectricPiano ePiano = new ElectricPiano();
						                        ePiano.playing();
						                        ePiano.playing("hello there!");
						                        
					}
}
