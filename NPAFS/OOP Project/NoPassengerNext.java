package nayya;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NoPassengerNext extends JFrame {

	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NoPassengerNext frame = new NoPassengerNext();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public NoPassengerNext() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel NoLabel = new JLabel("Passenger Information");
		NoLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		NoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NoLabel.setBounds(117, 22, 200, 27);
		contentPane.add(NoLabel);
		
		JLabel lblNewLabel = new JLabel("    You don't have a Valid Passport so you cannot Book Flight for YourSelf.");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 99, 405, 57);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Main Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				MenuofSystem2 frame = new MenuofSystem2();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(22, 229, 113, 23);
		contentPane.add(btnNewButton);
	}

}
