package lab2;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("1-2. feladat");
		Kezdo kezdo1=new Kezdo("kezdo1");
		Kezdo kezdo2=new Kezdo("kezdo2");
		Robot robot=new Robot();
		
		Asztal asztal1=new Asztal();

		asztal1.addJatekos(kezdo1);
		asztal1.addJatekos(kezdo2);
		asztal1.addJatekos(robot);
		
		asztal1.ujJatek();

		asztal1.kor();
		asztal1.kor();
		asztal1.kor();
		
		
		System.out.println("4. feldat");
		try {
			Asztal asztal2=new Asztal();
			asztal2.kor();
			
		}catch(NincsJatekos e) {
			System.out.println(e.getMessage());
		}

		System.out.println("5-6. feldat");
		Asztal asztal2=new Asztal();
		
		Nyuszi nyuszi=new Nyuszi("piros");
		Mester mester=new Mester(7);
		Ember ember=new Ember();
		
		asztal2.addJatekos(mester);
		asztal2.addJatekos(nyuszi);
		asztal2.addJatekos(ember);
		
		nyuszi.setAsztal(asztal2);
		mester.setAsztal(asztal2);
		ember.setAsztal(asztal2);
		
		asztal2.ujJatek();
		
		for(int i=0;i<10;i++)
			asztal2.kor();
	

		
		
		
	}
}
