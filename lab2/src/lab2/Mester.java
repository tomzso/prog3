package lab2;

class Mester extends Jatekos {
	private int mesterfokozat;
	public Mester(int m) {
		mesterfokozat=m;
	}
	public String toString() {
		return "Mester, fokozat: "+mesterfokozat;
	}
	public void lep() {
		System.out.println(this.toString());
		System.out.println("Jelenlegi kor: "+this.asztal.getKor());
		this.asztal.emel(this.asztal.getTet()*mesterfokozat/100);
	}
}
