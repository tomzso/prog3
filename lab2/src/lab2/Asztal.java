package lab2;


import java.util.Random;

class Asztal {
	private Jatekos[] jatekosok;
	private double tet;
	private int kor;
	private double goal;
	
	public Asztal() {jatekosok=new Jatekos[0];}
	
	public void ujJatek() {
		tet=0;
		kor=0;
		Random random= new Random();
		goal= random.nextDouble(100);
		
		
	}
	public void addJatekos(Jatekos j) {
		
		
		if(jatekosok.length!=10) {
			j.setAsztal(this);
			Jatekos tmp[]=new Jatekos[jatekosok.length+1];
			for(int i=0;i<jatekosok.length;i++) {
				tmp[i]=jatekosok[i];
			}
			tmp[jatekosok.length]=j;
			jatekosok=tmp;
		}	
		else
			System.out.println("Az asztal megtelt!");
		
	}
		
	public int getKor() {return kor;}
	public void emel(double d) {
		tet+=d;
	}
	
	public void kor() {
		if(jatekosok.length==0) {

			throw new NincsJatekos();

		}
		
		
		if(goal<=tet) {
			System.out.println("Vége a játéknak.\n");
		}
		else {
			kor+=1;
			boolean vege=false;
			int nyertesJatekosSzama=-1;
			for(int i=0;i<jatekosok.length;i++) {
				if(!vege) {
					jatekosok[i].lep();
					if(goal<tet) {
						vege=true;
						nyertesJatekosSzama=i;
					}
				}		
			}
			if(vege) {
				if(tet<=goal*1.1) {
					System.out.println("A nyertes jatekos sorszama: "+nyertesJatekosSzama+", a tobbi veszitett.");
				}
				else {
					System.out.println("Mindeki veszitett");
				}
				
			}
			else {
				
				System.out.println("A tet erteke: "+tet+"\n");
			}
		}
		
	}
	public double getTet() {return tet;}
	
	
	
}
