package genericutils;

import java.util.Random;

public class JavaUtils {
	public int getRandom() {
		Random ran= new Random();
		int rann=ran.nextInt(200);
		return rann;
	}

}
