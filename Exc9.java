package uyen.excercise;

import java.util.Scanner;

public class Exc9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so thu nhat tu 10 den 99: ");
		int a = checkInput(sc.nextInt());
		System.out.println("Nhap so thu hai tu 10 den 99: ");
		int b = checkInput(sc.nextInt());
		// System.out.print(a + " " + b + " ");
		System.out.print(check(a, b));
	}

	public static int checkInput(int n) {
		if (n < 10 || n > 99) {
			Scanner sc = new Scanner(System.in);
			System.out.print("So ban nhap khong dung, nhap lai so tu 10 den 99: ");
			n = sc.nextInt();
			n = checkInput(n);
		}
		return n;
	}

	public static boolean check(int a, int b) {
		int x = 0;
		int z = 0;
		while (a > 0) {
			x = a % 10;
			int y = b;
			while (y > 0) {
				z = y % 10;
				if (x == z) {
					return true;
				}
				y /= 10;
			}
			a /= 10;
		}
		return false;
	}
}
