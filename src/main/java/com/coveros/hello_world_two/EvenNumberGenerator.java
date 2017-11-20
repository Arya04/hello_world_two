package com.coveros.hello_world_two;
import java.util.Random;

//testing webhook please work!!
public class EvenNumberGenerator {
	public static int generateRandomEven() {
		Random randomGenerator = new Random();
		int result = randomGenerator.nextInt();
		if(result%2!=0) {
			result++;
		}
		return result;
	}
}
