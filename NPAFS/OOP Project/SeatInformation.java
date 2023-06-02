package nayya;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SeatInformation extends JFrame {

	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeatInformation frame = new SeatInformation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SeatInformation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Information About Seats ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(101, 22, 227, 14);
		contentPane.add(lblNewLabel);
		
		JButton BTN_SEATS = new JButton("Back to Main Menu");
		BTN_SEATS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuofSystem2 frame = new MenuofSystem2();
				frame.setVisible(true);
				dispose();
				
			}
		});
		BTN_SEATS.setFont(new Font("Times New Roman", Font.BOLD, 12));
		BTN_SEATS.setBounds(25, 229, 158, 23);
		contentPane.add(BTN_SEATS);
		
		JLabel lblNewLabel_1 = new JLabel("Annual 50,000 Users around the Globe.");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 68, 220, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("--> Seating Capacity of 50 Passengers in Economy Class.");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(49, 119, 316, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("--> Seating Capacity of 10 Passengers in Business Class.");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(49, 144, 309, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("In COVID DAYS,");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setBounds(25, 94, 116, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("--> Days Passengers are Seated with a Gap of One Seat.");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(49, 171, 316, 14);
		contentPane.add(lblNewLabel_5);
	}

}
