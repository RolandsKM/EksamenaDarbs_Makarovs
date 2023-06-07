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
		
		Test2 = new JFrame("Tests2");
	      Test2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      Test2.setSize(800, 490);
	      Test2.setLayout(null);
	     
	      Test2.setResizable(false);
	      Test2.setLocationRelativeTo(null);
	      Test2.setVisible(true);
	      
	      Test2Jautajums1 = new JCheckBox("Vektors ir sinhronizēts");
	      Test2Jautajums1.setBounds(290,237,200,20);
	      Test2.add(Test2Jautajums1);
	      Test2Jautajums2 = new JCheckBox("Java Vector satur daudzas mantotas metodes, kas neietilpst kolekciju ietvarā.");
	      Test2Jautajums2.setBounds(290,257,200,20);
	      Test2.add(Test2Jautajums2);
	      Test2Jautajums3 = new JCheckBox("");
	      Test2Jautajums3.setBounds(290,277,100,20);
	      Test2.add(Test2Jautajums3);
	      Test2Jautajums4 = new JCheckBox("");
	      Test2Jautajums4.setBounds(290,297,100,20);
	      Test2.add(Test2Jautajums4);
	      JButton Iesniekt = new JButton("Teksts");
	      Iesniekt.setBounds(500, 350, 250, 50);
	      Test2.add(Iesniekt);
	      Color Crasa = new Color(253, 235, 208);
	      Q2=new JLabel("Kādas ir 2 Vektora asķirības no ArrayList");
	      Q2.setBounds(0,0,800,235);
	        Q2.setFont(new Font("Arial",Font.BOLD,15));
	        Q2.setBackground(Crasa);
	        Q2.setOpaque(true);
	        Q2.setBorder(new EmptyBorder(0,50,0,0));
		Test2.add(Q2);
			
			p=0;
			Iesniekt.addActionListener(e ->{
				
				if(Test2Jautajums1.isSelected() && Test2Jautajums2.isSelected() && !Test2Jautajums3.isSelected() && !Test2Jautajums4.isSelected()) {
					Test2.dispose();
					System.out.println(p);
					punkti.add(p);
					System.out.println("Jusu P: "+punkti);
					if(p==0) {
						AtbPirmo=0;
						AtbPirmo++;
						uzPirmo.add(AtbPirmo);
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
	Test3 = new JFrame("Tests2");
    Test3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Test3.setSize(800, 490);
    Test3.setLayout(null);
   
    Test3.setResizable(false);
    Test3.setLocationRelativeTo(null);
    Test3.setVisible(true);
    
    Test3Jautajums1 = new JCheckBox("Atmiņas Apjoms");
    Test3Jautajums1.setBounds(290,237,200,20);
    Test3.add(Test3Jautajums1);
    Test3Jautajums3 = new JCheckBox("Maksimālā veselā skaitļa vērtība");
    Test3Jautajums3.setBounds(290,277,200,20);
    Test3.add(Test3Jautajums3);
    Test3Jautajums2 = new JCheckBox("");
    Test3Jautajums2.setBounds(290,257,100,20);
    Test3.add(Test3Jautajums2);
    Test3Jautajums4 = new JCheckBox("");
    Test3Jautajums4.setBounds(290,297,100,20);
    Test3.add(Test3Jautajums4);
    JButton Iesniekt = new JButton("Teksts");
    Iesniekt.setBounds(500, 350, 250, 50);
    Test3.add(Iesniekt);
    Color Crasa = new Color(253, 235, 208);
    Q3=new JLabel("Kādi ir divi Vektora ierobežojumi?");
    Q3.setBounds(0,0,800,235);
      Q3.setFont(new Font("Arial",Font.BOLD,15));
      Q3.setBackground(Crasa);
      Q3.setOpaque(true);
      Q3.setBorder(new EmptyBorder(0,50,0,0));
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
					AtbPirmo=0;
					AtbPirmo++;
					uzPirmo.add(AtbPirmo);
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
	Test4 = new JFrame("Tests2");
    Test4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Test4.setSize(800, 490);
    Test4.setLayout(null);
   
    Test4.setResizable(false);
    Test4.setLocationRelativeTo(null);
    Test4.setVisible(true);
    
    Test4Jautajums1 = new JCheckBox("10 Elementus");
    Test4Jautajums1.setBounds(290,237,200,20);
    Test4.add(Test4Jautajums1);
    Test4Jautajums3 = new JCheckBox("Bezgalīgi Daudz");
    Test4Jautajums3.setBounds(290,257,200,20);
    Test4.add(Test4Jautajums3);
    Test4Jautajums2 = new JCheckBox("4, jo vektora izmērs ir 4");
    Test4Jautajums2.setBounds(290,300,100,20);
    Test4.add(Test4Jautajums2);
    Test4Jautajums4 = new JCheckBox("Bezgalīgi daudz");
    Test4Jautajums4.setBounds(290,320,100,20);
    Test4.add(Test4Jautajums4);
    JButton Iesniekt = new JButton("Teksts");
    Iesniekt.setBounds(500, 350, 250, 50);
    Test4.add(Iesniekt);
    Color Crasa = new Color(253, 235, 208);
    	Q4=new JLabel("<html>Ja vektoram nav deklerēts izmērs,<br>tad vektora var iebāzt elementus...?</html>");
    Q4.setBounds(0,0,800,235);
      Q4.setFont(new Font("Arial",Font.BOLD,15));
      Q4.setBackground(Crasa);
      Q4.setOpaque(true);
      Q4.setBorder(new EmptyBorder(0,50,0,0));
	Test4.add(Q4);
	Q4v2=new JLabel("<html>Ja vektoram ir deklerēts izmērs 4,<br>tad vektora var ielikt..(cik elementus?)</html>");
	Q4v2.setBounds(0,100,800,235);
	Q4v2.setFont(new Font("Arial",Font.BOLD,15));
	Q4v2.setBackground(Crasa);
	Q4v2.setOpaque(true);
	Q4v2.setBorder(new EmptyBorder(0,50,0,0));
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
					AtbPirmo=0;
					AtbPirmo++;
					uzPirmo.add(AtbPirmo);
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
	
	Atzime = new JLabel("<html>Jusu Vertejums<br>--------- "+f.format(IegutaAtzime)+" ---------<br>Atbildējāt uz pirmo "+pirmo+"/10</html>");
	Atzime.setBounds(0,0,800,200);
	Atzime.setFont(new Font("Arial",Font.BOLD,15));
	Atzime.setBackground(Crasa);
	Atzime.setOpaque(true);
	Atzime.setBorder(new EmptyBorder(0,330,0,0));
	Vertejums.add(Atzime);
	
	
	 JButton DarbaApskate = new JButton("Apskatit Darbu");
	 DarbaApskate.setBounds(500, 350, 250, 50);
	    Vertejums.add(DarbaApskate);
	   
	    JButton Atpakal = new JButton("Apskatit Darbu");
	    Atpakal.setBounds(500, 150, 250, 50);
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
	JFrame info, Test, Test2, Test3, Test4, Vertejums;
	JRadioButton PT2;
	JRadioButton PT1;
	ButtonGroup Grupa;
	JTextArea Vards, Uzvards;
	String str="";
	String Persona="";
	JCheckBox Jautajums1, Jautajums2, Jautajums3, Jautajums4;
	JCheckBox Test2Jautajums1, Test2Jautajums2, Test2Jautajums3, Test2Jautajums4, Test3Jautajums1, Test3Jautajums2, Test3Jautajums3, Test3Jautajums4,
	Test4Jautajums1,Test4Jautajums2,Test4Jautajums3,Test4Jautajums4;
	JLabel Q1, Q2, Q3, Q4, Q4v2;
	JLabel Atzime;
	DecimalFormat f=new DecimalFormat("#.##");
	int p=0;
	 int AtbPirmo=0;
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
				if(p==0) {
					AtbPirmo=0;
					AtbPirmo++;
					uzPirmo.add(AtbPirmo);
				}
				JautajumsDivi();
				
			
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
