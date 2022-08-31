package uyen.excercise;

import java.util.Scanner;

public class Exc16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao nam: ");
		int n = sc.nextInt();
		if (isLeapYear(n) == true)
			System.out.print(n + " la nam nhuan");
		else
			System.out.print(n + " khong phai la nam nhuan");

	}

	public static boolean isLeapYear(int n) {
		if (n > 0 && n % 4 != 0) {
			return false;
		}
		return true;
	}
}
