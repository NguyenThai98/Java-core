package uyen.excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exc20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so phan tu trong mang: ");
		int n = sc.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap vap phan tu thu " + (i + 1) + ":");
			arr.add(sc.nextInt());
		}
		evenOddArr(arr);
	}

	public static void evenOddArr(List<Integer> arr) {
		List<Integer> oddArr = new ArrayList<Integer>();
		List<Integer> evenArr = new ArrayList<Integer>();
		for (var i : arr) {
			if (i % 2 == 0) {
				evenArr.add(i);
			} else {
				oddArr.add(i);
			}
		}
		System.out.print("mang chan la: ");
		for (var i : evenArr) {
			System.out.print(i + " ");
		}
		System.out.print("mang le la: ");
		for (var i : oddArr) {
			System.out.print(i + "  ");
		}
	}

}
