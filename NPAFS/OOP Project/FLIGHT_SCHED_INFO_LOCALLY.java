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
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.List;
import javax.swing.JSpinner;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.util.ArrayList;
public class FLIGHT_SCHED_INFO_LOCALLY extends JFrame {

	private JPanel contentPane;
	private JTable table;
	static ArrayList<Booking> list = new ArrayList<Booking>();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FLIGHT_SCHED_INFO_LOCALLY frame = new FLIGHT_SCHED_INFO_LOCALLY();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public FLIGHT_SCHED_INFO_LOCALLY() {
		 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome for Local Travelling");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(86, 0, 265, 30);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VisaLocal frame = new VisaLocal();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(25, 229, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("We are Offering Local Flights in these Cities.");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(25, 41, 243, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("City Offer");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CityInfo2 frame = new CityInfo2();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_1.setBounds(289, 37, 89, 23);
		contentPane.add(btnNewButton_1);
		
		table = new JTable();
		table.setBounds(193, 171, -35, -31);
		contentPane.add(table);
		
		JLabel lblNewLabel_2 = new JLabel("Select City from where you want to Travel  (Dep)?");
		lblNewLabel_2.setFont(new Font("Sitka Banner", Font.ITALIC, 12));
		lblNewLabel_2.setBounds(48, 68, 247, 23);
		contentPane.add(lblNewLabel_2);
		
		JComboBox CB = new JComboBox();
		CB.setModel(new DefaultComboBoxModel(new String[] {"Select City", "Islamabad", "Lahore", "Quetta", "Peshawar", "Karachi"}));
		CB.setToolTipText("Cities\r\n");
		CB.setMaximumRowCount(6);
		CB.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		CB.setBounds(289, 67, 89, 22);
		contentPane.add(CB);
		
		JLabel lblNewLabel_3 = new JLabel("In which type you want to Travel ?");
		lblNewLabel_3.setFont(new Font("Sitka Banner", Font.ITALIC, 12));
		lblNewLabel_3.setBounds(48, 126, 186, 14);
		contentPane.add(lblNewLabel_3);
		
		JRadioButton RB1 = new JRadioButton("Bussiness Class");
		RB1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		RB1.setBounds(215, 124, 99, 19);
		contentPane.add(RB1);
		
		JRadioButton RB2 = new JRadioButton("Economy Class");
		RB2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		RB2.setBounds(320, 124, 99, 19);
		contentPane.add(RB2);
		ButtonGroup btn = new ButtonGroup();
		btn.add(RB1);
		btn.add(RB2);
		
		JLabel LABEL3 = new JLabel("Select Direction of City Airport. (Departure)");
		LABEL3.setFont(new Font("Sitka Banner", Font.ITALIC, 12));
		LABEL3.setBounds(48, 99, 214, 14);
		contentPane.add(LABEL3);
		
		JComboBox CB1 = new JComboBox();
		CB1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		CB1.setModel(new DefaultComboBoxModel(new String[] {"Select", "North", "South"}));
		CB1.setMaximumRowCount(3);
		CB1.setBounds(289, 97, 89, 22);
		contentPane.add(CB1);
		
		JLabel lblNewLabel_4 = new JLabel("Select City where you want to go (Arrival)?");
		lblNewLabel_4.setFont(new Font("Sitka Banner", Font.ITALIC, 12));
		lblNewLabel_4.setBounds(48, 150, 220, 14);
		contentPane.add(lblNewLabel_4);
		
		JComboBox CB2 = new JComboBox();
		CB2.setModel(new DefaultComboBoxModel(new String[] {"Select City", "Islamabad", "Lahore", "Quetta", "Peshawar", "Karachi"}));
		CB2.setToolTipText("Cities\r\n");
		CB2.setMaximumRowCount(6);
		CB2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		CB2.setBounds(289, 147, 89, 22);
		contentPane.add(CB2);
		
		JLabel LABEL3_1 = new JLabel("Select Direction of City Airport. (Arrival)");
		LABEL3_1.setFont(new Font("Sitka Banner", Font.ITALIC, 12));
		LABEL3_1.setBounds(48, 175, 214, 14);
		contentPane.add(LABEL3_1);
		
		JComboBox CB1_1 = new JComboBox();
		CB1_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "North", "South"}));
		CB1_1.setMaximumRowCount(3);
		CB1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		CB1_1.setBounds(289, 171, 89, 22);
		contentPane.add(CB1_1);
		
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
					  else if("Select City".equals(CB2.getSelectedItem())) {
						  JOptionPane.showMessageDialog(null,"Please select Arrival City.");
					  }	  
					  else if("Select".equals(CB1_1.getSelectedItem())) {
						  JOptionPane.showMessageDialog(null,"Please select direction of Arrival City Airport.");
					  }
					  else if(CB2.getSelectedItem() == CB.getSelectedItem()) 
							  {
						  JOptionPane.showMessageDialog(null,"Please select different departure city and Arrival city.");
					  }
					  else {
						  JOptionPane.showMessageDialog(null,"On all Local Flights, you have to Pay 5% Extra Tax(Rs 500) other than Ticket Fee. ");
						  JPanel pan = new JPanel();
						  JFrame frame1 = new JFrame();
							frame1.setVisible(true);
							frame1.getContentPane().add(pan);
							frame1.setSize(500,500);
							
						     if(e.getSource() == btnNewButton_2) {
						    	 Object value = CB.getSelectedItem();
						    	 Object value1 = CB1.getSelectedItem();
						    	 Object value2 = CB2.getSelectedItem();
						    	 Object value3 = CB1_1.getSelectedItem();
						    	 String city1= "Islamabad";
						    	 String city2= "Lahore";
						    	 String city3= "Quetta";
						    	 String city4= "Peshawar";
						    	 String city5= "Karachi";
						    	 String dir1 = "North";
						    	 String dir2 = "South";
						    	//Islamabad North to Lahore North
						    	 if(city1.equals(CB.getSelectedItem()) && 
						    			 city2.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+ "    Seat Number: 4"+"    Price: RS 10000"
								     			+"    Time : 1 am"  + "      Flight 01 - PAK1");
								     	pan.add(label1);
						    	 }
						    	 //Islamabad North to Lahore South
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 city2.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+ "    Seat Number: 6"+ "    Price: RS 10000"
								     			+"    Time : 2 am"  + "      Flight 02 - PAK2");
								     	pan.add(label1);
						    	 }
						    	 //Islamabad South to Lahore North
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 city2.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 9"+"    Price: RS 10000"
								     			+"    Time : 3 am"  + "      Flight 03 - PAK3");
								     	pan.add(label1);
						    	 }
						    	 //Islamabad South to Lahore South
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 city2.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 11"+"    Price: RS 10000"
								     			+"    Time : 4 am"  + "      Flight 04 - PAK4");
								     	pan.add(label1);
						    	 }
						    	 //Islamabad North to Quetta North
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 city3.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 13"+"    Price: RS 10000"
								     			+"    Time : 5 am"  + "      Flight 05 - PAK5");
								     	pan.add(label1);
						    	 }
						    	//Islamabad North to Quetta South
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 city3.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 17"+"    Price: RS 10000"
								     			+"    Time : 6 am"  + "      Flight 06 - PAK6");
								     	pan.add(label1);
						    	 }
						    	 //Islamabad South to Quetta North
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 city3.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 19"+"    Price: RS 10000"
								     			+"    Time : 7 am"  + "      Flight 07 - PAK7");
								     	pan.add(label1);
						    	 }
						    	 //Islamabad South to Quetta South
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 city3.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 2"+"    Price: RS 10000"
								     			+"    Time : 8 am"  + "      Flight 08 - PAK8");
								     	pan.add(label1);
						    	 }
						    	 //Islamabad South to Peshawar North
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 city4.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 1"+"    Price: RS 10000"
								     			+"    Time : 9 am"  + "      Flight 09 - PAK9");
								     	pan.add(label1);
						    	 }
						    	 //Islamabad South to Peshawar South
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 city4.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 7"+"    Price: RS 10000"
								     			+"    Time : 10 am"  + "      Flight 10 - PAK10");
								     	pan.add(label1);
						    	 }
						    	 //Islamabad North to Peshawar North
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 city4.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 20"+"    Price: RS 10000"
								     			+"    Time : 11 am"  + "      Flight 11 - PAK11");
								     	pan.add(label1);
						    	 }
						    	//Islamabad North to Peshawar South
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 city4.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 14"+"    Price: RS 10000"
								     			+"    Time : 12 pm"  + "      Flight 12 - PAK12");
								     	pan.add(label1);
						    	 }
						    	//Islamabad North to Karachi North
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 city5.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 21"+"    Price: RS 10000"
								     			+"    Time : 1 pm"  + "      Flight 13 - PAK13");
								     	pan.add(label1);
						    	 }
						    	//Islamabad North to Karachi South
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 city5.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 27"+"    Price: RS 10000"
								     			+"    Time : 2 pm"  + "      Flight 14 - PAK14");
								     	pan.add(label1);
						    	 }
						    	//Islamabad South to Karachi South
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 city5.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 29"+"    Price: RS 10000"
								     			+"    Time : 3 pm"  + "      Flight 15 - PAK15");
								     	pan.add(label1);
						    	 }
						    	//Islamabad South to Karachi North
						    	 else if(city1.equals(CB.getSelectedItem()) && 
						    			 city5.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 31"+"    Price: RS 10000"
								     			+"    Time : 4 pm"  + "      Flight 16 - PAK16");
								     	pan.add(label1);
						    	 }
						    	//Lahore North to Karachi North
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 city5.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 33"+"    Price: RS 10000"
								     			+"    Time : 1 am"  + "      Flight 001 - PAK001");
								     	pan.add(label1);
						    	 }
						    	//Lahore North to Karachi South
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 city5.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 12"+"    Price: RS 10000"
								     			+"    Time : 2 am"  + "      Flight 002 - PAK002");
								     	pan.add(label1);
						    	 }
						    	//Lahore South to Karachi North
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 city5.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 11"+"    Price: RS 10000"
								     			+"    Time : 3 am"  + "      Flight 003 - PAK003");
								     	pan.add(label1);
						    	 }
						    	//Lahore South to Karachi South
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 city5.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 17"+"    Price: RS 10000"
								     			+"    Time : 4 am"  + "      Flight 004 - PAK004");
								     	pan.add(label1);
						    	 }
						    	//Lahore North to Quetta North
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 city3.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 19"+"    Price: RS 10000"
								     			+"    Time : 5 am"  + "      Flight 005 - PAK005");
								     	pan.add(label1);
						    	 }//Lahore North to Quetta South
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 city3.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 11"+"    Price: RS 10000"
								     			+"    Time : 6 am"  + "      Flight 006 - PAK006");
								     	pan.add(label1);
						    	 }//Lahore South to Quetta North
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 city3.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 23"+"    Price: RS 10000"
								     			+"    Time : 7 am"  + "      Flight 007 - PAK007");
								     	pan.add(label1);
						    	 }
						    	 //Lahore South to Quetta South
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 city3.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 22"+"    Price: RS 10000"
								     			+"    Time : 8 am"  + "      Flight 008 - PAK008");
								     	pan.add(label1);
						    	 }
						    	//Lahore North to Peshawar North
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 city4.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 21"+"    Price: RS 10000"
								     			+"    Time : 9 am"  + "      Flight 009 - PAK009");
								     	pan.add(label1);
						    	 }
						    	 //Lahore North to Peshawar South
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 city4.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 33"+"    Price: RS 10000"
								     			+"    Time : 10 am"  + "      Flight 010 - PAK010");
								     	pan.add(label1);
						    	 }
						    	 //Lahore South to Peshawar South
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 city4.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 34"+"    Price: RS 10000"
								     			+"    Time : 11 am"  + "      Flight 011 - PAK011");
								     	pan.add(label1);
						    	 }
						    	 //Lahore South to Peshawar North
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 city4.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 4"+"    Price: RS 10000"
								     			+"    Time : 12 pm"  + "      Flight 012 - PAK012");
								     	pan.add(label1);
						    	 }
						    	 
						    	//Lahore North to Islamabad North
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 city1.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 22"+"    Price: RS 10000"
								     			+"    Time : 1 pm"  + "      Flight 013 - PAK013");
								     	pan.add(label1);
						    	 }
						    	 //Lahore North to Islamabad South
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 city1.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 23"+"    Price: RS 10000"
								     			+"    Time : 2 pm"  + "      Flight 014 - PAK014");
								     	pan.add(label1);
						    	 }
						    	 //Lahore South to Islamabad North
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 city1.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 9"+"    Price: RS 10000"
								     			+"    Time : 3 pm"  + "      Flight 015 - PAK014");
								     	pan.add(label1);
						    	 }
						    	 //Lahore South to Islamabad South
						    	 else if(city2.equals(CB.getSelectedItem()) && 
						    			 city1.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 33"+"    Price: RS 10000"
								     			+"    Time : 4 pm"  + "      Flight 016 - PAK016");
								     	pan.add(label1);
						    	 }
						    	 
						    	 
						    	 
						    	 
						    	//Quetta North to Peshawar North
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 city4.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 41"+"    Price: RS 10000"
								     			+"    Time : 1 am"  + "      Flight 0001 - PAK0001");
								     	pan.add(label1);
						    	 }
						    	//Quetta North to Peshawar South
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 city4.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 43"+"    Price: RS 10000"
								     			+"    Time : 2 am"  + "      Flight 0002 - PAK0002");
								     	pan.add(label1);
						    	 }
						    	//Quetta South to Peshawar North
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 city4.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 1"+"    Price: RS 10000"
								     			+"    Time : 3 am"  + "      Flight 0003 - PAK0003");
								     	pan.add(label1);
						    	 }
						    	//Quetta South to Peshawar South
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 city4.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 2"+"    Price: RS 10000"
								     			+"    Time : 4 am"  + "      Flight 0004 - PAK0004");
								     	pan.add(label1);
						    	 }
						    	 
						    	//Quetta North to Karachi North
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 city5.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 9"+"    Price: RS 10000"
								     			+"    Time : 5 am"  + "      Flight 0005 - PAK0005");
								     	pan.add(label1);
						    	 }
						    	 //Quetta North to Karachi South
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 city5.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 15"+"    Price: RS 10000"
								     			+"    Time : 6 am"  + "      Flight 0006 - PAK0006");
								     	pan.add(label1);
						    	 }
						    	 //Quetta South to Karachi North
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 city5.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 21"+"    Price: RS 10000"
								     			+"    Time : 7 am"  + "      Flight 0007 - PAK0007");
								     	pan.add(label1);
						    	 }
						    	 //Quetta South to Karachi South
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 city5.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 4"+"    Price: RS 10000"
								     			+"    Time : 8 am"  + "      Flight 0008 - PAK0008");
								     	pan.add(label1);
						    	 }
						    	 
						    	 //Quetta South to Islamabad South
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 city1.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 19"+"    Price: RS 10000"
								     			+"    Time : 9 am"  + "      Flight 0009 - PAK0009");
								     	pan.add(label1);
						    	 }
						    	 //Quetta South to Islamabad North
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 city1.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 9"+"    Price: RS 10000"
								     			+"    Time : 10 am"  + "      Flight 0010 - PAK0010");
								     	pan.add(label1);
						    	 }
						    	 //Quetta North to Islamabad South
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 city1.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 12"+"    Price: RS 10000"
								     			+"    Time : 11 am"  + "      Flight 0011 - PAK0011");
								     	pan.add(label1);
						    	 }
						    	 //Quetta North to Islamabad North
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 city1.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value + "    Seat Number: 33"+"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+ "    Price: RS 10000"
								     			+"    Time : 12 pm"  + "      Flight 0012 - PAK0012");
								     	pan.add(label1);
						    	 }
						    	 
						    	 //Quetta South to Lahore South
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 city2.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value + "    Seat Number: 10"+"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+ "    Price: RS 10000"
								     			+"    Time : 1 pm"  + "      Flight 0013 - PAK0013");
								     	pan.add(label1);
						    	 }
						    	 //Quetta South to Lahore North
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 city2.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 11"+"    Price: RS 10000"
								     			+"    Time : 2 pm"  + "      Flight 0014 - PAK0014");
								     	pan.add(label1);
						    	 }
						    	 //Quetta North to Lahore South
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 city1.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 11"+"    Price: RS 10000"
								     			+"    Time : 3 pm"  + "      Flight 0015 - PAK0015");
								     	pan.add(label1);
						    	 }
						    	 //Quetta North to Lahore North
						    	 else if(city3.equals(CB.getSelectedItem()) && 
						    			 city1.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 37"+"    Price: RS 10000"
								     			+"    Time : 4 pm"  + "      Flight 0016 - PAK0016");
								     	pan.add(label1);
						    	 }
						    	 //Peshawar North to Lahore North
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 city2.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 32"+"    Price: RS 10000"
								     			+"    Time : 1 am"  + "      Flight 0001 - PAK0001");
								     	pan.add(label1);
						    	 }
						    	 //Peshawar North to Lahore South
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 city2.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 19"+"    Price: RS 10000"
								     			+"    Time : 2 am"  + "      Flight 0002 - PAK0002");
								     	pan.add(label1);
						    	 }
						    	 //Peshawar South to Lahore North
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 city2.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 2"+"    Price: RS 10000"
								     			+"    Time : 3 am"  + "      Flight 0003 - PAK0003");
								     	pan.add(label1);
						    	 }
						    	 //Peshawar South to Lahore South
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 city2.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 34"+"    Price: RS 10000"
								     			+"    Time : 4 am"  + "      Flight 0004 - PAK0004");
								     	pan.add(label1);
						    	 }
						    	 
						    	//Peshawar South to Quetta South
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 city3.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 9"+"    Price: RS 10000"
								     			+"    Time : 5 am"  + "      Flight 0005 - PAK0005");
								     	pan.add(label1);
						    	 }
						    	//Peshawar South to Quetta North
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 city3.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 10"+"    Price: RS 10000"
								     			+"    Time : 6 am"  + "      Flight 0006 - PAK0006");
								     	pan.add(label1);
						    	 }
						    	//Peshawar North to Quetta South
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 city3.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 10"+"    Price: RS 10000"
								     			+"    Time : 7 am"  + "      Flight 0007 - PAK0007");
								     	pan.add(label1);
						    	 }
						    	//Peshawar North to Quetta North
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 city3.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 17"+"    Price: RS 10000"
								     			+"    Time : 8 am"  + "      Flight 0008 - PAK0008");
								     	pan.add(label1);
						    	 }
						    	 
						    	//Peshawar South to Karachi South
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 city5.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 38"+"    Price: RS 10000"
								     			+"    Time : 9 am"  + "      Flight 0009 - PAK0009");
								     	pan.add(label1);
						    	 }
						    	//Peshawar South to Karachi North
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 city5.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 39"+"    Price: RS 10000"
								     			+"    Time : 10 am"  + "      Flight 00010 - PAK00010");
								     	pan.add(label1);
						    	 }
						    	//Peshawar North to Karachi South
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 city5.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 32"+"    Price: RS 10000"
								     			+"    Time : 11 am"  + "      Flight 00011 - PAK00011");
								     	pan.add(label1);
						    	 }
						    	//Peshawar North to Karachi North
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 city5.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 29"+"    Price: RS 10000"
								     			+"    Time : 12 pm"  + "      Flight 00012 - PAK00012");
								     	pan.add(label1);
						    	 }
						    	 
						    	//Peshawar South to Islamabad South
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 city1.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 42"+"    Price: RS 10000"
								     			+"    Time : 1 pm"  + "      Flight 00013 - PAK00013");
								     	pan.add(label1);
						    	 }
						    	//Peshawar South to Islamabad North
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 city1.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 49"+"    Price: RS 10000"
								     			+"    Time : 2 pm"  + "      Flight 00014 - PAK00014");
								     	pan.add(label1);
						    	 }
						    	//Peshawar North to Islamabad South
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 city1.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 45"+"    Price: RS 10000"
								     			+"    Time : 3 pm"  + "      Flight 00015 - PAK00015");
								     	pan.add(label1);
						    	 }
						    	//Peshawar North to Islamabad North
						    	 else if(city4.equals(CB.getSelectedItem()) && 
						    			 city1.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 47"+"    Price: RS 10000"
								     			+"    Time : 4 pm"  + "      Flight 00016 - PAK00016");
								     	pan.add(label1);
						    	 }
						    	 
						    	 
						    	//Karachi North to Islamabad North
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 city1.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 23"+"    Price: RS 10000"
								     			+"    Time : 1 am"  + "      Flight 00001 - PAK00001");
								     	pan.add(label1);
						    	 }
						    	//Karachi North to Islamabad South
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 city1.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 26"+"    Price: RS 10000"
								     			+"    Time : 2 am"  + "      Flight 00002 - PAK00002");
								     	pan.add(label1);
						    	 }
						    	//Karachi South to Islamabad North
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 city1.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 21"+"    Price: RS 10000"
								     			+"    Time : 3 am"  + "      Flight 00003 - PAK00003");
								     	pan.add(label1);
						    	 }
						    	//Karachi South to Islamabad South
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 city1.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 29"+"    Price: RS 10000"
								     			+"    Time : 4 am"  + "      Flight 00004 - PAK00004");
								     	pan.add(label1);
						    	 }
						    	 
						    	 
						    	//Karachi North to Peshawar North
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 city4.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 21"+"    Price: RS 10000"
								     			+"    Time : 5 am"  + "      Flight 00005 - PAK00005");
								     	pan.add(label1);
						    	 }
						    	//Karachi North to Peshawar South
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 city4.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 43"+"    Price: RS 10000"
								     			+"    Time : 6 am"  + "      Flight 00006 - PAK00006");
								     	pan.add(label1);
						    	 }
						    	//Karachi South to Peshawar North
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 city4.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 1"+"    Price: RS 10000"
								     			+"    Time : 7 am"  + "      Flight 00007 - PAK00007");
								     	pan.add(label1);
						    	 }
						    	//Karachi South to Peshawar South
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 city4.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 5"+"    Price: RS 10000"
								     			+"    Time : 8 am"  + "      Flight 00008 - PAK00008");
								     	pan.add(label1);
						    	 }
						    	 
						    	//Karachi North to Quetta North
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 city3.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 23"+"    Price: RS 10000"
								     			+"    Time : 9 am"  + "      Flight 00009 - PAK00009");
								     	pan.add(label1);
						    	 }
						    	//Karachi North to Quetta South
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 city3.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 34"+"    Price: RS 10000"
								     			+"    Time : 10 am"  + "      Flight 000010 - PAK000010");
								     	pan.add(label1);
						    	 }
						    	//Karachi South to Quetta North
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 city3.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 42"+"    Price: RS 10000"
								     			+"    Time : 11 am"  + "      Flight 000011 - PAK000011");
								     	pan.add(label1);
						    	 }
						    	//Karachi South to Quetta South
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 city3.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 22"+"    Price: RS 10000"
								     			+"    Time : 12 pm"  + "      Flight 000012 - PAK000012");
								     	pan.add(label1);
						    	 }
						    	 
						    	//Karachi North to Lahore North
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 city2.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 19"+"    Price: RS 10000"
								     			+"    Time : 1 pm"  + "      Flight 000013 - PAK000013");
								     	pan.add(label1);
						    	 }
						    	//Karachi North to Lahore South
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 city2.equals(CB2.getSelectedItem())
						    			 && dir1.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 25"+"    Price: RS 10000"
								     			+"    Time : 2 pm"  + "      Flight 000014 - PAK000014");
								     	pan.add(label1);
						    	 }
						    	//Karachi South to Lahore North
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 city2.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir1.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 27"+"    Price: RS 10000"
								     			+"    Time : 3 pm"  + "      Flight 000015 - PAK000015");
								     	pan.add(label1);
						    	 }
						    	//Karachi South to Lahore South
						    	 else if(city5.equals(CB.getSelectedItem()) && 
						    			 city2.equals(CB2.getSelectedItem())
						    			 && dir2.equals(CB1.getSelectedItem()) &&  dir2.equals(CB1_1.getSelectedItem())) {
						    		 JLabel label1=new JLabel("Departure City Name: " +value +"     Direction(Dep) : " +value1+ 
								     			"     Arrival City : " +value2+ "      Direction Arrival : " +value3+  "    Seat Number: 12"+"    Price: RS 10000"
								     			+"    Time : 4 pm"  + "      Flight 000016 - PAK000016");
								     	pan.add(label1);
						    	 }
						    	 
						   
						     }
					  }
				}
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_2.setBounds(179, 211, 135, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("PAYMENT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConfirmBOOK frame = new ConfirmBOOK();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_3.setBounds(320, 229, 106, 23);
		contentPane.add(btnNewButton_3);
	}
}
