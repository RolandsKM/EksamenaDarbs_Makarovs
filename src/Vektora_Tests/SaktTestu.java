package Vektora_Tests;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class SaktTestu implements ActionListener {

	
	// TODO Auto-generated method stub
	 JFrame frame = new JFrame();
	 JButton SaktTestuPoga= new JButton("Tests");
	 JButton Skolotajs = new JButton("skolotajs");
	 SaktTestu(){
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setSize(640,820);
		    frame.setLayout(null);
		    frame.setResizable(false);
		    frame.setLocationRelativeTo(null);
		    ImageIcon imageIcon = new ImageIcon(new ImageIcon("Sakums.png").getImage().getScaledInstance(640, 832, Image.SCALE_SMOOTH));
		    JLabel background = new JLabel(imageIcon);
		  
		    background.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		   
		    Font Izmers=new Font(SaktTestuPoga.getFont().getName(),SaktTestuPoga.getFont().getStyle(),30);
		    SaktTestuPoga.setFont(Izmers);
		    Color TextKrasa = new Color(3,	58,	53);
		    Color Krasa = new Color(242,230,230);
		    SaktTestuPoga.setBounds(210, 540, 250, 50);
		    SaktTestuPoga.addActionListener(this);
		    SaktTestuPoga.setFocusable(false);
		    SaktTestuPoga.setBackground(Krasa);
		    SaktTestuPoga.setForeground(TextKrasa);
		    
		    Skolotajs.setBounds(240,740, 180, 20);
		    Skolotajs.addActionListener(this);
		    Skolotajs.setFocusable(false);
		    Skolotajs.setBackground(TextKrasa);
		    Skolotajs.setForeground(Krasa);
		    background.add(Skolotajs); 
		
		    frame.add(background);
		    background.add(SaktTestuPoga); 
		    frame.setVisible(true);
		    
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaktTestu ManPicerija = new SaktTestu();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==SaktTestuPoga) {
			   frame.dispose();
		Tests TesuDala = new Tests(); 
		 }
		 if(e.getSource()==Skolotajs) {
			   frame.dispose();
		Skolotajs TesuDala = new Skolotajs(); 
		 }
	
}

}
