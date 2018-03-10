package treeStar;

public class TreeChristmas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++)
				System.out.print("*");
			if (i != 0) {
				System.out.println("");
			}
		}
	}
}