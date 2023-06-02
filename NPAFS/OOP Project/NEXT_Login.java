package nayya;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NEXT_Login extends JFrame {

	private JPanel contentPane;
	private AdminPanel addingWindow = new AdminPanel();
	private PassengerPanel addingwindow1 = new PassengerPanel(); 
	private JFrame PassengerPanel = new JFrame();
	private JFrame AdminPanel = new JFrame();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NEXT_Login frame = new NEXT_Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public NEXT_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New-PAK Airline Flight System");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(79, 29, 264, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Are You A ADMIN or PASSENGER ?");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 89, 249, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("--> Press ADMIN Button if You are an Admin other PASSENGER Button.");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(40, 121, 372, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("ADMIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPanel.setVisible(true);
				dispose();
				AdminPanel.pack();
				AdminPanel.setTitle("NPAFS");
				AdminPanel.setSize(600, 400);
				AdminPanel.setResizable(false);
				AdminPanel.setLocationRelativeTo(null);  
				AdminPanel.getContentPane().add(addingWindow); 
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(160, 146, 113, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PASSENGER");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PassengerPanel.setVisible(true);
				dispose();
				PassengerPanel.pack();
				PassengerPanel.setTitle("NPAFS");
				PassengerPanel.setSize(600, 400);
				PassengerPanel.setResizable(false);
				PassengerPanel.setLocationRelativeTo(null);  
				PassengerPanel.getContentPane().add(addingwindow1);
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setBounds(160, 180, 113, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back to Main Menu");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuofSystem2 frame = new MenuofSystem2();
			//	obj.dispose();
				frame.setVisible(true);
				dispose();
			//	obj.dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_2.setBounds(25, 229, 170, 23);
		contentPane.add(btnNewButton_2);
	}
}
