package control;

import insuranceRegistration.specialInsuranceRegistration;

public class cSpecialInsuranceRegistration {
	
	private specialInsuranceRegistration specialInsuranceRegistration;
	
	public cSpecialInsuranceRegistration() {
		this.specialInsuranceRegistration = new specialInsuranceRegistration();
	}
	
	public void run() {
		specialInsuranceRegistration.run();
	}


	public void setName(String name) {
		specialInsuranceRegistration.setName(name);
	}


	public void setResidentRegistrationNumber(String residentRegistrationNumber) {
		specialInsuranceRegistration.setResidentRegistrationNumber(residentRegistrationNumber);
	}


	public void setAge(int age) {
		specialInsuranceRegistration.setAge(age);
	}


	public void setPhoneNumber(String phoneNumber) {
		specialInsuranceRegistration.setPhoneNumber(phoneNumber);
	}


	public void setAddress(String address) {
		specialInsuranceRegistration.setAddress(address);
	}


	public void setAccountNumber(String accountNumber) {
		specialInsuranceRegistration.setAccountNumber(accountNumber);
	}

	public void setNote(String note) {
		specialInsuranceRegistration.setNote(note);
	}
	public void setGender(String gender) {
		specialInsuranceRegistration.setGender(gender);
	}

	public void setJob(String job) {
		specialInsuranceRegistration.setJob(job);
	}

	public void setLongterm(String longterm) {
		specialInsuranceRegistration.setLongterm(longterm);
	}
}
