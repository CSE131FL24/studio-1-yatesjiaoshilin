package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What year is it? ");
		int year = in.nextInt();
		boolean ly1 = year % 4 == 0;
		boolean ly2 = year % 100 != 0;
		boolean ly3 = year % 400 == 0;
		boolean ly4 = ly1&&ly2 || ly3;
		System.out.println(ly4);
		// TODO Auto-generated method stub

	}

}
