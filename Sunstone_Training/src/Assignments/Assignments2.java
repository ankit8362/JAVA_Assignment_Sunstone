package Assignments;

class Shapes {
    private int side;       // for square
    private int length;     // for rectangle
    private int breadth;    // for rectangle
    private int radius;     // for circle
    private double area;
    Shapes(){
        System.out.println("Default Shape Created");
    }
    Shapes(int side){ // for square
        this.side = side;
        this.area = side * side;
    }
    Shapes(int length,int breadth){ // for rectangle
        this.length =length;
        this.breadth =breadth;
        this.area = length*breadth;
    }
    Shapes(double radius){ // for circle
        this.radius = (int)radius;
        this.area = Math.PI*radius*radius;
    }
    public void square(){
        System.out.println("Area of Square: " +area);
    }
    public void rectangle(){
        System.out.println("Area of Rectangle: " +area);
    }
    public void circle(){
        System.out.println("Area of Circle: " +area);
    }
    
    // Method Overloading for Rhoombus and Triangle
    public void area(double diagonal1,double diagonal2){
        double result = (diagonal1*diagonal2)/2;
        System.out.println("Area of Rhombus: " +result);
    }
    public void area(double base, double height,boolean isTriangle){
        double result =(base*height)/2;
        System.out.println("Area of Triangle: " +result);
    }
}

public class Assignments2{
    public static void main(String[] args){
        // Square
        Shapes s1 =new Shapes(5);
        s1.square();

        // Rectangle
        Shapes s2 =new Shapes(4, 6);
        s2.rectangle();

        // Circle
        Shapes s3 =new Shapes(3.5);
        s3.circle();

        // Rhombus and Triangle using method overloading
        Shapes s4 =new Shapes();
        s4.area(6.0,8.0); // rhombus
        s4.area(5.0,10.0,true); // triangle
    }
}
