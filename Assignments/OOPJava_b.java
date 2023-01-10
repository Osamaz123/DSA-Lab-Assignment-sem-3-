//Name :  Osama caheer
//Faculty No.: 20COB110
//S. NO.: 11

abstract class Shape{
  abstract void  numberOfSides(); 
  Shape(){
      System.out.println("Shape constructor is called");
  }
}
class Trapezoid extends Shape{
    void numberOfSides(){
System.out.println("Trapezoid is a 4 sided Polygon");
    }
    void perimeter(int a ,int b, int c, int d){
System.out.println("Perimeter of Trapezoid is :"+a+" + "+b+" + "+c+" + "+d+" = "+(a+b+c+d));
    }
}
class Triangle extends Shape{
    void numberOfSides(){
     
System.out.println("Triangle is a 3 sided polygon");   
    }
    void perimeter(int a ,int b, int c){
        System.out.println("Perimeter of triangle is :"+a+" + "+b+" + "+c+" = "+(a+b+c));
            }
}
class Hexagon extends Shape{
    void numberOfSides(){
System.out.println("Hexagon is a 6 sided polygon");
    }
    void perimeter(int a ,int b, int c, int d,int e, int f){
        System.out.println("Perimeter of Hexagon is :"+a+" + "+b+" + "+c+" + "+d+" + "+e+" + "+f+" = "+(a+b+c+d+e+f));
            }
}
public class OOPJava_b {
    public static void main(String[] args) {
        Shape trap= new Trapezoid();
        trap.numberOfSides();
        Shape tri = new Triangle();
        tri.numberOfSides();
        Shape hex = new Hexagon();
        hex.numberOfSides();
       
       
        System.out.println("---------------------------------\n");
        ((Trapezoid) trap).perimeter(5,6,4,5);
        ((Triangle) tri).perimeter(5,4,3);
        ((Hexagon) hex).perimeter(6,4,4,6,4,4);


   
    }
}
