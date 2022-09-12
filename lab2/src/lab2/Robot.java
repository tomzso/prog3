package lab2;

class Robot extends Jatekos {
	public static int azonosito=0;
	private int az;
	public Robot() {
		azonosito=azonosito+1;
		az=azonosito;
		
	}
	
	
	public String toString() {
		return "Robot"+az;
	}
	public void lep() {
		System.out.println(this.toString());
		System.out.println("Jelenlegi kor: "+this.asztal.getKor());
		System.out.println();
	}
}
