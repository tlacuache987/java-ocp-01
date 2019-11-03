package com.example.lambda.salestxn;

import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

/**
 *
 * @author MikeW
 */
public class A05PrimFunction {

	public static void main(String[] args) {

		List<SalesTxn> tList = SalesTxn.createTxnList();
		SalesTxn first = tList.get(0);

		ToDoubleFunction<SalesTxn> discountFunction = null; // ??

		System.out.println("\n== Discount");
		// ??

		Function<SalesTxn, Double> taxFunction = t -> t.getTransactionTotal() * t.getTaxRate();
		
		double tax = taxFunction.apply(first); // What happerns here?
		
		System.out.println(tax);
	}
}
