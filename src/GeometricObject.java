package classes;

import java.util.Date;

public abstract class GeometricObject
{
    private String color;
    private boolean filled;
    private Date datecreated = new Date();


    public GeometricObject(){};

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public boolean isFilled() {
        return filled;
    }


    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    public Date getDateCreated() {
        return datecreated;
    }




    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                "\nfilled=" + filled +
                "\ndateCreated=" + datecreated +
                '}';
    }
}
