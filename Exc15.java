package uyen.excercise;

import java.util.Scanner;

public class Exc15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao mot chuoi: ");
		String str = sc.nextLine();
		System.out.println("do dai cua chuoi: " + str.length());
		System.out.print("chon vi tri ban muon in ki tu: ");
		int index = sc.nextInt();
		System.out.println("ki tu ban muon in ra: " + str.charAt(index - 1));
		String subStr = "abcdef";
		if (str.contains(subStr) == true) {
			System.out.print("co chuoi phu");
		} else {
			System.out.print("khong co chuoi phu");
		}

	}

}
