import com.xowrkz.politician.dto.PoliticianDTO;
import com.xworkz.constant.PartyName;
import com.xworkz.constant.PartySymbol;
import com.xworkz.politician.dao.PoliticianDAO;
import com.xworkz.politician.dao.PoliticianImpl;

public class PoliticianRunner {

	public static void main(String[] args) {
		PoliticianDTO politicianDTO1 = new PoliticianDTO(1, "Kumarswamy", PartyName.JDS, "Devegowda", PartySymbol.LION,
				"Banglore", "50", "Nothing", 100000.00D);
		PoliticianDTO politicianDTO2 = new PoliticianDTO(2, "Siddu", PartyName.CONG, "Sonia", PartySymbol.PALM,
				"Banglore", "50", "Nothing", 100000.00D);
		PoliticianDTO politicianDTO3 = new PoliticianDTO(3, "Cheluva", PartyName.CONG, "Sonia", PartySymbol.PALM,
				"Banglore", "50", "Nothing", 200000.00D);
		PoliticianDTO politicianDTO4 = new PoliticianDTO(4, "Bomma", PartyName.BJP, "Modi", PartySymbol.LOTUS,
				"NewDehli", "60", "Nothing", 150000.00D);
		PoliticianDTO politicianDTO5 = new PoliticianDTO(5, "Reddy", PartyName.TDP, "Modi", PartySymbol.CYCLE, "AP",
				"45", "Nothing", 160000.00D);
		PoliticianDTO politicianDTO6 = new PoliticianDTO(6, "Amma", PartyName.AIADMK, "Sonia", PartySymbol.TWOLEAVES,
				"Chennai", "60", "Nothing", 130000.00D);
		PoliticianDTO politicianDTO7 = new PoliticianDTO(7, "Pinarayi", PartyName.LDF, "Sonia", PartySymbol.FISH,
				"Kerala", "35", "Nothing", 105000.00D);
		PoliticianDTO politicianDTO8 = new PoliticianDTO(8, "Chand mahajan", PartyName.PDP, "Sonia",
				PartySymbol.UMBRELLA, "J&K", "50", "Nothing", 100000.00D);
		PoliticianDTO politicianDTO9 = new PoliticianDTO(9, "Shivu", PartyName.CONG, "Sonia", PartySymbol.PALM,
				"Banglore", "50", "Nothing", 100500.00D);
		PoliticianDTO politicianDTO10 = new PoliticianDTO(10, "Uppi", PartyName.PRKY, "No", PartySymbol.AUTO,
				"Banglore", "20", "Democracy", 100000.00D);
		PoliticianDTO politicianDTO11 = new PoliticianDTO(11, "Maya", PartyName.BSP, "No", PartySymbol.ELEPHANT, "UP",
				"20", "Nothing", 1600000.00D);

		PoliticianDAO dao = new PoliticianImpl();
		/*
		 * dao.saveDetails(politicianDTO1); dao.saveDetails(politicianDTO2);
		 * dao.saveDetails(politicianDTO3); dao.saveDetails(politicianDTO4);
		 * dao.saveDetails(politicianDTO5); dao.saveDetails(politicianDTO6);
		 * dao.saveDetails(politicianDTO7); dao.saveDetails(politicianDTO8);
		 * dao.saveDetails(politicianDTO9); dao.saveDetails(politicianDTO10);
		 * dao.saveDetails(politicianDTO11);
		 */

		// PoliticianDTO dto = dao.findById(2);
		// System.out.println(dto);

		// PoliticianDTO dto1 = dao.findByIdPresident(5, "Modi");
		// System.out.println(dto1);

		// PoliticianDTO dto2=dao.findByIdPresidentAndName(10, "No", "Uppi");
		// System.out.println(dto2);

		// PoliticianDTO dto3 = dao.findByIdAndName(5,"Reddy");
		// System.out.println(dto3);

		// PoliticianDTO dto4=dao.findNameById(6);
		// System.out.println(dto4);

		//PoliticianDTO dto5 = dao.findPresidentByIdAndName(3, "Cheluva");
		//System.out.println(dto5);

	}

}
