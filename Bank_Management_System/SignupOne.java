package bank.management.system;

import javax.swing.*;//swing is package 
import java.awt.*;//color class is inside awt package
import java.util.*;//random class is inside util package
import con.toedter.calendar.JDateChooser;//to access jcalendar jar, JDateChooser is class

public class SignupOne extends JFrame//Jframe is class
{
    SignupOne()
    {  
        
        setLayout(null);
        Random ran=new Random();//new object
        long random=Math.abs((ran.nextLong()%9000L)+1000L);
      
        
        JLabel formno=new JLabel("Application form no: "+random);        
        formno.setFont(new Font("Raleways",Font.BOLD, 38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        
        JLabel personalDetails=new JLabel("Page 1:Personal Details");        
        personalDetails.setFont(new Font("Raleways",Font.BOLD, 22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        
        
        JLabel name=new JLabel("Names:");        
        name.setFont(new Font("Raleways",Font.BOLD, 20));
        name.setBounds(100,140,100,30);//position of text
        add(name);
        
        
        JTextField nameTextField=new JTextField();
        nameTextField.setFont(new Font("Railway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        
        JLabel fname=new JLabel("Father's name:");        
        fname.setFont(new Font("Raleways",Font.BOLD, 20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        
        JTextField fnameTextField=new JTextField();
        fnameTextField.setFont(new Font("Railway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        
        JLabel dob=new JLabel("Date of Birth:");        
        dob.setFont(new Font("Raleways",Font.BOLD, 20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        
        /*JTextField dobTextField=new JTextField();
        dobTextField.setFont(new Font("Railway",Font.BOLD,14));
        dobTextField.setBounds(300,240,400,30);
        add(dobTextField);*/
        
        
        JDateChooser dateChooser=new JDateChooser();
        dateChooser.getBounds(300,240,200,30);   
        add(dateChooser);
        
        
        JLabel gender=new JLabel("Gender:");        
        gender.setFont(new Font("Raleways",Font.BOLD, 20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        
        
        JLabel email=new JLabel("Email Address:");        
        email.setFont(new Font("Raleways",Font.BOLD, 20));
        email.setBounds(100,340,200,30);
        add(email);
        
        
        JTextField emailTextField=new JTextField();
        emailTextField.setFont(new Font("Railway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        
        JLabel marital=new JLabel("Marital Status:");        
        marital.setFont(new Font("Raleways",Font.BOLD, 20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        
        JLabel address=new JLabel("Address:");        
        address.setFont(new Font("Raleways",Font.BOLD, 20));
        address.setBounds(100,440,200,30);
        add(address);
        
        
        JTextField addressTextField=new JTextField();
        addressTextField.setFont(new Font("Railway",Font.BOLD,14));
        nameTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        
        JLabel city=new JLabel("City:");        
        city.setFont(new Font("Raleways",Font.BOLD, 20));
        city.setBounds(100,490,200,30);
        add(city);
        
        
        JTextField cityTextField=new JTextField();
        cityTextField.setFont(new Font("Railway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        
        JLabel state=new JLabel("State:");        
        state.setFont(new Font("Raleways",Font.BOLD, 20));
        state.setBounds(100,540,200,30);
        add(state);
        
        
        JTextField stateTextField=new JTextField();
        stateTextField.setFont(new Font("Railway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        
        JLabel pincode=new JLabel("Pin Code:");        
        pincode.setFont(new Font("Raleways",Font.BOLD, 20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        
        JTextField pinTextField=new JTextField();
        pinTextField.setFont(new Font("Railway",Font.BOLD,14));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);
        
        
        getContentPane().setBackground(Color.WHITE);//getContentPane will give full frame
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public static void main(String ags[])
    {
    new SignupOne();
    }
}
        
