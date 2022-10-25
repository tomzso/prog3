package lab7;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CaesarFrame extends JFrame {
	private JTextField inputText;
	private JTextField outputText;
	
	private JButton button;
	private JComboBox comboBox;
	
	private JPanel topPanel;
	private JPanel bottonPanel;
	
	public CaesarFrame() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("SwingLab");
		this.setSize(400, 110);
		this.setResizable(false);
		String abc="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		
		
		GridLayout layout=new GridLayout();
		layout.setRows(2);
		layout.setColumns(1);
		this.setLayout(layout);
		
		Object obj[]= new Object[26];
		for(int i=0;i<abc.length();i++) {
			obj[i]=abc.charAt(i);
		}
		
		comboBox=new JComboBox(obj);
		topPanel = new JPanel(new FlowLayout());
		bottonPanel = new JPanel(new BorderLayout());
		inputText = new JTextField(20);
		outputText = new JTextField(20);
		outputText.setEditable(false);
		button=new JButton("Code!");
		button.addActionListener(new OkButtonActionListener());
		
		JLabel label=new JLabel("  Output:");
		
		topPanel.setEnabled(true);
		bottonPanel.setEnabled(false);
		
		
		topPanel.add(comboBox);
		topPanel.add(inputText);
		topPanel.add(button);
		
		
		bottonPanel.add(label,BorderLayout.WEST);
		bottonPanel.add(outputText);
		this.add(topPanel);
		this.add(bottonPanel);
		
		
	}
	
	class OkButtonActionListener implements ActionListener {

		public void actionPerformed(ActionEvent ae) {
			char character=(char)comboBox.getSelectedItem();
			String input=inputText.getText();
			String caesarString=Main.caesarCode(input,character);
			outputText.setText(caesarString);
		}
		}
	
}
