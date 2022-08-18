/**
 * This class is used to calculate the side and area of the square
 * @author james Frayser
 * Summer 2022
 * Lab 3
 * Square.java
 */

package arraylist;

public class Square{
   
	private double side; //side of the square
    private double area; //side * side of the square

    /**
     * empty argument constructor
     * @param side
     * @param area
     */
    public Square() {
    	this.side=0;
    	this.area = 0;
    }//end empty argument constructor

    /**
     * preferred argument constructor
     * @param side
     * @param area
     */
    public Square(double side){
        this.side = side;
        area = side * side;
    }//end preferred argument constructor

    /**
     * getters for area and side
     * @return
     */
    public double getSide() {
        return side;
    }//end getSide
    
    public double getArea() {
    	return area;
    }//end getArea

    /**
     * toString to print the side and area of the square
     */
	@Override
	public String toString() {
		return "Square [side=" + side + ", area=" + area + "]";
	}//end toString

    
}//end main

