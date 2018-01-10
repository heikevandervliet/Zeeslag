import java.util.Scanner;
import java.util.Arrays;

public class Zeeslag {

	static Integer[][] veld2D = { { 0, 1, 1, 1 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 1, 0, 0 } };

	static String[][] zee2D = { { "~", "~", "~", "~" }, { "~", "~", "~", "~" }, { "~", "~", "~", "~" },
			{ "~", "~", "~", "~" } };

	static Integer[] veldwijzer = { 1, 2, 3, 4 };

	static Integer horizontaal;
	static Integer verticaal;

	static int punten = 10;

	public static void printZee() {
		System.out.println("\t  " + Arrays.toString(veldwijzer));
		System.out.println("\t 1" + Arrays.toString(zee2D[0]));
		System.out.println("\t 2" + Arrays.toString(zee2D[1]));
		System.out.println("\t 3" + Arrays.toString(zee2D[2]));
		System.out.println("\t 4" + Arrays.toString(zee2D[3]));
	}

	public static void schiet(int verticaal, int horizontaal) throws ArrayIndexOutOfBoundsException {
		try {
			if (veld2D[verticaal - 1][horizontaal - 1] == 1) {
				System.out.println("Raak!");
				veld2D[verticaal - 1][horizontaal - 1] = 0;
				zee2D[verticaal - 1][horizontaal - 1] = "X";
				checkWinst();
			} else {
				System.out.println("Mis!");
				zee2D[verticaal - 1][horizontaal - 1] = "*";
				punten = punten - 1;
				checkWinst();
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Geschoten buiten het veld.");
			checkWinst();
		}
	}

	public static void checkWinst() {
		if (punten > 0) {
			OUTER: for (int i = 0; i < veld2D.length; i++) {
				INNER: for (int j = 0; j < veld2D[i].length; j++) {
					if (veld2D[i][j] == 1) {
						System.out.println("Punten: " + punten);
						System.out.println("Boten nog niet gezonken. Schiet nog een keer:");
						System.out.println();
						printZee();
						System.out.println();
						System.out.println("Kies een positie [verticaal spatie horizontaal]: ");
						break OUTER;
					} else if (i == 3 & j == 3 && veld2D[i][j] == 0) {
						printZee();
						System.out.println("Boten gezonken! Je wint.");
						System.out.println("Einde van het spel.");
					}
				}
			}
		} else if (punten == 0) {
			System.out.println("Beurten voorbij. Je hebt niet alle boten gevonden en dus verloren.");
			System.out.println("Einde van het spel.");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welkom bij Zeeslag");
		System.out.println("Vind de twee boten door te schieten.");
		System.out.println("Type per beurt nummer spatie nummer.");
		System.out.println("Deze nummers geven de positie in zee aan waarop je wilt schieten.");
		System.out.println("Bijvoorbeeld: 2 3");// uitleg wat te doen
		System.out.println();

		printZee();
		System.out.println();
		System.out.println("Kies een positie [verticaal spatie horizontaal]: ");

		for (int i = 50; i > 0; i--) {
			Scanner scanner = new Scanner(System.in);
			horizontaal = scanner.nextInt();
			verticaal = scanner.nextInt();
			schiet(horizontaal, verticaal);
		}
		
		

	}

}