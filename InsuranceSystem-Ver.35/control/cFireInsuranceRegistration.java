package control;

import insuranceRegistration.fireInsuranceRegistration;

public class cFireInsuranceRegistration {

	private fireInsuranceRegistration fireInsuranceRegistration;
	
	public cFireInsuranceRegistration() {
		this.fireInsuranceRegistration = new fireInsuranceRegistration();
	}
	
	public void run() {
		fireInsuranceRegistration.run();
	}


	public void setName(String name) {
		fireInsuranceRegistration.setName(name);
	}


	public void setResidentRegistrationNumber(String residentRegistrationNumber) {
		fireInsuranceRegistration.setResidentRegistrationNumber(residentRegistrationNumber);
	}


	public void setAge(int age) {
		fireInsuranceRegistration.setAge(age);
	}


	public void setPhoneNumber(String phoneNumber) {
		fireInsuranceRegistration.setPhoneNumber(phoneNumber);
	}


	public void setAddress(String address) {
		fireInsuranceRegistration.setAddress(address);
	}


	public void setAccountNumber(String accountNumber) {
		fireInsuranceRegistration.setAccountNumber(accountNumber);
	}

	public void setNote(String note) {
		fireInsuranceRegistration.setNote(note);
	}

	public void setGender(String gender) {
		fireInsuranceRegistration.setGender(gender);
	}

	public void setJob(String job) {
		fireInsuranceRegistration.setJob(job);
	}

	public void setLongterm(String longterm) {
		fireInsuranceRegistration.setLongterm(longterm);
	}

	public void setBuildingType(String buildingType) {
		fireInsuranceRegistration.setBuildingType(buildingType);
	}

	public void setSelectBuildingType(String selectBuildingType) {
		fireInsuranceRegistration.setSelectBuildingType(selectBuildingType);
	}
}
