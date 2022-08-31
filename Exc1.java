package uyen.excercise;

public class Exc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int rows = 15;
		final int column = 45;
		String c = "*";
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				if (i < 9 && j < 11) {
					System.out.print(c);
					c = (c == "*") ? " " : "*";
				} else if (i < 9 && j == 11) {
					System.out.print(" ");
				} else {
					System.out.print("=");
				}
			}
			c = (c == "*") ? "*" : " ";
			System.out.println("");
		}

	}
}
