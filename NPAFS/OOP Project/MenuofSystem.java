package nayya;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuofSystem extends JFrame {

	private JPanel CP1;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuofSystem frame = new MenuofSystem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MenuofSystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		CP1 = new JPanel();
		CP1.setForeground(Color.RED);
		CP1.setBackground(Color.CYAN);
		CP1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(CP1);
		CP1.setLayout(null);
		
		JLabel LabelMenu = new JLabel("New-PAK Airline Flight System (NPAFS)\r\n");
		LabelMenu.setBounds(5, 5, 426, 21);
		LabelMenu.setFont(new Font("Tahoma", Font.BOLD, 17));
		LabelMenu.setHorizontalAlignment(SwingConstants.CENTER);
		CP1.add(LabelMenu);
		
		JLabel LabelMenu2 = new JLabel("Do You want to Your System ?");
		LabelMenu2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		LabelMenu2.setHorizontalAlignment(SwingConstants.CENTER);
		LabelMenu2.setBounds(95, 67, 241, 14);
		CP1.add(LabelMenu2);
		
		JButton BtnMenu = new JButton("Yes");
		BtnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuofSystem2 frame = new MenuofSystem2();
				frame.setVisible(true);
				dispose();
				
			}
		});
		BtnMenu.setBackground(Color.LIGHT_GRAY);
		BtnMenu.setForeground(Color.BLACK);
		BtnMenu.setFont(new Font("Tahoma", Font.BOLD, 12));
		BtnMenu.setBounds(172, 115, 89, 23);
		CP1.add(BtnMenu);
		
		JButton BtnMenu2 = new JButton("No");
		BtnMenu2.setBackground(Color.LIGHT_GRAY);
		BtnMenu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		BtnMenu2.setFont(new Font("Tahoma", Font.BOLD, 12));
		BtnMenu2.setBounds(172, 149, 89, 23);
		CP1.add(BtnMenu2);
	}
}
