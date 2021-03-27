//walid ownership copyright ananas
//omar ownership tomato

package classes;

public class Triangle extends classes.GeometricObject {
    private double side1;
    private double side2;
    private double side3;


    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getArea()
    {
        double semiperimeter = this.getPerimeter() / 2;
        double area= Math.sqrt(semiperimeter * (semiperimeter-side1) * (semiperimeter-side2) * (semiperimeter*side3));
                return area;
    }

    public double getPerimeter()
    {
        double Perimeter = side1 + side3 + side2;
        return Perimeter;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ",color="+getColor()+
                ",filled="+isFilled()+
                '}';
    }
}
