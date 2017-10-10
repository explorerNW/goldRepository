package test2;

public class Human extends Animal{
               
	           private Apple apple;
	           private Animal animal;
	           
	           public Human(Apple apple,Animal animal) {
	        	              this.apple = apple;
	        	              this.animal = animal;
	        	              System.out.println("I'm a man!");
	        	              apple.pare();
	        	              apple.eat();
	        	              animal.work();
	           }
}
