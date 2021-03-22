import java.util.Date;

/**
 * An abstract class made for extension.
 * The specs for this abstract class were taken from sheet 3 question 11.
 * i dislike it. ~said.
 */
public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated = new java.util.Date();

    /**
     * Default constructor.
     * <strike>it assumes that the geometric object is not filled and therefore has no color.</strike>
     *
     */
    public GeometricObject(){
        //this.filled = false;
        //this.color = null;
    }

    /**
     * This constructor sets the color and determines wether the GeometicObject is filled
     * @param filled Determines if the object is filled with a color or not.
     * @param color The color of the filling
     *
     */
    public GeometricObject(boolean filled,String color){
        this.color = color;
        this.filled = filled;
    }

    /**
     * getter for the color property
     * @return the color of the object
     */
    public String getColor() {
        return color;
    }

    /**
     * setter for the color property
     * @param color sets the color of the object
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * getter for the filled property
     * @return true if filled, false otherwise
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * setter for the filled property
     * @param filled set true if filled, false otherwise
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * getter for date of object creation
     * @return the date of the object
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * Basic to string method
     * @return nothing of value
     */
    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                "\nfilled=" + filled +
                "\ndateCreated=" + dateCreated +
                '}';
    }
}
