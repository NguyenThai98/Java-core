package uyen.excercise;

import java.util.Scanner;

public class Exc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao mot chuoi: ");
		String str = new String();
		str = sc.nextLine();
		String newstr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			newstr += str.charAt(i);
		}
		System.out.print("chuoi sau khi dao nguoc la: " + newstr);
	}

}
