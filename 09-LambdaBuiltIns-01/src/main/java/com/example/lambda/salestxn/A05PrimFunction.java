package com.example.lambda.salestxn;

import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 *
 * @author MikeW
 */
public class A05PrimFunction {

	public static void main(String[] args) {

		List<SalesTxn> tList = SalesTxn.createTxnList();
		SalesTxn first = tList.get(0);

		ToDoubleFunction<SalesTxn> discountFunction = sales -> sales.getTransactionTotal() * sales.getDiscountRate(); // ??

		System.out.println("\n== Discount");
		// ??
		tList.stream().peek(s -> System.out.print(s.getTxnId() + ",")).peek(s -> System.out.print(" discount: "))
				.mapToDouble(discountFunction).forEach(System.out::println);

		System.out.println();

		Function<SalesTxn, Double> taxFunction = t -> t.getTransactionTotal() * t.getTaxRate();

		double tax = taxFunction.apply(first); // What happerns here?

		System.out.println(tax);
	}
}
