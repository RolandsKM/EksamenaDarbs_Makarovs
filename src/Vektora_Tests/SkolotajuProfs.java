package Vektora_Tests;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;

public class SkolotajuProfs  implements ActionListener{
	static File darbvirsma= FileSystemView.getFileSystemView().getHomeDirectory();
	static String atrasanasVieta = darbvirsma.getAbsolutePath();


	
	void Prog2() {
		 File Mape = new File(atrasanasVieta, "Vertejumi_Test");
	        if (!Mape.exists()) {
	          
	           
	        }

	       
	        File pt2Folder = new File(Mape, "2PT-2");
	      
	        if (!pt2Folder.exists() ) {
	          
	            
	        }
	     
	        File[] files = pt2Folder.listFiles();
	    	if (files.length == 0) {
	    	    JOptionPane.showMessageDialog(null, "Mape is Tuksa: " + pt2Folder, 
	    	            "Error", JOptionPane.ERROR_MESSAGE);
	    	 
	    	}
	    	String[] fileNosaukums = new String[files.length];
	    	for (int i = 0; i < files.length; i++) {
	    		fileNosaukums[i] = files[i].getName();
	    	}
	    	String IzveletaisFails = (String) JOptionPane.showInputDialog(null, "Izvelies Failu:", 
	    	        "Testi", JOptionPane.PLAIN_MESSAGE, null, fileNosaukums, fileNosaukums[0]);
	    	if (IzveletaisFails == null) {
	    	    return; 
	    	}
	    	for (File file : files) {
	    	    if (file.getName().equals(IzveletaisFails)) {
	    	        try {
	    	            FileReader reader = new FileReader(file);
	    	            BufferedReader bufferedReader = new BufferedReader(reader);
	    	            
	    	            StringBuilder teksts = new StringBuilder();
	    	            String line;
	    	            while ((line = bufferedReader.readLine()) != null) {
	    	            	teksts.append(line);
	    	            	teksts.append(System.lineSeparator());
	    	            }
	    	            bufferedReader.close();
	
	    	            JOptionPane.showMessageDialog(null, teksts.toString(), 
	    	                    "Tests: " + file.getName(), JOptionPane.INFORMATION_MESSAGE);
	    	            
	    	            
	    	        } catch (IOException e) {
	    	           
	    	            JOptionPane.showMessageDialog(null, "Kļūda");
	    	        }
	    	      
	    	    }
	    	}
	        

	}
	void Prog1() {
		 File Mape = new File(atrasanasVieta, "Vertejumi_Test");
	        if (!Mape.exists()) {
	          
	           
	        }

	       
	        File pt1Folder = new File(Mape, "2PT-1");
	      
	        if (!pt1Folder.exists() ) {
	          
	            
	        }
	     
	        File[] files = pt1Folder.listFiles();
	    	if (files.length == 0) {
	    	    JOptionPane.showMessageDialog(null, "Mape is Tuksa: " + pt1Folder, 
	    	            "Error", JOptionPane.ERROR_MESSAGE);
	    	 
	    	}
	    	String[] fileNosaukums = new String[files.length];
	    	for (int i = 0; i < files.length; i++) {
	    		fileNosaukums[i] = files[i].getName();
	    	}
	    	String IzveletaisFails = (String) JOptionPane.showInputDialog(null, "Izvelies Failu:", 
	    	        "Testi", JOptionPane.PLAIN_MESSAGE, null, fileNosaukums, fileNosaukums[0]);
	    	if (IzveletaisFails == null) {
	    	    return; 
	    	}
	    	for (File file : files) {
	    	    if (file.getName().equals(IzveletaisFails)) {
	    	        try {
	    	            FileReader reader = new FileReader(file);
	    	            BufferedReader bufferedReader = new BufferedReader(reader);
	    	            
	    	            StringBuilder teksts = new StringBuilder();
	    	            String line;
	    	            while ((line = bufferedReader.readLine()) != null) {
	    	            	teksts.append(line);
	    	            	teksts.append(System.lineSeparator());
	    	            }
	    	            bufferedReader.close();
	
	    	            JOptionPane.showMessageDialog(null, teksts.toString(), 
	    	                    "Tests: " + file.getName(), JOptionPane.INFORMATION_MESSAGE);
	    	            
	    	            
	    	        } catch (IOException e) {
	    	           
	    	            JOptionPane.showMessageDialog(null, "Kļūda");
	    	        }
	    	      
	    	    }
	    	}
	        

	}

	JFrame frame;
	JLabel Teksts;
	JButton pt2, pt1;
	 Color Crasa = new Color(3,	58,	53);
	    Color TextKrasa = new Color(242,230,230);
	    Color label = new Color(14, 102, 85);
	    JButton sakums;
	SkolotajuProfs(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 490);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		Teksts=new JLabel("Skolotāju Profils");
		Teksts.setBounds(0,0,400,100);
		Teksts.setFont(new Font("Arial",Font.BOLD,15));
		Teksts.setBackground(Crasa);
		Teksts.setOpaque(true);
		Teksts.setBorder(new EmptyBorder(0,50,0,0));
		Teksts.setBackground(Crasa);
		Teksts.setForeground(TextKrasa);

		JLabel Teksts2=new JLabel();
		Teksts2.setBounds(0,330,400,200);
		Teksts2.setFont(new Font("Arial",Font.BOLD,15));
		Teksts2.setBackground(Crasa);
		Teksts2.setOpaque(true);
		Teksts2.setBorder(new EmptyBorder(0,50,0,0));
		Teksts2.setBackground(label);
		Teksts2.setForeground(TextKrasa);
		
		frame.add(Teksts);
		frame.add(Teksts2);
		pt2=new JButton("2PT-2");
		pt2.setBounds(0, 100, 200, 60);
		pt2.addActionListener(this);
		pt1=new JButton("2PT-1");
		pt1.setBounds(200, 100, 200, 60);
		pt1.addActionListener(this);
		frame.add(pt2);
		frame.add(pt1);
		ImageIcon imageIcon2 = new ImageIcon(new ImageIcon("acc.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
	    JLabel acc = new JLabel(imageIcon2);
	    acc.setBounds(50,50,300, 400);
	    frame.add(acc);
	     sakums=new JButton("Sākumu");
	    sakums.setBounds(68, 320, 150, 60);
	    sakums.addActionListener(this);
	    sakums.setBackground(Crasa);
	    sakums.setForeground(TextKrasa);
	    frame.add(sakums);
	    acc.add(sakums);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==pt2) {
			Prog2();
		}
		if(e.getSource()==pt1) {
			Prog1();
		}
		if(e.getSource()==sakums) {
			frame.dispose();
			SaktTestu sakums = new SaktTestu();
		}
	}
}
