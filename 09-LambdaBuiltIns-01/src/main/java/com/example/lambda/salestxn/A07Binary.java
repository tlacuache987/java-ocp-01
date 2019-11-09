package com.example.lambda.salestxn;

import java.util.List;
import java.util.function.BiPredicate;

/**
 *
 * @author MikeW
 */
public class A07Binary {

	public static void main(String[] args) {

		List<SalesTxn> tList = SalesTxn.createTxnList();
		SalesTxn first = tList.get(0);
		String testState = "CA";

		BiPredicate<SalesTxn, String> stateBiPred = null; // ??

		System.out.println("\n== First is CA?");
		// ??
	}
}
