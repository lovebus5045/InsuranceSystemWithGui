package control;

import insurnaceTool.insuranceApproval;

public class cInsurnaceApproval {
	private insuranceApproval insuranceApproval;

	public cInsurnaceApproval() {
		this.insuranceApproval = new insuranceApproval();
	}

	public void sendDenialMessage(int i) {
		// ����

		this.insuranceApproval.sendDenialMessage(i);
		this.insuranceApproval.approveInsurance();

	}

	public void sendAcceptMessage(int i) {
		// ����
		this.insuranceApproval.sendAcceptMessage(i);
		this.insuranceApproval.approveInsurance();

	}

}
