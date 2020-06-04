package insurnaceDesinging;

import insurance.insuranceList;
import insurance.insuranceListImpl;
import insurance.onTheSeaInsurance;
import insurnaceTool.underWriter;

public class onTheSeaInsuranceDesinging {

	private int insuranceID;
	private underWriter underWriter;
	private insuranceList insuranceList;
	private String subscriptionTarget;
	private int payment;
	private String insurancePeriod;
	private String paymentMethod;
	private int insuranceMoney;
	private String compensationAmount;
	private String notes;
	private String specialSubscription;
	private String SeaInsurancetype;
	private String SpecialType;
	private boolean waitList = true;

	public onTheSeaInsuranceDesinging() {
		this.insuranceID = 1;
		this.subscriptionTarget = null;
		this.payment = 0;
		this.insurancePeriod = null;
		this.paymentMethod = null;
		this.insuranceMoney = 0;
		this.compensationAmount = null;
		this.notes = null;
		this.specialSubscription = null;

		this.insuranceList = new insuranceListImpl();
	}

	public void setSubscriptionTarget(String subscriptionTarget2) {

		this.subscriptionTarget = subscriptionTarget2;
	}

	public void setPayment(String payment2) {
		if (payment2 != null) {
			System.out.println(payment2);
			// this.payment = Integer.parseInt(payment2);
		}
	}

	public void setPeriod(String period) {

		this.insurancePeriod = period;

	}

	public void setPaymentMethod(String paymentMethod2) {
		this.paymentMethod = paymentMethod2;

	}

	public void setInsurnaceMoney(String insurnaceMoney) {
		System.out.println(this.insuranceMoney);
		// this.insuranceMoney = Integer.parseInt(insurnaceMoney);
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

	public void setLongTermPeriod(String longTermPeriod) {
		// 이거 왜 없지?
	}

	public void run() {
		onTheSeaInsurance ontheSeaInsurance = new onTheSeaInsurance();
		System.out.println("해상 보험 설계 입니다.");
		ontheSeaInsurance.setName("해상보험");
		System.out.println("해당 보험의 ID는 " + insuranceID);
		ontheSeaInsurance.setInsuranceID(insuranceID);

		System.out.println("가입대상을 입력해주세요");
		ontheSeaInsurance.setSubscriptionTarget(subscriptionTarget);

		System.out.println("납입비를  입력해주세요");
		// this.payment = sc.nextInt();
		ontheSeaInsurance.setPayment(payment);

		System.out.println("보험 기간을 입력해주세요");
		System.out.println("Ex)0000/00/00");
		// this.insurancePeriod = sc.next();
		ontheSeaInsurance.setInsurancePeriod(insurancePeriod);

		System.out.println("납입 방법을 입력해주세요");
		// this.paymentMethod = sc.next();
		ontheSeaInsurance.setPaymentMethod(paymentMethod);

		System.out.println("보험금을 입력해주세요");
		// this.insuranceMoney = sc.nextInt();
		ontheSeaInsurance.setInsuranceMoney(insuranceMoney);

		System.out.println("보상횟수을 입력해주세요");
		// this.compensationAmount = sc.next();
		ontheSeaInsurance.setCompensationAmount(compensationAmount);

		System.out.println("참고사항을 입력해주세요");
		// this.notes = sc.next();
		ontheSeaInsurance.setNotes(notes);

		System.out.println("가입 특약을 입력해주세요");
		// this.specialSubscription = sc.next();
		ontheSeaInsurance.setSpecialSubscription(specialSubscription);

		System.out.println("보험 종류를 입력해주세요");
		// this.SeaInsurancetype = sc.next();
		ontheSeaInsurance.setSeaInsurancetype(SeaInsurancetype);
		this.insuranceList.add(waitList, ontheSeaInsurance);
		insuranceID++;

	}

}
