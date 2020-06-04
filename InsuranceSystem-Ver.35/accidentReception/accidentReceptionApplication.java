package accidentReception;

import control.cAccidentReceptionApplication;
import insurnaceTool.insurancePostProcessor;

public class accidentReceptionApplication {
	private int isAllright;

	// employee
	public insurancePostProcessor insurancePostProcessor;
	private cAccidentReceptionApplication cAccidentReceptionApplication;
	private String name;
	private String idNumber;
	private String phoneNumber;
	private String eMail;

	public accidentReceptionApplication() {
		this.name = null;
		this.idNumber = null;
		this.phoneNumber = null;
		this.eMail = null;
	}

	public void setName(String name2) {
		this.name = name2;
	}

	public void setIdNumber(String idNumber2) {
		this.idNumber = idNumber2;
	}

	public void setPhoneNumber(String phoneNumber2) {
		this.phoneNumber = phoneNumber2;
	}

	public void setEmail(String eMail2) {
		this.eMail = eMail2;
	}

	public void run() {

	}

	public void sendAcceptMessage(int i) {
		this.isAllright = i;
	}

	public void sendApplication() {
		if (this.isAllright == 1) {
			System.out.println("사고접수완료");
		} else {
			System.out.println("없는 번호입니다");
		}
	}

}