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
	private boolean accident;// true면 사고 발생한걸로

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
			System.out.println("1. 보험금 지급");
			
		} else if (this.isAllright == 2) {
			System.out.println("2. 보험금 지급 거절");

		} else {
			System.out.println("없는 번호입니다");
		}
	}
	public void payOut() {
//		int insuranceID = this.insurance.getInsuranceID();
//		int CinsuranceID = this.client.getInsuranceID();
//
//		if (insuranceID == CinsuranceID) {// 모르겠다 이게 맞는지
//
//		}

	}

	public void receiptTheAccident() {
		// GUI로 한다하면 버튼 눌러서 false를 true로 바꿔주고 이하 진행하는 것이 깔끔해보임.
		// 사고가 났다고 고객이 입력 --> 보험금 지급 버튼을 누른다.
		this.accident = true;

		if (this.accident == true) {
			// this.accidentReceptionList.add(this.client);
			boolean clientCheck = searchTheClientInformation();// 조회해서 가입된 사람인지 확인

			if (clientCheck == true) {
				System.out.println("가입된 고객임을 확인했습니다.");
				payOut();
			} else {
				System.out.println("가입되지 않은 고객입니다.");
			}
		}
	}

	public boolean searchTheClientInformation() {
		clientListImpl clientListImpl = new clientListImpl();

		boolean clientCheck = false;
		int insurancePPID = 0;
		System.out.println("보험사후처리사는 개인 ID를 입력하시오");
		if (this.insurancePostProcessorID == insurancePPID) {
			System.out.println("확인되었습니다.");
			clientCheck = clientListImpl.lookUpClientInformation(this.clientName, this.clientPhoneNumber);
		} else {
			System.out.println("다시 입력하시오");
			searchTheClientInformation();// 다시
		}

		return clientCheck;
	}

}
