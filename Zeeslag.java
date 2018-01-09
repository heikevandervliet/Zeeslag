import java.util.Scanner;

public class Zeeslag {
	
	private static int []zee = new int[] { 0, 1, 1, 1, 0};
	
	static int positie;
	
	public static void schiet(int positie) {
		
		System.out.println("Welkom bij Zeeslag");
		// uitleg wat te doen
		//zee array uitprinten System.out.println();
		//
		
		if(zee[positie] == 1) {
			System.out.println("raak!");
		}
		else {
			System.out.println("mis!");
		}
	}
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		positie = scanner.nextInt();
		schiet(positie);
		

	}

}
