//walid ownership copyright ananas

package classes;

public class Triangle extends  GeometricObject{
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
        double semipermiter=side1+side2+side3;
        double area= Math.sqrt(semipermiter*(semipermiter-side1)*(semipermiter-side2)*(semipermiter*side3));
                return area;
    }

    public double getpermiter()
    {
        double permiter=side1+side3+side2;
        return permiter;
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
