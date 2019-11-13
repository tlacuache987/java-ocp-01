package com.example.lambda.salestxn;

import java.util.List;
import java.util.function.Function;

/**
 *
 * @author MikeW
 */
public class A03Function {

	public static void main(String[] args) {

		List<SalesTxn> tList = SalesTxn.createTxnList();
		SalesTxn first = tList.get(0);

		Function<SalesTxn, String> buyerFunction = s -> s.getBuyerName();// ??

		System.out.println("\n== First Buyer");
		// ??
		System.out.println(buyerFunction.apply(first));
	}
}