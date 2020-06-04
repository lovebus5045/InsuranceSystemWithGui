package control;

import insurnaceDesinging.carInsuranceDesigning;

public class cCarInsuranceDesinging {

	private carInsuranceDesigning carInsurnaceDesigning;

	public cCarInsuranceDesinging() {

		this.carInsurnaceDesigning = new carInsuranceDesigning();
	}

	public void setSubscriptionTarget(String subscriptionTarget) {

		this.carInsurnaceDesigning.subscriptionTarget(subscriptionTarget);
	}

	public void setPayment(String payment) {
		this.carInsurnaceDesigning.setPayment(payment);

	}

	public void setPeriod(String period) {
		this.carInsurnaceDesigning.setPeriod(period);

	}

	public void setPaymentMethod(String paymentMethod) {
		this.carInsurnaceDesigning.setPaymentMethod(paymentMethod);

	}

	public void setInsurnaceMoney(String insurnaceMoney) {
		this.carInsurnaceDesigning.setInsurnaceMoney(insurnaceMoney);

	}

	public void setCompensationAmount(String CompensationAmount) {
		this.carInsurnaceDesigning.setCompensationAmount(CompensationAmount);

	}

	public void setNotes(String notes) {
		this.carInsurnaceDesigning.setNotes(notes);

	}

	public void setSpecialSubscription(String SpecialSubscription) {
		this.carInsurnaceDesigning.setSpecialSubscription(SpecialSubscription);

	}

	public void setLongterPeriod(String longTermPeriod) {

		this.carInsurnaceDesigning.setLongTermPeriod(longTermPeriod);
	}

	public void runcarInsurnaceDesign() {
		this.carInsurnaceDesigning.run();

	}

}
