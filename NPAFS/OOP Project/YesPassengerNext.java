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

public class YesPassengerNext extends JFrame {

	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YesPassengerNext frame = new YesPassengerNext();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public YesPassengerNext() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Label11 = new JLabel("Passenger Information");
		Label11.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Label11.setHorizontalAlignment(SwingConstants.CENTER);
		Label11.setBounds(84, 22, 270, 35);
		contentPane.add(Label11);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(84, 96, 49, 14);
		contentPane.add(lblNewLabel);
		
		JLabel Label77 = new JLabel("You want to Travel Locally or Internationally ? ");
		Label77.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		Label77.setHorizontalAlignment(SwingConstants.CENTER);
		Label77.setBounds(77, 96, 289, 14);
		contentPane.add(Label77);
		
		JButton btnNewButton = new JButton("Locally");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VisaLocal frame = new VisaLocal();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(163, 137, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnInternationally = new JButton("Internationally");
		btnInternationally.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VisaInternational frame = new VisaInternational();
				frame.setVisible(true);
				dispose();
			}
		});
		btnInternationally.setBackground(Color.LIGHT_GRAY);
		btnInternationally.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnInternationally.setBounds(148, 171, 119, 23);
		contentPane.add(btnInternationally);
	}
}
