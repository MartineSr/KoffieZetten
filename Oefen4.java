package KoffieZetten;

import java.util.Scanner;

public class Oefen4 {
	public static void main(String[] args) {
		Persoon Martine = new Persoon();
		Persoon Timon = new Persoon();
		Apparaat apparaat = new Apparaat();		

		Ober ober = new Ober(apparaat); 
		
		Martine.naam = "Martine";
		Timon.naam = "Timon";
		
	}
}

class Apparaat{
	int Lwater;
	String[] Soorten = new String[] {"Ristretto","Espresso","Cafe Creme","Capuccino","Latte Macchiato"};
	void ZetKoffie(String soort) {
		System.out.println("Koffiezetapparaat: 'Pruttel pruttel'");
	}
}

class Ober{
	Apparaat mijnApparaat;
	Ober(Apparaat apparaat){
		mijnApparaat = apparaat;
		BestellingOpnemen();
	}
	Scanner scanner = new Scanner(System.in);
	void BestellingOpnemen() {
		System.out.println("Ober: 'Wat voor soort koffie wilt u drinken?'");
		for(String s : mijnApparaat.Soorten) {
			System.out.print(s);
			if(!(s.equals("Latte Macchiato"))) {
				System.out.print(" - ");
			}else {
				System.out.println(".");
			}
		}
		String drinken = scanner.nextLine(); 
		
		if(drinken.equals(mijnApparaat.Soorten[0])||drinken.equals(mijnApparaat.Soorten[1])||drinken.equals(mijnApparaat.Soorten[2])||drinken.equals(mijnApparaat.Soorten[3])||drinken.equals(mijnApparaat.Soorten[4])) {
			System.out.println("Ober: 'Uw bestelling wordt verwerkt.'");
			this.lopen("koffiezetapparaat");
			mijnApparaat.ZetKoffie(drinken);
		}else {
			System.out.println("Ober: 'Dit soort koffie hebben wij niet.'");
			BestellingOpnemen();
		}
		
	}
	
	void lopen(String doel) {
		System.out.println("De ober loopt naar "+doel);
	}
}

class Koffie{
	String soort; 
	boolean melk;
	boolean suiker;
}