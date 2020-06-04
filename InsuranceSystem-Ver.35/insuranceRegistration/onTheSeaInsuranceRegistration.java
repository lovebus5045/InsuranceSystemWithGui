package insuranceRegistration;

public class onTheSeaInsuranceRegistration {
	private String name;
	private String residentRegistrationNumber;
	private int age;
	private String phoneNumber;
	private String address;
	private String accountNumber;
	private String note;
	private String gender;
	private String job;
	private String longterm;
	private String selectBoatType;
	private String selectOnTheSeaType;

	public onTheSeaInsuranceRegistration() {
		this.name = null;
		this.residentRegistrationNumber = null;
		this.age = 0;
		this.phoneNumber = null;
		this.address = null;
		this.accountNumber = null;
		this.note = null;
	}

	public void run() {// 실제 프로그램 실행.
		System.out.println(this.name);
		System.out.println(residentRegistrationNumber);
		System.out.println(age);
		System.out.println(phoneNumber);
		System.out.println(address);
		System.out.println(accountNumber);
		System.out.println(note);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setResidentRegistrationNumber(String residentRegistrationNumber) {
		this.residentRegistrationNumber = residentRegistrationNumber;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setLongterm(String longterm) {
		this.longterm = longterm;
	}

	public void setBoatType(String selectBoatType) {
		this.selectBoatType = selectBoatType;
	}

	public void setOnTheSeaType(String selectOnTheSeaType) {
		this.selectOnTheSeaType = selectOnTheSeaType;
	}
}
