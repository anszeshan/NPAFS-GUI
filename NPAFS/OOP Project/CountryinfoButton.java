package nayya;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CountryinfoButton extends JFrame {

	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CountryinfoButton frame = new CountryinfoButton();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CountryinfoButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Label1 = new JLabel("Country Names");
		Label1.setHorizontalAlignment(SwingConstants.CENTER);
		Label1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Label1.setBounds(128, 22, 170, 31);
		contentPane.add(Label1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuofSystem2 frame = new MenuofSystem2();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(10, 229, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel Label2_Cities = new JLabel("We are providing our Services in 25 Different Countries.");
		Label2_Cities.setHorizontalAlignment(SwingConstants.CENTER);
		Label2_Cities.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		Label2_Cities.setBounds(0, 64, 319, 14);
		contentPane.add(Label2_Cities);
		
		JLabel Label3_Cities = new JLabel("--> England");
		Label3_Cities.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities.setBounds(38, 79, 83, 14);
		contentPane.add(Label3_Cities);
		
		JLabel Label3_Cities_1 = new JLabel("--> Saudi Arabia");
		Label3_Cities_1.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_1.setBounds(38, 99, 83, 14);
		contentPane.add(Label3_Cities_1);
		
		JLabel Label3_Cities_2 = new JLabel("--> Quwait");
		Label3_Cities_2.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_2.setBounds(38, 124, 83, 14);
		contentPane.add(Label3_Cities_2);
		
		JLabel Label3_Cities_3 = new JLabel("--> Sudan");
		Label3_Cities_3.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_3.setBounds(38, 149, 83, 14);
		contentPane.add(Label3_Cities_3);
		
		JLabel Label3_Cities_4 = new JLabel("--> Nepal");
		Label3_Cities_4.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_4.setBounds(38, 174, 83, 14);
		contentPane.add(Label3_Cities_4);
		
		JLabel Label3_Cities_5 = new JLabel("--> Indonesia");
		Label3_Cities_5.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_5.setBounds(38, 199, 83, 14);
		contentPane.add(Label3_Cities_5);
		
		JLabel Label3_Cities_6 = new JLabel("--> South Africa");
		Label3_Cities_6.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_6.setBounds(129, 79, 83, 14);
		contentPane.add(Label3_Cities_6);
		
		JLabel Label3_Cities_7 = new JLabel("--> India");
		Label3_Cities_7.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_7.setBounds(128, 99, 83, 14);
		contentPane.add(Label3_Cities_7);
		
		JLabel Label3_Cities_8 = new JLabel("--> Iran");
		Label3_Cities_8.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_8.setBounds(128, 124, 83, 14);
		contentPane.add(Label3_Cities_8);
		
		JLabel Label3_Cities_9 = new JLabel("--> Afghanistan");
		Label3_Cities_9.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_9.setBounds(129, 149, 83, 14);
		contentPane.add(Label3_Cities_9);
		
		JLabel Label3_Cities_10 = new JLabel("--> Bahrain");
		Label3_Cities_10.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_10.setBounds(128, 174, 83, 14);
		contentPane.add(Label3_Cities_10);
		
		JLabel Label3_Cities_11 = new JLabel("--> China");
		Label3_Cities_11.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_11.setBounds(129, 199, 83, 14);
		contentPane.add(Label3_Cities_11);
		
		JLabel Label3_Cities_12 = new JLabel("--> Korea");
		Label3_Cities_12.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_12.setBounds(215, 79, 83, 14);
		contentPane.add(Label3_Cities_12);
		
		JLabel Label3_Cities_13 = new JLabel("--> Russia");
		Label3_Cities_13.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_13.setBounds(215, 99, 83, 14);
		contentPane.add(Label3_Cities_13);
		
		JLabel Label3_Cities_14 = new JLabel("--> Bangladesh");
		Label3_Cities_14.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_14.setBounds(215, 124, 83, 14);
		contentPane.add(Label3_Cities_14);
		
		JLabel Label3_Cities_15 = new JLabel("--> America");
		Label3_Cities_15.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_15.setBounds(215, 149, 83, 14);
		contentPane.add(Label3_Cities_15);
		
		JLabel Label3_Cities_16 = new JLabel("--> Canada");
		Label3_Cities_16.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_16.setBounds(215, 174, 83, 14);
		contentPane.add(Label3_Cities_16);
		
		JLabel Label3_Cities_17 = new JLabel("--> Australia");
		Label3_Cities_17.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_17.setBounds(215, 199, 83, 14);
		contentPane.add(Label3_Cities_17);
		
		JLabel Label3_Cities_18 = new JLabel("-->Malaysia");
		Label3_Cities_18.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_18.setBounds(298, 79, 83, 14);
		contentPane.add(Label3_Cities_18);
		
		JLabel Label3_Cities_19 = new JLabel("--> UAE");
		Label3_Cities_19.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_19.setBounds(298, 99, 83, 14);
		contentPane.add(Label3_Cities_19);
		
		JLabel Label3_Cities_20 = new JLabel("--> North Korea");
		Label3_Cities_20.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_20.setBounds(298, 124, 83, 14);
		contentPane.add(Label3_Cities_20);
		
		JLabel Label3_Cities_21 = new JLabel("--> West Indies");
		Label3_Cities_21.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_21.setBounds(298, 149, 83, 14);
		contentPane.add(Label3_Cities_21);
		
		JLabel Label3_Cities_22 = new JLabel("--> Scotland");
		Label3_Cities_22.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_22.setBounds(298, 174, 83, 14);
		contentPane.add(Label3_Cities_22);
		
		JLabel Label3_Cities_23 = new JLabel("--> Netherland");
		Label3_Cities_23.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_23.setBounds(298, 199, 83, 14);
		contentPane.add(Label3_Cities_23);
		
		JLabel Label3_Cities_24 = new JLabel("--> NewZealand");
		Label3_Cities_24.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3_Cities_24.setBounds(170, 224, 83, 14);
		contentPane.add(Label3_Cities_24);
	}

}
