package insurnaceTool;

import insurance.insuranceList;
import insurance.insuranceListImpl;

/**
 * @author user
 * @version 1.0
 * @created 11-5-2020 ���� 9:35:36
 */
public class insuranceRetrieval {

	private int insuranceID;
	public insuranceList insuracnceList;

	public insuranceRetrieval() {
		this.insuracnceList = new insuranceListImpl();
	}

	public void searchByAmount(String searchMethod) {
		System.out.println("������� �˻�");
	}

	public void searchByPeriod(String searchMethod) {
		System.out.println("�Ⱓ���� �˻�");

	}

	public void searchForInsuranceName(String searchMethod) {
		System.out.println("�����̸����� �˻�");

	}

}