
public class StarProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;
		for (i = 0; i < 6; i++) {
			for (j = 0; j < i; j++)
				System.out.print("*");
			if (i != 0) {
				System.out.println("");
			}
		}
	}
}
