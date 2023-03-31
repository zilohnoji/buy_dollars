package source;

import java.util.Locale;
import java.util.Scanner;
import calculator.Convert;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner inp = new Scanner(System.in);
		double priceDollar;
		double buyDollar;

		System.out.print("What is price dollar? ");
		priceDollar = Convert.priceDollar = inp.nextDouble();

		System.out.print("How many dollars will be bougth? ");
		buyDollar = Convert.buyDollar = inp.nextDouble();

		System.out.println(Convert.iofConvert(Convert.priceDollar, Convert.buyDollar));

		inp.close();
	}

}
