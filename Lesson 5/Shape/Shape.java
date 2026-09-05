package Lesson4;
public interface Shape {
    double getArea();
    void display();
}

// Create a class that implements Shape
class Circle implements Shape{
    // instance variable
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of getArea()
    public double getArea(){
        return Math.PI * radius * radius;
    }

    public void display() {
        System.out.println("Radius of circle: " + radius);
        System.out.println("Area of circle: " + getArea());
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public void display() {
        System.out.println("Length:" + length + " Width: " + width);
        System.out.println("Area of rectangle: " + getArea());
    }
}