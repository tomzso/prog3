package lab4;

import java.io.Serializable;
import java.util.Comparator;

public class Beer implements Serializable{
	private String name;
	private String style;
	private double strength;
	public Beer(String n, String s, double d) {
		name=n;
		style=s;
		strength=d;
	}
	public String getName() {
		return name;
	}
	public String getStyle() {
		return style;
	}
	public double getStength(){
		return strength;
	}
	
	public String toString() {
		return "Name: "+name+", style: "+style+", strength: "+strength+"%";
	}
	



	
}
