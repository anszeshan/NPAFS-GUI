package nayya;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.event.AncestorListener;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.util.*;
public class PassengerPanel extends JPanel {
	private JTextField TF1;
	private JPasswordField PF1;
	public PassengerPanel() {
		setBackground(Color.CYAN);
		setLayout(null);
		
			setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBounds(38, 45, 363, 221);
			add(panel);
			panel.setLayout(null);
		JLabel lblNewLabel = new JLabel("WELCOME TO LOGIN PAGE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(23, 11, 265, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Username: ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(31, 66, 95, 26);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("   Enter Password:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(23, 103, 103, 14);
		panel.add(lblNewLabel_2);
		
		TF1 = new JTextField();
		TF1.setBounds(130, 69, 96, 20);
		panel.add(TF1);
		TF1.setColumns(10);
		
		JButton btnNewButton = new JButton("Main Menu");
		btnNewButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				MenuofSystem2 frame = new MenuofSystem2();
				frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton.setBounds(10, 187, 89, 23);
		panel.add(btnNewButton);
		add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("If you Haven't an account.");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(208, 171, 145, 10);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("SIGN UP");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SignUp_Passenger frame = new SignUp_Passenger();
				frame.setVisible(true);
				
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_2.setBounds(249, 187, 89, 23);
		panel.add(btnNewButton_2);
		
		JLabel Lab_Error_Username = new JLabel("");
		Lab_Error_Username.setBounds(239, 72, 114, 14);
		panel.add(Lab_Error_Username);
		
		JLabel Lab_Error_Password = new JLabel("");
		Lab_Error_Password.setBounds(239, 103, 114, 14);
		panel.add(Lab_Error_Password);
		
		PF1 = new JPasswordField();
		PF1.setBounds(130, 100, 96, 20);
		panel.add(PF1);

		JButton btnNewButton_1 = new JButton("LOGIN");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				SignUp_Passenger obj222 = new SignUp_Passenger();
				if(e.getSource() == btnNewButton_1) {
					    String userText;
			            String pwdText;
			            userText = TF1.getText();
			            pwdText = PF1.getText();
			            LOGINaccess frame = new LOGINaccess();
			            if(userText.isEmpty() && pwdText.isEmpty()) {
			            	JOptionPane.showMessageDialog(null,"Username and Password Field is empty");
			            }
			            else if(userText.isEmpty() ) {
					 JOptionPane.showMessageDialog(null,"Username Field is empty");
				      }
				      else if(pwdText.isEmpty()) {
				    	 JOptionPane.showMessageDialog(null,"Password Field is empty");
			    	 }
			    	 else {
			    		   PassengerPanel.search(userText);
			    		   PassengerPanel.searchPass(pwdText);
			    		   
				 }
			          
				}
			}
		});
				 
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setBounds(121, 137, 89, 23);
		panel.add(btnNewButton_1);
	}
	static void search(String userText){
		
		File file = new File("C://Users//pcs//Desktop//OOP_PROJJECT_FINAL//nayya//src//nayya/PassengerInfo.text");
		 try {
		       Scanner sc = new Scanner(file).useDelimiter( ",");

		        while (sc.hasNext()) {
		             String lineFromFile = sc.nextLine();
		            if (lineFromFile.contains(userText)) {         
		            	
		                break;
		            }
		            else {
		            	JOptionPane.showMessageDialog(null,"UserName Wrong. Try Again.");
		            }
		        }
		    } catch (IOException e) {
		    	e.printStackTrace();
		    	}

	}
static void searchPass(String pwdText){
		
		File file = new File("C://Users//pcs//Desktop//OOP_PROJJECT_FINAL//nayya//src//nayya/PassengerInfo.text");
		 try {
		       Scanner sc = new Scanner(file).useDelimiter( ",");

		        while (sc.hasNext()) {
		             String lineFromFile = sc.nextLine();
		            if (lineFromFile.contains(pwdText)) {         
		            	 JOptionPane.showMessageDialog(null,"Logged In Successfully."); 
		            	 PassengerClassFrame frame2 = new PassengerClassFrame();
							frame2.setVisible(true);
      		                break;
		            }
		            else {
		            	JOptionPane.showMessageDialog(null,"Password Wrong. Try Again.");
		            }
		        }
		    } catch (IOException e) {
		    	e.printStackTrace();
		    	}
}
	public void PassengerPanel() {


	}
	
}