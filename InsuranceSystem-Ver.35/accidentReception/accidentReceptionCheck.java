package accidentReception;

import java.util.ArrayList;

import client.client;
import client.clientList;
import client.clientListImpl;
import insurance.insurance;

public class accidentReceptionCheck {
	private insurance insurance;
	private client client;

	private int clientID;
	private String clientName;
	private String clientPhoneNumber;
	
	private int isAllright;
	private int insurancePostProcessorID;
	private boolean accident;// true�� ��� �߻��Ѱɷ�

	// list
	private ArrayList<client> accidentReceptionList; // What is this for?
	public clientList clientList;
	
	public accidentReceptionCheck() {
		this.accident = false;
	}

	public void sendAcceptMessage(int i) {
		this.isAllright = i;
	}

	public void sendDenialMessage(int i) {
		this.isAllright = i;
	}

	public void sendInsuranceMoney() {
		if (this.isAllright == 1) {
			System.out.println("1. ����� ����");
			
		} else if (this.isAllright == 2) {
			System.out.println("2. ����� ���� ����");

		} else {
			System.out.println("���� ��ȣ�Դϴ�");
		}
	}
	public void payOut() {
//		int insuranceID = this.insurance.getInsuranceID();
//		int CinsuranceID = this.client.getInsuranceID();
//
//		if (insuranceID == CinsuranceID) {// �𸣰ڴ� �̰� �´���
//
//		}

	}

	public void receiptTheAccident() {
		// GUI�� �Ѵ��ϸ� ��ư ������ false�� true�� �ٲ��ְ� ���� �����ϴ� ���� ����غ���.
		// ��� ���ٰ� ���� �Է� --> ����� ���� ��ư�� ������.
		this.accident = true;

		if (this.accident == true) {
			// this.accidentReceptionList.add(this.client);
			boolean clientCheck = searchTheClientInformation();// ��ȸ�ؼ� ���Ե� ������� Ȯ��

			if (clientCheck == true) {
				System.out.println("���Ե� ������ Ȯ���߽��ϴ�.");
				payOut();
			} else {
				System.out.println("���Ե��� ���� ���Դϴ�.");
			}
		}
	}

	public boolean searchTheClientInformation() {
		clientListImpl clientListImpl = new clientListImpl();

		boolean clientCheck = false;
		int insurancePPID = 0;
		System.out.println("�������ó����� ���� ID�� �Է��Ͻÿ�");
		if (this.insurancePostProcessorID == insurancePPID) {
			System.out.println("Ȯ�εǾ����ϴ�.");
			clientCheck = clientListImpl.lookUpClientInformation(this.clientName, this.clientPhoneNumber);
		} else {
			System.out.println("�ٽ� �Է��Ͻÿ�");
			searchTheClientInformation();// �ٽ�
		}

		return clientCheck;
	}

}
