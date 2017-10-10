package test2;

public class Fruit implements Pare,Eat {

	@Override
	public void eat() {
		          System.out.println("eating!");
		
	}

	@Override
	public void pare() {
                  System.out.println("paring!");		
	}

}
