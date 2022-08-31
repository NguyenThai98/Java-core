package uyen.excercise;

import java.util.Scanner;

public class Exc8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao mot chuoi: ");
		String str = sc.nextLine();
		sc.close();
		str = formatString(str);
		String[] subStr = str.split(" ");
		String newStr = "";
		for (int i = 0; i < subStr.length; i++) {
			newStr += upperCase(subStr[i]);
			if (i != subStr.length - 1) {
				newStr += " ";
			}
		}
		System.out.print("Chuoi moi la: " + newStr);
	}

	public static String upperCase(String str) {
		String newStr = str.substring(0, 1).toUpperCase();
		for (int i = 1; i < str.length(); i++) {
			newStr += str.charAt(i);
		}
		return newStr;
	}

	public static String formatString(String input) {
		input = input.trim();
		input = input.replaceAll("\\s+", " ");
		return input;
	}
}