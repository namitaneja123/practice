package Gui;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.border.Border;

public class GUI_attendant implements ActionListener {
	
	static JButton button;
	
	public static void main(String[] args) {

    ImageIcon image = new ImageIcon("imageslf.png");
    Border border = BorderFactory.createLineBorder(Color.white, 2);
    Border border2 = BorderFactory.createLineBorder(Color.cyan, 2);
	JLabel label =new JLabel();
	label.setText("Welcome to SelfCheckoutStation");
	label.setForeground(new Color(0x00ff00));
	label.setIcon(image);
	label.setFont(new Font("MV Boli",Font.PLAIN,20));
    label.setVerticalAlignment(JLabel.CENTER);
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setBackground(Color.black);
    label.setOpaque(true);
	label.setBounds(0, 0, 500, 100);

	
	
	JLabel start_label =new JLabel();
	start_label.setText("Press Start to Continue");
	start_label.setForeground(new Color(0xffffff));
	start_label.setFont(new Font("MV Boli",Font.PLAIN,20));
	start_label.setVerticalAlignment(JLabel.CENTER);
	start_label.setHorizontalAlignment(JLabel.CENTER);
	start_label.setBackground(Color.BLACK);
	start_label.setOpaque(true);
	start_label.setBounds(130, 210, 250, 50);
	start_label.setBorder(border2);
	
	
	button=new JButton();	
	button.setBounds(210, 270, 80, 50);
	button.addActionListener(new GUI_attendant());
	button.setText("Start");
	button.setFocusable(false);
	button.setFont(new Font("MV Boli",Font.PLAIN,20));
	button.setForeground(Color.red);
	button.setBackground(Color.BLACK);
	button.setBorder(border);
	
	
	JFrame frame= new JFrame("SelfCheckoutStation");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	frame.setSize(500,500);
	frame.setLayout(null);
	frame.setVisible(true);
	frame.getContentPane().setBackground(Color.black);

	frame.add(label);
	frame.add(start_label);
	frame.add(button);

   
	
}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	//	if(e.getSource()==button) {
			System.out.println("hello world");
		}
		
	}


