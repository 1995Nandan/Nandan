package com.xowrkz.politician.dto;

import java.io.Serializable;

import com.xworkz.constant.PartyName;
import com.xworkz.constant.PartySymbol;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class PoliticianDTO implements Serializable {

	private Integer id;
	private String name;
	private PartyName partyName = PartyName.getByParty(name);
	private String partyPresident;
	private PartySymbol partySymbol = PartySymbol.getBySymbol(name);
	private String headQuaters;
	private String partyMembers;
	private String partyScheme;
	private Double partyFunds;

}
