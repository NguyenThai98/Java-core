package uyen.excercise.Point;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao toa do x1: ");
		int x1 = sc.nextInt();
		System.out.print("Nhap vao toa do y2: ");
		int y1 = sc.nextInt();
		System.out.print("Nhap vao toa do x2: ");
		int x2 = sc.nextInt();
		System.out.print("Nhap vao toa do y2: ");
		int y2 = sc.nextInt();
		Point A = new Point(x1, y1);
		Point B = new Point(x2, y2);
		System.out.print("Do dai doan thang 2 diem AB la: " + Point.lineLength(A, B));
	}

}
