package insurnaceTool;

import control.cEmailSend;
import etc.financialManagementCommittee;
import insurance.insuranceListImpl;

public class insuranceApproval {

	private int approverID;
	private int insuranceID;
	private int isAllright;

	private financialManagementCommittee financialManagementCommittee;
	private insuranceListImpl insuracneList;
	// private boolean isAllright = false;

	public insuranceApproval() {
	}

	public void association(insuranceListImpl insuranceListImpl) {
		this.insuracneList = insuranceListImpl;
	}

	public void sendDenialMessage(int i) {
		this.isAllright = i;
	}

	public void sendAcceptMessage(int i) {

		this.isAllright = i;
	}

	public void approveInsurance() {

		if (this.isAllright == 1) {
			System.out.println("1. 승인하다");
			cEmailSend cEmailSend = new cEmailSend();
			cEmailSend.sendEmail();
			// wait삭제 --> 보험란 추가
		} else if (this.isAllright == 2) {
			System.out.println("2. 거절한다.");
			// wait 삭제
		} else {
			System.out.println("없는 번호입니다");
		}
	}

}