package uyen.excercise;

import java.util.Scanner;

public class Exc7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao mot so: ");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
