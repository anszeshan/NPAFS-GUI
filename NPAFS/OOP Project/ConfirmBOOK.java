package nayya;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class ConfirmBOOK extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmBOOK frame = new ConfirmBOOK();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ConfirmBOOK() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Label222 = new JLabel("Payment Details");
		Label222.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Label222.setHorizontalAlignment(SwingConstants.CENTER);
		Label222.setBounds(61, 24, 323, 30);
		contentPane.add(Label222);
		
		JLabel lblNewLabel = new JLabel("Your Billing Information");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel.setBounds(32, 71, 169, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Credit Card");
		rdbtnNewRadioButton.setBounds(90, 103, 102, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Paypal");
		rdbtnNewRadioButton_1.setBounds(236, 103, 92, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		ButtonGroup btn = new ButtonGroup();
		btn.add(rdbtnNewRadioButton);
		btn.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Type");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(61, 138, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "VISA", "Master Card", "Discover", "jCB"}));
		comboBox.setBounds(120, 134, 57, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("CONFIRM");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton) {
					String name;
					String cardNum;
					String code ;
					name = textField_1.getText();
					cardNum = textField.getText();
					code = passwordField.getText();
					  if(!(rdbtnNewRadioButton.isSelected() || rdbtnNewRadioButton_1.isSelected())) {
						  JOptionPane.showMessageDialog(null,"Please Select Your Payment Option.");
					  }
					  else if("Select".equals(comboBox.getSelectedItem())) {
						  JOptionPane.showMessageDialog(null,"Please select Your Card Type.");
					  }
					  else if(cardNum.isEmpty()) {
						  JOptionPane.showMessageDialog(null,"Please Fill Card Number.");
					  }
					  else if(!(cardNum.length() == 16)) {
						  JOptionPane.showMessageDialog(null,"Please Enter 16 Digits Card Number.");
					  }
					  else if(name.isEmpty()) {
						  JOptionPane.showMessageDialog(null,"Please Fill Name.");
					  }
					  else if(code.isEmpty()) {
						  JOptionPane.showMessageDialog(null,"Please Fill Pin Code.");
					  }
					  else if(!(code.length() == 4 )) {
						  JOptionPane.showMessageDialog(null,"Pin Code Should Be of 4 Digits.");
					  }
					  
					  else {
						  JOptionPane.showMessageDialog(null,"Your Booking has been Confirmed.");
						  FINALending frame = new FINALending();
							frame.setVisible(true);
							dispose();
					  }
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(269, 229, 115, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Card Number : ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(46, 167, 92, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(130, 164, 108, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Name : ");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(61, 192, 49, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(130, 189, 108, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FLIGHT_SCHED_INFO_LOCALLY frame = new FLIGHT_SCHED_INFO_LOCALLY();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setBounds(10, 229, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Pin Code:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(269, 181, 49, 14);
		contentPane.add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(328, 178, 75, 20);
		contentPane.add(passwordField);
	}
}
