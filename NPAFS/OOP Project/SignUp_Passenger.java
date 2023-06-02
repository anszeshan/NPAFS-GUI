package nayya;
import java.io.File;
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JPasswordField;
public class SignUp_Passenger extends JFrame {
     ArrayList<LoginANDRegistration> List1 = new ArrayList<LoginANDRegistration>();
     File file = new File("C://Users//pcs//Desktop//Nayyar Project//nayya//src//nayya/PassengerInfo.text");
	private JPanel contentPane;
	private JTextField TF_USERNAME;
	private JTextField TF_EMAIL;
	private JTextField TF_CNIC;
	private PassengerPanel addingWindow = new PassengerPanel();
	private JFrame PassengerPanel = new JFrame();
	private JPasswordField TF_PASSWORD;
	private JPasswordField TF_RETYPEPASS;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp_Passenger frame = new SignUp_Passenger();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SignUp_Passenger() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Label1 = new JLabel("WELCOME TO SIGNUP PAGE OF PASSENGER");
		Label1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Label1.setHorizontalAlignment(SwingConstants.CENTER);
		Label1.setBounds(36, 22, 376, 31);
		contentPane.add(Label1);
		
		JLabel lblNewLabel = new JLabel("Enter Username:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(102, 76, 95, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("    Enter Email:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(92, 101, 85, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("    Enter CNIC:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(92, 128, 85, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Password:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setBounds(102, 155, 97, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Re-Enter Password:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(102, 181, 113, 14);
		contentPane.add(lblNewLabel_4);
		
		TF_USERNAME = new JTextField();
		TF_USERNAME.setFont(new Font("Tahoma", Font.PLAIN, 11));
		TF_USERNAME.setBounds(223, 73, 96, 20);
		contentPane.add(TF_USERNAME);
		TF_USERNAME.setColumns(10);
		
		TF_EMAIL = new JTextField();
		TF_EMAIL.setBounds(223, 98, 96, 20);
		contentPane.add(TF_EMAIL);
		TF_EMAIL.setColumns(10);
		
		TF_CNIC = new JTextField();
		TF_CNIC.setBounds(223, 123, 96, 20);
		contentPane.add(TF_CNIC);
		TF_CNIC.setColumns(10);
		
		JButton BTNSIGNUP_PASSENGER = new JButton("SIGNUP");
		BTNSIGNUP_PASSENGER.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginANDRegistration obj = new LoginANDRegistration(TF_USERNAME.getText(), TF_EMAIL.getText(), TF_CNIC.getText(), TF_PASSWORD.getText());
				List1.add(obj);
					if(e.getSource() == BTNSIGNUP_PASSENGER) {
						 String username;
				            String password;
				            String cnic;
				            String email;
				            String retype_pass; 
				            username = TF_USERNAME.getText();
				            password = TF_PASSWORD.getText();
				            cnic = TF_CNIC.getText();
				            email = TF_EMAIL.getText();
				            retype_pass = TF_RETYPEPASS.getText();
				            LOGINaccess frame = new LOGINaccess();
				            String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
				                 Pattern patter = Pattern.compile(regex);
				                 Matcher mat = patter.matcher(password);
				            if(username.isEmpty() && password.isEmpty() && cnic.isEmpty() && email.isEmpty() && retype_pass.isEmpty()) {
				            	JOptionPane.showMessageDialog(null,"Fields can't be empty");
				            }
				            else if(username.isEmpty() ) {
						 JOptionPane.showMessageDialog(null,"Username Field can't empty");
					        }
				            else if(email.isEmpty()) {
								 JOptionPane.showMessageDialog(null,"Email Field can't empty");
							 }
				            else if(cnic.isEmpty()) {
								 JOptionPane.showMessageDialog(null,"CNIC Field can't empty");
							 }
				            else if(cnic.length() < 13) {
								 JOptionPane.showMessageDialog(null,"CNIC must be of 13 Numbers.");
							 }
					        else if(password.isEmpty()) {
					        	 JOptionPane.showMessageDialog(null,"Password Field can't empty");
					         }
					        else if(password.length() <8) {
				            	JOptionPane.showMessageDialog(null, "Password Must be Greator than or Equal to 8 Character.");
				            }
					        else if(!mat.matches()) {
					        	JOptionPane.showMessageDialog(null,"Password Field must have Digit, Special Character and Upper and Lower Alphabets.");
					        }
					        else if(retype_pass.isEmpty()) {
					        	 JOptionPane.showMessageDialog(null,"Retype_pass Field can't empty");
					        }
				            else if(!retype_pass.contains(password)) {
						         JOptionPane.showMessageDialog(null,"Re-type Password can't be Match.");
					        }
				            else {
						         JOptionPane.showMessageDialog(null, "Account Created Successfully!");
					        }
				            try 
						     { 
						        FileWriter fw=new FileWriter("C://Users//pcs//Desktop//OOP_PROJJECT_FINAL//nayya//src//nayya/PassengerInfo.text",true);
						       
								fw.append(TF_USERNAME.getText());
								fw.append("," +TF_PASSWORD.getText());
								
							    fw.append("\r");
							    fw.close();
								} 
				            catch (IOException e1) {
									e1.printStackTrace();
								}
						       
						     
						     System.out.println("File Created Sucessfully");		
				}
				}
			
			});
				
			
		
		BTNSIGNUP_PASSENGER.setFont(new Font("Times New Roman", Font.BOLD, 12));
		BTNSIGNUP_PASSENGER.setBounds(180, 209, 77, 20);
		contentPane.add(BTNSIGNUP_PASSENGER);
		
		JButton btnNewButton = new JButton("Main Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuofSystem2 frame = new MenuofSystem2();
				frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(32, 229, 103, 23);
		contentPane.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 PassengerPanel.setVisible(true);
				 PassengerPanel.pack();
				 PassengerPanel.setTitle("NPAFS");
				 PassengerPanel.setSize(600, 400);
				 PassengerPanel.setResizable(false);
				 PassengerPanel.setLocationRelativeTo(null);  
				 PassengerPanel.getContentPane().add(addingWindow); 
				}		
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setBounds(363, 229, 63, 23);
		contentPane.add(btnNewButton_1);
		
		TF_PASSWORD = new JPasswordField();
		TF_PASSWORD.setBounds(223, 148, 96, 20);
		contentPane.add(TF_PASSWORD);
		
		TF_RETYPEPASS = new JPasswordField();
		TF_RETYPEPASS.setBounds(223, 176, 96, 20);
		contentPane.add(TF_RETYPEPASS);
		
		JButton resetButton = new JButton("RESET");
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == resetButton) {
					TF_USERNAME.setText("");
					TF_EMAIL.setText("");
					TF_CNIC.setText("");
					TF_PASSWORD.setText("");
					TF_RETYPEPASS.setText("");
		        }
			}
		});
		resetButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		resetButton.setBounds(267, 208, 77, 20);
		contentPane.add(resetButton);
}
}