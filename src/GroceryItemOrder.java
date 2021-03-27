/**
 * Sheet 4 Question 6
 * <p>
 *     Write a class  namedGroceryItemOrder that  represents  a  request  to  purchase  a  particular item in a given quantity (example: four boxes of cookies).
 * The GroceryltemOrder class should store an item name, quantity and a price per unit.
 * A GroceryltemOrder object should have the following :
 *  public GroceryltemOrder (String name, double pricePerUnit) constructs an item order to purchase the item with the given name, in the given quantity, which costs the given price per unit.
 *  public double getCost() returns the total cost of this item in its given quantity.
 *      For example, four boxes of cookies that cost 2.30 per unit have a total cost of 9.20.
 *  public void setQuantity(int quantity) sets the quantity of the item.
 *  </p>
 */
public class GroceryItemOrder {
	//TODO implement variables
	private String name;
	private int quantity;
	private double pricePerUnit;
	//TODO implement setter and getter	//No getter required
	public void setQuantity(int quantity) {
	this.quantity = quantity;
	}
	//TODO implement a constructor
	public GroceryItemOrder(String name, double pricePerUnit) {
	this.name = name;
	this.pricePerUnit = pricePerUnit;
	this.quantity = 1;
	}
	//Implementing the getCost method
	public double getCost() {
	return pricePerUnit * quantity;
	}
}
