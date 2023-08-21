package JavaTest1;

import java.util.Scanner;

public class TestP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		revNum();

	}

	public static void revNum() {
		int rev = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		while (num != 0) {
			rev = rev * 10 + (num % 10);
			num = num / 10;
		}
		System.out.println("Reverese num: " + rev);
	}

}
