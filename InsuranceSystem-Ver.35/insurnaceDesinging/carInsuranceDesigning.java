package insurnaceDesinging;

import insurance.insuranceList;
import insurance.insuranceListImpl;
import insurance.specialInsurance;
import insurnaceTool.underWriter;

public class carInsuranceDesigning {
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
	private String SpecialType;
	private boolean waitList = true;

	public carInsuranceDesigning() {
		this.insuranceID = 1;
		this.subscriptionTarget = null;
		this.payment = 0;
		this.insurancePeriod = null;
		this.paymentMethod = null;
		this.insuranceMoney = 0;
		this.compensationAmount = null;
		this.notes = null;
		this.specialSubscription = null;

		this.insuranceList = new insuranceListImpl();// �����
	}

	public void subscriptionTarget(String subscriptionTarget2) {

		this.subscriptionTarget = subscriptionTarget2;

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

	}

	public void run() {
		specialInsurance specialInsurance = new specialInsurance();
		System.out.println("Ư�� ���� ���� �Դϴ�.");
		// �ָ��� �۾��ϱ�
		System.out.println("���� ������ �������ּ���");
		// this.SpecialType = sc.next();
		specialInsurance.setSpecialType(SpecialType);

		// specialInsurance.setName("Ư������");
		// Ư�����輳���Դϴ�. --> 1�� -->���ﺸ �����Դϴ�.

		System.out.println("�ش� ������ ID�� " + insuranceID);
		specialInsurance.setInsuranceID(insuranceID);

		System.out.println("���Դ���� �Է����ּ���");
		specialInsurance.setSubscriptionTarget(subscriptionTarget);

		System.out.println("���Ժ�  �Է����ּ���");
		specialInsurance.setPayment(payment);

		System.out.println("���� �Ⱓ�� �Է����ּ���");
		System.out.println("Ex)0000/00/00");
		specialInsurance.setInsurancePeriod(insurancePeriod);

		System.out.println("���� ����� �Է����ּ���");
		specialInsurance.setPaymentMethod(paymentMethod);

		System.out.println("������� �Է����ּ���");
		specialInsurance.setInsuranceMoney(insuranceMoney);

		System.out.println("����Ƚ���� �Է����ּ���");
		specialInsurance.setCompensationAmount(compensationAmount);

		System.out.println("���� Ư���� �Է����ּ���");
		specialInsurance.setSpecialSubscription(specialSubscription);

		System.out.println("��������� �Է����ּ���");
		specialInsurance.setNotes(notes);

		this.insuranceList.add(waitList, specialInsurance);
		insuranceID++;
	}

}
