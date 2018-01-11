
public class Boot {

	int lengte;
	int aantalKeerGeraakt = 0;
	boolean gezonken = false;
	String naam;
	
	public Boot (String naam, int lengte) {
		this.lengte = lengte;
		this.naam = naam;
	}
	
	void geraakt() {
		aantalKeerGeraakt++;
		if(aantalKeerGeraakt >= lengte) {
			System.out.println(this.naam +" geraakt en gezonken.");
			this.gezonken = true;
		} else { 
			System.out.println(this.naam +" geraakt, maar nog niet gezonken.");
		}
	}
}
