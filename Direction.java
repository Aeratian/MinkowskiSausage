/**
 * Direction.java
 * 
 * A class for representing the direction of a line segment. The xDir represents
 * the x-component of the direction and the yDir represents the the y-component
 * of the direction. The sum of the squares of xDir and yDir will always equal
 * 1. Includes two constructors and getters and setters for the xDir and yDir
 * variables. The class also include two methods turnLeft and turnRight for
 * turning 90 degrees left and right.
 * 
 * @author Ian Youn
 * @version 1.0
 * @since 2/25/2021
 */
public class Direction {
	/** The multiplier for the x-component of the direction. */
	private double xDir;

	/** The multiplier for the y-component of the direction. */
	private double yDir;

	/**
	 * A no-args constructor for creating a Direction object of a horizontal line
	 * pointing towards the positive x-direction.
	 */
	public Direction() {
		xDir = 1.0;
		yDir = 0.0;
	}

	/**
	 * A two-args constructor for creating a Direction object, The parameters
	 * represent the x-component and y-component of the direction.
	 * 
	 * @param xD The x-component of the direction.
	 * @param yD The y-component of the direction.
	 */
	public Direction(double xD, double yD) {
		xDir = xD;
		yDir = yD;
	}

	/**
	 * Gets the x-component of the Direction.
	 * 
	 * @return The x-component of the Direction.
	 */
	public double getxDir() {
		return xDir;
	}

	/**
	 * Sets the x-component of the direction.
	 * 
	 * @param xD The new x-component of the Direction.
	 */
	public void setxDir(double xD) {
		xDir = xD;
	}

	/**
	 * Gets the y-component of the Direction.
	 * 
	 * @return The y-component of the Direction.
	 */
	public double getyDir() {
		return yDir;
	}

	/**
	 * Sets the x-component of the direction.
	 * 
	 * @param yD The new y-component of the Direction.
	 */
	public void setyDir(double yD) {
		yDir = yD;
	}

	/**
	 * Turns the Direction object 90 degrees to the left.
	 */
	public void turnLeft() {
		if (xDir == 0) {
			xDir = -yDir;
			yDir = 0;
		} 
		else {
			yDir = xDir;
			xDir = 0;
		}
	}

	/**
	 * Turns the Direction object 90 degrees to the right.
	 */
	public void turnRight() {
		if (xDir == 0) {
			xDir = yDir;
			yDir = 0;
		} 
		else {
			yDir = -xDir;
			xDir = 0;
		}
	}
}