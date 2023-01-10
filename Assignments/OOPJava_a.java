//Name :  Osama caheer
//Faculty No.: 20COB110
//S. NO.: 11


class MethodOvrloading
{
    void area(float a)
    {
        
        System.out.println("Area of the square is "+Math.pow(a, 2)+" sq units");
    }
    void area(int a, float b)
    {
        System.out.println("Area of the rectangle is "+a*b+" sq units");
    }
    void area(float a, int b)
    {
        System.out.println("Area of triangle is "+a*b/2+" sq units");
    }
    void area(double a)
    {
        //double c = 3.14 * a * a;
        System.out.println("Area of the circle is "+3.14*a*a+" sq units");
    }
}
public class OOPJava_a {
    public static void main(String[] args) {
        MethodOvrloading ob = new MethodOvrloading();
        ob.area(8);
        ob.area(5,6.2f);
        ob.area(8.5f, 10);
        ob.area(5.5);  
    }
}
