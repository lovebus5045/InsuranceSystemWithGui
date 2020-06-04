package insurnaceDesinging;

import insurance.fireInsurance;
import insurance.insuranceList;
import insurance.insuranceListImpl;
import insurnaceTool.underWriter;

public class fireInsurnaceDesinging {

	private int insuranceID;
	private underWriter underWriter;
	private insuranceList insuranceList;
	private int payment;
	private String insurancePeriod;
	private String paymentMethod;
	private int insuranceMoney;
	private String compensationAmount;
	private String notes;
	private String specialSubscription;
	private boolean waitList = true;

	public fireInsurnaceDesinging() {
		this.insuranceID = 1;
		this.payment = 0;
		this.insurancePeriod = null;
		this.paymentMethod = null;
		this.insuranceMoney = 0;
		this.compensationAmount = null;
		this.notes = null;
		this.specialSubscription = null;

		this.insuranceList = new insuranceListImpl();
	}

	public void setSubscriptionTarget(String text) {
		// TODO Auto-generated method stub

	}

	public void setPayment(String payment2) {
		this.payment = Integer.parseInt(payment2);

	}

	public void setPeriod(String period) {

		this.insurancePeriod = period;

	}

	public void setPaymentMethod(String paymentMethod2) {
		this.paymentMethod = paymentMethod2;

	}

	public void setInsurnaceMoney(String insurnaceMoney) {

		this.insuranceMoney = Integer.parseInt(insurnaceMoney);
	}

	public void setCompensationAmount(String compensationAmount2) {
		this.compensationAmount = compensationAmount2;

	}

	public void setNotes(String notes2) {
		this.notes = notes2;

	}

	public void setSpecialSubscription(String specialSubscription2) {
		this.specialSubscription = specialSubscription2;

	}
	public void setLongtermPeriod(String text) {
		// TODO Auto-generated method stub
		
	}

	public void run() {
		fireInsurance fireInsurance = new fireInsurance();
		System.out.println("화재 보험 설계 입니다.");
		fireInsurance.setName("화재보험");
		System.out.println("해당 보험의 ID는 " + insuranceID);
		fireInsurance.setInsuranceID(insuranceID);
		System.out.println("가입대상을 입력해주세요");
		System.out.println("Ex)최근 2년 내 화재 사고가 없는 사람");

		fireInsurance.setSpecialSubscription(specialSubscription);

		System.out.println("납입비를  입력해주세요");
		System.out.println("Ex)100000");

		fireInsurance.setPayment(payment);

		System.out.println("보험 기간을 입력해주세요");
		System.out.println("Ex)1년");
		fireInsurance.setInsurancePeriod(insurancePeriod);

		System.out.println("납입 방법을 입력해주세요");
		System.out.println("Ex)계좌이체");
		fireInsurance.setPaymentMethod(paymentMethod);

		System.out.println("보험금을 입력해주세요");
		System.out.println("Ex)100000000");
		fireInsurance.setInsuranceMoney(insuranceMoney);

		System.out.println("보상횟수을 입력해주세요");
		System.out.println("Ex)2회");
		fireInsurance.setCompensationAmount(compensationAmount);

		System.out.println("참고사항을 입력해주세요");
		System.out.println("??");
		fireInsurance.setNotes(notes);

		System.out.println("가입 특약을 입력해주세요");
		System.out.println("Ex)없음");
		fireInsurance.setSpecialSubscription(specialSubscription);

		this.insuranceList.add(waitList, fireInsurance);

		insuranceID++;

	}


}
