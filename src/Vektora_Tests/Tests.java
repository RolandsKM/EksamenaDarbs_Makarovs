package Vektora_Tests;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Tests implements ActionListener {
	
	
	void FrameMaina(JButton  UzTestu){
		
		switchWindow(info, Test);
		  
		 return;
	}
	JFrame info, Test;
	JRadioButton PT2;
	JRadioButton PT1;
	ButtonGroup Grupa;
	JTextArea Vards, Uzvards;
	String str="";
	String Persona="";
	Tests(){
		info = new JFrame("Sūtītāja Info");
        info.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        info.setSize(800, 490);
        info.setLayout(null);
       
        info.setResizable(false);
        info.setLocationRelativeTo(null);
        info.setVisible(true);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("PersonasInfo.png").getImage().getScaledInstance(800, 450, Image.SCALE_SMOOTH));
	    JLabel background = new JLabel(imageIcon);
	  
	    PT2= new JRadioButton("2PT-2");
	    PT2.setBounds(330, 300, 120, 30);
	    PT2.setFont(new Font("Arial", Font.PLAIN, 30));
	    PT2.setSelected(true);
	    PT1= new JRadioButton("2PT-1");
	    PT1.setBounds(330, 350, 120, 30);
	    PT1.setFont(new Font("Arial", Font.PLAIN, 30));
	    Grupa = new ButtonGroup();
	    Grupa.add(PT2);
	    Grupa.add(PT1);
	    info.add(PT2);
	    info.add(PT1);
	    
	    JButton UzTestu = new JButton("Teksts");
	    UzTestu.setBounds(500, 350, 250, 50);
	   
        info.add(UzTestu);
	     
	    background.setBounds(0, 0, info.getWidth(), info.getHeight());
	    info.add(background);
	    Vards = new JTextArea();
	    Vards.setBounds(280, 60, 250, 50);
	    Vards.setFont(new Font("Arial", Font.PLAIN, 30));
	    Vards.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	    
	    Uzvards = new JTextArea();
	    Uzvards.setBounds(280, 160, 250, 50);
	    Uzvards.setFont(new Font("Arial", Font.PLAIN, 30));
	    Uzvards.setBorder(BorderFactory.createLineBorder(Color.BLACK));
 
        info.add(Vards);
        info.add(Uzvards);  

      UzTestu.addActionListener(e -> {
    	  String name = Vards.getText().trim();
          String surname = Uzvards.getText().trim();
          Persona = name + " " + surname;
     
    	
          if (!name.isEmpty() && !surname.isEmpty()) {
           
             
              System.out.println("Test: " + Persona);
              FrameMaina(UzTestu);
          } else {
              JOptionPane.showMessageDialog(info, "Ludzu Ievadiet Vissus Datus");
          }
    	 
      });
	}
      private void switchWindow(JFrame currentWindow, JFrame tests) {
	        currentWindow.setVisible(false);
	        tests.setVisible(true);
	    }
   

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
