package nayya;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java. io. FileWriter;
import java.io.PrintWriter;
import java.util.*;
import java.io.File;
import java.io.IOException;
public class LoginANDRegistration {
	static ArrayList<String> List = new ArrayList<String>();            //array list
	static ArrayList<String> List1 = new ArrayList<String>();           //array list
	SignUp_Passenger obj2 = new SignUp_Passenger();               //object of signup passenger frame
	SignUp_Admin obj1 = new SignUp_Admin();                        //object of signup admin frame
	 
	private  String username;                  //private data members
	private String email;
	private String CNIC;
	private String password;
	
      //getters and setters
  public  String getUsername() {
		return username;
	}
  public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCNIC() {
		return CNIC;
	}
	public void setCNIC(String cNIC) {
		CNIC = cNIC;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


public LoginANDRegistration(String text, String text2, String text3, String text4) {    //parametrized constructor
	      this.username = text;
	      this.email = text2;
	      this.CNIC = text3;
	      this.password = text4;
	}

	  public LoginANDRegistration() {                //default constructor
		  this.username = username;
	      this.email = email;
	      this.CNIC = CNIC;
	      this.password = password;
}
	 static void matchadmin() {                
		   
	 }
 }  
