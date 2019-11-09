package com.example.lambda.salestxn;


import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author MikeW
 */
public class A02Consumer {

	public static void main(String[] args) {

		List<SalesTxn> tList = SalesTxn.createTxnList();
		SalesTxn first = tList.get(0);

		Consumer<SalesTxn> buyerConsumer = null; // ??

		System.out.println("== Buyers - Lambda");
		// ??

		System.out.println("== First Buyer - Method");
		// ??
	}
}
