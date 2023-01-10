class NegativeSideException extends Exception {
    //    This is a custom class which will be used to throw exceptions if the user passes a negative argument. This custom class(NegativeSideException) extends 'Exception' class.
    @Override
    public String toString() {
        return "Side of a polygon cannot be negative";
    }

    @Override
    public String getMessage() {
        return "Side of a polygon cannot be negative";
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
// try and catch blocks in java are used to handle exceptions.
        try {
            System.out.println("Area of rectangle is = " + area(2, 4));
//      As we have passed two arguments in this statement, so during compilation of this program, the method (with name 'area') which accepts two arguments of type 'int' will be called.
        } catch (Exception e) {
            System.out.println("Exception : " +e);
        }
        try {
            System.out.println("Area of square is = " + area(-4));
//        As we have passed a single argument in this statement, during compilation of this program, the method(with name 'area') which accepts a single argument of type 'int' will be called.
        } catch (Exception e) {
            System.out.println("Exception : " +e);
        }
        try {
            System.out.println("Perimeter of rectangle is = " + perimeter(2, 4));
//        As we have passed two arguments in this statement, so during compilation of this program, the method (with name 'perimeter') which accepts two arguments of type 'int' will be called.
        } catch (Exception e) {
            System.out.println("Exception : " +e);
        }
        try {
            System.out.println("Perimeter of square is = " + perimeter(-4));
//        As we have passed a single argument in this statement, during compilation of this program, the method(with name 'perimeter') which accepts a single argument of type 'int' will be called.
        } catch (Exception e) {
            System.out.println("Exception : " +e);
        }
        try {
            System.out.println("Area of triangle is = " + area(5.0, 10.0));
//        Now in this statement, we have passed two arguments BUT, the data type of arguments is different in this statement. In this statement, we have passed arguments of type 'double', so the method 'area' which accepts two arguments of type double will be called.
        } catch (Exception e) {
            System.out.println("Exception : " +e);
        }
        try {
            System.out.println("Perimeter of equilateral triangle = " + perimeter(5.0));
//        In this statement, we have passed a single argument BUT, the data type of that argument is different in this statement. In this statement, we have passed argument of type 'double', so the method 'perimeter' which accepts a single argument of type double will be called.
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }

    }

    public static int area(int length, int breadth) throws NegativeSideException {
//        This method will calculate area of a rectangle.
        if (length < 0 || breadth < 0) {
            throw new NegativeSideException();
        }
        return length * breadth;
    }

    public static int area(int side) throws NegativeSideException {
//        This method will calculate area of a square.
        if (side < 0) {
            throw new NegativeSideException();
        }
        return side * side;
    }

    public static int perimeter(int length, int breadth) throws NegativeSideException {
//        This method will calculate perimeter of a rectangle
        if (length < 0 || breadth < 0) {
            throw new NegativeSideException();
        }
        return 2 * (length + breadth);
    }

    public static int perimeter(int length) throws NegativeSideException {
//        This method will calculate perimeter of a square.
        if (length < 0) {
            throw new NegativeSideException();
        }
        return 4 * length;
    }

    public static double area(double base, double height) throws NegativeSideException {
//        This method will calculate area of a triangle.
        if (base < 0 || height < 0) {
            throw new NegativeSideException();
        }
        return 0.5 * base * height;
    }

    public static double perimeter(double side) throws NegativeSideException {
//        CONSIDERING THAT PERIMETER OF AN EQUILATERAL TRIANGLE IS TO BE CALCULATED.
        if (side < 0) {
            throw new NegativeSideException();
        }
        return 3 * side;
    }
}
