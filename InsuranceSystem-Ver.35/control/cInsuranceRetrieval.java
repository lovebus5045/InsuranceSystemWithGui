package control;

import insurnaceTool.insuranceRetrieval;

public class cInsuranceRetrieval {

	private insuranceRetrieval insuranceRetrieval;

	public cInsuranceRetrieval() {
		this.insuranceRetrieval = new insuranceRetrieval();
	}

	public void searchInformation(String searchType, String searchMethod) {

		if (searchType == "보험이름") {
			this.insuranceRetrieval.searchForInsuranceName(searchMethod);
		} else if (searchType == "보험기간") {
			this.insuranceRetrieval.searchByPeriod(searchMethod);
		} else if (searchType == "보험가격") {
			this.insuranceRetrieval.searchByAmount(searchMethod);
		}
	}
}
