package uyen.excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exc13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao do dai mang: ");
		int n = sc.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap vao phan tu thu " + (i + 1) + " ");
			arr.add(sc.nextInt());
		}

		int sum = 0;
		System.out.println("Trung binh cua mang: " + average(arr));
		System.out.println("Max cua mang: " + max(arr) + " ,Min cua mang: " + min(arr));
		negaMinMax(arr);
		posiMinMax(arr);
		oddEven(arr);
		addIndex(arr);
		System.out.println();
		removeEle(arr);
	}

	public static int average(List<Integer> arr) {
		int sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
		}
		int average = sum / arr.size();
		return average;
	}

	public static int min(List<Integer> arr) {
		int min = arr.get(0);
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) < min) {
				min = arr.get(i);
			}
		}
		return min;
	}

	public static int max(List<Integer> arr) {
		int max = arr.get(0);
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > max) {
				max = arr.get(i);
			}
		}
		return max;
	}

	public static void negaMinMax(List<Integer> arr) {
		List<Integer> nega = new ArrayList<Integer>();
		for (var i : arr) {
			if (i < 0) {
				nega.add(i);
			}
		}
		if (nega.size() > 0) {
			System.out.print("Phan tu am nho nhat: " + min(nega));
			System.out.println(", phan tu am lon nhat: " + max(nega));
		} else {
			System.out.println("khong co phan tu am ");
		}
	}

	public static void posiMinMax(List<Integer> arr) {
		List<Integer> posi = new ArrayList<Integer>();
		for (var i : arr) {
			if (i > 0) {
				posi.add(i);
			}
		}
		if (posi.size() > 0) {
			System.out.print("Phan tu duong nho nhat: " + min(posi));
			System.out.println(", phan tu duong lon nhat: " + max(posi));
		} else {
			System.out.println("khong co phan tu duong ");
		}

	}

	public static void oddEven(List<Integer> arr) {
		int even[] = new int[arr.size()];
		int odd[] = new int[arr.size()];
		int x = 0, y = 0;
		for (var i : arr) {
			if (i % 2 == 0) {
				even[x] = i;
				x++;
			} else {
				odd[y] = i;
				y++;
			}
		}
		System.out.print("cac phan tu chan: ");
		for (int i = 0; i < x; i++) {
			System.out.print(even[i] + " ");
		}
		System.out.print("cac phan tu le: ");
		for (int j = 0; j < y; j++) {
			System.out.print(odd[j] + " ");
		}
		System.out.println();
	}

	public static void addIndex(List<Integer> arr) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao vi tri muon them: ");
		int index = sc.nextInt();
		System.out.print("Nhap vao gia tri phan tu: ");
		int element = sc.nextInt();
		List<Integer> newArr = new ArrayList<Integer>();
		for (int i = 0; i < index - 1; i++) {
			newArr.add(arr.get(i));
		}
		newArr.add(element);
		for (int i = index - 1; i < arr.size(); i++) {
			newArr.add(arr.get(i));
		}
		System.out.print("Mang sau khi them vao: ");
		for (var i : newArr)
			System.out.print(i + " ");
	}

	public static void removeEle(List<Integer> arr) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao vi tri muon xoa: ");
		int index = sc.nextInt();
		arr.remove(index - 1);
		System.out.print("Mang moi la: ");
		for (var i : arr) {
			System.out.print(i + " ");
		}
	}
}
