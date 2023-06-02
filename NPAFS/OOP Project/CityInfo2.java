package nayya;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CityInfo2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CityInfo2 frame = new CityInfo2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CityInfo2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Label1_Cities = new JLabel("Information about Cities");
		Label1_Cities.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Label1_Cities.setHorizontalAlignment(SwingConstants.CENTER);
		Label1_Cities.setBounds(101, 11, 212, 27);
		contentPane.add(Label1_Cities);
		
		JLabel Label2_Cities = new JLabel("We are providing our Services in Five Major Cities of Pakistan.");
		Label2_Cities.setHorizontalAlignment(SwingConstants.CENTER);
		Label2_Cities.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		Label2_Cities.setBounds(10, 63, 319, 14);
		contentPane.add(Label2_Cities);
		
		JLabel Label3_Cities = new JLabel("--> Islamabad");
		Label3_Cities.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities.setBounds(65, 88, 83, 14);
		contentPane.add(Label3_Cities);
		
		JLabel Label4_Cities = new JLabel("--> Lahore");
		Label4_Cities.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label4_Cities.setBounds(65, 108, 59, 14);
		contentPane.add(Label4_Cities);
		
		JLabel Label5_Cities = new JLabel("--> Quetta");
		Label5_Cities.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label5_Cities.setBounds(65, 125, 83, 14);
		contentPane.add(Label5_Cities);
		
		JLabel Label6_Cities = new JLabel("--> Peshawar");
		Label6_Cities.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label6_Cities.setBounds(65, 143, 83, 14);
		contentPane.add(Label6_Cities);
		
		JLabel Label7_Cities = new JLabel("--> Karachi");
		Label7_Cities.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label7_Cities.setBounds(65, 158, 83, 14);
		contentPane.add(Label7_Cities);
		
		JLabel Label8_Cities = new JLabel("Each City has two Airports\r\nlocated at the North and South.");
		Label8_Cities.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		Label8_Cities.setBounds(21, 183, 308, 27);
		contentPane.add(Label8_Cities);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FLIGHT_SCHED_INFO_LOCALLY frame = new FLIGHT_SCHED_INFO_LOCALLY();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(10, 229, 89, 23);
		contentPane.add(btnNewButton);
				
			
	}
}
