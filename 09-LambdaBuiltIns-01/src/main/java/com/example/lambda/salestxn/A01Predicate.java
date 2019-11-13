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

		Predicate<SalesTxn> massSales = sales -> sales
				.getState().getStr().equals("MA"); // ??
		
		Predicate<SalesTxn> massSales2 = sales -> sales
				.getState().equals(State.MA); // ??

		System.out.println("\n== Sales - Stream");
		// ??
		tList.stream().filter(massSales).forEach(System.out::println);

		System.out.println();
		
		System.out.println("\n== Sales - Method Call");
		// ??
		for(SalesTxn s : tList) {
			if(massSales2.test(s)) {
				System.out.println(s);
			}
		}
		
	}
}