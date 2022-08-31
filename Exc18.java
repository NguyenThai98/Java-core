package uyen.excercise;

import java.util.Scanner;

public class Exc18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so tien ban dau: ");
		long initial = sc.nextLong();
		System.out.print("So tien se dat duoc: ");
		long target = sc.nextLong();
		System.out.print("% lai moi nam: ");
		double interest = sc.nextDouble();
		int year = 0;
		while (initial <= target) {
			initial += initial * interest;
			year++;
		}
		System.out.print(year);
	}

}
