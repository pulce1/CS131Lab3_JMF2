/**
 * This class is used as a main method to print out the array lists for square, 
 * PointThreeD, and a new String
 * @author james Frayser
 * Summer 2022
 * Lab 3
 * ListApp.java
 */

package main;

import arraylist.*;

public class ListApp 
{
	public static void main(String[] args){

        /**
         * sets up the array lists with the appropriate size for each
         */
		ArrayList<String> stringList = new ArrayList<String>(4);
        ArrayList<Square> squareList = new ArrayList<Square>(6);
        ArrayList<PointThreeD> point3dList = new ArrayList<PointThreeD>(3);
        
        /**
         * addItem adds each specific item to each specific list
         */
        stringList.addItem("James Frayser");
        stringList.addItem("Stranger Things");
        stringList.addItem("Spider Man");
        stringList.addItem("Dungeons and Dragons");

        squareList.addItem(new Square(2.8));
        squareList.addItem(new Square(4.2));
        squareList.addItem(new Square(5.3));
        squareList.addItem(new Square(10.5));
        squareList.addItem(new Square(20.1));
        squareList.addItem(new Square(35.6));

        point3dList.addItem(new PointThreeD(2.1,9.7,1.9));
        point3dList.addItem(new PointThreeD(2.6,5.4,4.3));
        point3dList.addItem(new PointThreeD(9.2,3.4,5.9));

        /**
         * prints out each list according to the list size
         */
        System.out.println("List of Strings: ");
        for (int i = 0; i < stringList.size(); i++) 
        {
            System.out.println(stringList.getItem(i));
        }

        System.out.println("\nList of Squares: ");
        for (int i = 0; i < squareList.size(); i++) 
        {
            System.out.println(squareList.getItem(i).toString());
        }

        System.out.println("\nList of Points: ");
        for (int i = 0; i < point3dList.size(); i++) 
        {
            System.out.println(point3dList.getItem(i).toString());
        }

    }//end main
                
}//end class

