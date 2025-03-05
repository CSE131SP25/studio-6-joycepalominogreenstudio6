package studio6;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class IterativeMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		double sum = 0.0;
		for (int power = 1; power <= n; ++power) {
			sum = sum + Math.pow(0.5, power);
		}
		return sum;
	}

	/**
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}

	/**
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	
	
	public static int[] toReversed(int[] array) {
		int[] reversed = new int[array.length];
		
		return helper(reversed, array, 0);
	}
	
public static int[] helper(int[] reversed, int [] array, int index) {
		if (index >= array.length) {
			return reversed;
			
		}
		else {
			
				int lastIndex = array.length - 1 - index;
				reversed[lastIndex] = array[index];
				return helper(reversed, array, index + 1);
				
		
				}
			}
		}
		
	
	
	
	

