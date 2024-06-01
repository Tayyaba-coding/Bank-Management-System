
package bank.management.system;
import javax.swing.*;
import java.awt.*;//bcz Image class is inside awt pacakage 
import java.awt.event.*;//actionlistener is inside awt.event package
import java.sql.*;

public class Login extends JFrame implements ActionListener//actionlistener iss an interface ad we should override all its methods
{
        
   
    JButton login, signup, clear;//JButton login, sihgnuo, clear buttons are globaly defined so that they can be accessed outside the constructor
    JTextField cardTextField;
    JPasswordField pinTextField;//when we want that whatever the user will enter in the pin it will be not visible 
    
    
    Login()//constructor
    {   
        setTitle("Automated Teller Machine");//function
        setLayout(null);//default layout uis center so we have to make it null to set layout according to us
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icone/icone1.png"));//i1 is object name, ImageIcon is class, img will come from system,getSystemResource() is static method 
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);//1st written Image is class
        ImageIcon i3=new ImageIcon(i2);
        //we cant add icone directlyt to frame so we use JLabel
       
        JLabel label=new JLabel(i3);//variable is lable, i1 is icone, we can insert i1-ImageIcone in JLabel as JLabel(i1) but we cant insert i2-Image in JLable as JLable(i2)
        label.setBounds(70,10,100,100);
        add(label);//jlable is placed on frame, object label is passed
        
        
        JLabel text=new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD,38));
        text.setBounds(200,40,400,40);//40+40=80
        add(text);
        
        JLabel cardno=new JLabel("Card no:");
        cardno.setFont(new Font("Raleway", Font.BOLD,28));//raleway is font
        cardno.setBounds(120,150,150,30);//40+40=80
        add(cardno);
        
        cardTextField=new JTextField();//we used swing so we will use J with textField
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add (cardTextField);
        
        JLabel ping=new JLabel("PIN:");
        ping.setFont(new Font("Raleway", Font.BOLD,28));
        ping.setBounds(120,220,250,30);
        add(ping);
        
        
        pinTextField=new JPasswordField();//we used swing so we will use J with textField
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add (pinTextField);
        
        
        login=new JButton("Sign In");//login button is localy defined
        login.setBounds(300,300,100,30);//300+100=400+30(for gap)
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);//when we will click the button then it will light up for a sec
        add(login);
        
        
        clear=new JButton("Clear");//login button is localy defined
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        
        signup=new JButton("Sign Up");//login button is localy defined
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(800, 480);//function
        setVisible(true);//function
        setLocation(350, 300);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)//ae is object of ActionEvent class
    {
        //when we want to perform action on buttons
        if(ae.getSource()==clear)
        {
            //after clicking clear button data inserted in the above JTextField column will be cleared, so declare it gllobaly
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if(ae.getSource()==login)
        {
            Conn conn=new Conn();
            String cardnumber=cardTextField.getText();
            String pinnumber=pinTextField.getText();
            String query="Select * from login where cardnumbeer = '"+cardnumber+"' and pin ='"+pinnumber+"'";
            try{
                ResultSet rs=conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource()==signup)
        {
          
        
        }
        
    }

    public static void main(String args[]) 
    {
        new Login(); //object and call constructor
    }
    
}
