/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;

/**
 *
 * @author Ntsako
 * @student number : 211230235
 * @Project Mid-Terminator
 * @module : IRP Part Time
 */
public class LoginGui implements ActionListener
{
    private  JFrame loginFrame = new JFrame();
    private  JPanel pnlLogin;
    private  JPanel pnlImage;
    private ImageIcon icon;
    
    String n;
    char p[];
    
    private final JLabel lblUsername = new JLabel("Username     ");
    private final JLabel lblPassword = new JLabel("Password     ");
    
    private final JTextField txtUsername = new JTextField(20);
    private final JPasswordField passwordField = new JPasswordField(20);
    
    private final JButton btnLogin = new JButton("Login");
    private final JButton btnClear = new JButton("Clear");
    private final JButton btnExit = new JButton("Exit");
    
    
   
 //   SalesManagementGui salesManageGui = new SalesManagementGui();
    
    public LoginGui()
    {
        myGui();
    }  
    
    public void myGui()
    {
      pnlLogin = new JPanel();
      pnlLogin.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "Login"));
      
      ImageIcon icon;
      icon = new ImageIcon("images/image1.jpg");
      JLabel label = new JLabel("", icon, JLabel.CENTER);
    //  label.setSize(200, 300);
      
      ImageIcon icon1;
      icon1 = new ImageIcon("images/welcome.jpg");
      JLabel label1 = new JLabel("", icon1, JLabel.CENTER);
     
      loginFrame = new JFrame("Fast Food Login");
      loginFrame.setSize(400,400);
      loginFrame.setLayout(new GridLayout(3, 1));
      loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      loginFrame.setVisible(true);
      
      pnlLogin.add(lblUsername);
      pnlLogin.add(txtUsername);
      txtUsername.setEditable(false);
      
      pnlLogin.add(lblPassword);
      pnlLogin.add(passwordField);
      
      pnlLogin.add(btnLogin);
      pnlLogin.add(btnClear);
      pnlLogin.add(btnExit);
      
      
      loginFrame.add(label1);
      loginFrame.add(pnlLogin);
      loginFrame.add(label);
     
    
      btnClear.addActionListener(this);
      btnExit.addActionListener(this);
      btnLogin.addActionListener(this);
      
      n = "2";
      p[0] = '2';
     
    }
    
    public void actionPerformed(ActionEvent e)
    {
        char[] password = passwordField.getPassword();
        char[] correctPass = new char[] {'s', 'e', 'c', 'r', 'e', 't'};
        
        if(e.getSource()== btnLogin)
        {

            char pass[] = passwordField.getPassword();
            System.out.println(pass);
            
            if(passwordField.getPassword().length == 0)
            {
            JOptionPane.showMessageDialog(null, "Password cannot be blank");
          
            txtUsername.setText(null);
            passwordField.setText(null);
            
            }
            else if(Arrays.equals(password, correctPass))
            {
            JOptionPane.showMessageDialog(null, "Login successfull");
            SalesManagementGui menuGui = new SalesManagementGui();
            loginFrame.setVisible(false);
            
            }
            else
            {
            JOptionPane.showMessageDialog(null, "Incorrect Password entered");
            txtUsername.setText(null);
            passwordField.setText(null);
            }
            
            
            
            
            
        }
        else if(e.getSource()== btnExit)
        {
          System.exit(0);
        }
        else if(e.getSource()== btnClear)
        {
          txtUsername.setText(null);
          passwordField.setText(null);
        }
    }
    
    
    
    
   
    
}
