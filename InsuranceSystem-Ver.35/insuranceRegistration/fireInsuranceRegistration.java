package insuranceRegistration;

public class fireInsuranceRegistration {
	
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
	private String buildingType;
	private String selectBuildingType;
	
	private int clientID;
	
	public fireInsuranceRegistration() {
		this.name = null;
		this.residentRegistrationNumber = null;
		this.age = 0;
		this.phoneNumber = null;
		this.address = null;
		this.accountNumber = null;
		this.note = null;
		this.clientID = 0;
		this.buildingType = null;
	}
	
	public void run() {//���� ���α׷� ����.
		//�����ϱ�� db �������� �� ���� ������ �� ID +1 �ϴ°� ����Ʈ����.
		
		this.clientID++;
		System.out.println("�ش� ���� ID�� " + this.clientID + "�Դϴ�.");
		
		System.out.println(this.job);
		System.out.println(this.gender);
		System.out.println(this.longterm);
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

	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}

	public void setSelectBuildingType(String selectBuildingType) {
		this.selectBuildingType = selectBuildingType;
	}
	
}
