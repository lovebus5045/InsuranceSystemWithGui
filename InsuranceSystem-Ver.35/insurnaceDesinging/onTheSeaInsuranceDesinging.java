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
		// �̰� �� ����?
	}

	public void run() {
		onTheSeaInsurance ontheSeaInsurance = new onTheSeaInsurance();
		System.out.println("�ػ� ���� ���� �Դϴ�.");
		ontheSeaInsurance.setName("�ػ���");
		System.out.println("�ش� ������ ID�� " + insuranceID);
		ontheSeaInsurance.setInsuranceID(insuranceID);

		System.out.println("���Դ���� �Է����ּ���");
		ontheSeaInsurance.setSubscriptionTarget(subscriptionTarget);

		System.out.println("���Ժ�  �Է����ּ���");
		// this.payment = sc.nextInt();
		ontheSeaInsurance.setPayment(payment);

		System.out.println("���� �Ⱓ�� �Է����ּ���");
		System.out.println("Ex)0000/00/00");
		// this.insurancePeriod = sc.next();
		ontheSeaInsurance.setInsurancePeriod(insurancePeriod);

		System.out.println("���� ����� �Է����ּ���");
		// this.paymentMethod = sc.next();
		ontheSeaInsurance.setPaymentMethod(paymentMethod);

		System.out.println("������� �Է����ּ���");
		// this.insuranceMoney = sc.nextInt();
		ontheSeaInsurance.setInsuranceMoney(insuranceMoney);

		System.out.println("����Ƚ���� �Է����ּ���");
		// this.compensationAmount = sc.next();
		ontheSeaInsurance.setCompensationAmount(compensationAmount);

		System.out.println("��������� �Է����ּ���");
		// this.notes = sc.next();
		ontheSeaInsurance.setNotes(notes);

		System.out.println("���� Ư���� �Է����ּ���");
		// this.specialSubscription = sc.next();
		ontheSeaInsurance.setSpecialSubscription(specialSubscription);

		System.out.println("���� ������ �Է����ּ���");
		// this.SeaInsurancetype = sc.next();
		ontheSeaInsurance.setSeaInsurancetype(SeaInsurancetype);
		this.insuranceList.add(waitList, ontheSeaInsurance);
		insuranceID++;

	}

}
