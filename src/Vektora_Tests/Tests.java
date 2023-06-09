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
import java.text.DecimalFormat;
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
import javax.swing.filechooser.FileSystemView;



public class Tests implements ActionListener {
void JautajumsDivi(){
		
		Test2 = new JFrame("Otrais Jautājums");
	      Test2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      Test2.setSize(800, 490);
	      Test2.setLayout(null);
	     
	      Test2.setResizable(false);
	      Test2.setLocationRelativeTo(null);
	      Test2.setVisible(true);
	      
	      Test2Jautajums1 = new JCheckBox("Vektors ir sinhronizēts");
	      Test2Jautajums1.setBounds(20,200,300,20);
	      Test2Jautajums1.setFont(new Font("Arial",Font.BOLD,18));
	      Test2.add(Test2Jautajums1);
	      Test2Jautajums2 = new JCheckBox("<html>Java Vector satur daudzas mantotas<br> metodes, kas neietilpst kolekciju ietvarā?</html>");
	      Test2Jautajums2.setBounds(20,240,400,40);
	      Test2Jautajums2.setFont(new Font("Arial",Font.BOLD,18));
	      Test2.add(Test2Jautajums2);
	      Test2Jautajums3 = new JCheckBox("Nav Atšķirības, Abi ir identiski vienādi");
	      Test2Jautajums3.setBounds(420,200,500,20);
	      Test2Jautajums3.setFont(new Font("Arial",Font.BOLD,18));
	      Test2.add(Test2Jautajums3);
	      Test2Jautajums4 = new JCheckBox("Vektors nav sinhronizēts");
	      Test2Jautajums4.setBounds(420,250,300,20);
	      Test2Jautajums4.setFont(new Font("Arial",Font.BOLD,18));
	      Test2.add(Test2Jautajums4);
	      JButton Iesniekt = new JButton("Nākamais ->");
	      Iesniekt.setBounds(500, 350, 250, 50);
	      Iesniekt.setBackground(Crasa);
	      Iesniekt.setForeground(TextKrasa);
	      Test2.add(Iesniekt);
	     
	      Q2=new JLabel("Kādas ir 2 Vektora asķirības no ArrayList?");
	      Q2.setBounds(0,0,800,150);
	        Q2.setFont(new Font("Arial",Font.BOLD,15));
	        Q2.setBackground(Crasa);
	        Q2.setOpaque(true);
	        Q2.setBorder(new EmptyBorder(0,50,0,0));
	        Q2.setBackground(Crasa);
	        Q2.setForeground(TextKrasa);
		Test2.add(Q2);
			
			p=0;
			Iesniekt.addActionListener(e ->{
				
				if(Test2Jautajums1.isSelected() && Test2Jautajums2.isSelected() && !Test2Jautajums3.isSelected() && !Test2Jautajums4.isSelected()) {
					Test2.dispose();
					System.out.println(p);
					punkti.add(p);
					System.out.println("Jusu P: "+punkti);
					if(p==0) {
						uzPirmo.add(1);
					}
					JautajumsTris();
					//Rezultats();
				}else {
					JOptionPane.showMessageDialog(info, "Nav akķeksēts Pareizi");
					if(p<3) {
					p++;
					}else {
						
					}
				}
			});
	      
	}
void JautajumsTris() {
	Test3 = new JFrame("Trešais Jautājums");
    Test3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Test3.setSize(800, 490);
    Test3.setLayout(null);
   
    Test3.setResizable(false);
    Test3.setLocationRelativeTo(null);
    Test3.setVisible(true);
    
    Test3Jautajums1 = new JCheckBox("Atmiņas Apjoms");
    Test3Jautajums1.setBounds(40,200,300,20);
    Test3Jautajums1.setFont(new Font("Arial",Font.BOLD,18));
    Test3.add(Test3Jautajums1);
    Test3Jautajums3 = new JCheckBox("Maksimālā veselā skaitļa vērtība");
    Test3Jautajums3.setBounds(40,240,330,20);
    Test3Jautajums3.setFont(new Font("Arial",Font.BOLD,18));
    Test3.add(Test3Jautajums3);
    Test3Jautajums2 = new JCheckBox("Vektoram nav ierobežojumi");
    Test3Jautajums2.setBounds(400,200,300,20);
    Test3Jautajums2.setFont(new Font("Arial",Font.BOLD,18));
    Test3.add(Test3Jautajums2);
    Test3Jautajums4 = new JCheckBox("Elementu ievades lielums");
    Test3Jautajums4.setBounds(400,250,300,20);
    Test3Jautajums4.setFont(new Font("Arial",Font.BOLD,18));
    Test3.add(Test3Jautajums4);
    JButton Iesniekt = new JButton("Nākamais ->");
    Iesniekt.setBounds(500, 350, 250, 50);
    Test3.add(Iesniekt);
    Iesniekt.setBackground(Crasa);
    Iesniekt.setForeground(TextKrasa);
    Q3=new JLabel("Kādi ir divi Vektora ierobežojumi?");
    Q3.setBounds(0,0,800,150);
      Q3.setFont(new Font("Arial",Font.BOLD,15));
      Q3.setBackground(Crasa);
      Q3.setOpaque(true);
      Q3.setBorder(new EmptyBorder(0,50,0,0));
      Q3.setBackground(Crasa);
      Q3.setForeground(TextKrasa);
	Test3.add(Q3);
		
		p=0;
		Iesniekt.addActionListener(e ->{
			
			if(Test3Jautajums1.isSelected() && Test3Jautajums3.isSelected() && !Test3Jautajums2.isSelected() && !Test3Jautajums4.isSelected()) {
				Test3.dispose();
				System.out.println(p);
				punkti.add(p);
				System.out.println("Jusu P: "+punkti);
				//JautajumsTris();
				if(p==0) {
					uzPirmo.add(1);
				}
				JautajumsCetri();
			}else {
				JOptionPane.showMessageDialog(info, "Nav akķeksēts Pareizi");
				if(p<3) {
				p++;
				}else {
					
				}
			}
		});
}
	

void JautajumsCetri() {
	Test4 = new JFrame("Ceturtais Jautājums");
    Test4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Test4.setSize(800, 490);
    Test4.setLayout(null);
   
    Test4.setResizable(false);
    Test4.setLocationRelativeTo(null);
    Test4.setVisible(true);
    
    Test4Jautajums1 = new JRadioButton("10 Elementus");
    Test4Jautajums1.setBounds(100,140,150,20);
    Test4Jautajums1.setFont(new Font("Arial",Font.BOLD,18));
 //   Test4Jautajums1.setSelected(true);
    Test4Jautajums3 = new JRadioButton("Bezgalīgi Daudz");
    Test4Jautajums3.setBounds(450,140,200,20);
    Test4Jautajums3.setFont(new Font("Arial",Font.BOLD,18));
    Test4Group = new ButtonGroup();
    Test4Group.add(Test4Jautajums1);  Test4Group.add(Test4Jautajums3);
    Test4.add(Test4Jautajums1);
    Test4.add(Test4Jautajums3);
    Test4Jautajums2 = new JRadioButton("4, jo vektora izmērs ir 4");
    Test4Jautajums2.setBounds(100,300,250,20);
    Test4Jautajums2.setFont(new Font("Arial",Font.BOLD,18));
    
    Test4Jautajums4 = new JRadioButton("Bezgalīgi daudz");
    Test4Jautajums4.setBounds(450,300,200,20);
    Test4Jautajums4.setFont(new Font("Arial",Font.BOLD,18));
    Test4Group2 = new ButtonGroup();
    Test4Group2.add(Test4Jautajums2);  Test4Group2.add(Test4Jautajums4);
    Test4.add(Test4Jautajums4);
    Test4.add(Test4Jautajums2);
    JButton Iesniekt = new JButton("Nākamais ->");
    Iesniekt.setBounds(500, 350, 250, 50);
    Test4.add(Iesniekt);
    Iesniekt.setBackground(Crasa);
    Iesniekt.setForeground(TextKrasa);
    	Q4=new JLabel("<html>Ja vektoram nav deklerēts izmērs,<br>tad vektora var iebāzt elementus...?</html>");
    Q4.setBounds(0,0,800,100);
      Q4.setFont(new Font("Arial",Font.BOLD,15));
      Q4.setBackground(Crasa);
      Q4.setOpaque(true);
      Q4.setBorder(new EmptyBorder(0,50,0,0));
      Q4.setBackground(Crasa);
      Q4.setForeground(TextKrasa);
	Test4.add(Q4);
	Q4v2=new JLabel("<html>Ja vektoram ir deklerēts izmērs 4,<br>tad vektora var ielikt..(cik elementus?)</html>");
	Q4v2.setBounds(0,180,800,100);
	Q4v2.setFont(new Font("Arial",Font.BOLD,15));
	Q4v2.setBackground(Crasa);
	Q4v2.setOpaque(true);
	Q4v2.setBorder(new EmptyBorder(0,50,0,0));
	Q4v2.setBackground(Crasa);
	Q4v2.setForeground(TextKrasa);
  	Test4.add(Q4v2);
		p=0;
		Iesniekt.addActionListener(e ->{
			
			if(Test4Jautajums3.isSelected() && Test4Jautajums4.isSelected() && !Test4Jautajums1.isSelected() && !Test4Jautajums2.isSelected()) {
				Test4.dispose();
				System.out.println(p);
				punkti.add(p);
				System.out.println("Jusu P: "+punkti);
				//JautajumsTris();
				if(p==0) {
					uzPirmo.add(1);
				}
				JautajumsPieci();
			}else {
				JOptionPane.showMessageDialog(info, "Nav akķeksēts Pareizi");
				if(p<3) {
				p++;
				}else {
					
				}
			}
		});
}
void JautajumsPieci() {
	Test5 = new JFrame("Piektais Jautājums");
    Test5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Test5.setSize(800, 490);
    Test5.setLayout(null);
   
    Test5.setResizable(false);
    Test5.setLocationRelativeTo(null);
    Test5.setVisible(true);
    
    
    Test5Jautajums1 = new JRadioButton("deklerē vektora izmēru");
    Test5Jautajums1.setBounds(100,140,250,20);
    Test5Jautajums1.setFont(new Font("Arial",Font.BOLD,18));
    //Test5Jautajums1.setSelected();
    Test5Jautajums3 = new JRadioButton("Parāda vektora izmēru");
    Test5Jautajums3.setBounds(450,140,250,20);
    Test5Jautajums3.setFont(new Font("Arial",Font.BOLD,18));
    Test5Group = new ButtonGroup();
    Test5Group.add(Test5Jautajums1);  Test5Group.add(Test5Jautajums3);
    Test5.add(Test5Jautajums1);
    Test5.add(Test5Jautajums3);
    Test5Jautajums2 = new JRadioButton("Parāda Vektora izmēru");
    Test5Jautajums2.setBounds(100,300,250,20);
    Test5Jautajums2.setFont(new Font("Arial",Font.BOLD,18));
    
    Test5Jautajums4 = new JRadioButton("Deklerē vektora izmēru");
    Test5Jautajums4.setBounds(450,300,250,20);
    Test5Jautajums4.setFont(new Font("Arial",Font.BOLD,18));
    Test5Group2 = new ButtonGroup();
    Test5Group2.add(Test5Jautajums2);  Test5Group2.add(Test5Jautajums4);
    Test5.add(Test5Jautajums4);
    Test5.add(Test5Jautajums2);
    
    
   
    JButton Iesniekt = new JButton("Nākamais ->");
    Iesniekt.setBounds(500, 350, 250, 50);
    Iesniekt.setBackground(Crasa);
    Iesniekt.setForeground(TextKrasa);
    Test5.add(Iesniekt);
    
    	Q5=new JLabel("<html>Ko dara setSize()?</html>");
    Q5.setBounds(0,0,800,100);
      Q5.setFont(new Font("Arial",Font.BOLD,15));
      Q5.setBackground(Crasa);
      Q5.setOpaque(true);
      Q5.setBorder(new EmptyBorder(0,50,0,0));
      Q5.setBackground(Crasa);
      Q5.setForeground(TextKrasa);
	Test5.add(Q5);
	Q5v2=new JLabel("<html>Ko dara size()</html>");
	Q5v2.setBounds(0,200,800,100);
	Q5v2.setFont(new Font("Arial",Font.BOLD,15));
	Q5v2.setBackground(Crasa);
	Q5v2.setOpaque(true);
	Q5v2.setBorder(new EmptyBorder(0,50,0,0));
	Q5v2.setBackground(Crasa);
	Q5v2.setForeground(TextKrasa);
  	Test5.add(Q5v2);
		p=0;
		Iesniekt.addActionListener(e ->{
			
			if(Test5Jautajums2.isSelected() && Test5Jautajums1.isSelected() && !Test5Jautajums3.isSelected() && !Test5Jautajums4.isSelected()) {
				Test5.dispose();
				System.out.println(p);
				punkti.add(p);
				System.out.println("Jusu P: "+punkti);
				//JautajumsTris();
				if(p==0) {
					uzPirmo.add(1);
				}
				JautajumsSesi();
			}else {
				JOptionPane.showMessageDialog(info, "Nav akķeksēts Pareizi");
				if(p<3) {
				p++;
				}else {
					
				}
			}
		});
}

void JautajumsSesi() {
	Test6 = new JFrame("Sestais Jautājums");
    Test6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Test6.setSize(800, 490);
    Test6.setLayout(null);
   
    Test6.setResizable(false);
    Test6.setLocationRelativeTo(null);
    Test6.setVisible(true);
    
    Test6Jautajums1 = new JCheckBox("Vektoram nav metode addFirst()");
    Test6Jautajums1.setBounds(20,250,400,20);
    Test6Jautajums1.setFont(new Font("Arial",Font.BOLD,18));
    Test6.add(Test6Jautajums1);
    Test6Jautajums3 = new JCheckBox("Kodā nav kļudas");
    Test6Jautajums3.setBounds(420,250,300,20);
    Test6Jautajums3.setFont(new Font("Arial",Font.BOLD,18));
    Test6.add(Test6Jautajums3);
    Test6Jautajums2 = new JCheckBox("Vektors nav implamentēts");
    Test6Jautajums2.setBounds(20,290,400,20);
    Test6Jautajums2.setFont(new Font("Arial",Font.BOLD,18));
    Test6.add(Test6Jautajums2);
    Test6Jautajums4 = new JCheckBox("Vektoram trūkst <Integer>");
    Test6Jautajums4.setBounds(420,290,300,20);
    Test6Jautajums4.setFont(new Font("Arial",Font.BOLD,18));
    Test6.add(Test6Jautajums4);
    JButton Iesniekt = new JButton("Nākamais ->");
    Iesniekt.setBounds(500, 350, 250, 50);
    Iesniekt.setBackground(Crasa);
    Iesniekt.setForeground(TextKrasa);

    Test6.add(Iesniekt);
  String s="<";
    	Q6=new JLabel("<html><br>Atrodi šī koda kļūdas<br><br>Vector int>> cip = new Vector<<>>();<br>"
    			+ "		cip.add(1);<br>"
    			+ "		cip.add(2);<br>"
    			+ "		cip.add(3);<br>"
    			+ "		System.out.println(cip);<br>"
    			+ "		cip.addFirst(5);</html>");
    Q6.setBounds(0,0,800,200);
      Q6.setFont(new Font("Arial",Font.BOLD,15));
      Q6.setBackground(Crasa);
      Q6.setOpaque(true);
      Q6.setBorder(new EmptyBorder(0,50,0,0));
      Q6.setBackground(Crasa);
      Q6.setForeground(TextKrasa);

	Test6.add(Q6);

		p=0;
		Iesniekt.addActionListener(e ->{
			
			if(Test6Jautajums4.isSelected() && Test6Jautajums1.isSelected() && !Test6Jautajums3.isSelected() && !Test6Jautajums2.isSelected()) {
				Test6.dispose();
				System.out.println(p);
				punkti.add(p);
				System.out.println("Jusu P: "+punkti);
				//JautajumsTris();
				if(p==0) {
					uzPirmo.add(1);
				}
				JautajumsSeptini();
			}else {
				JOptionPane.showMessageDialog(info, "Nav akķeksēts Pareizi");
				if(p<3) {
				p++;
				}else {
					
				}
			}
		});
}
void JautajumsSeptini() {
	JFrame Test7;
	JCheckBox Jautajums1, Jautajums2, Jautajums3, Jautajums4;
	JLabel Q;
	Test7 = new JFrame("Septītais Jautājums");
    Test7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Test7.setSize(800, 490);
    Test7.setLayout(null);
   
    Test7.setResizable(false);
    Test7.setLocationRelativeTo(null);
    Test7.setVisible(true);
    
    Jautajums1 = new JCheckBox("Vektors ir pilnībā pavedienu droš");
    Jautajums1.setBounds(20,150,400,15);
    Jautajums1.setFont(new Font("Arial",Font.BOLD,18));
    Test7.add(Jautajums1);
    Jautajums2 = new JCheckBox("Vektori ir noderīgi kad velamies mainīt datu struktūras lielumu programmas vidū");
    Jautajums2.setBounds(20,200,800,15);
    Jautajums2.setFont(new Font("Arial",Font.BOLD,18));
    Test7.add(Jautajums2);
    Jautajums3 = new JCheckBox("<html>Īpašība ar dinamisku izmēru ir ļoti noderīga, tā ļauj iztērēt atmiņu,<br> ja mēs nezinām atmiņas lielumu</html>");
    Jautajums3.setBounds(20,230,800,40);
    Jautajums3.setFont(new Font("Arial",Font.BOLD,18));
    Test7.add(Jautajums3);
    Jautajums4 = new JCheckBox("Vissas atbildes ir pareizas");
    Jautajums4.setBounds(20,300,300,15);
    Jautajums4.setFont(new Font("Arial",Font.BOLD,18));
    Test7.add(Jautajums4);
    JButton Iesniekt = new JButton("Nākamais ->");
    Iesniekt.setBounds(500, 350, 250, 50);
    Iesniekt.setBackground(Crasa);
    Iesniekt.setForeground(TextKrasa);

    Test7.add(Iesniekt);
  
    Q=new JLabel("<html>Vektora priekšrocības</html>");
    Q.setBounds(0,0,800,100);
      Q.setFont(new Font("Arial",Font.BOLD,15));
      Q.setBackground(Crasa);
      Q.setOpaque(true);
      Q.setBorder(new EmptyBorder(0,50,0,0));
      Q.setBackground(Crasa);
      Q.setForeground(TextKrasa);

	Test7.add(Q);

		p=0;
		Iesniekt.addActionListener(e ->{
			
			if(Jautajums2.isSelected() && Jautajums3.isSelected() && !Jautajums1.isSelected() && !Jautajums4.isSelected()) {
				Test7.dispose();
				System.out.println(p);
				punkti.add(p);
				System.out.println("Jusu P: "+punkti);
				//JautajumsTris();
				if(p==0) {
					uzPirmo.add(1);
				}
				JautajumsAstoni();
			}else {
				JOptionPane.showMessageDialog(info, "Nav akķeksēts Pareizi");
				if(p<3) {
				p++;
				}else {
					
				}
			}
		});
}
void JautajumsAstoni() {
	JFrame Test;
	JCheckBox Jautajums1, Jautajums2, Jautajums3, Jautajums4;
	JLabel Q;
	Test = new JFrame("Astotais Jautājums");
    Test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Test.setSize(800, 490);
    Test.setLayout(null);
   
    Test.setResizable(false);
    Test.setLocationRelativeTo(null);
    Test.setVisible(true);
    
    Jautajums1 = new JCheckBox("Vector (int sākotnējā ietilpība, int pieaugums) ");
    Jautajums1.setBounds(20,150,400,15);
    Jautajums1.setFont(new Font("Arial",Font.BOLD,18));
    Test.add(Jautajums1);
    Jautajums2 = new JCheckBox("Vector (int initialCapacity)");
    Jautajums2.setBounds(20,200,300,15);
    Jautajums2.setFont(new Font("Arial",Font.BOLD,18));
    Test.add(Jautajums2);
    Jautajums3 = new JCheckBox("Vektors ()");
    Jautajums3.setBounds(20,230,300,40);
    Jautajums3.setFont(new Font("Arial",Font.BOLD,18));
    Test.add(Jautajums3);
    Jautajums4 = new JCheckBox("Vissas atbildes ir pareizas");
    Jautajums4.setBounds(20,300,300,15);
    Jautajums4.setFont(new Font("Arial",Font.BOLD,18));
    Test.add(Jautajums4);
    JButton Iesniekt = new JButton("Nākamais ->");
    Iesniekt.setBounds(500, 350, 250, 50);
    Iesniekt.setBackground(Crasa);
    Iesniekt.setForeground(TextKrasa);

    Test.add(Iesniekt);
  
    Q=new JLabel("<html>Izvēlies vissus vektora konstruktorus</html>");
    Q.setBounds(0,0,800,100);
      Q.setFont(new Font("Arial",Font.BOLD,15));
      Q.setBackground(Crasa);
      Q.setOpaque(true);
      Q.setBorder(new EmptyBorder(0,50,0,0));
      Q.setBackground(Crasa);
      Q.setForeground(TextKrasa);

	Test.add(Q);

		p=0;
		Iesniekt.addActionListener(e ->{
			
			if(Jautajums4.isSelected() || Jautajums1.isSelected() && Jautajums2.isSelected() && Jautajums3.isSelected()) {
				Test.dispose();
				System.out.println(p);
				punkti.add(p);
				System.out.println("Jusu P: "+punkti);
				
				if(p==0) {
					uzPirmo.add(1);
				}
				JautajumsDevini();
			}else {
				JOptionPane.showMessageDialog(info, "Nav akķeksēts Pareizi");
				if(p<3) {
				p++;
				}else {
					
				}
			}
		});
}
void JautajumsDevini() {
	JFrame Test;
	JCheckBox Jautajums1, Jautajums2, Jautajums3, Jautajums4;
	JLabel Q;
	Test = new JFrame("Devītais Jautājums");
    Test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Test.setSize(800, 490);
    Test.setLayout(null);
   
    Test.setResizable(false);
    Test.setLocationRelativeTo(null);
    Test.setVisible(true);
    
    Jautajums1 = new JCheckBox("<html>Veiktspēja: Vektora sinhronizācija var samazināt veiktspēju salīdzinājumā<br> ar citām kolekciju klasēm, piemēram, ArrayList</html>");
    Jautajums1.setBounds(20,150,800,40);
    Jautajums1.setFont(new Font("Arial",Font.BOLD,16));
    Test.add(Jautajums1);
    Jautajums2 = new JCheckBox("<html>Līdzšinējais kods:Lai gan Vector joprojām tiek atbalstīta, jaunāks Java kods<br>bieži tiek rakstīts, izmantojot modernākas kolekciju klases, tāpēc var būt grūtāk atrast<br> piemērus un atbalstu Vector</html>");
    Jautajums2.setBounds(20,200,800,60);
    Jautajums2.setFont(new Font("Arial",Font.BOLD,16));
    Test.add(Jautajums2);
    Jautajums3 = new JCheckBox("Sinhronizācija:  Vektors ir sinhronizēts, tāpēc to var izmantot daudzpavedienu vidē.");
    Jautajums3.setBounds(20,280,500,20);
    Jautajums3.setFont(new Font("Arial",Font.BOLD,16));
    Test.add(Jautajums3);
    Jautajums4 = new JCheckBox("<html>Nevajadzīgas pieskaitāmās izmaksas: Ja jums nav nepieciešamas Vector sinhronizācijas<br> funkcijas, tā lietošana jūsu kodam pievienos nevajadzīgas pieskaitāmās izmaksas.</html>");
    Jautajums4.setBounds(20,320,800,40);
    Jautajums4.setFont(new Font("Arial",Font.BOLD,16));
    Test.add(Jautajums4);
    JButton Iesniekt = new JButton("Nākamais ->");
    Iesniekt.setBounds(500, 370, 250, 50);
    Iesniekt.setBackground(Crasa);
    Iesniekt.setForeground(TextKrasa);

    Test.add(Iesniekt);
  
    Q=new JLabel("<html>Kādi it vektora izmantošanas mīnusi </html>");
    Q.setBounds(0,0,800,100);
      Q.setFont(new Font("Arial",Font.BOLD,15));
      Q.setBackground(Crasa);
      Q.setOpaque(true);
      Q.setBorder(new EmptyBorder(0,50,0,0));
      Q.setBackground(Crasa);
      Q.setForeground(TextKrasa);

	Test.add(Q);

		p=0;
		Iesniekt.addActionListener(e ->{
			
			if(Jautajums1.isSelected() && Jautajums2.isSelected() && Jautajums4.isSelected() && !Jautajums3.isSelected()) {
				Test.dispose();
				System.out.println(p);
				punkti.add(p);
				System.out.println("Jusu P: "+punkti);
				
				if(p==0) {
					uzPirmo.add(1);
				}
				JautajumsDesmit();
			}else {
				JOptionPane.showMessageDialog(info, "Nav akķeksēts Pareizi");
				if(p<3) {
				p++;
				}else {
					
				}
			}
		});
}
void JautajumsDesmit() {
JFrame Test;
JCheckBox Jautajums1, Jautajums2, Jautajums3, Jautajums4;
JLabel Q;
Test = new JFrame("Desmitais Jaut;ajums");
Test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

Test.setSize(800, 490);
Test.setLayout(null);

Test.setResizable(false);
Test.setLocationRelativeTo(null);
Test.setVisible(true);

Jautajums1 = new JCheckBox("pievienojot");
Jautajums1.setBounds(20,150,300,40);
Jautajums1.setFont(new Font("Arial",Font.BOLD,16));
Test.add(Jautajums1);
Jautajums2 = new JCheckBox("Vektoram nav zemu veikspēju, vektors ir izcils");
Jautajums2.setBounds(20,200,400,60);
Jautajums2.setFont(new Font("Arial",Font.BOLD,16));
Test.add(Jautajums2);
Jautajums3 = new JCheckBox("meklējot");
Jautajums3.setBounds(20,250,300,20);
Jautajums3.setFont(new Font("Arial",Font.BOLD,16));
Test.add(Jautajums3);
Jautajums4 = new JCheckBox("Atjauninot tā elementus");
Jautajums4.setBounds(20,300,300,40);
Jautajums4.setFont(new Font("Arial",Font.BOLD,16));
Test.add(Jautajums4);
JButton Iesniekt = new JButton("Pabeikt");
Iesniekt.setBounds(500, 370, 250, 50);
Iesniekt.setBackground(Crasa);
Iesniekt.setForeground(TextKrasa);

Test.add(Iesniekt);

Q=new JLabel("<html>Vektors ir sinhranizēts tāpēc tas nodrosina zemu veiktspēju....(kur?) </html>");
Q.setBounds(0,0,800,100);
  Q.setFont(new Font("Arial",Font.BOLD,15));
  Q.setBackground(Crasa);
  Q.setOpaque(true);
  Q.setBorder(new EmptyBorder(0,50,0,0));
  Q.setBackground(Crasa);
  Q.setForeground(TextKrasa);

Test.add(Q);

	p=0;
	Iesniekt.addActionListener(e ->{
		
		if(Jautajums1.isSelected() && Jautajums2.isSelected() && Jautajums4.isSelected() && !Jautajums3.isSelected()) {
			Test.dispose();
			System.out.println(p);
			punkti.add(p);
			System.out.println("Jusu P: "+punkti);
			
			if(p==0) {
				uzPirmo.add(1);
			}
			Rezultats();
		}else {
			JOptionPane.showMessageDialog(info, "Nav akķeksēts Pareizi");
			if(p<3) {
			p++;
			}else {
				
			}
		}
	});
}

void Rezultats() {
	int sum=0, DabutieP=0, pirmo=0;
	double IegutaAtzime = 0.0;
	
	
	for (int punk : punkti) {
         sum+= punk;
         DabutieP=30-sum;
         IegutaAtzime=DabutieP/3.0;
    }
	for (int punk : uzPirmo) {
		pirmo+= punk;
        
   }

	
	Vertejums = new JFrame("Jusu Vertejums");
	Vertejums.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
	Vertejums.setSize(800, 490);
	Vertejums.setLayout(null);
   
	Vertejums.setResizable(false);
	Vertejums.setLocationRelativeTo(null);
	Vertejums.setVisible(true);
	
	Color Crasa = new Color(253, 235, 208);
	
	Atzime = new JLabel("<html>Jusu Vertejums<br>-------- "+f.format(IegutaAtzime)+" --------</html>");
	JLabel Atb=new JLabel("Atbildējāt uz pirmo "+pirmo+"/10");
	Atzime.setBounds(0,0,800,100);
	Atzime.setFont(new Font("Arial",Font.BOLD,30));
	Atzime.setBackground(Crasa);
	Atzime.setOpaque(true);
	Atzime.setBorder(new EmptyBorder(0,280,0,0));
	Vertejums.add(Atzime);
	Atb.setBounds(0,80,800,100);
	Atb.setFont(new Font("Arial",Font.BOLD,15));
	Atb.setBackground(Crasa);
	Atb.setOpaque(true);
	Atb.setBorder(new EmptyBorder(0,310,0,0));
	Vertejums.add(Atb);
	
	
	 JButton DarbaApskate = new JButton("Apskatit Darbu");
	 DarbaApskate.setBounds(50, 390, 250, 50);
	    Vertejums.add(DarbaApskate);
	   
	    JButton Atpakal = new JButton("Uz Sākumu");
	    Atpakal.setBounds(490, 390, 250, 50);
		    Vertejums.add(Atpakal);
		    int uzd=0;
			for (int i = 0; i < punkti.size(); i++) {
		  		 
		  		 uzd++;
		  		 str+=uzd + " Uzdevums: "+(3-punkti.get(i)) +" Punkti\n";
		      }
			str+="Atzīme: "+f.format(IegutaAtzime);
	    DarbaApskate.addActionListener(e ->{
	    
	    	 Uzdevumi();
	    	
			});
	    Atpakal.addActionListener(e ->{
	    	Vertejums.dispose();
	    	SaktTestu Sakums = new SaktTestu();
	    	
			});
	   if(PT2.isSelected()) {
		   Saglabat(str, Persona);
	   }else {
	    Saglabat2(str, Persona);
	   }
}

void Uzdevumi() {
	
	JOptionPane.showMessageDialog(null, str);
	
}
static File darbvirsma= FileSystemView.getFileSystemView().getHomeDirectory();
static String atrasanasVieta = darbvirsma.getAbsolutePath();

static void Saglabat(String str, String Persona) {
	try {
        File mape = new File(atrasanasVieta + "\\" + "Vertejumi_Test");
        if (!mape.exists()) {
            mape.mkdir();
        }
        File pt2 = new File(mape, "2PT-2");
        if(!pt2.exists()) {
        	pt2.mkdir();
        }
        String FileNos = Persona + "_Tests_" + ".txt";
        File pasutijums = new File(pt2,  FileNos);
     
        FileWriter fw = new FileWriter(pasutijums, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(str);
        pw.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "An error occurred while writing the content.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}

static void Saglabat2(String str, String Persona) {
	try {
        File mape = new File(atrasanasVieta + "\\" + "Vertejumi_Test");
        if (!mape.exists()) {
            mape.mkdir();
        }
       
        File pt1 = new File(mape, "2PT-1");
        if(!pt1.exists()) {
        	pt1.mkdir();
        }
        
        String FileNos = Persona + "_Tests_" + ".txt";    
        File pasutijums = new File(pt1,  FileNos);

        

        FileWriter fw = new FileWriter(pasutijums, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(str);
        pw.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "An error occurred while writing the content.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}
	void FrameMaina(JButton  UzTestu){
		
		switchWindow(info, Test);
		  
		 return;
	}
	
	JFrame info, Test, Test2, Test3, Test4, Test5, Test6, Vertejums;
	JRadioButton PT2, PT1;
	JRadioButton Test4Jautajums1,Test4Jautajums2,Test4Jautajums3,Test4Jautajums4,  Test5Jautajums1,Test5Jautajums2,Test5Jautajums3,Test5Jautajums4 ;
	ButtonGroup Grupa, Test4Group, Test4Group2, Test5Group, Test5Group2;
	JTextArea Vards, Uzvards;
	String str="";
	String Persona="";
	JCheckBox Jautajums1, Jautajums2, Jautajums3, Jautajums4;
	JCheckBox Test2Jautajums1, Test2Jautajums2, Test2Jautajums3, Test2Jautajums4, Test3Jautajums1, Test3Jautajums2, Test3Jautajums3, Test3Jautajums4,
	Test6Jautajums1,Test6Jautajums2,Test6Jautajums3,Test6Jautajums4;
	JLabel Q1, Q2, Q3, Q4, Q4v2, Q5, Q5v2, Q6;
	JLabel Atzime;
	DecimalFormat f=new DecimalFormat("#.##");
	int p=0;
	 Color Crasa = new Color(3,	58,	53);
	    Color TextKrasa = new Color(242,230,230);
	Vector<String> dal = new Vector<>();
	Vector<Integer> punkti = new Vector<>();
	Vector<Integer> uzPirmo = new Vector<>();
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
	    
	    JButton UzTestu = new JButton("Sākt");
	    UzTestu.setBounds(500, 350, 250, 50);
	    UzTestu.setBackground(Crasa);
	    UzTestu.setForeground(TextKrasa);
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
         
          
          try {
    		  File mape = new File(atrasanasVieta + "\\" + "Vertejumi_Test");
    		  if (!mape.exists()) {
                  mape.mkdir();
              }
    		  String rakstnieki="Rakstitaji" + ".txt";
    	 File file= new File(mape, rakstnieki);
    	  FileReader reader = new FileReader(file);
          BufferedReader bufferedReader = new BufferedReader(reader);
          
          StringBuilder teksts = new StringBuilder();
          String line;
         
          while ((line = bufferedReader.readLine()) != null) {
          	teksts.append(line);
          	teksts.append(System.lineSeparator());
          	dal.add(line);
          }
        
          bufferedReader.close();
         
    	  } catch (Exception a) {
              JOptionPane.showMessageDialog(null, "Kluda.", "Error", JOptionPane.ERROR_MESSAGE);
              a.printStackTrace();
          }
         
    	 if(dal.contains(Persona)) {
    		 JOptionPane.showMessageDialog(null, "Jus jau rakstijat testu", "Error", JOptionPane.ERROR_MESSAGE);
    		
    	 }else {
    		 
    	 	  try {
    	    	  File mape = new File(atrasanasVieta + "\\" + "Vertejumi_Test");
    	          if (!mape.exists()) {
    	              mape.mkdir();
    	          }
    	          String FileNos ="Rakstitaji" + ".txt";    
    	          File pasutijums = new File(mape,  FileNos);
    	          
    	          FileWriter fw = new FileWriter(pasutijums, true);
    	          PrintWriter pw = new PrintWriter(fw);
    	          
    	          pw.println(Persona);
    	          pw.close();
    
    	        
    	      } catch (Exception a) {
    	          JOptionPane.showMessageDialog(null, "Kļuda paradījās", "Error", JOptionPane.ERROR_MESSAGE);
    	          a.printStackTrace();
    	      }
    	
          if (!name.isEmpty() && !surname.isEmpty()) {
           
             
              System.out.println("Test: " + Persona);
              FrameMaina(UzTestu);
          } else {
              JOptionPane.showMessageDialog(info, "Ludzu Ievadiet Vissus Datus");
          }
    	 }
      });
      
      Test = new JFrame("Pirmais Jautājums");
      Test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      Test.setSize(800, 490);
      Test.setLayout(null);
     
      Test.setResizable(false);
      Test.setLocationRelativeTo(null);
      Test.setVisible(false);
     
      Jautajums1 = new JCheckBox("[1, 4, 2, 5, 3, 6]");
      Jautajums1.setBounds(50,267,200,20);
      Jautajums1.setFont(new Font("Arial",Font.BOLD,20));
      Test.add(Jautajums1);
      Jautajums2 = new JCheckBox("1 2 3 4 5 6");
      Jautajums2.setBounds(50,307,200,20);
      Jautajums2.setFont(new Font("Arial",Font.BOLD,20));
      Test.add(Jautajums2);
      Jautajums3 = new JCheckBox("6 5 4 3 2 1");
      Jautajums3.setBounds(50,347,200,20);
      Jautajums3.setFont(new Font("Arial",Font.BOLD,20));
      Test.add(Jautajums3);
      Jautajums4 = new JCheckBox("[1, 2, 3, 4, 5, 6]");
      Jautajums4.setBounds(50,387,200,20);
      Jautajums4.setFont(new Font("Arial",Font.BOLD,20));
      Test.add(Jautajums4);
      JButton Iesniekt = new JButton("Nākamais ->");
      Iesniekt.setBounds(500, 370, 250, 50);
      Iesniekt.setBackground(Crasa);
      Iesniekt.setForeground(TextKrasa);
		Test.add(Iesniekt);
		
		
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
	        Q1.setForeground(TextKrasa);
		Test.add(Q1);
		
		Iesniekt.addActionListener(e ->{
			
			if(Jautajums1.isSelected() && Jautajums4.isSelected() && !Jautajums2.isSelected() && !Jautajums3.isSelected()) {
				Test.dispose();
				
				punkti.add(p);
				if(p==0) {
					
					uzPirmo.add(1);
				}
				 
				//JautajumsDivi();
				//JautajumsDevini();
				//JautajumsSesi();
				Rezultats();
			
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
