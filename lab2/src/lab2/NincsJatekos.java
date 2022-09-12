package lab2;

public class NincsJatekos extends RuntimeException {
	public NincsJatekos() {
		super("Nincs jatekos!\n");
	}
	public NincsJatekos(String message) {
		super(message);
	}
}
