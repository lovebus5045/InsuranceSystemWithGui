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
		System.out.println("ȭ�� ���� ���� �Դϴ�.");
		fireInsurance.setName("ȭ�纸��");
		System.out.println("�ش� ������ ID�� " + insuranceID);
		fireInsurance.setInsuranceID(insuranceID);
		System.out.println("���Դ���� �Է����ּ���");
		System.out.println("Ex)�ֱ� 2�� �� ȭ�� ��� ���� ���");

		fireInsurance.setSpecialSubscription(specialSubscription);

		System.out.println("���Ժ�  �Է����ּ���");
		System.out.println("Ex)100000");

		fireInsurance.setPayment(payment);

		System.out.println("���� �Ⱓ�� �Է����ּ���");
		System.out.println("Ex)1��");
		fireInsurance.setInsurancePeriod(insurancePeriod);

		System.out.println("���� ����� �Է����ּ���");
		System.out.println("Ex)������ü");
		fireInsurance.setPaymentMethod(paymentMethod);

		System.out.println("������� �Է����ּ���");
		System.out.println("Ex)100000000");
		fireInsurance.setInsuranceMoney(insuranceMoney);

		System.out.println("����Ƚ���� �Է����ּ���");
		System.out.println("Ex)2ȸ");
		fireInsurance.setCompensationAmount(compensationAmount);

		System.out.println("��������� �Է����ּ���");
		System.out.println("??");
		fireInsurance.setNotes(notes);

		System.out.println("���� Ư���� �Է����ּ���");
		System.out.println("Ex)����");
		fireInsurance.setSpecialSubscription(specialSubscription);

		this.insuranceList.add(waitList, fireInsurance);

		insuranceID++;

	}


}
