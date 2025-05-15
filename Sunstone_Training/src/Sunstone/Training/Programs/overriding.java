package Sunstone.Training.Programs;
class Shape {
 void findArea() {
     System.out.println("Area calculate karna hai...");
 }
}

class Rectangle extends Shape {
 int length = 10;
 int breadth = 5;
 @Override
 void findArea() {
     int area = length * breadth;
     System.out.println("Rectangle ka area: " + area);
 }
}

class Triangle extends Shape {
 int base = 10;
 int height = 4;
 @Override
 void findArea() {
     double area = 0.5 * base * height;
     System.out.println("Triangle ka area: " + area);
 }
}

class Square extends Shape {
 int side = 6;
 @Override
 void findArea() {
     int area = side * side;
     System.out.println("Square ka area: " + area);
 }
}


public class overriding {
 public static void main(String[] args) {
     Shape s;
     s = new Rectangle();
     s.findArea(); // Rectangle ka area

     s = new Triangle();
     s.findArea(); // Triangle ka area

     s = new Square();
     s.findArea(); // Square ka area
 }
}

