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

		Consumer<SalesTxn> buyerConsumer = s -> System.out.println(
				"id: " + s.getTxnId() + ", Buyer: " + s.getBuyer().getName()); // ??

		System.out.println("== Buyers - Lambda");
		// ??
		tList.stream()
			.filter(s -> s.getBuyerName().equals("Acme Electronics"))
			.forEach(buyerConsumer);
		
		System.out.println();
		
		System.out.println("== First Buyer - Method");
		// ??
		buyerConsumer.accept(first);
	}
}
