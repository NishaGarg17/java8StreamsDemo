package com.java8.streamsDemo.utility;

import java.util.ArrayList;

import com.java8.streamsDemo.entity.Trader;
import com.java8.streamsDemo.entity.Transaction;

public class TransactionUtility {
	public static ArrayList<Transaction> createAndGetTransactionList() {
		ArrayList<Transaction> transactionList = new ArrayList<Transaction>();
		ArrayList<Trader> traderList = TraderUtility.createAndGetTraderList();
		transactionList.add(new Transaction(traderList.get(3), 2011, 300));
		transactionList.add(new Transaction(traderList.get(0), 2012, 1000));
		transactionList.add(new Transaction(traderList.get(0), 2011, 400));
		transactionList.add(new Transaction(traderList.get(1), 2012, 710));
		transactionList.add(new Transaction(traderList.get(1), 2012, 700));
		transactionList.add(new Transaction(traderList.get(2), 2012, 950));
		return transactionList;
	}
}
