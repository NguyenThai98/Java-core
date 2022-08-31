package uyen.excercise;

import java.util.Scanner;

public class Exc11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so tu nhien n: ");
		int n = sc.nextInt();
		int max = 0;
		int log = (int) (Math.log(n) / Math.log(2));
		for (int i = 0; i < n; i++) {
			if (i < log) {
				max = i;
			}
		}
		System.out.print(max);
	}

}
