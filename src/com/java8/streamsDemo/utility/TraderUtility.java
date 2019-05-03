package com.java8.streamsDemo.utility;

import java.util.ArrayList;

import com.java8.streamsDemo.entity.Trader;

public class TraderUtility {
	
	public static ArrayList<Trader> createAndGetTraderList() {
		ArrayList<Trader> traderList = new ArrayList<Trader>();
		traderList.add(new Trader("Raoul", "Cambridge"));
		traderList.add(new Trader("Mario","Milan"));
		traderList.add(new Trader("Alan","Cambridge"));
		traderList.add(new Trader("Brian","Cambridge"));
		return traderList;
	}
}
