package nayya;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FlightsInformation extends JFrame {

	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlightsInformation frame = new FlightsInformation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public FlightsInformation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setForeground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Label1_FlightInfo = new JLabel("Information About Flights");
		Label1_FlightInfo.setHorizontalAlignment(SwingConstants.CENTER);
		Label1_FlightInfo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Label1_FlightInfo.setBounds(101, 22, 227, 27);
		contentPane.add(Label1_FlightInfo);
		
		JLabel lblNewLabel = new JLabel("NPAFS has Established a Network of 20 Airplanes in Each City.");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 89, 324, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("  Maximum of 5 Planes can land at a time in an Airport.\r\n");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 114, 334, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NPAFS has Established a Network of 25 Countries around the Globe.");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 139, 348, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton BTN_FLIGHTS = new JButton("Back to Main Menu\r\n");
		BTN_FLIGHTS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuofSystem2 frame = new MenuofSystem2();
				frame.setVisible(true);
				dispose();
				
			}
		});
		BTN_FLIGHTS.setFont(new Font("Times New Roman", Font.BOLD, 12));
		BTN_FLIGHTS.setBounds(10, 229, 163, 23);
		contentPane.add(BTN_FLIGHTS);
		
		JLabel lblNewLabel_3 = new JLabel("(New-PAK Airline Flight System)");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_3.setBounds(249, 192, 163, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("  10 Local and 5 interNational Daily Flights.");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 164, 212, 14);
		contentPane.add(lblNewLabel_4);
	}

}
