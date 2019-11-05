package teor_ver;

public class Lab2_PT {

	/**
	 * @param args
	 */
	public static double n = 5000;
	public static void main(String[] args) {
		GeneratorEven g = new GeneratorEven(4, 5, 6, 8, 0.2,0.3, 0.5);
		standartDeviation(variance(g.getValues(), expectation(g.getValues())));
		System.out.println();

	}

	public static double expectation (double [] values){
		double m =0;
		for (double d : values) {
			m += d;
		}
		System.out.println("sum/col");
		System.out.println(m/n);
		return m/n;
	}
	public static double variance (double [] values, double m){
		double d = 0;
		for (double v : values) {
			d += Math.pow(v-m, 2);
		}
		System.out.println("sum((val-sum(val)/col)^2)////середнє відхилення");
		System.out.println(d/n);
		return d/n;
	}
	public static void standartDeviation(double d){
		System.out.println("сигма");
		System.out.println(Math.sqrt(d));
	}
}
