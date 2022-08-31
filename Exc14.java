package uyen.excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exc14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so phan tu: ");
		int n = sc.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap vao phan tu thu " + (i + 1) + " ");
			arr.add(sc.nextInt());
		}
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(j) == arr.get(i)) {
					arr.remove(j);
				}
			}
		}
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
	}

}
