import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Zeeslag {
	
	private static Integer []veldstart = new Integer[] { 0, 1, 1, 1, 0, 0};
	static List<Integer> veld = Arrays.asList(veldstart);
	private static String []zeestart = new String[] { "~", "~", "~", "~", "~", "~"};
	static List<String> zee = Arrays.asList(zeestart);
	private static Integer []wijzerstart = new Integer[] { 1, 2, 3, 4, 5, 6};
	static List<Integer> veldwijzer = Arrays.asList(wijzerstart);
	static int beurt = 5;
	static int positie;
	
	public static void schiet(int positie) throws ArrayIndexOutOfBoundsException{
		try{
			if(veldstart[positie-1]==1) {
			System.out.println("Raak!");
			veld.set((positie-1), new Integer(0));
			zee.set((positie-1), "B");
			}else {
			System.out.println("Mis!");
			zee.set((positie-1), "m");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Geschoten buiten het veld.");
		}
		
		if(veld.contains(1)) {
			System.out.println("Boot nog niet gezonken. Schiet nog een keer.");
			System.out.println("Posities: \t" +veldwijzer);
			System.out.println("Zee:      \t" +zee);
		}else {
			System.out.println("Zee:      \t" + zee);
			System.out.println("Boot gezonken! Je wint.");
			
		}
	}
	
	

	public static void main(String[] args) {
		System.out.println("Welkom bij Zeeslag");
		System.out.println("Vind de boot door te schieten.");
		System.out.println("Type per beurt het nummer van de positie in zee waarop je wilt schieten.");// uitleg wat te doen
		//zee array uitprinten System.out.println();
		System.out.println("Posities: \t" +veldwijzer);
		System.out.println("Zee:      \t" +zee);
		
		for(beurt = 5; beurt>0; beurt--) {
		Scanner scanner = new Scanner(System.in);
		positie = scanner.nextInt();
		schiet(positie);
		}
		
		if(beurt == 0) {
			System.out.println("Beurten voorbij. Je hebt verloren. Einde van het spel.");
		}
		else {
			System.out.println("Einde van het spel");
		}
	}

}
