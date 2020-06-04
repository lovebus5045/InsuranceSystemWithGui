package control;

import accidentReception.accidentReceptionCheck;

public class cAccidentReceptionCheck {
	private accidentReceptionCheck accidentReceptionCheck;
	
	public cAccidentReceptionCheck() {
		this.accidentReceptionCheck = new accidentReceptionCheck();
	}

	public void sendAcceptMessage(int i) { //½ÂÀÎ
		this.accidentReceptionCheck.sendAcceptMessage(i);
		this.accidentReceptionCheck.sendInsuranceMoney();
	}

	public void sendDenialMessage(int i) { //°ÅÀý
		this.accidentReceptionCheck.sendDenialMessage(i);
		this.accidentReceptionCheck.sendInsuranceMoney();
	}

}
