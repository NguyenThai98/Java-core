package uyen.excercise;

import java.util.Scanner;

public class Exc21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao vi tri kan1, x1, 0<x1<1000: ");
		int x1 = checkLimit(0, 1000, sc.nextInt());
		System.out.print("Nhap vao vi tri kan2, x2, x1<x2<1000: ");
		int x2 = checkLimit(x1, 1000, sc.nextInt());
		System.out.print("Nhap vao van toc kan1, v1, 1<v1<1000: ");
		int v1 = checkLimit(1, 1000, sc.nextInt());
		System.out.print("Nhap vao van toc kan2, v2, 1<v2<1000: ");
		int v2 = checkLimit(1, 1000, sc.nextInt());
		if (jump(x1, x2, v1, v2) == true) {
			System.out.println("2 con kang se gap nhau ");
		} else {
			System.out.println("2 con kang se khong gap nhau ");
		}

	}

	static boolean jump(int x1, int x2, int v1, int v2) {
		while (x1 <= x2) {
			if (x1 < x2) {
				x1 += v1;
				x2 += v2;
			} else {
				return true;
			}
		}
		return false;
	}

	static int checkLimit(int min, int max, int n) {
		Scanner sc = new Scanner(System.in);
		if (n > max) {
			System.out.print("Input ban nhap bi lon hon gioi han, nhap lai: ");
			n = sc.nextInt();
			n = checkLimit(min, max, n);
		} else if (n < min) {
			System.out.print("Input ban nhap bi nho hon gioi han, nhap lai: ");
			n = sc.nextInt();
			n = checkLimit(min, max, n);
		}
		return n;
	}
}
