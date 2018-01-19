/**
 * Computes the value from 2 given equations
 * @author Beesham Sarendranauth 104854956
 * Date: 2018/01/17
 */
public class EquationSolver {
	public static void main(String[] args) {

		double s;
		s = evaluateEqn1(0,0,0,0);
		System.out.println("Value of s: " + s);

		double G;
		try {
			G = evaluateEqn2(0, 0, 0, 0);
			System.out.println("Value of G: " + G);
		}catch (IllegalArgumentException e) {
			e.printStackTrace();
			System.out.println("Can't divide by zero!");
		}


	}

	/**
	 * Evaluates an equation with given params
	 * @param s0
	 * @param v0
	 * @param g
	 * @param t
	 * @return the value evaluated
	 */
	public static double evaluateEqn1(double s0, double v0, double g, double t) {
		return s0 * v0 - (0.5 * g) * Math.pow(t, 3);
	}

	/**
	 * Evaluates a given equation
	 * @param a
	 * @param m1
	 * @param m2
	 * @param p
	 * @return the value evaluated
	 */
	public static double evaluateEqn2(double a, double m1, double m2, double p) throws IllegalArgumentException {
		double m = m1 - m2;
		final double CONST = (3/4.0) * Math.pow(Math.PI, 2);

		if(!(m == 0 || p == 0)) {
			return CONST * (Math.pow(a, 3) / ((Math.pow(p, 0.5) * m)));
		} else throw new IllegalArgumentException("Divide by zero!");
	}
}
