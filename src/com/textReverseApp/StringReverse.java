package com.textReverseApp;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class StringReverse implements ActionListener{
	JTextField mytext;
	JLabel original;
	JLabel reversed;
	JLabel prompt;
	JButton reverse;
	public StringReverse() {
		JFrame frame = new JFrame("String reverse App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setLayout(new FlowLayout());
		frame.setLocationRelativeTo(null);
		//fields
		prompt= new JLabel("Enter Text: ");
		original = new JLabel();
		reversed = new JLabel();
		mytext = new JTextField(15);
		mytext.setActionCommand("myText");
		reverse= new JButton("Reverse");
		mytext.addActionListener(this);
		reverse.addActionListener(this);
		
		//add to frame
		frame.add(prompt);
		frame.add(mytext);
		frame.add(reverse);
		frame.add(reversed);
		frame.add(original);
		
		
		//set visible
		frame.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Reverse")) {
			String originalText= mytext.getText();
			String reverseT="";
			for(int i=originalText.length()-1; i>=0; i--) {
				reverseT +=originalText.charAt(i);
				
			}
			reversed.setText(reverseT);
		}else {
			
			original.setText("Text entered: "+ mytext.getText());
		}
		
	}


	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new StringReverse();
				
			}
		});
	}

}
