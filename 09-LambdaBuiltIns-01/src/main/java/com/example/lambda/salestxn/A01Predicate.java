package com.example.lambda.salestxn;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author MikeW
 */
public class A01Predicate {

	public static void main(String[] args) {

		List<SalesTxn> tList = SalesTxn.createTxnList();

		Predicate<SalesTxn> massSales = null; // ??

		System.out.println("\n== Sales - Stream");
		// ??

		System.out.println("\n== Sales - Method Call");
		// ??
	}
}