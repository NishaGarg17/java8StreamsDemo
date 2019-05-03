package com.java8.streamsDemo.demoApps;

import java.util.Comparator;
import java.util.Optional;

import com.java8.streamsDemo.entity.Trader;
import com.java8.streamsDemo.entity.Transaction;
import com.java8.streamsDemo.utility.TraderUtility;
import com.java8.streamsDemo.utility.TransactionUtility;

public class TransactionAndTraderOperationsWithStreams {
	public static void main(String args[]) {
		// Find all transactions in the year 2011 and sort them by value (small to
		// high).
		System.out.println("****All transactions in the year 2011 and sorted by value (small to high)****:");
		TransactionUtility.createAndGetTransactionList().stream().filter(transaction -> transaction.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);

		// What are all the unique cities where the traders work?
		System.out.println("****All the unique cities where the traders work****:");
		TraderUtility.createAndGetTraderList().stream().map(trader -> trader.getCity()).distinct()
				.forEach(System.out::println);

		// Find all traders from Cambridge and sort them by name.
		System.out.println("****Traders from Cambridge sorted by name****:");
		TraderUtility.createAndGetTraderList().stream().filter(trader -> trader.getCity().equals("Cambridge"))
				.sorted(Comparator.comparing(Trader::getName)).forEach(System.out::println);

		// Return a string of all traders’ names sorted alphabetically.
		System.out.println("****All Traders' names sorted alphabetically****:");
		Optional<String> string= TraderUtility.createAndGetTraderList().stream().map(trader -> trader.getName()).distinct().sorted()
		.reduce((str1,str2) -> str1 + str2);
		System.out.println(string);

		// Are any traders based in Milan?
		System.out.println("****Are any traders based in Milan?****:");
		if (TraderUtility.createAndGetTraderList().stream().anyMatch(trader -> trader.getCity().equals("Milan"))) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		// Print all transactions’ values from the traders living in Cambridge
		System.out.println("**** All the Transaction's values from the traders living in Cambridge****:");
		TransactionUtility.createAndGetTransactionList().stream()
				.filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
				.map(transaction -> transaction.getValue()).forEach(System.out::println);
		// What’s the highest value of all the transactions?
		
		System.out.println("**** The highest value from all the transacations****:");
		TransactionUtility.createAndGetTransactionList()
		.stream().map(transaction -> transaction.getValue())
		.reduce(Integer :: max).ifPresent(System.out :: println);
		
		// Find the transaction with the smallest value.
		System.out.println("**** The lowest value from all the transacations****:");
		TransactionUtility.createAndGetTransactionList()
		.stream().map(transaction -> transaction.getValue())
		.reduce(Integer :: min).ifPresent(System.out :: println);
	}
}
