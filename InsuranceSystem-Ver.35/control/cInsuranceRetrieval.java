package control;

import insurnaceTool.insuranceRetrieval;

public class cInsuranceRetrieval {

	private insuranceRetrieval insuranceRetrieval;

	public cInsuranceRetrieval() {
		this.insuranceRetrieval = new insuranceRetrieval();
	}

	public void searchInformation(String searchType, String searchMethod) {

		if (searchType == "�����̸�") {
			this.insuranceRetrieval.searchForInsuranceName(searchMethod);
		} else if (searchType == "����Ⱓ") {
			this.insuranceRetrieval.searchByPeriod(searchMethod);
		} else if (searchType == "���谡��") {
			this.insuranceRetrieval.searchByAmount(searchMethod);
		}
	}
}
