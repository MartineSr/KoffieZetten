package KoffieZetten;

import java.util.Scanner;

public class Oefen4 {
	public static void main(String[] args) {
		Persoon Martine = new Persoon();
		Persoon Timon = new Persoon();
		Ober ober = new Ober(); 
				 
		
		
		
		Martine.naam = "Martine";
		Timon.naam = "Timon";
		
	}
}

class Apparaat{
	int Lwater;
	String[] Soorten = new String[] {"Ristretto","Espresso","Cafe Creme","Capuccino","Latte Macchiato"};
	void ZetKoffie() {}
}

class Ober{
	Ober(){
		BestellingOpnemen();
	}
	Scanner scanner = new Scanner(System.in);
	void BestellingOpnemen() {
		System.out.println("Wat wilt u drinken?");
		String drinken = scanner.nextLine(); 
		System.out.println(drinken);
		
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