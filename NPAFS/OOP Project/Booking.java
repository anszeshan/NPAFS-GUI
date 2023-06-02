package nayya;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class Booking {
	
	FLIGHT_SCHED_INFO_LOCALLY obj3 = new FLIGHT_SCHED_INFO_LOCALLY();       //object of FLight schedule information locally class
	JComboBox CB11;
	JComboBox CB22;
	JRadioButton RB11;
	JRadioButton RB22;
	JComboBox CB11_1;
	public Booking() {      //default constructor
		
	}

	public Booking(JComboBox cB, JComboBox cB2, JComboBox cB1_1, JRadioButton rB1, JRadioButton rB2) {  //parametrized constructor
		this.CB11 = cB;
		this.CB22 = cB2;
		this.CB11_1 = cB1_1;
		this.RB11 = rB1;
		this.RB22 = rB2;
	}

	
}



















