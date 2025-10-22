package studio6;

import java.util.Arrays;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8 + ...)
	 *    
	 */
	public static double geometricSum(int n) {
		double sum = 0;
		if (n == 0) {
			return sum;
		}
		else {
			double term = Math.pow(0.5, n);
			sum += term;
			return sum + geometricSum(n-1);
		}
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	
	public static void circlesUponCircles(double xCenter, double yCenter, double radius, double radiusMinimumDrawingThreshold) {
		double bound = 5.0;
		StdDraw.setXscale(-bound, bound);
		StdDraw.setYscale(-bound, bound);
		if (radius < radiusMinimumDrawingThreshold) {
			return;
		}
		else {
			StdDraw.circle(xCenter, yCenter, radius);
			circlesUponCircles(xCenter, yCenter + radius, radius/3.0, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, yCenter - radius, radius/3.0, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter + radius, yCenter, radius/3.0, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter - radius, yCenter, radius/3.0, radiusMinimumDrawingThreshold);
		}
	}

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		int i = 0;
		int swap = array.length;
		if (array.length <= 1) {
			return array;
		}
		else {
			return toReversedHelper(array, i, swap);
		}
	}

	public static int[] toReversedHelper(int[] reversedArray, int i, int swap) {
		if (reversedArray.length <= 1) {
			return reversedArray;
		}
		if (i < reversedArray.length / 2) {
			swap = reversedArray[i];
			reversedArray[i] = reversedArray[reversedArray.length - i - 1];
			reversedArray[reversedArray.length - i - 1] = reversedArray[swap];
			return toReversedHelper(reversedArray, i++, swap);
		}
		return reversedArray;
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
			return 0;
	}
}