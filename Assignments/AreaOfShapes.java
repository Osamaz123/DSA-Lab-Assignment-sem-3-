import java.util.Scanner;

abstract class Shape {  //Abstract class
        //Variable declarations
        int length;
        int breadth;
        int radius;
        void printArea() {}     //Empty method
}

class Rectangle extends Shape{  //Concrete class
        void printArea() {      //Calculate and prints the area of the rectangle
                Scanner scan = new Scanner(System.in);  //Scanner object to read the input from the console
                System.out.println("Please enter the length of the rectangle:");        //Get the value of length from the user
                length = scan.nextInt();
                System.out.println("Please enter the breadth of the rectangle:");       //Get the value of breadth from the user
                breadth = scan.nextInt();
                int areaRectangle = length*breadth;             //Formula to caluculate area of rectangle is length*breadth
                System.out.println("The area of the rectangle is: " + areaRectangle);   //Print the result
        }
}

class Triangle extends Shape{   //Concrete class
        void printArea() {      //Calculate and prints the area of the triangle
                Scanner scan = new Scanner(System.in);  //Scanner object to read the input from the console
                System.out.println("Please enter the base of the triangle:");   //Get the value of base from the user
                int base = scan.nextInt();
                System.out.println("Please enter the height of the triangle:"); //Get the value of height from the user
                int height = scan.nextInt();
                double areaTriangle = (base*height)/2;  //Formula to calculate area of triangle is 1/2(base*height)
                System.out.println("The area of the triangle is: " + areaTriangle);     //Print the result
        }
}

class Circle extends Shape{     //Concrete class
        void printArea() {      //Calculate and prints the area of the circle
                Scanner scan = new Scanner(System.in);  //Scanner object to read the input from the console
                System.out.println("Please enter the radius of the circle:");   //Get the value of radius from the user
                radius = scan.nextInt();
                double areaCircle = (3.14)*radius*radius;       //Formula to calculate the area of circle is π*radius*radius here π=3.14
                System.out.println("The area of the circle is: " + areaCircle); //Print the result
        }
}

public class AreaOfShapes {

        public static void main(String[] args) {
                
                Shape rectangle = new Rectangle();      //Creates an object of Rectangle class using Shape class
                rectangle.printArea();  //Calls the method in Rectangle class
                
                Shape triangle = new Triangle();        //Creates an object of Triangle class using Shape class
                triangle.printArea();   //Calls the method in Triangle class
                
                Shape circle = new Circle();    //Creates an object of Circle class using Shape class
                circle.printArea();     //Calls the method in Circle class

        }

}