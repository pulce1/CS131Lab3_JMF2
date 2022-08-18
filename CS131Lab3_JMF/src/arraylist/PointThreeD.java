/**
 * This class is used to set up three coordinate points
 * @author james Frayser
 * Summer 2022
 * Lab 3
 * PointThreeD.java
 */

package arraylist;

public class PointThreeD{
    
	private double x;//x coordinate
    private double y;//y coordinate
    private double z;//z coordinate

    /**
     * empty argument constructor
     * @param x
     * @param y
     * @param z
     */
    public PointThreeD() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    
    /**
     * preferred argument constructor
     * @param x
     * @param y
     * @param z
     */
    public PointThreeD(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * toString to print in the main
     */
	@Override
	public String toString() {
		return "PointThreeD [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}
