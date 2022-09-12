package lab2;

class Nyuszi extends Jatekos {
	private String szin;
	public Nyuszi(String s) {
		szin=s;
	}
	public String toString() {
		return "Nyuszi, szine: "+szin;
	}
	public void lep() {
		System.out.println(this.toString());
		System.out.println("Jelenlegi kor: "+this.asztal.getKor());
		if(this.asztal.getTet()<50) {
			this.asztal.emel(5);
		}
		else {
			System.out.println(this.asztal.getTet()+" Huha!");
		}
	}
}
