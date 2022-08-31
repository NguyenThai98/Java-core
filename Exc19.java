package uyen.excercise;

import java.util.Scanner;

public class Exc19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Giai phuong trinh bac 1 hoac bac 2: ");
		int n = checkInput(sc.nextInt());
		double a = 0, b = 0, c = 0;
		// System.out.print(checkInput(n));
		switch (n) {
		case 1:
			System.out.print("Nhap vao hai so a va b: ");
			a = sc.nextInt();
			b = sc.nextInt();
			phuongTrinhBac1(a, b);
			break;
		case 2:
			System.out.print("Nhap vao he so a, b va c: ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			phuongTrinhBac2(a, b, c);
			break;
		}
	}

	public static void phuongTrinhBac1(double a, double b) {
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh co vo so nghiem");
			} else {
				System.out.println("Phuong trinh vo nghiem");
			}
		} else {
			System.out.println("Nghiem cua phuong trinh la: " + (-b / (2 * a)));
		}
	}

	public static void phuongTrinhBac2(double a, double b, double c) {
		if (a == 0) {
			if (b != 0) {
				System.out.printf("Phuong trinh la phuong trinh bac 1 co nghiem la: %.2f", (-b / (2 * a)));
			} else {
				System.out.println("Phuong trinh vo nghiem");
			}
		}
		double x1 = 0, x2 = 0;
		double delta = Math.pow(b, 2) - 4 * a * c;
		if (delta > 0) {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("Phuong trinh co 2 nghiem la: %.2f va %.2f", x1, x2);
		} else if (delta == 0) {
			x1 = x2 = -b / (2 * a);
			System.out.printf("Phuong trinh co nghiem kep: %.2f", x1);
		} else {
			System.out.print("Phuong trinh vo nghiem");
		}
	}

	static int checkInput(int n) {
		if (n > 2 || n < 1) {
			Scanner sc = new Scanner(System.in);
			System.out.print("So ban chon khong hop le, vui long nhap lai 1 hoac 2: ");
			n = sc.nextInt();
			n = checkInput(n);
		}
		return n;
	}

}
