package calculator;

public class Convert {
	public static double priceDollar;
	public static double buyDollar;
	public static final double IOF = 0.06;
	
	public static String iofConvert(double price, double buy) {
		return String.format("%.2f", (buy * price) * IOF);
	}
}
