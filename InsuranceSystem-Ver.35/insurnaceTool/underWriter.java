package insurnaceTool;

import java.util.HashMap;

import client.clientListImpl;
import etc.employee;
import global.constant.eJob;

public class underWriter extends employee {

	private int UWID;
	private insuranceRegistration insuranceRegistration;
	private float rate;
	private clientListImpl clientList;
	private HashMap<String, Float> ratePrice;
	private int isAllright;
	private float driver;
	private float fieldJob;
	private float etc;
	private float planeCaptain;
	private float captain;
	private float solider;
	private float sailor;
	private float stewardess;

	public underWriter() {
		this.UWID = 1;
		this.rate = (float) 0.0;
		this.ratePrice = new HashMap<String, Float>();
	}

	public void association(clientListImpl clientListImpl) {
		this.clientList = clientListImpl;
	}

	public void setDriver(String driver2) {
		this.driver = (float) Double.parseDouble(driver2);
	}

	public void setSolider(String solider2) {
		this.solider = (float) Double.parseDouble(solider2);
	}

	public void setFieldJob(String fieldJob2) {
		this.fieldJob = (float) Double.parseDouble(fieldJob2);
	}

	public void setPlaneCaptain(String planeCaptain2) {
		this.planeCaptain = (float) Double.parseDouble(planeCaptain2);
	}

	public void setStewardess(String stewardess2) {
		this.stewardess = (float) Double.parseDouble(stewardess2);
	}

	public void setCaptain(String captain2) {
		this.captain = (float) Double.parseDouble(captain2);
	}

	public void setSailor(String sailor2) {
		this.sailor = (float) Double.parseDouble(sailor2);
	}

	public void setEtc(String etc2) {
		this.etc = (float) Double.parseDouble(etc2);
	}

	public void CalculatePremiumRate() {

		ratePrice.put(eJob.captain.getText(), captain);
		ratePrice.put(eJob.sailor.getText(), sailor);
		ratePrice.put(eJob.driver.getText(), driver);
		ratePrice.put(eJob.planeCaptain.getText(), planeCaptain);
		ratePrice.put(eJob.stewardess.getText(), stewardess);
		ratePrice.put(eJob.solider.getText(), solider);
		ratePrice.put(eJob.fieldJob.getText(), fieldJob);
		ratePrice.put(eJob.etc.getText(), etc);

	}

	public int getUWID() {
		return UWID;
	}

	public void setUWID(int uWID) {
		UWID = uWID;
	}

	public void approveClient() {

		for (int i = 0; i < this.clientList.getClientWaitList().size(); i++) {

			System.out.println("가입 승인 여부를 선택해주세요");
			System.out.println("1. 가입을 승인한다.");
			System.out.println("2. 가입을 거절한다.");
			int isAllright = 1;
			switch (isAllright) {
			case 1:
				// this.clientList.getClientWaitList.get(0).getJob();
				this.clientList.add(false, this.clientList.getClientWaitList().get(0));

				break;
			case 2:
				this.clientList.delete(true, this.clientList.getClientWaitList().get(0));

				break;
			default:
				System.out.println("없는 번호입니다.");
				break;
			}
		}
	}

	public HashMap<String, Float> getRatePrice() {
		return ratePrice;
	}

	public void sendAcceptMessage(int i) {
		this.isAllright = i;
	}

	public void calculatePremiumRate() {
		if (this.isAllright == 1) {
			System.out.println("요율계산완료");
			for (eJob eJob : eJob.values()) {
				System.out.println(ratePrice.get(eJob.getText()));

			}

		} else {
			System.out.println("없는 번호입니다");
		}
	}
}