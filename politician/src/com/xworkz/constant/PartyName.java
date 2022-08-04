package com.xworkz.constant;

public enum PartyName {

	JDS("JDS"), BJP("BJP"), CONG("CONG"), BSP("BSP"), PRKY("PRKY"), TDP("TDP"), AIADMK("AIADMK"), LDF("LDF"),
	PDP("PDP");

	private String party;

	private PartyName(String party) {
		this.party = party;

	}

	public String getPartyName() {
		return party;
	}

	public  static PartyName getByParty(String party) {
		PartyName[] partyNames=PartyName.values();
		for(PartyName partyName:partyNames) {
			if(partyName.getPartyName().equals(party));
			return partyName;
			}
		return null;
	}
	}
