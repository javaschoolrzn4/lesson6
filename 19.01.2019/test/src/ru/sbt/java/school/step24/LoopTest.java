package ru.sbt.java.school.step24;

public class LoopTest{
	public static void main(String args[]) {
		int counter = 0;
		outer:
		for (int i = 0; i < 3; i++) {
			middle:
			for (int j = 0; j < 3; j++) {
				inner:
				for (int k = 0; k < 3; k++) {
					if (k - j > 0) {
						break middle;
					}
					counter++;
				}
			}
		}
		System.out.println(counter);
	}
}


































//      1. 2
//		2. 3 +
//		3. 6
//		4. 7
//		5. 9