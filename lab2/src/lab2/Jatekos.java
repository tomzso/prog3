package lab2;


abstract class Jatekos {
	protected Asztal asztal;
	public static int id=0;
	public final int object_id;
	public Jatekos() {
		object_id=++id;
	}
	
	
	public void lep() {		
	}
	public void setAsztal(Asztal a) {
		asztal=a;
	}
	public void finalize() {
		System.out.println(this.toString());
	}
	
}
