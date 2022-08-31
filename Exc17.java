package uyen.excercise;

import java.util.Scanner;

public class Exc17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int min = 0;
		final int max = 1000;
		int n = (int) (Math.random() * 1000 + 1);
		// System.out.print(n);
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao 1 so tu 0 den 1000: ");
		int num = checkInput(min, max, sc.nextInt());
		while (num != n) {
			if (num > n) {
				System.out.println("So ban nhap dang lon hon ");
				System.out.print("Nhap vao 1 so: ");
				num = sc.nextInt();
			} else {
				System.out.println("So ban nhap dang nho hon ");
				System.out.print("Nhap vao 1 so: ");
				num = sc.nextInt();
			}
		}
		System.out.print("Ban da doan dung: " + num);
	}

	public static int checkInput(int min, int max, int n) {
		Scanner sc = new Scanner(System.in);
		if (n > max || n < min) {
			System.out.print("Invalid input, nhap lai tu 0 den 1000: ");
			n = sc.nextInt();
			n = checkInput(min, max, n);
		}
		return n;
	}
}
