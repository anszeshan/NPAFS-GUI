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
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FLIGHT_SCHEDULE_INFO extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FLIGHT_SCHEDULE_INFO frame = new FLIGHT_SCHEDULE_INFO();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FLIGHT_SCHEDULE_INFO() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Flight Schedule of NPAFS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(56, 21, 334, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("We are Offering International Flights in these Countries.");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(37, 66, 277, 24);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Countries");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CountriesNameOFFER frame = new CountriesNameOFFER();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(324, 67, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Select City from where you want to Travel  (Dep)?");
		lblNewLabel_2.setFont(new Font("Sitka Banner", Font.ITALIC, 12));
		lblNewLabel_2.setBounds(56, 95, 258, 23);
		contentPane.add(lblNewLabel_2);
		
		JComboBox CB = new JComboBox();
		CB.setModel(new DefaultComboBoxModel(new String[] {"Select City", "Islamabad", "Lahore", "Quetta", "Peshawar", "Karachi"}));
		CB.setToolTipText("Cities\r\n");
		CB.setMaximumRowCount(6);
		CB.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		CB.setBounds(324, 93, 89, 22);
		contentPane.add(CB);
		
		JLabel LABEL3 = new JLabel("Select Direction of City Airport. (Departure)");
		LABEL3.setFont(new Font("Sitka Banner", Font.ITALIC, 12));
		LABEL3.setBounds(56, 122, 214, 14);
		contentPane.add(LABEL3);
		
		JComboBox CB1 = new JComboBox();
		CB1.setModel(new DefaultComboBoxModel(new String[] {"Select", "North", "South"}));
		CB1.setMaximumRowCount(3);
		CB1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		CB1.setBounds(324, 120, 89, 22);
		contentPane.add(CB1);
		
		JLabel lblNewLabel_3 = new JLabel("In which type you want to Travel ?");
		lblNewLabel_3.setFont(new Font("Sitka Banner", Font.ITALIC, 12));
		lblNewLabel_3.setBounds(56, 152, 186, 14);
		contentPane.add(lblNewLabel_3);
		
		JRadioButton RB1 = new JRadioButton("Bussiness Class");
		RB1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		RB1.setBounds(232, 149, 99, 19);
		contentPane.add(RB1);
		
		JRadioButton RB2 = new JRadioButton("Economy Class");
		RB2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		RB2.setBounds(334, 149, 99, 19);
		contentPane.add(RB2);
		ButtonGroup btn = new ButtonGroup();
		btn.add(RB1);
		btn.add(RB2);
		JLabel lblNewLabel_4 = new JLabel("Select Country where you want to go (Arrival)?");
		lblNewLabel_4.setFont(new Font("Sitka Banner", Font.ITALIC, 12));
		lblNewLabel_4.setBounds(56, 180, 220, 14);
		contentPane.add(lblNewLabel_4);
		
		JComboBox CB2 = new JComboBox();
		CB2.setModel(new DefaultComboBoxModel(new String[] {"Select Country", "England", "Saudia Arabia", 
				"Quwait", "Sudan", "Nepal", "Indonesia", "South Africa", "India", "Iran", "Afgahnistan",
				"Bahrain", "China", "Korea", "Russia", "Bangladesh", "America", "Sweden", "Australia",
				"Malaysia", "UAE", "North Korea", "West Indies", "Scotland", "Netherland", "NewZealand"}));
		CB2.setToolTipText("Cities\r\n");
		CB2.setMaximumRowCount(26);
		CB2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		CB2.setBounds(324, 174, 102, 22);
		contentPane.add(CB2);
		
		JButton btnNewButton_2 = new JButton("Flight Information");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton_2) {
					if("Select City".equals(CB.getSelectedItem())) {
						  JOptionPane.showMessageDialog(null,"PLease Select Departure City.");
					  }
					 else if("Select".equals(CB1.getSelectedItem())) {
						  JOptionPane.showMessageDialog(null,"Please select direction of Departure City Airport.");
					  }
					 else if(!(RB1.isSelected() || RB2.isSelected())) {
						  JOptionPane.showMessageDialog(null,"Please Select Your Class of Travel.");
					  }
					  else if("Select Country".equals(CB2.getSelectedItem())) {
						  JOptionPane.showMessageDialog(null,"Please select Arrival Country.");
					  }
					  else if("India".equals(CB2.getSelectedItem())) {
						  JOptionPane.showMessageDialog(null,"India has banned travelling from Pakistan due to Corona Virus.");
					  }
					  else if("NewZealand".equals(CB2.getSelectedItem())) {
						  JOptionPane.showMessageDialog(null,"NewZealand has banned travelling from Pakistan due to Corona Virus.");
					  }
					  else if("Iran".equals(CB2.getSelectedItem())) {
						  JOptionPane.showMessageDialog(null,"Iran has banned travelling from Pakistan due to Corona Virus.");
					  }
					  else if("Australia".equals(CB2.getSelectedItem())) {
						  JOptionPane.showMessageDialog(null,"Australia has banned travelling from Pakistan due to Corona Virus.");
					  }
					  else if("America".equals(CB2.getSelectedItem())) {
						  JOptionPane.showMessageDialog(null,"America has banned travelling from Pakistan due to Corona Virus.");
					  }
					  else if(CB2.getSelectedItem() == CB.getSelectedItem()) 
							  {
						  JOptionPane.showMessageDialog(null,"Please select different departure city and Arrival city.");
					  }
					  else {
						  JOptionPane.showMessageDialog(null,"On all International Flights, you have to Pay 10% Extra Tax(Rs 2000) other than Ticket Fee. ");
						  JPanel panel11 = new JPanel();
						  JFrame frame1 = new JFrame();
							frame1.setVisible(true);
							frame1.getContentPane().add(panel11);
							frame1.setSize(500,500);
							
						     if(e.getSource() == btnNewButton_2) {
						    	 Object value1 = CB.getSelectedItem();  //for cities departure
						    	 Object value2 = CB1.getSelectedItem();    //for dep direction
						    	 Object value3 = CB2.getSelectedItem();      //for countries
						    	 String city1= "Islamabad";
						    	 String city2= "Lahore";
						    	 String city3= "Quetta";
						    	 String city4= "Peshawar";
						    	 String city5= "Karachi";
						    	 String dir1 = "North";
						    	 String dir2 = "South";
						    	 String c1 = "England"; String c2 = "Saudia Arabia"; String c3 = "Quwait"; String c4 = "Sudan";String c5 = "Nepal";
						    	 String c6 = "Indonesia";String c7 = "South Africa";String c8 = "Afgahnistan";String c9 = "Bahrain";String c10 = "Sweden";
						    	 String c11 = "China";String c12 = "Korea";String c13 = "Russia";String c14 = "Bangladesh";String c15 = "Malaysia";
						    	 String c16 = "UAE";String c17 = "North Korea";String c18 = "West Indies";String c19 = "Scotland";String c20 = "Netherland";
						    	//Islamabad North to England
						    	 if(city1.equals(CB.getSelectedItem()) && 
						    			 c1.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Price: RS 20000"
								     			+"    Time : 5 pm"  + "      Flight 017 - PAK017");
								     	panel11.add(label1);
						    	 }
						    	//Islamabad South to England
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c1.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 4"+"    Price: RS 20000"
								     			+"    Time : 7 pm"  + "      Flight 018 - PAK018");
								     	panel11.add(label1);
						    	 }
						    	//Islamabad South to Saudia Arabia
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c2.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 11"+"    Price: RS 20000"
								     			+"    Time : 8 pm"  + "      Flight 019 - PAK019");
								     	panel11.add(label1);
						    	 }
						    	//Islamabad North to Saudia Arabia
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c2.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 33"+"    Price: RS 20000"
								     			+"    Time : 9 pm"  + "      Flight 020 - PAK020");
								     	panel11.add(label1);
						    	 }
						    	//Islamabad South to Quwait
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c3.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 1"+ "    Price: RS 20000"
								     			+"    Time : 10 pm"  + "      Flight 16 - PAK16");
								     	panel11.add(label1);
						    	 }
						    	//Islamabad North to Quwait
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c3.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 29"+"    Price: RS 20000"
								     			+"    Time : 11 pm"  + "      Flight 17 - PAK17");
								     	panel11.add(label1);
						    	 }
						    	//Islamabad North to Sudan
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c4.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 12"+"    Price: RS 20000"
								     			+"    Time : 12 am"  + "      Flight 18 - PAK18");
								     	panel11.add(label1);
						    	 }
						    	//Islamabad South to Sudan
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c4.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 21"+"    Price: RS 20000"
								     			+"    Time : 4:30 pm"  + "      Flight 19 - PAK19");
								     	panel11.add(label1);
						    	 }
						    	//Islamabad North to Nepal
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c5.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 25"+"    Price: RS 20000"
								     			+"    Time : 5:30 pm"  + "      Flight 20 - PAK20");
								     	panel11.add(label1);
						    	 }
						    	//Islamabad South to Nepal
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c5.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 29"+"    Price: RS 20000"
								     			+"    Time : 6:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	//Islamabad North to Indonesia
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c6.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 20"+"    Price: RS 20000"
								     			+"    Time : 7:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	//Islamabad South to Indonesia
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c6.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 2"+"    Price: RS 20000"
								     			+"    Time : 7:30 pm"  + "      Flight 017 - PAK017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c7.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 10"+"    Price: RS 20000"
								     			+"    Time : 7:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c7.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 10"+ "    Price: RS 20000"
								     			+"    Time : 9:30 pm"  + "      Flight 017 - PAK017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c8.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 17"+"    Price: RS 20000"
								     			+"    Time : 9:30 pm"  + "      Flight 17 - PAK17");
								     	panel11.add(label1);
						    	 }
						    	 
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c9.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 21"+"    Price: RS 20000"
								     			+"    Time : 10:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c9.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 33"+ "    Price: RS 20000"
								     			+"    Time : 10:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c10.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 34"+"    Price: RS 20000"
								     			+"    Time : 11:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c10.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 37"+"    Price: RS 20000"
								     			+"    Time : 11:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c11.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 29"+ "    Price: RS 20000"
								     			+"    Time : 12:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c11.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 20"+"    Price: RS 20000"
								     			+"    Time : 12:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c12.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 39"+"    Price: RS 20000"
								     			+"    Time : 1:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c12.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 45"+ "    Price: RS 20000"
								     			+"    Time : 1:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c13.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 29"+"    Price: RS 20000"
								     			+"    Time : 2:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c13.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 28"+ "    Price: RS 20000"
								     			+"    Time : 2:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c14.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 35"+"    Price: RS 20000"
								     			+"    Time : 3:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c14.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 8"+ "    Price: RS 20000"
								     			+"    Time : 3:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c15.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 23"+ "    Price: RS 20000"
								     			+"    Time : 5:30 am"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c15.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 23"+"    Price: RS 20000"
								     			+"    Time : 5:30 am"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c16.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 21"+"    Price: RS 20000"
								     			+"    Time : 6:30 am"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c16.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 9"+ "    Price: RS 20000"
								     			+"    Time : 6:30 am"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c17.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 12"+"    Price: RS 20000"
								     			+"    Time : 7:30 am"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c17.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 11"+"    Price: RS 20000"
								     			+"    Time : 7:30 am"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c18.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 19"+"    Price: RS 20000"
								     			+"    Time : 8:30 am"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c18.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 22"+"    Price: RS 20000"
								     			+"    Time : 8:30 am"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c19.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 28"+"    Price: RS 20000"
								     			+"    Time : 9:30 am"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c19.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 29"+"    Price: RS 20000"
								     			+"    Time : 9:30 am"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c20.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 34"+ "    Price: RS 20000"
								     			+"    Time : 10:30 am"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 c20.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 29"+"    Price: RS 20000"
								     			+"    Time : 10:30 am"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }			    	 
			//Lahore to Every Country			    	 
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c1.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 10"+"    Price: RS 20000"
								     			+"    Time : 5 pm"  + "      Flight 017 - PAK017");
								     	panel11.add(label1);
						    	 }
						    	
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c1.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 10"+"    Price: RS 20000"
								     			+"    Time : 7 pm"  + "      Flight 018 - PAK018");
								     	panel11.add(label1);
						    	 }
						    	
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c2.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 22"+"    Price: RS 20000"
								     			+"    Time : 8 pm"  + "      Flight 019 - PAK019");
								     	panel11.add(label1);
						    	 }
						    
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c2.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 39"+"    Price: RS 20000"
								     			+"    Time : 9 pm"  + "      Flight 020 - PAK020");
								     	panel11.add(label1);
						    	 }
						    	
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c3.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 22"+"    Price: RS 20000"
								     			+"    Time : 10 pm"  + "      Flight 16 - PAK16");
								     	panel11.add(label1);
						    	 }
						    	//Lahore North to Quwait
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c3.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 23"+ "    Price: RS 20000"
								     			+"    Time : 11 pm"  + "      Flight 17 - PAK17");
								     	panel11.add(label1);
						    	 }
						    	//Lahore North to Sudan
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c4.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 9"+ "    Price: RS 20000"
								     			+"    Time : 12 am"  + "      Flight 18 - PAK18");
								     	panel11.add(label1);
						    	 }
						    	//Lahore South to Sudan
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c4.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 4"+ "    Price: RS 20000"
								     			+"    Time : 4:30 pm"  + "      Flight 19 - PAK19");
								     	panel11.add(label1);
						    	 }
						    	//Lahore North to Nepal
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c5.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 22"+"    Price: RS 20000"
								     			+"    Time : 5:30 pm"  + "      Flight 20 - PAK20");
								     	panel11.add(label1);
						    	 }
						    	//Lahore South to Nepal
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c5.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 1"+ "    Price: RS 20000"
								     			+"    Time : 6:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	//Lahore North to Indonesia
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c6.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 2"+ "    Price: RS 20000"
								     			+"    Time : 7:30 pm"  + "      Flight 23 - PAK23");
								     	panel11.add(label1);
						    	 }
						    	//Lahore South to Indonesia
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c6.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 4"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 017 - PAK017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c7.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 01"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c7.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 09"+"    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c8.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 04"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c9.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 19"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c9.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 29"+"    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c10.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 22"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c10.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 2"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c11.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 11"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c11.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 10"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c12.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 29"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c12.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 21"+"    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c13.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 25"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c13.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 4"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c14.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 1"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c14.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 9"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c15.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 13"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c15.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 15"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c16.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 17"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c16.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 19"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c17.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 19"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c17.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 21"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c18.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 23"+"    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c18.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 25"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c19.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 27"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c19.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 29"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c20.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 9"+"    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 c20.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 12"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }	 
						    	 
						//From Quetta to Every Country    	 
						    	 
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c1.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 12"+ "    Price: RS 20000"
								     			+"    Time : 5 pm"  + "      Flight 017 - PAK017");
								     	panel11.add(label1);
						    	 }
						    	
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c1.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 22"+ "    Price: RS 20000"
								     			+"    Time : 7 pm"  + "      Flight 018 - PAK018");
								     	panel11.add(label1);
						    	 }
						    	
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c2.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 2"+ "    Price: RS 20000"
								     			+"    Time : 8 pm"  + "      Flight 019 - PAK019");
								     	panel11.add(label1);
						    	 }
						    
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c2.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 3"+"    Price: RS 20000"
								     			+"    Time : 9 pm"  + "      Flight 020 - PAK020");
								     	panel11.add(label1);
						    	 }
						    	
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c3.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 19"+ "    Price: RS 20000"
								     			+"    Time : 10 pm"  + "      Flight 16 - PAK16");
								     	panel11.add(label1);
						    	 }
						    	//Quetta North to Quwait
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c3.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 29"+"    Price: RS 20000"
								     			+"    Time : 11 pm"  + "      Flight 17 - PAK17");
								     	panel11.add(label1);
						    	 }
						    	//Quetta North to Sudan
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c4.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 20"+"    Price: RS 20000"
								     			+"    Time : 12 am"  + "      Flight 18 - PAK18");
								     	panel11.add(label1);
						    	 }
						    	//Quetta South to Sudan
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c4.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 23"+ "    Price: RS 20000"
								     			+"    Time : 4:30 pm"  + "      Flight 19 - PAK19");
								     	panel11.add(label1);
						    	 }
						    	//Quetta North to Nepal
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c5.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 40"+ "    Price: RS 20000"
								     			+"    Time : 5:30 pm"  + "      Flight 20 - PAK20");
								     	panel11.add(label1);
						    	 }
						    	//Quetta South to Nepal
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c5.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 22"+ "    Price: RS 20000"
								     			+"    Time : 6:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	//Quetta North to Indonesia
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c6.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 8"+ "    Price: RS 20000"
								     			+"    Time : 7:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	           //Quetta South to Indonesia
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c6.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 9"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c7.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 1"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c7.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 4"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c8.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 7"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c9.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 01"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c9.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 3"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c10.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 8"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c10.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 8"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c11.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 2"+"    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c11.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 15"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c12.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 9"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c12.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 23"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c13.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 10"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c13.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 6"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c14.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 13"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c14.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 10"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c15.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 3"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c15.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 09"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c16.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 24"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c16.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 09"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c17.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 3"+"    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c17.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 23"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c18.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 28"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c18.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 29"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c19.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 4"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c19.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 14"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c20.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 40"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 c20.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 43"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 					    	 
						//From Peshawar to Every Country    	 
						    	 
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c1.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 9"+ "    Price: RS 20000"
								     			+"    Time : 5 pm"  + "      Flight 017 - PAK017");
								     	panel11.add(label1);
						    	 }
						    	
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c1.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 10"+ "    Price: RS 20000"
								     			+"    Time : 7 pm"  + "      Flight 018 - PAK018");
								     	panel11.add(label1);
						    	 }
						    	
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c2.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 19"+ "    Price: RS 20000"
								     			+"    Time : 8 pm"  + "      Flight 019 - PAK019");
								     	panel11.add(label1);
						    	 }
						    
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c2.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 12"+ "    Price: RS 20000"
								     			+"    Time : 9 pm"  + "      Flight 020 - PAK020");
								     	panel11.add(label1);
						    	 }
						    	
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c3.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 17"+ "    Price: RS 20000"
								     			+"    Time : 10 pm"  + "      Flight 16 - PAK16");
								     	panel11.add(label1);
						    	 }
						    	//Peshawar North to Quwait
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c3.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 10"+ "    Price: RS 20000"
								     			+"    Time : 11 pm"  + "      Flight 17 - PAK17");
								     	panel11.add(label1);
						    	 }
						    	//Peshawar North to Sudan
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c4.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 12"+ "    Price: RS 20000"
								     			+"    Time : 12 am"  + "      Flight 18 - PAK18");
								     	panel11.add(label1);
						    	 }
						    	//Peshawar South to Sudan
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c4.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 14"+ "    Price: RS 20000"
								     			+"    Time : 4:30 pm"  + "      Flight 19 - PAK19");
								     	panel11.add(label1);
						    	 }
						    	//Peshawar North to Nepal
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c5.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 19"+ "    Price: RS 20000"
								     			+"    Time : 5:30 pm"  + "      Flight 20 - PAK20");
								     	panel11.add(label1);
						    	 }
						    	//Peshawar South to Nepal
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c5.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 21"+ "    Price: RS 20000"
								     			+"    Time : 6:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	//Peshawar North to Indonesia
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c6.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 23"+ "    Price: RS 20000"
								     			+"    Time : 7:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	//Peshawar South to Indonesia
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c6.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 27"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c7.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 4"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c7.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 20"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c8.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 4"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c9.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 13"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c9.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 12"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c10.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 23"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c10.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 8"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c11.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 34"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c11.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 4"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c12.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 9"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c12.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 12"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c13.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 4"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c13.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 13"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c14.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 31"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c14.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 33"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c15.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 37"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c15.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 39"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c16.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 41"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c16.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 44"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c17.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 45"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c17.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 4"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c18.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 9"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c18.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 41"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c19.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 4"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c19.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 34"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c20.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 3"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 c20.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 6"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }    	 
						//From Karachi to Every Country    	 
						    	 
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c1.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 34"+ "    Price: RS 20000"
								     			+"    Time : 5 pm"  + "      Flight 017 - PAK017");
								     	panel11.add(label1);
						    	 }
						    	
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c1.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 22"+ "    Price: RS 20000"
								     			+"    Time : 7 pm"  + "      Flight 018 - PAK018");
								     	panel11.add(label1);
						    	 }
						    	
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c2.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 4"+ "    Price: RS 20000"
								     			+"    Time : 8 pm"  + "      Flight 019 - PAK019");
								     	panel11.add(label1);
						    	 }
						    
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c2.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 31"+ "    Price: RS 20000"
								     			+"    Time : 9 pm"  + "      Flight 020 - PAK020");
								     	panel11.add(label1);
						    	 }
						    	
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c3.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 3"+ "    Price: RS 20000"
								     			+"    Time : 10 pm"  + "      Flight 16 - PAK16");
								     	panel11.add(label1);
						    	 }
						    	//Karachi North to Quwait
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c3.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 10"+ "    Price: RS 20000"
								     			+"    Time : 11 pm"  + "      Flight 17 - PAK17");
								     	panel11.add(label1);
						    	 }
						    	//Karachi North to Sudan
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c4.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 4"+ "    Price: RS 20000"
								     			+"    Time : 12 am"  + "      Flight 18 - PAK18");
								     	panel11.add(label1);
						    	 }
						    	//Karachi South to Sudan
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c4.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 19"+ "    Price: RS 20000"
								     			+"    Time : 4:30 pm"  + "      Flight 19 - PAK19");
								     	panel11.add(label1);
						    	 }
						    	//Karachi North to Nepal
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c5.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 12"+ "    Price: RS 20000"
								     			+"    Time : 5:30 pm"  + "      Flight 20 - PAK20");
								     	panel11.add(label1);
						    	 }
						    	//Karachi South to Nepal
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c5.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 10"+ "    Price: RS 20000"
								     			+"    Time : 6:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	//Karachi North to Indonesia
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c6.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 16"+ "    Price: RS 20000"
								     			+"    Time : 7:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	//Karachi South to Indonesia
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c6.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 19"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c7.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 12"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c7.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 18"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c8.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 10"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c9.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 12"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c9.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 46"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c10.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 4"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c10.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 12"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c11.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 2"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c11.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 4"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c12.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 6"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c12.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 8"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c13.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 10"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c13.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 12"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c14.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 14"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c14.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 16"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c15.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 19"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c15.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 13"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c16.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+   "    Seat Number: 19"+"    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c16.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 18"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c17.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 13"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c17.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 6"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c18.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 5"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c18.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 10"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c19.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 9"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c19.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 3"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c20.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 45"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 c20.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value1 +"     Direction(Dep) : " +value2+ 
								     			"     Arrival City : " +value3+  "    Seat Number: 49"+ "    Price: RS 20000"
								     			+"    Time : 8:30 pm"  + "      Flight 0017 - PAK0017");
								     	panel11.add(label1);
						    	 }
						     }
					  }
				}
				
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_2.setBounds(164, 214, 135, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VisaInternational frame = new VisaInternational();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setBounds(22, 229, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("PAYMENT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConfirmBOOK frame = new ConfirmBOOK();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_3.setBounds(324, 229, 99, 23);
		contentPane.add(btnNewButton_3);
	}

}
