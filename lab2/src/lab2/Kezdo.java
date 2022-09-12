package lab2;

class Kezdo extends Jatekos {
	private String nev;
	public Kezdo(String n) {
		nev=n;
	}
	
	
	
	public String toString() {
		return nev;
	}
	
	public void lep() {
		System.out.println("Nev: "+this.toString());
		System.out.println("Jelenlegi kor: "+this.asztal.getKor());
		if(this.asztal.getKor()%2==0) {
			this.asztal.emel(1);
			
		}
		System.out.println();
		
	}
}
