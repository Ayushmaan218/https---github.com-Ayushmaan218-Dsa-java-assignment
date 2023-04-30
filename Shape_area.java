abstract class Shape{
    abstract double getArea();
}
class Square extends Shape
{
    double side;
    Square(double s)
    {
        side = s;
    }
    double getArea()
    {
        return side * side;
    }
}
class Triangle extends Shape{
    double base;
    double height;
    Triangle(double b, double h){
        base = b;
        height = h;
    }
    double getArea(){
        return 0.5 * base * height;
    }
}
class Circle extends Shape{
    double radius;
    Circle(double r){
        radius = r;
    }
    double getArea(){
        return Math.PI * radius * radius;
    }
}
public class Shape_area{
    public static void main(String[] args){
        Square square = new Square(4);
        System.out.println("Area of square: " + square.getArea());
        Triangle triangle = new Triangle(3, 6);
        System.out.println("Area of triangle: " + triangle.getArea());
        Circle circle = new Circle(5);
        System.out.println("Area of circle: " + circle.getArea());
    }
}
