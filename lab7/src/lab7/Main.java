package lab7;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
	static public String caesarCode(String input, char offset){
		String input2=input.toUpperCase();
		char offset2=Character.toUpperCase(offset);
		
		String abc="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String uj="";
		int shift=(int) offset2-64;
		
		
        while(!(shift>=0&&shift<26)){
            if(shift>=26){
                shift-=26;
            }
            else{
                if(shift<0){
                    shift+=26;
                }
            }
        }
        for( int i=0; i<input2.length();i++){

         
        	boolean charexception=false;
            
            for( int f=0; f<26;f++){
                if(abc.charAt(f)==input2.charAt(i)){
                    uj+=abc.charAt((f+shift)%26);
                    charexception=true;
                }
            }
            if(!charexception) {
            	uj+=input2.charAt(i);
            }
        }
        return uj;


    }
	
	
	public static void main(String[] args) {
		String hello="hello world!!!!!!!!";
		String chello=caesarCode(hello,'A');
		System.out.println(chello);
		/*
		JFrame f = new JFrame("Swinglab");
		f.setTitle("Swinglab");
		f.setSize(400, 110);
		JPanel p = new JPanel();
		JButton b = new JButton("Click Me!");
		JTextField t = new JTextField("Type here!");
		p.add(b);
		p.add(t);
		f.add(p, BorderLayout.NORTH);
		f.pack();
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);*/
		
		CaesarFrame cf=new CaesarFrame();
		cf.setVisible(true);
		
		
	}
}
