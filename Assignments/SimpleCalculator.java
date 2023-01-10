//Name :  Osama caheer
//Faculty No.: 20COB110
//S. NO.: 11

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.awt.Color;

public class SimpleCalculator implements ActionListener{  
     JTextField tf1,tf2,tf3;  //creating textfields tf1 anf tf2 to read data and tf3 to get result output
     JButton b1,b2,b3,b4;  
     SimpleCalculator(){  
         JFrame f= new JFrame("Simple Calculator");               // Creating a frame with title Simple Calculator
         JLabel l1 = new JLabel("First Value");                   //Using JLabel for placing text
         l1.setBounds(10, 50,90,20);                              // x axis, y axis, width and height of Jlabel l1
         
        JLabel l2 = new JLabel("Second Value");               //Using JLabel for placing text
        l2.setBounds(10, 100,90,20);
        JLabel l3 = new JLabel("Result");                     //Using JLabel for placing text
        l3.setBounds(10, 150,90,20);
        tf1=new JTextField();                                     //Initialising the textfield  
        tf1.setBounds(100,50,180,20);                             //x,y,width ,height 

        tf2=new JTextField();                                    //Initialising the textfield 
        tf2.setBounds(100,100,180,20);                            //x,y,width ,height 
        
        tf3=new JTextField();                                   //Initialising the textfield  
        tf3.setBounds(100,150,180,20);                          //x,y , width, height
        tf3.setEditable(false);                                 //Making textfield tf3 uneditable
        tf3.setBackground(Color.LIGHT_GRAY);                    //setting background color of textfield

        b1=new JButton("+");                                     //Initialize plus  button 
        Border border = BorderFactory.createLineBorder(Color.gray);        //Initializing border of button
        b1.setBounds(50,200,50,50);                //x,y , width, height of button
        b1.setBorder(border);                      //Set border of button

        b2=new JButton("-");                       //Initialize minus button 
        b2.setBounds(120,200,50,50);               //x,y , width, height of button
        b2.setBorder(border);                      //Set border of button

        b3 = new JButton("*");                     //Initialize multiply button 
        b3.setBounds(190,200,50,50);               //x,y , width, height of button
        b3.setBorder(border);                      //Set border of button

        b4 = new JButton("/");                     //Initialize divide button
        b4.setBounds(260,200,50,50);               //x,y , width, height of button
        b4.setBorder(border);                      //Set border of button


        //Use addActionListener to execute the code when user click on the button
        b1.addActionListener(this);  
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        //Add all components to the frame
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(l1);f.add(l2);f.add(l3);
       
        f.setSize(400,400);  //set the window size
        f.setLayout(null);  
        f.setVisible(true);  //set frame to visible
    }         

    //Function for performing arithmatic operation
    public void actionPerformed(ActionEvent e) {  
        //input values from the user
        String s1=tf1.getText();   
        String s2=tf2.getText();  
        double a= Double.parseDouble(s1);  
        double b=Double.parseDouble(s2);  
        double c=0; 
        char opretpr ='_'; 

        //putting conditions to perform action
        if(e.getSource()==b1)          //if user clicks on b1 perform addition
        {  
            c=a+b;
            opretpr = '+';  
        }else if(e.getSource()==b2)     //if user clicks on b1 perform subtraction
        {  
            c=a-b;
            opretpr = '-'; 
        } else if(e.getSource()==b3)      //if user clicks on b1 perform multiplication
        {
            c=a*b;
            opretpr='*';
        }
        else if(e.getSource()==b4)               //if user clicks on b1 perform division
        {
             c=a/b;
            opretpr='/';
            
        } 

        //String to show as result
        String result=a+" "+opretpr+" " +b+" = "+String.valueOf(c);   
        tf3.setText(result);  
    }  
public static void main(String[] args) {  
    new SimpleCalculator();  
} }  