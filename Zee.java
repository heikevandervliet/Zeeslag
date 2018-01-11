import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zee {
	
	Integer[][] veld2D = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
	// { { 0, 1, 1, 1 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 1, 0, 0 } };

	String[][] zee2D = { { "~", "~", "~", "~" }, { "~", "~", "~", "~" }, { "~", "~", "~", "~" },
			{ "~", "~", "~", "~" } };

	Integer[] veldwijzer = { 1, 2, 3, 4 };
	
	public Zee() {
		int richting = (int) (Math.random() * 4);
		
		if (richting == 0) {
			int rij1 = (int) (Math.random() * 4);
			int boot1 = (int) (Math.random() * 2);
			this.veld2D[rij1][boot1] = 3;
			this.veld2D[rij1][boot1+1] = 3;
			this.veld2D[rij1][boot1+2] = 3;

			int rij2 = (int) (Math.random() * 3);
			int boot2 = (int) (Math.random() * 4);
			
			while ((rij1 == rij2 && (boot1 == boot2 | boot1+1 == boot2 | boot1+2 == boot2))
				| (rij1 == rij2+1 && (boot1 == boot2 | boot1+1 == boot2 | boot1+2 == boot2))) {
				rij2 = (int) (Math.random() * 3);
			}
			this.veld2D[rij2][boot2] = 2;
			this.veld2D[rij2+1][boot2] = 2;
		}
			
		else if(richting ==1) {
			int rij3 = (int) (Math.random() * 4);
			int boot3 = (int) (Math.random() * 2);
			this.veld2D[rij3][boot3] = 3;
			this.veld2D[rij3][boot3+1] = 3;
			this.veld2D[rij3][boot3+2] = 3;

			int rij4 = (int) (Math.random() * 4);
			int boot4 = (int) (Math.random() * 3);
			
			while (rij3 == rij4) {
				rij4 = (int) (Math.random() * 4);
			}
			this.veld2D[rij4][boot4] = 2;
			this.veld2D[rij4][boot4+1] = 2;
		}
		else if (richting == 2) {
			int rij5 = (int) (Math.random() * 4);
			int boot5 = (int) (Math.random() * 3);
			this.veld2D[rij5][boot5] = 2;
			this.veld2D[rij5][boot5+1] = 2;

			int rij6 = (int) (Math.random() * 2);
			int boot6 = (int) (Math.random() * 4);
			
			while ((rij5 == rij6 && (boot5 == boot6 | boot5+1 == boot6)) 
					| (rij5 == rij6+1 && (boot5 == boot6 | boot5+1 == boot6)) 
				| (rij5 == rij6+2 && (boot5 == boot6 | boot5+1 == boot6)))
			{
				rij6 = (int) (Math.random() * 2);
			}
			this.veld2D[rij6][boot6] = 3;
			this.veld2D[rij6+1][boot6] = 3;
			this.veld2D[rij6+2][boot6] = 3;
		 }
		else if(richting == 3) {
			int rij7 = (int) (Math.random() * 2);
			int boot7 = (int) (Math.random() * 4);
			this.veld2D[rij7][boot7] = 3;
			this.veld2D[rij7+1][boot7] = 3;
			this.veld2D[rij7+2][boot7] = 3;

			int rij8 = (int) (Math.random() * 3);
			int boot8 = (int) (Math.random() * 4);
			
			while (boot7 == boot8) {
				boot8 = (int) (Math.random() * 4);
			}
			this.veld2D[rij8][boot8] = 2;
			this.veld2D[rij8+1][boot8] = 2;
			}	
		
		}
	
	public void printZee() {
		System.out.println("\t  " + Arrays.toString(veldwijzer));
		System.out.println("\t 1" + Arrays.toString(zee2D[0]));
		System.out.println("\t 2" + Arrays.toString(zee2D[1]));
		System.out.println("\t 3" + Arrays.toString(zee2D[2]));
		System.out.println("\t 4" + Arrays.toString(zee2D[3]));
	}

}
