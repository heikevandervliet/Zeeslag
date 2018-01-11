import java.util.Scanner;
import java.util.Arrays;

public class Zeeslag {

	Integer horizontaal;
	Integer verticaal;
	int punten = 10;
	boolean klaar = false;

	
	public void schiet(int verticaal, int horizontaal, Zee zee, Boot boot1, Boot boot2) throws ArrayIndexOutOfBoundsException {
		try {
			if (zee.veld2D[verticaal - 1][horizontaal - 1] == 3) {
				System.out.println("Raak!");
				boot1.geraakt();
				zee.veld2D[verticaal - 1][horizontaal - 1] = 0;
				zee.zee2D[verticaal - 1][horizontaal - 1] = "X";
				checkWinst(zee, boot1, boot2);
			} else if(zee.veld2D[verticaal - 1][horizontaal - 1] == 2) {
				System.out.println("Raak!");
				boot2.geraakt();
				zee.veld2D[verticaal - 1][horizontaal - 1] = 0;
				zee.zee2D[verticaal - 1][horizontaal - 1] = "X";
				checkWinst(zee, boot1, boot2);
			
		}else {
				System.out.println("Mis!");
				zee.zee2D[verticaal - 1][horizontaal - 1] = "*";
				punten = punten - 1;
				checkWinst(zee, boot1, boot2);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Geschoten buiten het veld.");
			checkWinst(zee, boot1, boot2);
		}
	}

	public void checkWinst(Zee zee, Boot boot1, Boot boot2) {
		if (boot1.gezonken == true && boot2.gezonken == true) {
			klaar = true;
			zee.printZee();
			System.out.println("Alle boten gezonken! Je wint.");
			System.out.println("Einde van het spel.");
		}
		else if(punten > 0 && klaar == false) {
			System.out.println("Punten: " + punten);
			System.out.println("Schiet nog een keer:");
			System.out.println();
			zee.printZee();
			System.out.println();
			System.out.println("Kies een positie [verticaal spatie horizontaal]: ");
			}
		else if(punten <=0) {
			System.out.println("Beurten voorbij. Je hebt niet alle boten gevonden en dus verloren.");
			System.out.println("Einde van het spel.");
		}
		
		}
			
/*
			OUTER: for (int i = 0; i < zee.veld2D.length; i++) {
				INNER: for (int j = 0; j < zee.veld2D[i].length; j++) {
					if (zee.veld2D[i][j] == 1) {
						break OUTER;
					} else if (i == 3 & j == 3 && zee.veld2D[i][j] == 0) {
						zee.printZee();
						System.out.println("Alle boten gezonken! Je wint.");
						System.out.println("Einde van het spel.");
					}
				}
			}
		} else if (punten == 0) {
			System.out.println("Beurten voorbij. Je hebt niet alle boten gevonden en dus verloren.");
			System.out.println("Einde van het spel.");
		}
	}
	
	*/

	public static void main(String[] args) {
		Zee zee = new Zee();
		Zeeslag zeeslag = new Zeeslag();
		Boot oorlogsschip = new Boot("Oorlogsschip", 3);
		Boot vrachtschip = new Boot("Vrachtschip", 2);
		
		System.out.println("Welkom bij Zeeslag!");
		System.out.println("Vind de twee boten door te schieten.");
		System.out.println("Type per beurt nummer spatie nummer.");
		System.out.println("Deze nummers geven de positie in zee aan waarop je wilt schieten.");
		System.out.println("Bijvoorbeeld: 2 3");// uitleg wat te doen
		System.out.println();

		zee.printZee();
		System.out.println();
		System.out.println("Kies een positie [verticaal spatie horizontaal]: ");

		for (int i = 50; i > 0; i--) {
			Scanner scanner = new Scanner(System.in);
			zeeslag.horizontaal = scanner.nextInt();
			zeeslag.verticaal = scanner.nextInt();
			zeeslag.schiet(zeeslag.horizontaal, zeeslag.verticaal, zee, oorlogsschip, vrachtschip);
		}
		
		

	}

}