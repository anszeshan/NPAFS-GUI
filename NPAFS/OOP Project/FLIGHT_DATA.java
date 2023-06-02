package nayya;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FLIGHT_DATA extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FLIGHT_DATA frame = new FLIGHT_DATA();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public FLIGHT_DATA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Information Menu of Flights");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(75, 11, 278, 31);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Islamabad City Departure");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame1;      
			    frame1=new JFrame();
			     
			    String allData[][]={ {"1","Islamabad","North","Lahore", "North", "1 am", "Rs 10,000 + 500", "Flight 01 - PAK1"},{"2","Islamabad","North","Lahore", "South", "2 am", "Rs 10,000 + 500", "Flight 02 - PAK2"},{"3","Islamabad","South","Lahore", "North", "3 am", "Rs 10,000 + 500", "Flight 03 - PAK3"},{"4","Islamabad","South","Lahore", "South", "4 am", "Rs 10,000 + 500", "Flight 04 - PAK4"},
			    		{"5","Islamabad","South","Quetta", "North", "5 am", "Rs 10,000 + 500", "Flight 05 - PAK5"},{"6","Islamabad","North","Quetta", "South", "6 am", "Rs 10,000 + 500", "Flight 06 - PAK6"},{"7","Islamabad","North","Quetta", "North", "7 am", "Rs 10,000 + 500", "Flight 08 - PAK8"},{"8","Islamabad","South","Quetta", "South", "8 am", "Rs 10,000 + 500", "Flight 08 - PAK8"},
			    		{"9","Islamabad","South","Peshawar", "North", "9 am", "Rs 10,000 + 500", "Flight 09 - PAK9"},{"10","Islamabad","South","Peshawar", "South", "10 am", "Rs 10,000 + 500", "Flight 10 - PAK10"},{"11","Islamabad","North","Peshawar", "North", "11 am", "Rs 10,000 + 500", "Flight 11 - PAK11"},{"12","Islamabad","North","Peshawar", "North", "12 pm", "Rs 10,000 + 500", "Flight 12 - PAK12"},
			    		{"13","Islamabad","North","Karachi", "North", "1 pm", "Rs 10,000 + 500", "Flight 13 - PAK13"},{"14","Islamabad","North","Karachi", "South", "2 pm", "Rs 10,000 + 500", "Flight 14 - PAK14"},{"15","Islamabad","South","Karachi", "South", "3 pm", "Rs 10,000 + 500", "Flight 15 - PAK15"},{"16","Islamabad","South","Karachi", "North", "4 pm", "Rs 10,000 + 500", "Flight 16 - PAK16"},
			                       };    
			    String fieldName[]={"Serial No.","Departure City","Dep City Direction ","Arrival City Name", "Arrival City Direction", "Time","Price (+5% Tax)","Flight Name"};         
			    JTable tableName=new JTable(allData,fieldName);    
			       tableName.setEnabled(false);
			       tableName.setBounds(50,50,300,300);  
			       JScrollPane pane=new JScrollPane(tableName);  
			          frame1.getContentPane().add(pane);          
			             frame1.setSize(500,500);    
			             frame1.setVisible(true);  
			             JOptionPane.showMessageDialog(null,"You can't be able to edit the Schedule.");
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.setBounds(36, 75, 169, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quetta City Departure");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame1;      
			    frame1=new JFrame();
			     
			    String allData[][]={ {"1","Quetta","North","Peshawar", "North", "1 am", "Rs 10,000 + 500", "Flight 0001 - PAK0001"},{"2","Quetta","North","Peshawar", "South", "2 am", "Rs 10,000 + 500", "Flight 0002 - PAK0002"},{"3","Quetta","South","Peshawar", "North", "3 am", "Rs 10,000 + 500", "Flight 0003 - PAK0003"},{"4","Quetta","South","Peshawar", "South", "4 am", "Rs 10,000 + 500", "Flight 0004 - PAK0004"},
			    		{"5","Quetta","North","Karachi", "North", "5 am", "Rs 10,000 + 500", "Flight 0005 - PAK0005"},{"6","Quetta","North","Karachi", "South", "6 am", "Rs 10,000 + 500", "Flight 0006 - PAK0006"},{"7","Quetta","South","Karachi", "North", "7 am", "Rs 10,000 + 500", "Flight 0007 - PAK0007"},{"8","Quetta","South","Karachi", "South", "8 am", "Rs 10,000 + 500", "Flight 0008 - PAK0008"},
			    		{"9","Quetta","South","Islamabad", "South", "9 am", "Rs 10,000 + 500", "Flight 0009 - PAK0009"},{"10","Quetta","South","Islamabad", "North", "10 am", "Rs 10,000 + 500", "Flight 0010 - PAK0010"},{"11","Quetta","North","Islamabad", "South", "11 am", "Rs 10,000 + 500", "Flight 0011 - PAK0011"},{"12","Quetta","North","Islamabad", "North", "12 pm", "Rs 10,000 + 500", "Flight 0012 - PAK0012"},
			    		{"13","Quetta","South","Lahore", "South", "1 pm", "Rs 10,000 + 500", "Flight 0013 - PAK0013"},{"14","Quetta","South","Lahore", "North", "2 pm", "Rs 10,000 + 500", "Flight 0014 - PAK0014"},{"15","Quetta","North","Lahore", "South", "3 am", "Rs 10,000 + 500", "Flight 0015 - PAK0015"},{"16","Quetta","North","Lahore", "North", "4 pm", "Rs 10,000 + 500", "Flight 0016 - PAK0016"},
			                       };    
			    String fieldName[]={"Serial No.","Departure City","Dep City Direction ","Arrival City Name", "Arrival City Direction", "Time","Price (+5% Tax)","Flight Name"};         
			    JTable tableName=new JTable(allData,fieldName);    
			    tableName.setEnabled(false);
			       tableName.setBounds(50,50,300,300);  
			       JScrollPane pane=new JScrollPane(tableName);  
			          frame1.getContentPane().add(pane);          
			             frame1.setSize(500,500);    
			             frame1.setVisible(true);  
			             JOptionPane.showMessageDialog(null,"You can't be able to edit the Schedule.");
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_1.setBounds(36, 103, 169, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Peshawar City Departure");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame1;      
			    frame1=new JFrame();
			     
			    String allData[][]={ {"1","Peshawar","North","Lahore", "North", "1 am", "Rs 10,000 + 500", "Flight 0001 - PAK0001"},{"2","Peshawar","North","Lahore", "South", "2 am", "Rs 10,000 + 500", "Flight 0002 - PAK0002"},{"3","Peshawar","South","Lahore", "North", "3 am", "Rs 10,000 + 500", "Flight 0003 - PAK0003"},{"4","Peshawar","South","Lahore", "South", "4 am", "Rs 10,000 + 500", "Flight 0004 - PAK0004"},
			    		{"5","Peshawar","South","Quetta", "South", "5 am", "Rs 10,000 + 500", "Flight 0005 - PAK0005"},{"6","Peshawar","South","Quetta", "North", "6 am", "Rs 10,000 + 500", "Flight 0006 - PAK0006"},{"7","Peshawar","North","Quetta", "South", "7 am", "Rs 10,000 + 500", "Flight 0007 - PAK0007"},{"8","Peshawar","North","Quetta", "North", "8 am", "Rs 10,000 + 500", "Flight 0008 - PAK0008"},
			    		{"9","Peshawar","South","Karachi", "South", "9 am", "Rs 10,000 + 500", "Flight 0009 - PAK0009"},{"10","Peshawar","South","Karachi", "North", "10 am", "Rs 10,000 + 500", "Flight 00010 - PAK00010"},{"11","Peshawar","North","Karachi", "South", "11 am", "Rs 10,000 + 500", "Flight 00011 - PAK00011"},{"12","Peshawar","North","Karachi", "North", "12 pm", "Rs 10,000 + 500", "Flight 00012 - PAK00012"},
			    		{"13","Peshawar","South","Islamabad", "South", "1 pm", "Rs 10,000 + 500", "Flight 00013 - PAK00013"},{"14","Peshawar","South","Islamabad", "North", "2 pm", "Rs 10,000 + 500", "Flight 00014 - PAK00014"},{"15","Peshawar","North","Islamabad", "South", "3 am", "Rs 10,000 + 500", "Flight 00015 - PAK00015"},{"16","Peshawar","North","Islamabad", "North", "4 pm", "Rs 10,000 + 500", "Flight 00016 - PAK00016"},
			                       };    
			    String fieldName[]={"Serial No.","Departure City","Dep City Direction ","Arrival City Name", "Arrival City Direction", "Time","Price (+5% Tax)","Flight Name"};         
			    JTable tableName=new JTable(allData,fieldName);    
			    tableName.setEnabled(false);
			       tableName.setBounds(50,50,300,300);  
			       JScrollPane pane=new JScrollPane(tableName);  
			          frame1.getContentPane().add(pane);          
			             frame1.setSize(500,500);    
			             frame1.setVisible(true); 
			             JOptionPane.showMessageDialog(null,"You can't be able to edit the Schedule.");
				
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_2.setBounds(36, 130, 169, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Lahore City Departure");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame1;      
			    frame1=new JFrame();
			     
			    String allData[][]={ {"1","Lahore","North","Karachi", "North", "1 am", "Rs 10,000 + 500", "Flight 001 - PAK001"},{"2","Lahore","North","Karachi", "South", "2 am", "Rs 10,000 + 500", "Flight 002 - PAK002"},{"3","Lahore","South","Karachi", "North", "3 am", "Rs 10,000 + 500", "Flight 003 - PAK003"},{"4","Lahore","South","Karachi", "South", "4 am", "Rs 10,000 + 500", "Flight 004 - PAK004"},
			    		{"5","Lahore","North","Quetta", "North", "5 am", "Rs 10,000 + 500", "Flight 005 - PAK005"},{"6","Lahore","North","Quetta", "South", "6 am", "Rs 10,000 + 500", "Flight 006 - PAK006"},{"7","Lahore","South","Quetta", "North", "7 am", "Rs 10,000 + 500", "Flight 007 - PAK007"},{"8","Lahore","South","Quetta", "South", "8 am", "Rs 10,000 + 500", "Flight 008 - PAK008"},
			    		{"9","Lahore","North","Peshawar", "North", "9 am", "Rs 10,000 + 500", "Flight 009 - PAK009"},{"10","Lahore","North","Peshawar", "South", "10 am", "Rs 10,000 + 500", "Flight 010 - PAK010"},{"11","Lahore","South","Peshawar", "South", "11 am", "Rs 10,000 + 500", "Flight 011 - PAK011"},{"12","Lahore","South","Peshawar", "North", "12 pm", "Rs 10,000 + 500", "Flight 012 - PAK012"},
			    		{"13","Lahore","North","Islamabad", "North", "1 pm", "Rs 10,000 + 500", "Flight 013 - PAK013"},{"14","Lahore","North","Islamabad", "South", "2 pm", "Rs 10,000 + 500", "Flight 014 - PAK014"},{"15","Lahore","South","Islamabad", "North", "3 am", "Rs 10,000 + 500", "Flight 015 - PAK015"},{"16","Lahore","South","Islamabad", "South", "4 pm", "Rs 10,000 + 500", "Flight 016 - PAK016"},
			                       };      
			    String fieldName[]={"Serial No.","Departure City","Dep City Direction ","Arrival City Name", "Arrival City Direction", "Time","Price (+5% Tax)","Flight Name"};         
			    JTable tableName=new JTable(allData,fieldName);    
			    tableName.setEnabled(false);
			       tableName.setBounds(50,50,300,300);  
			       JScrollPane pane=new JScrollPane(tableName);  
			          frame1.getContentPane().add(pane);          
			             frame1.setSize(500,500);    
			             frame1.setVisible(true); 
			             JOptionPane.showMessageDialog(null,"You can't be able to edit the Schedule.");
				
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_3.setBounds(36, 157, 169, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Karachi City Departure");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame1;      
			    frame1=new JFrame();
			     
			    String allData[][]={ {"1","Karachi","North","Islamabad", "North", "1 am", "Rs 10,000 + 500", "Flight 00001 - PAK00001"},{"2","Karachi","North","Islamabad", "South", "2 am", "Rs 10,000 + 500", "Flight 00002 - PAK00002"},{"3","Karachi","South","Islamabad", "North", "3 am", "Rs 10,000 + 500", "Flight 00003 - PAK00003"},{"4","Karachi","South","Islamabad", "South", "4 am", "Rs 10,000 + 500", "Flight 00004 - PAK00004"},
			    		{"5","Karachi","North","Peshawar", "North", "5 am", "Rs 10,000 + 500", "Flight 00005 - PAK00005"},{"6","Karachi","North","Peshawar", "South", "6 am", "Rs 10,000 + 500", "Flight 00006 - PAK00006"},{"7","Karachi","South","Peshawar", "North", "7 am", "Rs 10,000 + 500", "Flight 00007 - PAK00007"},{"8","Karachi","South","Peshawar", "South", "8 am", "Rs 10,000 + 500", "Flight 00008 - PAK00008"},
			    		{"9","Karachi","North","Quetta", "North", "9 am", "Rs 10,000 + 500", "Flight 00009 - PAK00009"},{"10","Karachi","North","Quetta", "South", "10 am", "Rs 10,000 + 500", "Flight 000010 - PAK000010"},{"11","Karachi","South","Quetta", "North", "11 am", "Rs 10,000 + 500", "Flight 000011 - PAK000011"},{"12","Karachi","South","Quetta", "South", "12 pm", "Rs 10,000 + 500", "Flight 000012 - PAK000012"},
			    		{"13","Karachi","North","Lahore", "North", "1 pm", "Rs 10,000 + 500", "Flight 000013 - PAK000013"},{"14","Karachi","North","Lahore", "South", "2 pm", "Rs 10,000 + 500", "Flight 000014 - PAK000014"},{"15","Karachi","South","Lahore", "North", "3 am", "Rs 10,000 + 500", "Flight 000015 - PAK000015"},{"16","Karachi","South","Lahore", "South", "4 pm", "Rs 10,000 + 500", "Flight 000016 - PAK000016"},
			                       };       
			    String fieldName[]={"Serial No.","Departure City","Dep City Direction ","Arrival City Name", "Arrival City Direction", "Time","Price (+5% Tax)","Flight Name"};         
			    JTable tableName=new JTable(allData,fieldName);    
			    tableName.setEnabled(false);
			       tableName.setBounds(50,50,300,300);  
			       JScrollPane pane=new JScrollPane(tableName);  
			          frame1.getContentPane().add(pane);          
			             frame1.setSize(500,500);    
			             frame1.setVisible(true);  
			             JOptionPane.showMessageDialog(null,"You can't be able to edit the Schedule.");
				
			}
		});
		btnNewButton_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_3_1.setBounds(36, 184, 169, 23);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_4 = new JButton("Islamabad City Departure");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			     
				JFrame frame1;      
			    frame1=new JFrame();
			     
			    String allData[][]={ {"1","Islamabad","North","England", "5 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"},  {"2","Islamabad","South","England", "7 pm", "Rs 20,000 + 2000", "Flight 018 - PAK018"}, 
			    		 {"3","Islamabad","South","Saudia Arabia", "8 pm", "Rs 20,000 + 2000", "Flight 019 - PAK019"},  {"4","Islamabad","North","Saudia Arabia", "8 pm", "Rs 20,000 + 2000", "Flight 020 - PAK020"}, 
			    		 {"5","Islamabad","South","Quwait", "10 pm", "Rs 20,000 + 2000", "Flight 16 - PAK16"},  {"6","Islamabad","North","Quwait", "11 pm", "Rs 20,000 + 2000", "Flight 17 - PAK17"}, 
			    		 {"7","Islamabad","North","Sudan", "12 am", "Rs 20,000 + 2000", "Flight 18 - PAK18"},  {"8","Islamabad","South","Sudan", "4:30 pm", "Rs 20,000 + 2000", "Flight 19 - PAK19"}, 
			    		 {"9","Islamabad","North","Nepal", "5:30 pm", "Rs 20,000 + 2000", "Flight 20 - PAK20"},  {"10","Islamabad","South","Nepal", "6:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"11","Islamabad","North","Indonesia", "7:30 pm", "Rs 20,000 + 2000", "Flight 23 - PAK23"},  {"12","Islamabad","South","Indonesia", "7:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"}, 
			    		 {"13","Islamabad","North","South Africa", "9:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"},  {"14","Islamabad","South","South Africa", "9:30 pm", "Rs 20,000 + 2000", "Flight 17 - PAK17"}, 
			    		 {"15","Islamabad","North","Afghanistan", "10:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"16","Islamabad","South","Afghanistan", "10:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"17","Islamabad","North","Bahrain", "11:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"18","Islamabad","South","Bahrain", "11:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"19","Islamabad","North","Sweden", "12:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"20","Islamabad","South","Sweden", "12:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"21","Islamabad","North","China", "1:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"22","Islamabad","South","China", "1:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"23","Islamabad","North","Korea", "2:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"24","Islamabad","South","Korea", "2:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"25","Islamabad","North","Russia", "3:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"26","Islamabad","South","Russia", "3:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"27","Islamabad","North","Bangladesh", "4:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"28","Islamabad","South","Bangladesh", "4:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"29","Islamabad","North","Malysia", "5:30 am", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"30","Islamabad","South","Malysia", "5:30 am", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"31","Islamabad","North","UAE", "6:30 am", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"32","Islamabad","South","UAE", "6:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"33","Islamabad","North","North Korea", "7:30 am", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"34","Islamabad","South","North Korea", "7:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"35","Islamabad","North","West Indies", "8:30 am", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"36","Islamabad","South","West Indies", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"37","Islamabad","North","Scotland", "9:30 am", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"38","Islamabad","South","Scotland", "9:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"39","Islamabad","North","Netherland", "10:30 am", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"40","Islamabad","South","Netherland", "10:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 
			                       };       
			    String fieldName[]={"Serial No.","Departure City","Dep City Direction ","Arrival Country Name", "Time","Price (+10% Tax)","Flight Name"};         
			    JTable tableName=new JTable(allData,fieldName);    
			    tableName.setEnabled(false);
			       tableName.setBounds(50,50,300,300);  
			       JScrollPane pane=new JScrollPane(tableName);  
			          frame1.getContentPane().add(pane);          
			             frame1.setSize(500,500);    
			             frame1.setVisible(true);  
			             JOptionPane.showMessageDialog(null,"You can't be able to edit the Schedule.");
				
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_4.setBounds(245, 75, 169, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnBack = new JButton("MAIN MENU");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuofSystem2 frame = new MenuofSystem2();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnBack.setBounds(21, 229, 125, 23);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_1_1 = new JLabel("From Cities to Countries");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(255, 53, 154, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("From Cities to Cities");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(40, 53, 154, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Quetta City Departure");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame1;      
			    frame1=new JFrame();
			     
			    String allData[][]={ {"1","Quetta","North","England", "5 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"2","Quetta","South","England", "7 pm", "Rs 20,000 + 2000", "Flight 018 - PAK018"}, 
			    		 {"3","Quetta","North","Saudia Arabia", "9 pm", "Rs 20,000 + 2000", "Flight 020 - PAK020"},  {"4","Quetta","South","Saudia Arabia", "8 pm", "Rs 20,000 + 2000", "Flight 019 - PAK019"}, 
			    		 {"5","Quetta","North","Quwait", "11 pm", "Rs 20,000 + 2000", "Flight 17 - PAK17"},  {"6","Quetta","South","Quwait", "10 pm", "Rs 20,000 + 2000", "Flight 16 - PAK16"}, 
			    		 {"7","Quetta","North","Sudan", "12 am", "Rs 20,000 + 2000", "Flight 18 - PAK18"},  {"8","Quetta","South","Sudan", "4:30 pm", "Rs 20,000 + 2000", "Flight 19 - PAK19"}, 
			    		 {"9","Quetta","North","Nepal", "5:30 pm", "Rs 20,000 + 2000", "Flight 20 - PAK20"},  {"10","Quetta","South","Nepal", "6:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"11","Quetta","North","Indonesia", "7:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"12","Quetta","South","Indonesia", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"13","Quetta","North","South Africa", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"14","Quetta","South","South Africa", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"15","Quetta","North","Afghanistan", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"16","Quetta","South","Afghanistan", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"17","Quetta","North","Bahrain", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"18","Quetta","South","Bahrain", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"19","Quetta","North","Sweden", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"20","Quetta","South","Sweden", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"21","Quetta","North","China", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"22","Quetta","South","China", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"23","Quetta","North","Korea", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"24","Quetta","South","Korea", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"25","Quetta","North","Russia", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"26","Quetta","South","Russia", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"27","Quetta","North","Bangladesh", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"28","Quetta","South","Bangladesh", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"29","Quetta","North","Malysia", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"30","Quetta","South","Malysia", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"31","Quetta","North","UAE", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"32","Quetta","South","UAE", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"33","Quetta","North","North Korea", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"34","Quetta","South","North Korea", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"35","Quetta","North","West Indies", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"36","Quetta","South","West Indies", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"37","Quetta","North","Scotland", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"38","Quetta","South","Scotland", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"39","Quetta","North","Netherland", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"40","Quetta","South","Netherland", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 
			                       };       
			    String fieldName[]={"Serial No.","Departure City","Dep City Direction ","Arrival Country Name", "Time","Price (+10% Tax)","Flight Name"};         
			    JTable tableName=new JTable(allData,fieldName);    
			    tableName.setEnabled(false);
			       tableName.setBounds(50,50,300,300);  
			       JScrollPane pane=new JScrollPane(tableName);  
			          frame1.getContentPane().add(pane);          
			             frame1.setSize(500,500);    
			             frame1.setVisible(true);  
			             JOptionPane.showMessageDialog(null,"You can't be able to edit the Schedule.");
				
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(245, 103, 169, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Peshawar City Departure");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame1;      
			    frame1=new JFrame();
			     
			    String allData[][]={ {"1","Peshawar","North","England", "5 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"},  {"2","Peshawar","South","England", "7 pm", "Rs 20,000 + 2000", "Flight 018 - PAK018"}, 
			    		 {"3","Peshawar","North","Saudia Arabia", "9 pm", "Rs 20,000 + 2000", "Flight 020 - PAK020"},  {"4","Peshawar","South","Saudia Arabia", "8 pm", "Rs 20,000 + 2000", "Flight 019 - PAK019"}, 
			    		 {"5","Peshawar","North","Quwait", "11 pm", "Rs 20,000 + 2000", "Flight 17 - PAK17"},  {"6","Peshawar","South","Quwait", "10 pm", "Rs 20,000 + 2000", "Flight 16 - PAK16"}, 
			    		 {"7","Peshawar","North","Sudan", "12 am", "Rs 20,000 + 2000", "Flight 18 - PAK18"},  {"8","Peshawar","South","Sudan", "4:30 pm", "Rs 20,000 + 2000", "Flight 19 - PAK19"}, 
			    		 {"9","Peshawar","North","Nepal", "5:30 pm", "Rs 20,000 + 2000", "Flight 20 - PAK20"},  {"10","Peshawar","South","Nepal", "6:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"11","Peshawar","North","Indonesia", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"12","Peshawar","South","Indonesia", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"13","Peshawar","North","South Africa", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"14","Peshawar","South","South Africa", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"15","Peshawar","North","Afghanistan", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"16","Peshawar","South","Afghanistan", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"17","Peshawar","North","Bahrain", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"18","Peshawar","South","Bahrain", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"19","Peshawar","North","Sweden", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"20","Peshawar","South","Sweden", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"21","Peshawar","North","China", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"22","Peshawar","South","China", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"23","Peshawar","North","Korea", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"24","Peshawar","South","Korea", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"25","Peshawar","North","Russia", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"26","Peshawar","South","Russia", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"27","Peshawar","North","Bangladesh", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"28","Peshawar","South","Bangladesh", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"29","Peshawar","North","Malysia", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"30","Peshawar","South","Malysia", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"31","Peshawar","North","UAE", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"32","Peshawar","South","UAE", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"33","Peshawar","North","North Korea", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"34","Peshawar","South","North Korea", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"35","Peshawar","North","West Indies", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"36","Peshawar","South","West Indies", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"37","Peshawar","North","Scotland", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"38","Peshawar","South","Scotland", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"39","Peshawar","North","Netherland", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"40","Peshawar","South","Netherland", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			                       };       
			    String fieldName[]={"Serial No.","Departure City","Dep City Direction ","Arrival Country Name", "Time","Price (+10% Tax)","Flight Name"};         
			    JTable tableName=new JTable(allData,fieldName);    
			    tableName.setEnabled(false);
			       tableName.setBounds(50,50,300,300);  
			       JScrollPane pane=new JScrollPane(tableName);  
			          frame1.getContentPane().add(pane);          
			             frame1.setSize(500,500);    
			             frame1.setVisible(true);  
			             JOptionPane.showMessageDialog(null,"You can't be able to edit the Schedule.");
				
				
			}
		});
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_2_1.setBounds(245, 130, 169, 23);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_2 = new JButton("Lahore City Departure");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame frame1;      
			    frame1=new JFrame();
			     
			    String allData[][]={ {"1","Lahore","North","England", "5 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"},  {"2","Lahore","South","England", "7 pm", "Rs 20,000 + 2000", "Flight 018 - PAK018"}, 
			    		 {"3","Lahore","South","Saudia Arabia", "9 pm", "Rs 20,000 + 2000", "Flight 020 - PAK020"},  {"4","Lahore","North","Saudia Arabia", "8 pm", "Rs 20,000 + 2000", "Flight 019 - PAK019"}, 
			    		 {"5","Lahore","South","Quwait", "10 pm", "Rs 20,000 + 2000", "Flight 16 - PAK16"},  {"6","Lahore","North","Quwait", "11 pm", "Rs 20,000 + 2000", "Flight 17 - PAK17"}, 
			    		 {"7","Lahore","North","Sudan", "4:30 pm", "Rs 20,000 + 2000", "Flight 19 - PAK19"},  {"8","Lahore","South","Sudan", "12 am", "Rs 20,000 + 2000", "Flight 18 - PAK18"}, 
			    		 {"9","Lahore","North","Nepal", "5:30 pm", "Rs 20,000 + 2000", "Flight 20 - PAK20"},  {"10","Lahore","South","Nepal", "6:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"11","Lahore","North","Indonesia", "7:30 pm", "Rs 20,000 + 2000", "Flight 23 - PAK23"},  {"12","Lahore","South","Indonesia", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"}, 
			    		 {"13","Lahore","North","South Africa", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"},  {"14","Lahore","South","South Africa", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"}, 
			    		 {"15","Lahore","North","Afghanistan", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"},  {"16","Lahore","South","Afghanistan", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"}, 
			    		 {"17","Lahore","North","Bahrain", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"},  {"18","Lahore","South","Bahrain", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"}, 
			    		 {"19","Lahore","North","Sweden", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"},  {"20","Lahore","South","Sweden", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"}, 
			    		 {"21","Lahore","North","China", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"},  {"22","Lahore","South","China", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"}, 
			    		 {"23","Lahore","North","Korea", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"},  {"24","Lahore","South","Korea", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"}, 
			    		 {"25","Lahore","North","Russia", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"},  {"26","Lahore","South","Russia", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"}, 
			    		 {"27","Lahore","North","Bangladesh", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"},  {"28","Lahore","South","Bangladesh", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"}, 
			    		 {"29","Lahore","North","Malysia", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"},  {"30","Lahore","South","Malysia", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"}, 
			    		 {"31","Lahore","North","UAE", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"},  {"32","Lahore","South","UAE", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"}, 
			    		 {"33","Lahore","North","North Korea", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"},  {"34","Lahore","South","North Korea", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"}, 
			    		 {"35","Lahore","North","West Indies", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"},  {"36","Lahore","South","West Indies", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"}, 
			    		 {"37","Lahore","North","Scotland", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"},  {"38","Lahore","South","Scotland", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"}, 
			    		 {"39","Lahore","North","Netherland", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"},  {"40","Lahore","South","Netherland", "8:30 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"}, 
			    		 
			                       };       
			    String fieldName[]={"Serial No.","Departure City","Dep City Direction ","Arrival Country Name", "Time","Price (+10% Tax)","Flight Name"};         
			    JTable tableName=new JTable(allData,fieldName);    
			    tableName.setEnabled(false);
			       tableName.setBounds(50,50,300,300);  
			       JScrollPane pane=new JScrollPane(tableName);  
			          frame1.getContentPane().add(pane);          
			             frame1.setSize(500,500);    
			             frame1.setVisible(true);  
			             JOptionPane.showMessageDialog(null,"You can't be able to edit the Schedule.");
				
			}
		});
		btnNewButton_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_3_2.setBounds(245, 157, 169, 23);
		contentPane.add(btnNewButton_3_2);
		
		JButton btnNewButton_3_1_1 = new JButton("Karachi City Departure");
		btnNewButton_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame1;      
			    frame1=new JFrame();
			     
			    String allData[][]={ {"1","Karachi","North","England", "5 pm", "Rs 20,000 + 2000", "Flight 017 - PAK017"},  {"2","Karachi","South","England", "7 pm", "Rs 20,000 + 2000", "Flight 018 - PAK018"}, 
			    		 {"3","Karachi","North","Saudia Arabia", "9 pm", "Rs 20,000 + 2000", "Flight 020 - PAK020"},  {"4","Karachi","South","Saudia Arabia", "8 pm", "Rs 20,000 + 2000", "Flight 019 - PAK019"}, 
			    		 {"5","Karachi","North","Quwait", "11 pm", "Rs 20,000 + 2000", "Flight 17 - PAK17"},  {"6","Karachi","South","Quwait", "10 pm", "Rs 20,000 + 2000", "Flight 16 - PAK16"}, 
			    		 {"7","Karachi","North","Sudan", "12 am", "Rs 20,000 + 2000", "Flight 18 - PAK18"},  {"8","Karachi","South","Sudan", "4:30 pm", "Rs 20,000 + 2000", "Flight 19 - PAK19"}, 
			    		 {"9","Karachi","North","Nepal", "5:30 pm", "Rs 20,000 + 2000", "Flight 20 - PAK20"},  {"10","Karachi","South","Nepal", "6:30 pm", "Rs 20,000 + 2000", "Flight 17 - PAK17"}, 
			    		 {"11","Karachi","North","Indonesia", "7:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"12","Karachi","South","Indonesia", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"13","Karachi","North","South Africa", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"14","Karachi","South","South Africa", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"15","Karachi","North","Afghanistan", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"16","Karachi","South","Afghanistan", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"17","Karachi","North","Bahrain", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"18","Karachi","South","Bahrain", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"19","Karachi","North","Sweden", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"20","Karachi","South","Sweden", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"21","Karachi","North","China", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"22","Karachi","South","China", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"23","Karachi","North","Korea", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"24","Karachi","South","Korea", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"25","Karachi","North","Russia", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"26","Karachi","South","Russia", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"27","Karachi","North","Bangladesh", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"28","Karachi","South","Bangladesh", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"29","Karachi","North","Malysia", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"30","Karachi","South","Malysia", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"31","Karachi","North","UAE", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"32","Karachi","South","UAE", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"33","Karachi","North","North Korea", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"34","Karachi","South","North Korea", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"35","Karachi","North","West Indies", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"36","Karachi","South","West Indies", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"37","Karachi","North","Scotland", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"38","Karachi","South","Scotland", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			    		 {"39","Karachi","North","Netherland", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"},  {"40","Karachi","South","Netherland", "8:30 pm", "Rs 20,000 + 2000", "Flight 0017 - PAK0017"}, 
			                       };       
			    String fieldName[]={"Serial No.","Departure City","Dep City Direction ","Arrival Country Name", "Time","Price (+10% Tax)","Flight Name"};         
			    JTable tableName=new JTable(allData,fieldName);    
			    tableName.setEnabled(false);
			       tableName.setBounds(50,50,300,300);  
			       JScrollPane pane=new JScrollPane(tableName);  
			          frame1.getContentPane().add(pane);          
			             frame1.setSize(500,500);    
			             frame1.setVisible(true);  
			             JOptionPane.showMessageDialog(null,"You can't be able to edit the Schedule.");
				
			}
		});
		btnNewButton_3_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_3_1_1.setBounds(245, 184, 169, 23);
		contentPane.add(btnNewButton_3_1_1);
		
		
	}
}
