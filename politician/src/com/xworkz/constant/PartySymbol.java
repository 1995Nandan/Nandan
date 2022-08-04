package com.xworkz.constant;

public enum PartySymbol {

	LION("LiON"), LOTUS("Lotus"), PALM("Palm"), ELEPHANT("Elephant"), AUTO("Auto"), CYCLE("Cycle"),
	TWOLEAVES("Twoleaves"), FISH("Fish"), UMBRELLA("Umbrella");

	private String symbol;

	private PartySymbol(String symbol) {
		this.symbol = symbol;

	}

	public String getPartySymbol() {
		return symbol;
	}

	public static PartySymbol getBySymbol(String symbol) {
		PartySymbol[] partySymbols = PartySymbol.values();
		for (PartySymbol partySymbol : partySymbols) {
			if (partySymbol.getPartySymbol().equals(symbol))
				;
			return partySymbol;
		}
		return null;

	}
}
