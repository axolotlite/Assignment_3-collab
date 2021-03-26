/**
 * Sheet 4 Question 6
 * <p>
 *     Write  a  class  named GroceryList that represents a person’s list of items to buy from the market.
 * The GroceryList class has a list of grocery item orders and keeps track of its size (number of items in the list so far).
 * Assume that a grocery list will have no more than 10 items.
 * A GroceryList object should have the following methods and constructor:
 * public GroceryList() constructs a new empty grocery list.
 * public void add(GroceryltemOrder item) adds the given item order to this list, if the list is not full (i.e., has fewer than 10 items).
 * public double getTotalCost() returns the total sum cost of all grocery item orders in this list.
 * </p>
 */

public class GroceryList {
	//TODO implement the variables
	private ArrayList<GroceryItemOrder> list = new ArrayList<>();
	//TODO implement a constructor
	public GroceryList() {
	}

	//TODO implement the method add
	public void add(GroceryItemOrder item) {
	if(list.size() < 10)    list.add(item);
	}

	//TODO implement the method getTotalCost
	public double getTotalCost() {
	double cost = 0;
	for (GroceryItemOrder groceryItemOrder : list) {
	    cost += groceryItemOrder.getCost();
	}
	return cost;
   	}
   	//Method to allow setting quantity through the GroceryList object
   	public void setQuantity(int index, int quantity) {
        list.get(index).setQuantity(quantity);
    	}
}
