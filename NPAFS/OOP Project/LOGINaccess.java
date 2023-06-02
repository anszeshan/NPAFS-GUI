package nayya;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LOGINaccess extends JFrame {

	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGINaccess frame = new LOGINaccess();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LOGINaccess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LABELlogin = new JLabel("Welcome Admin after Login in Our System");
		LABELlogin.setFont(new Font("Times New Roman", Font.BOLD, 18));
		LABELlogin.setHorizontalAlignment(SwingConstants.CENTER);
		LABELlogin.setBounds(34, 26, 349, 32);
		contentPane.add(LABELlogin);
		
		JLabel lblNewLabel = new JLabel("If you want to change Flight Schedule");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblNewLabel.setBounds(50, 82, 206, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Change");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_ACCESStoFLights frame = new Admin_ACCESStoFLights();
				frame.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(325, 78, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblIfYouWant = new JLabel("If you want to add New Routes to Local FLights");
		lblIfYouWant.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblIfYouWant.setBounds(50, 115, 241, 14);
		contentPane.add(lblIfYouWant);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Admin will be able to Add New Routes to Local Flights.");
				Admin_ACCESStoFLights frame = new Admin_ACCESStoFLights();
				frame.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setBounds(325, 110, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblIfYouWant_2 = new JLabel("If you want to add New Routes to International FLights");
		lblIfYouWant_2.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblIfYouWant_2.setBounds(50, 147, 271, 14);
		contentPane.add(lblIfYouWant_2);
		
		JButton btnNewButton_2 = new JButton("Add");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Admin will be able to Add New Routes to International Flights.");
				Admin_ACCESStoFLights frame = new Admin_ACCESStoFLights();
				frame.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_2.setBounds(325, 143, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblIfYouWant_2_1 = new JLabel("If you want to restrict Passengers in  FLights");
		lblIfYouWant_2_1.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblIfYouWant_2_1.setBounds(50, 204, 252, 14);
		contentPane.add(lblIfYouWant_2_1);
		
		JButton btnNewButton_2_1 = new JButton("Update");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Admin will be able to restrict Passengers in Flights.");
				Admin_ACCESStoFLights frame = new Admin_ACCESStoFLights();
				frame.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_2_1.setBounds(325, 175, 89, 23);
		contentPane.add(btnNewButton_2_1);
		
		JLabel lblIfYouWant_2_1_1 = new JLabel("If you want to Update Airline Inquiry Detail");
		lblIfYouWant_2_1_1.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblIfYouWant_2_1_1.setBounds(50, 179, 241, 14);
		contentPane.add(lblIfYouWant_2_1_1);
		
		JButton btnNewButton_2_1_1 = new JButton("Restrict");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Admin will be able to Update Airline Inquiry Details.");
				Admin_ACCESStoFLights frame = new Admin_ACCESStoFLights();
				frame.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_2_1_1.setBounds(325, 205, 89, 23);
		contentPane.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_3 = new JButton("Main Menu");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuofSystem2 frame = new MenuofSystem2();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_3.setBounds(20, 233, 102, 23);
		contentPane.add(btnNewButton_3);
	}
}
