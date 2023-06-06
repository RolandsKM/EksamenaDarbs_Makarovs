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
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

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
	JCheckBox Jautajums1, Jautajums2, Jautajums3, Jautajums4;
	JLabel Q1;
	int p=0;
	
	Vector<Integer> punkti = new Vector<>();
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
      
      Test = new JFrame("Tests");
      Test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      Test.setSize(800, 490);
      Test.setLayout(null);
     
      Test.setResizable(false);
      Test.setLocationRelativeTo(null);
      Test.setVisible(false);
      
      Jautajums1 = new JCheckBox("[1, 4, 2, 5, 3, 6]");
      Jautajums1.setBounds(290,237,100,20);
      Test.add(Jautajums1);
      Jautajums2 = new JCheckBox("1 2 3 4 5 6");
      Jautajums2.setBounds(290,257,100,20);
      Test.add(Jautajums2);
      Jautajums3 = new JCheckBox("6 5 4 3 2 1");
      Jautajums3.setBounds(290,277,100,20);
      Test.add(Jautajums3);
      Jautajums4 = new JCheckBox("[1, 2, 3, 4, 5, 6]");
      Jautajums4.setBounds(290,297,100,20);
      Test.add(Jautajums4);
      JButton Iesniekt = new JButton("Teksts");
      Iesniekt.setBounds(500, 350, 250, 50);
		Test.add(Iesniekt);
		 Color Crasa = new Color(253, 235, 208);
		
		   Q1 = new JLabel("<html><br>Kas tiks izdrukats ekrana Ja Kods Tiks Palaists?<br><br>"
				+ "public static void main(String[] args) {<br><br>"
		   		+ " Vector<Integer> vec = new Vector<>();<br>"
		   		+ " vec.add(1); vec.add(4);<br>"
		   		+ " vec.add(2); vec.add(5);<br>"
		   		+ " vec.add(3);vec.add(6);<br>"
		   		+ " System.out.println(vec);<br>"
		   		+ " Collections.sort(vec);<br>"
		   		+ " 	System.out.println(vec);<br>"
		   		+ "	}</html>");
		   
	        Q1.setBounds(0,0,800,235);
	        Q1.setFont(new Font("Arial",Font.BOLD,15));
	        Q1.setBackground(Crasa);
	        Q1.setOpaque(true);
	        Q1.setBorder(new EmptyBorder(0,50,0,0));
		Test.add(Q1);
		
		Iesniekt.addActionListener(e ->{
			
			if(Jautajums1.isSelected() && Jautajums4.isSelected() && !Jautajums2.isSelected() && !Jautajums3.isSelected()) {
				Test.dispose();
				
				punkti.add(p);
				
				
			
			}else {
				JOptionPane.showMessageDialog(info, "Nav akķeksēts Pareizi");
				if(p<3) {
				p++;
				}
			
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
