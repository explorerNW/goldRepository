package algorithms;

public class RandomGenerator {
	public static int randomNumber(int max, int min) { // 产生max到min之间的随机数
		return (int) (Math.random() * (max+1 - min) + min);
	}
}
