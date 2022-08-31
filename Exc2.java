package uyen.excercise;

import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap 1 de chuyen tu decimal sang binary, 2 de chuyen tu binary sang decimal: ");
		int n = checkInput(sc.nextInt());
		switch (n) {
		case 1: {
			System.out.print("Nhap vap so decimal: ");
			int decimal = sc.nextInt();
			System.out.print(decimal + " thanh binary: " + decimalToBinary(decimal));
			break;
		}
		case 2: {
			System.out.print("Nhap vap so binary: ");
			long binary = sc.nextInt();
			System.out.print(binary + " thanh decimal: " + binaryToDecimal(binary));
		}
		}
	}

	public static long decimalToBinary(int n) {
		int pow = 0;
		long binary = 0;
		while (n > 0) {
			binary += (n % 2) * Math.pow(10, pow);
			pow++;
			n /= 2;
		}
		return binary;
	}

	public static int binaryToDecimal(long n) {
		int pow = 0;
		int decimal = 0;
		while (n > 0) {
			decimal += (n % 2) * Math.pow(2, pow);
			n /= 10;
			pow++;
		}
		return decimal;
	}

	public static int checkInput(int n) {
		if (n > 2 || n < 1) {
			Scanner sc = new Scanner(System.in);
			System.out.print("So ban chon khong hop le, vui long nhap lai 1 hoac 2: ");
			n = sc.nextInt();
			n = checkInput(n);
		}
		return n;
	}
}
