package lab2;
import java.util.Scanner;

class Ember extends Jatekos {
	public String toString() {
		return "Ember";
	}
	
	public void lep() {
		System.out.println(this.toString());
		System.out.println("Aktualis tet: "+this.asztal.getTet());
		System.out.println("Ennyit emelek: ");
		Scanner scanner= new Scanner(System.in);
		double szam=scanner.nextDouble();
		this.asztal.emel(szam);
		//scanner.close();
		
	}
}
