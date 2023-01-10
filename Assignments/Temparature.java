
import java.awt.*;
import java.awt.event.*;


public class Temparature extends Frame {

//creating textfield for reads data
TextField tf1;

//using label for placing text
Label l1;

//create 3 button
Button convert2C, convert2F, clear;

//create Temparature() constructor
Temparature() {

//set title of app
setTitle("Converter");

//initialize the textfield
tf1 = new TextField("Enter Celsius/Fahrenheit here");
//set size of textfield
tf1.setBounds(50, 50, 400, 20);

//initialize Convert to Celsius button
convert2C = new Button("Convert2C");
//set size of button
convert2C.setBounds(100, 90, 80, 30);

//initialize Convert to Fahrenheit button
convert2F = new Button("Convert2F");
//set size of button
convert2F.setBounds(200, 90, 80, 30);

//initialize Clear button
clear = new Button("Clear");
//set size of button
clear.setBounds(300, 90, 80, 30);

//initialize label
l1 = new Label("");
//set size of label
l1.setBounds(120, 300, 85, 20);

//add following component
add(convert2C);
add(convert2F);
add(clear);
add(tf1);
add(l1);

//set the windows size
setSize(500, 300);
setVisible(true);

//use ActionListener for calculate Fahrenheit to Celsius
convert2C.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
double F = Double.parseDouble(tf1.getText());
//this is the formula
double C = (F-32)*(5.0/9);
//set the output
l1.setText(String.valueOf(C) + " degree celsius");
};
});

//use ActionListener for calculate Celsius to Fahrenheit
convert2F.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
double C = Double.parseDouble(tf1.getText());
//this is the formula
double F = (9.0/5)*C+32;
//set the output
l1.setText(String.valueOf(F) + " degree fahrenheit");
};
});

//use ActionListener for clear textfield and output data
clear.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
tf1.setText("");
l1.setText("");
};
});
}


public static void main (String[]args){

//invoke Temparature() constructor in main function
Temparature temparature = new Temparature();
}
}