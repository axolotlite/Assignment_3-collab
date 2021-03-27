//walid ownership copyright ananas
//omar ownership tomato

//package classes;

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
        double semiPerimeter = this.getPerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter-side1) * (semiPerimeter-side2) * (semiPerimeter-side3));
    }

    public double getPerimeter()
    {
        return side1 + side3 + side2;
    }

    @Override
    public String toString() {
        return "Triangle\n" +
                "\nArea: " + this.getArea() +
                "\nPerimeter: " + this.getPerimeter() +
                "\nColor: " + getColor()+
                "\nFilled: " + isFilled();
    }
}
