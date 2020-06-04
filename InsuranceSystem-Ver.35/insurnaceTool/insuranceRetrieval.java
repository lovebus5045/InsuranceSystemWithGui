package insurnaceTool;

import insurance.insuranceList;
import insurance.insuranceListImpl;

/**
 * @author user
 * @version 1.0
 * @created 11-5-2020 오후 9:35:36
 */
public class insuranceRetrieval {

	private int insuranceID;
	public insuranceList insuracnceList;

	public insuranceRetrieval() {
		this.insuracnceList = new insuranceListImpl();
	}

	public void searchByAmount(String searchMethod) {
		System.out.println("비용으로 검색");
	}

	public void searchByPeriod(String searchMethod) {
		System.out.println("기간으로 검색");

	}

	public void searchForInsuranceName(String searchMethod) {
		System.out.println("보험이름으로 검색");

	}

}