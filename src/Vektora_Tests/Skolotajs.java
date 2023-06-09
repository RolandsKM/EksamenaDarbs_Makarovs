package Vektora_Tests;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Skolotajs implements ActionListener{
JFrame Join;
JTextField Vards;
JPasswordField password;
JLabel name, parole;
JButton Log;
	Skolotajs(){
		Join = new JFrame("Login");
		Join.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Join.setSize(800, 490);
		Join.setLayout(null);
		Join.setResizable(false);
		Join.setLocationRelativeTo(null);
		Join.setVisible(true);
		
		Log=new JButton("Login");
		Log.setBounds(340, 200, 80, 30);
		 Log.addActionListener(this);
		name=new JLabel("Name");
		name.setBounds(10, 100, 100, 40);
		name.setFont(new Font("Arial",Font.BOLD,30));
		
		parole=new JLabel("Password");
		parole.setBounds(10, 150, 150, 40);
		parole.setFont(new Font("Arial",Font.BOLD,30));
		
		Vards = new JTextField();
		Vards.setBounds(160, 100, 260, 40);
		Vards.setPreferredSize(new Dimension(250,100));
		Vards.setFont(new Font("Consolas",Font.PLAIN,30));
		Vards.setForeground(new Color(0x0B5345));
		Vards.setCaretColor(Color.black);
		
		
		password = new JPasswordField();
		password.setBounds(160, 150, 260, 40);
		password.setPreferredSize(new Dimension(250,100));
		password.setFont(new Font("Consolas",Font.PLAIN,30));
		password.setForeground(new Color(0x0B5345));
		password.setCaretColor(Color.black);
		
		
		Join.add(name);
		Join.add(parole);
		Join.add(password);
		Join.add(Vards);
		Join.add(Log);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String n=Vards.getText().trim();
		String p= String.valueOf(password.getPassword());
		
	
		if(e.getSource()==Log) {
			if(n.equals("Mr.Rolands") && p.equals("parole123")) {
				Join.dispose();
				SkolotajuProfs skA = new SkolotajuProfs();
			
			
		}
		 }
	}
	
}

