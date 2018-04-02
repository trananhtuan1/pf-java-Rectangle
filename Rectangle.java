

public class Rectangle {
    double width, height;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double Area() {
        double Area = width * height;
        return Area;
    }

    public double Perimeter() {
        double Perimeter = (width + height) * 2;
        return Perimeter;
    }
}