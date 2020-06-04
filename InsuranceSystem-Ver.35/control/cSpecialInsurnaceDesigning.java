package control;

import insurnaceDesinging.specialInsuranceDesigning;

public class cSpecialInsurnaceDesigning {
	private specialInsuranceDesigning specialInsuranceDesigning;

	public cSpecialInsurnaceDesigning() {
		this.specialInsuranceDesigning = new specialInsuranceDesigning();

	}

	public void setSubscriptionTarget(String subscriptionTarget) {

		this.specialInsuranceDesigning.subscriptionTarget(subscriptionTarget);
	}

	public void setPayment(String payment) {
		this.specialInsuranceDesigning.setPayment(payment);

	}

	public void setPeriod(String period) {
		this.specialInsuranceDesigning.setPeriod(period);

	}

	public void setPaymentMethod(String paymentMethod) {
		this.specialInsuranceDesigning.setPaymentMethod(paymentMethod);

	}

	public void setInsurnaceMoney(String insurnaceMoney) {
		this.specialInsuranceDesigning.setInsurnaceMoney(insurnaceMoney);

	}

	public void setCompensationAmount(String CompensationAmount) {
		this.specialInsuranceDesigning.setCompensationAmount(CompensationAmount);

	}

	public void setNotes(String notes) {
		this.specialInsuranceDesigning.setNotes(notes);

	}

	public void setSpecialSubscription(String SpecialSubscription) {
		this.specialInsuranceDesigning.setSpecialSubscription(SpecialSubscription);

	}

	public void setLongterPeriod(String longTermPeriod) {

		this.specialInsuranceDesigning.setLongTermPeriod(longTermPeriod);
	}

	public void runcSpecialInsurnace() {
		this.specialInsuranceDesigning.run();

	}
}
