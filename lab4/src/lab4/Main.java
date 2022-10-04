package lab4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static public ArrayList<Beer> arraylist=new ArrayList<Beer>();
	
	static protected void exit() {
		System.exit(0);
	}
	static protected void list(String[] array) {

		if(array.length==2) {
			if(array[1].equals("name")) {
				Collections.sort(arraylist,new NameComparator());
			}else if(array[1].equals("style")){
				Collections.sort(arraylist,new StyleComparator());
			}else if(array[1].equals("strength")){
				Collections.sort(arraylist,new StrengthComparator());
			}
		}
		for (int i=0;i<arraylist.size();i++) {
			System.out.println(arraylist.get(i).toString());
		}
	}
	
	static protected void add(String[] array) {
		arraylist.add(new Beer(array[1],array[2],Double.parseDouble(array[3])));
	}
	
	static protected void save(String[] array) throws IOException {
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(array[1]));
		out.writeObject(arraylist);
	}
	
	static protected void load(String[] array) throws IOException, ClassNotFoundException{
		ObjectInputStream in=new ObjectInputStream(new FileInputStream(array[1]));
		arraylist=(ArrayList<Beer>)in.readObject();
		in.close();
	}
	
	static protected void search(String[] array) {
		for(Beer b: arraylist) {
			if(b.getName().equals(array[1]))
				System.out.println(b.toString());
		}
	}
	static protected void find(String[] array) {
		for(int i=1;i<array.length;i++) {
			for(Beer b: arraylist) {
				if(b.getName().contains(array[i]))
					System.out.println(b.toString());
			}
		}
	}
	static protected void delete(String[] array) {
		Collections.sort(arraylist,new NameComparator());
		arraylist.remove(Collections.binarySearch(arraylist, new Beer(array[1], null, 0), new NameComparator()));
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		arraylist.add(new Beer("Uc","easy",6.4));
		arraylist.add(new Beer("Rt","medium",3.1));
		arraylist.add(new Beer("Hard","hard",9.1));
		arraylist.add(new Beer("Premium","soft",0.000002));
		
		System.out.println(arraylist.get(0).toString());
		System.out.println(arraylist.get(1).toString());
		System.out.println(arraylist.get(2).toString());
		System.out.println(arraylist.get(3).toString());
		
		while(true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s=br.readLine();
			
			//Scanner sc=new Scanner(System.in);
			//String s=sc.nextLine();
			
			String[] array=s.split(" ");
			
			if(array.length==4 && array[0].equals("add")) {
				add(array);
				
			}
			
			if(array.length==1 && array[0].equals("exit")) {
				exit();
			}
			
			if(array[0].equals("list")) {
				list(array);
			}

			
			if(array.length==2 && array[0].equals("save")) {
				save(array);
			}
			if(array.length==2 && array[0].equals("load")) {
				load(array);
			}
			
			if(array.length==2 && array[0].equals("find")) {
				find(array);
			}
			
			if(array.length<=2 && array[0].equals("search")) {
				search(array);
			}
			if(array.length<=2 && array[0].equals("delete")) {
				delete(array);
			}
			
			
			System.out.println(array[0]+", tomb merete: "+array.length);
			
		}
		
		
	}
}
