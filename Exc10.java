package uyen.excercise;

import java.util.Scanner;

public class Exc10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so tu nhien n: ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			if (isPrime(i) == true) {
				sum += i;
			}
		}
		System.out.print("Tong cac so nguyen to nho hon n la: " + sum);
	}

	public static boolean isPrime(int n) {
		int count = 0;
		if (n == 0 || n == 1) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					count++;
				}
			}
		}
		if (count >= 1)
			return false;
		return true;
	}

}
