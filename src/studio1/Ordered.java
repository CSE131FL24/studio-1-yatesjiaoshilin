package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();

		boolean comp1 = (x<y);
		boolean comp2 = (y<z);
		boolean comp3 = (x>y);
		boolean comp4 = (y>z);
		boolean isOrdered = (comp1 && comp2)||(comp3 && comp4);
		System.out.println(isOrdered);
	}

}
