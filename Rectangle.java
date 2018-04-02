

public class Rectangle {
    double cao, rong;

    public Rectangle(double cao, double rong) {
        this.cao = cao;
        this.rong = rong;
    }

    public double dientich() {
        double Area = cao * rong;
        return Area;
    }

    public double chuvi() {
        double Perimeter = (cao + rong) * 2;
        return Perimeter;
    }

    public String display() {
        return "Rectangle(" + "rong= " + rong + ", cao= " + cao + ")";
    }
}