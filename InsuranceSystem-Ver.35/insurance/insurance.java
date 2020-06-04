package insurance;

import java.util.Date;

public class insurance {

	enum fireProperty {

	};

//보험이름
	private String name;
	// 보상횟수
	private String compensationAmount;
	// 고객아이디
	private int clientID;
	// 보험아이디
	private int insuranceID;
	// 보험금
	private int insuranceMoney;
	// 보험기간
	private String insurancePeriod;
	// 납입비
	private int payment;
	// 지불날
	private Date paymentDate;
	// 지불방법
	private String paymentMethod;
	// 요율
	private float rate;
//가입특약
	private String specialSubscription;
	// 가입대상
	private String subscriptionTarget;

	public insurance() {
	}

	public float premiumRate(int targetCustomerID) {
		return rate;
	}

	public String getCompensationAmount() {
		return compensationAmount;
	}

	public void setCompensationAmount(String compensationAmount) {
		this.compensationAmount = compensationAmount;
	}

	public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public int getInsuranceID() {
		return insuranceID;
	}

	public void setInsuranceID(int insuranceID) {
		this.insuranceID = insuranceID;
	}

	public int getInsuranceMoney() {
		return insuranceMoney;
	}

	public void setInsuranceMoney(int insuranceMoney) {
		this.insuranceMoney = insuranceMoney;
	}

	public String getInsurancePeriod() {
		return insurancePeriod;
	}

	public void setInsurancePeriod(String insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public String getSpecialSubscription() {
		return specialSubscription;
	}

	public void setSpecialSubscription(String specialSubscription) {
		this.specialSubscription = specialSubscription;
	}

	public String getSubscriptionTarget() {
		return subscriptionTarget;
	}

	public void setSubscriptionTarget(String subscriptionTarget) {
		this.subscriptionTarget = subscriptionTarget;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}