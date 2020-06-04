package control;

import insurnaceTool.insuranceApproval;

public class cInsurnaceApproval {
	private insuranceApproval insuranceApproval;

	public cInsurnaceApproval() {
		this.insuranceApproval = new insuranceApproval();
	}

	public void sendDenialMessage(int i) {
		// °ÅÀý

		this.insuranceApproval.sendDenialMessage(i);
		this.insuranceApproval.approveInsurance();

	}

	public void sendAcceptMessage(int i) {
		// ½ÂÀÎ
		this.insuranceApproval.sendAcceptMessage(i);
		this.insuranceApproval.approveInsurance();

	}

}
