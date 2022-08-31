package uyen.excercise;

import java.util.Scanner;

public class Exc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so tu nhien: ");
		int n = sc.nextInt();
		sc.close();
		System.out.println(sum(n));
	}

	public static int sum(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

}
