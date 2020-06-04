package control;

import insurnaceDesinging.fireInsurnaceDesinging;

public class cFireInsuranceDesigning {

	private fireInsurnaceDesinging fireInsurnaceDesinging;

	public cFireInsuranceDesigning() {

		this.fireInsurnaceDesinging = new fireInsurnaceDesinging();
	}

	public void setPayment(String payment) {
		this.fireInsurnaceDesinging.setPayment(payment);

	}

	public void setPeriod(String period) {
		this.fireInsurnaceDesinging.setPeriod(period);

	}

	public void setPaymentMethod(String paymentMethod) {
		this.fireInsurnaceDesinging.setPaymentMethod(paymentMethod);

	}

	public void setInsurnaceMoney(String insurnaceMoney) {
		this.fireInsurnaceDesinging.setInsurnaceMoney(insurnaceMoney);

	}

	public void setCompensationAmount(String CompensationAmount) {
		this.fireInsurnaceDesinging.setCompensationAmount(CompensationAmount);

	}

	public void setNotes(String notes) {
		this.fireInsurnaceDesinging.setNotes(notes);

	}

	public void setSpecialSubscription(String SpecialSubscription) {
		this.fireInsurnaceDesinging.setSpecialSubscription(SpecialSubscription);

	}

	public void setSubscriptionTarget(String text) {
		this.fireInsurnaceDesinging.setSubscriptionTarget(text);

	}
	public void setLongtermPeriod(String text) {
		this.fireInsurnaceDesinging.setLongtermPeriod(text);
		
	}
	public void runFireInsurnaceDesign() {

		this.fireInsurnaceDesinging.run();
	}

	

}
