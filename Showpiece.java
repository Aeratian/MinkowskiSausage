
/**
 * Showpiece.java
 * 
 * A class for drawing a fractal-pattern called the "Minkowski sausage" using 
 * recursion. A number can be passed into the arguments to signify the depth 
 * of the pattern. Otherwise, the program is run with a depth of 3.
 * 
 * @author Ian Youn
 * @version 1.0
 * @since 2/24/2021
 */
import java.awt.Color;

public class Showpiece {
	/**
	 * The main method of the program.
	 * 
	 * @param args The array of arguments containing the depth of the pattern.
	 */
	public static void main(String[] args) {
		setUpAndDrawBackground();
		int n = 3;
		if (args.length > 0) {
			n = Integer.parseInt(args[0]);
		}
		quadKoch(n, -450, 0, new Direction(1, 0), 900);
	}

	/**
	 * Sets up the background and scale of the StdDraw canvas.
	 */
	public static void setUpAndDrawBackground() {
		StdDraw.setCanvasSize(900, 900);
		StdDraw.setXscale(-450, 450);
		StdDraw.setYscale(-450, 450);
	}

	/**
	 * A recursive method for drawing a fractal pattermn. In this fractal pattern,
	 * every straight line is changed with a square of length length/4 at the
	 * top-middle-left and a square of length length/4 at the bottom-middle-right
	 * (use the program with argument 1 for a better explanation), starting from a
	 * straight line.
	 * 
	 * @param n      The depth of the line (starts at max, ends at 0).
	 * @param x0     The starting x-coordinate of the line.
	 * @param y0     The starting y-coordinate of the line.
	 * @param d      The direction of the line.
	 * @param length The length of the line.
	 */
	public static void quadKoch(int n, double x0, double y0, Direction d, int length) {
		if (n > 0) {
			StdDraw.setPenColor(new Color(10, 100 + (int) (Math.random() * 100), 100 + (int) (Math.random() * 100)));
			quadKoch(n - 1, x0, y0, d, length / 4);
			x0 += length / 4 * d.getxDir();
			y0 += length / 4 * d.getyDir();
			d.turnLeft();
			quadKoch(n - 1, x0, y0, d, length / 4);
			x0 += length / 4 * d.getxDir();
			y0 += length / 4 * d.getyDir();
			d.turnRight();
			quadKoch(n - 1, x0, y0, d, length / 4);
			x0 += length / 4 * d.getxDir();
			y0 += length / 4 * d.getyDir();
			d.turnRight();
			quadKoch(n - 1, x0, y0, d, length / 4);
			x0 += length / 4 * d.getxDir();
			y0 += length / 4 * d.getyDir();
			quadKoch(n - 1, x0, y0, d, length / 4);
			x0 += length / 4 * d.getxDir();
			y0 += length / 4 * d.getyDir();
			d.turnLeft();
			quadKoch(n - 1, x0, y0, d, length / 4);
			x0 += length / 4 * d.getxDir();
			y0 += length / 4 * d.getyDir();
			d.turnLeft();
			quadKoch(n - 1, x0, y0, d, length / 4);
			x0 += length / 4 * d.getxDir();
			y0 += length / 4 * d.getyDir();
			d.turnRight();
			quadKoch(n - 1, x0, y0, d, length / 4);
		} 
		else {
			StdDraw.line(x0, y0, x0 + length * d.getxDir(), y0 + length * d.getyDir());
		}
	}
}