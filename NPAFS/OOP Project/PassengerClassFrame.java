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

public class PassengerClassFrame extends JFrame {

	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassengerClassFrame frame2 = new PassengerClassFrame();
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PassengerClassFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LabelPassenger = new JLabel("Passenger Information");
		LabelPassenger.setHorizontalAlignment(SwingConstants.CENTER);
		LabelPassenger.setFont(new Font("Times New Roman", Font.BOLD, 18));
		LabelPassenger.setBounds(117, 22, 200, 27);
		contentPane.add(LabelPassenger);
		
		JLabel LabelPassenger2 = new JLabel("Do you Have a Valid Passport ? ");
		LabelPassenger2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		LabelPassenger2.setHorizontalAlignment(SwingConstants.CENTER);
		LabelPassenger2.setBounds(100, 78, 234, 27);
		contentPane.add(LabelPassenger2);
		
		JButton ButtonPassenger = new JButton("Yes");
		ButtonPassenger.setFont(new Font("Times New Roman", Font.BOLD, 12));
		ButtonPassenger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				YesPassengerNext frame = new YesPassengerNext();
				frame.setVisible(true);	
				dispose();
			}
		});
		ButtonPassenger.setBounds(173, 131, 77, 23);
		contentPane.add(ButtonPassenger);
		
		JButton ButtonPassenger2 = new JButton("No");
		ButtonPassenger2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NoPassengerNext frame = new NoPassengerNext();
				frame.setVisible(true);
				dispose();
			}
		});
		ButtonPassenger2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		ButtonPassenger2.setBounds(173, 163, 77, 23);
		contentPane.add(ButtonPassenger2);
		
		JButton Btn1 = new JButton("Back");
		Btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostVisitedPlace frame2 = new MostVisitedPlace();
				frame2.setVisible(true);
				dispose();
			}
		});
		Btn1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Btn1.setBounds(10, 229, 77, 23);
		contentPane.add(Btn1);
	}
}
