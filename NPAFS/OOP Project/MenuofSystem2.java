package nayya;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuofSystem2 extends JFrame {

	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuofSystem2 frame = new MenuofSystem2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MenuofSystem2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setForeground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LabelMenu2 = new JLabel("Welcome to Our System");
		LabelMenu2.setBounds(5, 5, 426, 24);
		LabelMenu2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		LabelMenu2.setForeground(new Color(0, 0, 0));
		LabelMenu2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(LabelMenu2);
		
		JLabel Label2Menu2 = new JLabel("NPAFS provides you with the best airline service.");
		Label2Menu2.setBounds(53, 50, 341, 14);
		Label2Menu2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Label2Menu2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(Label2Menu2);
		
		JLabel lblNewLabel_1 = new JLabel("About");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 83, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton BTN1 = new JButton("Cities ");
		BTN1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CityButtonFrame frame = new CityButtonFrame();
				frame.setVisible(true);
				dispose();
				
			}
		});
		BTN1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		BTN1.setBounds(163, 100, 89, 23);
		contentPane.add(BTN1);
		
		JButton BTN2 = new JButton("Flights");
		BTN2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FlightsInformation frame = new FlightsInformation();
				frame.setVisible(true);		
				dispose();
			}
		});
		BTN2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		BTN2.setBounds(163, 127, 89, 23);
		contentPane.add(BTN2);
		
		JButton BTN3 = new JButton("Seats");
		BTN3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SeatInformation frame = new SeatInformation();
				frame.setVisible(true);	
				dispose();
			}
		});
		BTN3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		BTN3.setBounds(163, 155, 89, 23);
		contentPane.add(BTN3);
		
		JButton BTNnext = new JButton("Next");
		BTNnext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NEXT_Login frame = new NEXT_Login();
				frame.setVisible(true);
				dispose();
			}
		});
		BTNnext.setFont(new Font("Times New Roman", Font.BOLD, 12));
		BTNnext.setBounds(337, 229, 89, 23);
		contentPane.add(BTNnext);
		
		JButton btnNewButton = new JButton("Countries");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CountryinfoButton frame = new CountryinfoButton();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.setBounds(163, 182, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Flight Schedule");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FLIGHT_DATA frame = new FLIGHT_DATA();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_1.setBounds(155, 208, 107, 23);
		contentPane.add(btnNewButton_1);
	}
}
