package uyen.excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exc22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so chuoi: ");
		int n = sc.nextInt();
		System.out.println("Nhap vao chuoi: ");
		List<String> str = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			str.add(sc.next());
		}
		String[] arr = new String[n];

		arr = str.toArray(arr);
		int count = 0;
		List<String> palinArr = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			if (palindromic(arr[i]) == true) {
				count++;
				// System.out.print(arr[i].substring((arr[i].length() / 2), arr[i].length()) + "
				// ");
				palinArr.add(arr[i].substring((arr[i].length() / 2), arr[i].length()));
			}
		}
		// System.out.println(count);
		String a[] = new String[count];
		a = palinArr.toArray(a);
		int max = a[0].length();
		if (count > 1) {
			for (int i = 1; i < count; i++) {
				if (a[i].length() > max) {
					max = a[i].length();
				}
			}
		}
		// System.out.println(max);
		for (int i = 0; i < count; i++) {
			if (a[i].length() == max) {
				System.out.print("chuoi palindromic dai nhat la: " + a[i]);
			}
		}
	}

	public static boolean palindromic(String str) {
		String reveStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reveStr += str.charAt(i);
		}
		if (!str.equals(reveStr)) {
			return false;
		}
		return true;
	}
}
