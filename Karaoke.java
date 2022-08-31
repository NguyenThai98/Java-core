package uyen.excercise;

import java.util.Scanner;

public class Karaoke {

	final static int donGia = 30000;
	final static double extra = 0.3;
	final static int giaNuoc = 10000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao thgian bat dau: ");
		int startHour = checkHour(0, 24, sc.nextInt());
		System.out.print("Nhap vao thoi gian ket thuc: ");
		int endHour = checkHour(startHour, 24, sc.nextInt());
		System.out.print("Nhap vao so chai nuoc da dung: ");
		int water = sc.nextInt();
		int totalHour = endHour - startHour;
		int totalBill = totalSingPayment(totalHour) + water * giaNuoc;
		if (startHour >= 9 && endHour <= 17) {
			totalBill *= 0.2;
		}
		System.out.print("Tong hoa don la: " + totalBill);

	}

	public static int checkHour(int min, int max, int n) {
		Scanner sc = new Scanner(System.in);
		if (n > max || n < min) {
			System.out.print("Invalid input, nhap lai: ");
			n = sc.nextInt();
			n = checkHour(min, max, n);
		}
		return n;
	}

	public static int totalSingPayment(int n) {
		int total = 0;
		if (n > 3) {
			total = (int) (3 * donGia + (n - 3) * (donGia + donGia * extra));
		} else {
			total = n * donGia;
		}
		return total;
	}

}
