package insurnaceTool;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import client.client;
import client.clientListImpl;
import global.constant.eJob;
import insurance.insuranceList;
import insurance.insuranceListImpl;

public class insuranceRegistration {

	private int insuranceID;
	private String longtermInsurance;
	private int UWID;
	private clientListImpl clientList;
	private insuranceList insuracnceList;

	// client 정보
	private String accidentHistory;
	private String accountNumber;
	private String address;
	private int age;
	private int clientID;
	private boolean gender;
	private int selectGender;

	// true 여자 false 남자
	private String job;
	private String name;
	private String phoneNumber;
	private String residentRegistrationNumber;
	private boolean waitList = true;
	private boolean checker = true;
	private BufferedReader br;
	private client client;
	private underWriter underWriter;
	private int selectJob;
	private String writeYourJob;

	public insuranceRegistration() {
		this.br = new BufferedReader(new InputStreamReader(System.in));
		this.client = new client();
		this.gender = true; // 여성
		this.selectGender = 1;
		this.selectJob = 1;

	}

	public void association(clientListImpl clientListImpl, insuranceListImpl insuranceListImpl) {
		this.clientList = clientListImpl;
		this.insuracnceList = insuranceListImpl;
		this.underWriter = underWriter;
		this.underWriter.association(this.clientList);

	}

	public boolean chooseLongtermInsurance() {// 장기보험 선택하는 곳. 지금은 1 쳐서 인식하게 하지만 나중에 드롭박스 같은걸로 선택하는 거.
		Scanner sc2 = new Scanner(System.in);

		if (sc2.nextInt() == 1) {
			return true;
		} else {
			return false;
		}
	}

	public void lookUpTheWaitList() {
		this.underWriter.approveClient();
	}

	public void payIn() {

		// 보험료에대한정보를가져와서 고객의 정보랑 underwirter가 책정한 요율을 가져와서
		// hashmap에서 rate정보가져와서
		// price*rate 얼마를 납입하셔야합니다 -->납입하시겠습니까?
	}

	public void regist() {

		System.out.println("가입을 희망하는 보험을 선택해주세요");
		System.out.println("1. 화재보험");
		System.out.println("2. 해상보험");
		System.out.println("3. 자동차보험");
		System.out.println("4. 특종보험");
		// currentInsuranceList 출력 -->switch문으로 해당 번호 선택하면 해당 insurnaceID를 return
		// this.insuranceID = Integer.parseInt(this.information.getInformation1());
		// 여기서 위에꺼로 인포메이션에서 넘버 가져와서 판별

	//	this.insuranceID = Integer.parseInt(this.information.getInformationAboutRegist2());
		System.out.println(this.insuranceID);
//			this.information.setFourthInfo(true);

		switch (this.insuranceID) {
		case 1: // 화재보험
			this.client.setInsuranceID(this.insuranceID);
			System.out.println(this.insuranceID);
			System.out.println("-- 개인 정보 --");

			System.out.println("이름을 입력해주세요");// 영어 이름은 띄어쓰기 해야되니까
			System.out.println("Ex. 박지수 / Michael Jordan");
			// this.name = br.readLine();
			this.client.setName(name);
			System.out.println("나이를 입력해주세요");
			System.out.println("Ex)20");
			// this.age = sc.nextInt();
			this.client.setAge(age);

			System.out.println("계좌번호를 입력해주세요");
			System.out.println("Ex)국민 67300201333555");
			// this.accountNumber = sc.next();
			this.client.setAccountNumber(accountNumber);

			System.out.println("주소를 입력해주세요");
			System.out.println("Ex)서울특별시 서대문구 남가좌동 거북골로 34로 명지대학교 인문캠퍼스 101호");
			// this.address = br.readLine();
			this.client.setAddress(address);

			/*
			 * System.out.println("직업을 선택 해주세요"); for (eJob eJob : eJob.values()) {
			 * System.out.println(eJob.ordinal() + 1 + "." + eJob.getText()); }
			 * 
			 * // this.selectJob = sc.nextInt(); while (checker) { switch (selectJob) { case
			 * 1: this.client.setJob("운전수"); checker = false; break; case 2:
			 * this.client.setJob("군인"); checker = false; break; case 3:
			 * this.client.setJob("현장직"); checker = false; break; case 4:
			 * this.client.setJob("기장"); checker = false; break; case 5:
			 * this.client.setJob("승무원"); checker = false; break; case 6:
			 * this.client.setJob("선장"); checker = false; break; case 7:
			 * this.client.setJob("선원"); checker = false; break; case 8:
			 * this.client.setJob("기타"); System.out.println("직업을 입력해주십시오");
			 * System.out.println("Ex)무직"); // writeYourJob = sc.next(); checker = false;
			 * break; default: System.out.println("없는 직업입니다. 다시 선택해주세요"); // selectJob =
			 * sc.nextInt(); checker = true; break; } }
			 * 
			 * System.out.println("전화번호를 입력해주세요"); // this.phoneNumber = sc.next();
			 * this.client.setPhoneNumber(phoneNumber);
			 * 
			 * System.out.println("주민등록번호를 입력해주세요"); // this.residentRegistrationNumber =
			 * sc.next();
			 * this.client.setResidentRegistrationNumber(residentRegistrationNumber);
			 * 
			 * System.out.println("성별을 선택해주세요"); System.out.println("1.여자");
			 * System.out.println("2.남자");
			 * 
			 * // this.selectGender = sc.nextInt(); if (selectGender == 1) { this.gender =
			 * true;// 여 } else { this.gender = false;// 남 }
			 * 
			 * System.out.println("장기보험 여부를 선택해주세요"); System.out.println("1.장기보험");
			 * System.out.println("2.단기보험");
			 * 
			 * if (chooseLongtermInsurance() == true) { System.out.println("장기보험 선택"); }
			 * else { System.out.println("단기보험 선택"); }
			 */
			this.clientList.add(waitList, client);
			break;

		case 2: // 해상보험
			this.client.setInsuranceID(this.insuranceID);
			System.out.println(this.insuranceID);
			System.out.println("-- 개인 정보 --");

			System.out.println("이름을 입력해주세요");// 영어 이름은 띄어쓰기 해야되니까
			System.out.println("Ex. 박지수 / Michael Jordan");
			this.client.setName(name);
			System.out.println("나이를 입력해주세요");
			System.out.println("Ex)20");
			// this.age = sc.nextInt();
			this.client.setAge(age);

			System.out.println("계좌번호를 입력해주세요");
			System.out.println("Ex)국민 67300201333555");
			// this.accountNumber = sc.next();
			this.client.setAccountNumber(accountNumber);

			System.out.println("주소를 입력해주세요");
			System.out.println("Ex)서울특별시 서대문구 남가좌동 거북골로 34로 명지대학교 인문캠퍼스 101호");
//			try {
////				this.address = br.readLine();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
			this.client.setAddress(address);

			System.out.println("직업을 선택 해주세요");
			for (eJob eJob : eJob.values()) {
				System.out.println(eJob.ordinal() + 1 + "." + eJob.getText());
			}

			// this.selectJob = sc.nextInt();
			while (checker) {
				switch (selectJob) {
				case 1:
					this.client.setJob("운전수");
					checker = false;
					break;
				case 2:
					this.client.setJob("군인");
					checker = false;
					break;
				case 3:
					this.client.setJob("현장직");

					checker = false;
					break;
				case 4:
					this.client.setJob("기장");
					checker = false;
					break;
				case 5:
					this.client.setJob("승무원");
					checker = false;
					break;
				case 6:
					this.client.setJob("선장");
					checker = false;
					break;
				case 7:
					this.client.setJob("선원");
					checker = false;
					break;
				case 8:
					this.client.setJob("기타");
					System.out.println("직업을 입력해주십시오");
					System.out.println("Ex)무직");
					// writeYourJob = sc.next();
					checker = false;
					break;
				default:
					System.out.println("없는 직업입니다. 다시 선택해주세요");
					// selectJob = sc.nextInt();
					checker = true;
					break;
				}
			}

			System.out.println("전화번호를 입력해주세요");
			// this.phoneNumber = sc.next();
			this.client.setPhoneNumber(phoneNumber);

			System.out.println("주민등록번호를 입력해주세요");
			// this.residentRegistrationNumber = sc.next();
			this.client.setResidentRegistrationNumber(residentRegistrationNumber);

			System.out.println("성별을 선택해주세요");
			System.out.println("1.여자");
			System.out.println("2.남자");

			// this.selectGender = sc.nextInt();
			if (selectGender == 1) {
				this.gender = true;// 여
			} else {
				this.gender = false;// 남
			}

			System.out.println("장기보험 여부를 선택해주세요");
			System.out.println("1.장기보험");
			System.out.println("2.단기보험");
//
//			if (chooseLongtermInsurance() == true) {
//				System.out.println("장기보험 선택");
//			} else {
//				System.out.println("단기보험 선택");
//			}
			this.clientList.add(waitList, client);
			break;

		case 3: // 자동차보험
			this.client.setInsuranceID(this.insuranceID);
			System.out.println(this.insuranceID);
			System.out.println("-- 개인 정보 --");

			System.out.println("이름을 입력해주세요");// 영어 이름은 띄어쓰기 해야되니까
			System.out.println("Ex. 박지수 / Michael Jordan");
//			try {
//				this.name = br.readLine();
//			} catch (IOException e1) {
//				e1.printStackTrace();
//			}
			this.client.setName(name);
			System.out.println("나이를 입력해주세요");
			System.out.println("Ex)20");
			// this.age = sc.nextInt();
			this.client.setAge(age);

			System.out.println("계좌번호를 입력해주세요");
			System.out.println("Ex)국민 67300201333555");
			// this.accountNumber = sc.next();
			this.client.setAccountNumber(accountNumber);

			System.out.println("주소를 입력해주세요");
			System.out.println("Ex)서울특별시 서대문구 남가좌동 거북골로 34로 명지대학교 인문캠퍼스 101호");
//			try {
//				this.address = br.readLine();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
			this.client.setAddress(address);

			System.out.println("직업을 선택 해주세요");
			for (eJob eJob : eJob.values()) {
				System.out.println(eJob.ordinal() + 1 + "." + eJob.getText());
			}

			// this.selectJob = sc.nextInt();
			while (checker) {
				switch (selectJob) {
				case 1:
					this.client.setJob("운전수");
					checker = false;
					break;
				case 2:
					this.client.setJob("군인");
					checker = false;
					break;
				case 3:
					this.client.setJob("현장직");
					checker = false;
					break;
				case 4:
					this.client.setJob("기장");
					checker = false;
					break;
				case 5:
					this.client.setJob("승무원");
					checker = false;
					break;
				case 6:
					this.client.setJob("선장");
					checker = false;
					break;
				case 7:
					this.client.setJob("선원");
					checker = false;
					break;
				case 8:
					this.client.setJob("기타");
					System.out.println("직업을 입력해주십시오");
					System.out.println("Ex)무직");
					// writeYourJob = sc.next();
					checker = false;
					break;
				default:
					System.out.println("없는 직업입니다. 다시 선택해주세요");
					// selectJob = sc.nextInt();
					checker = true;
					break;
				}
			}

			System.out.println("전화번호를 입력해주세요");
			// this.phoneNumber = sc.next();
			this.client.setPhoneNumber(phoneNumber);

			System.out.println("주민등록번호를 입력해주세요");
			// this.residentRegistrationNumber = sc.next();
			this.client.setResidentRegistrationNumber(residentRegistrationNumber);

			System.out.println("성별을 선택해주세요");
			System.out.println("1.여자");
			System.out.println("2.남자");

			// this.selectGender = sc.nextInt();
			if (selectGender == 1) {
				this.gender = true;// 여
			} else {
				this.gender = false;// 남
			}

			System.out.println("장기보험 여부를 선택해주세요");
			System.out.println("1.장기보험");
			System.out.println("2.단기보험");

//			if (chooseLongtermInsurance() == true) {
//				System.out.println("장기보험 선택");
//			} else {
//				System.out.println("단기보험 선택");
//			}
			this.clientList.add(waitList, client);
			break;

		case 4: // 특종보험
			this.client.setInsuranceID(this.insuranceID);
			System.out.println(this.insuranceID);
			System.out.println("-- 개인 정보 --");

			System.out.println("이름을 입력해주세요");// 영어 이름은 띄어쓰기 해야되니까
			System.out.println("Ex. 박지수 / Michael Jordan");
//			try {
//				this.name = br.readLine();
//			} catch (IOException e1) {
//				e1.printStackTrace();
//			}
			this.client.setName(name);
			System.out.println("나이를 입력해주세요");
			System.out.println("Ex)20");
			// this.age = sc.nextInt();
			this.client.setAge(age);

			System.out.println("계좌번호를 입력해주세요");
			System.out.println("Ex)국민 67300201333555");
			// this.accountNumber = sc.next();
			this.client.setAccountNumber(accountNumber);

			System.out.println("주소를 입력해주세요");
			System.out.println("Ex)서울특별시 서대문구 남가좌동 거북골로 34로 명지대학교 인문캠퍼스 101호");
//			try {
//				this.address = br.readLine();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
			this.client.setAddress(address);

			System.out.println("직업을 선택 해주세요");
			for (eJob eJob : eJob.values()) {
				System.out.println(eJob.ordinal() + 1 + "." + eJob.getText());
			}
//			this.selectJob = sc.nextInt();
			while (checker) {
				switch (selectJob) {
				case 1:
					this.client.setJob("운전수");
					checker = false;
					break;
				case 2:
					this.client.setJob("군인");
					checker = false;
					break;
				case 3:
					this.client.setJob("현장직");
					checker = false;
					break;
				case 4:
					this.client.setJob("기장");
					checker = false;
					break;
				case 5:
					this.client.setJob("승무원");
					checker = false;
					break;
				case 6:
					this.client.setJob("선장");
					checker = false;
					break;
				case 7:
					this.client.setJob("선원");
					checker = false;
					break;
				case 8:
					this.client.setJob("기타");
					System.out.println("직업을 입력해주십시오");
					System.out.println("Ex)무직");
					// writeYourJob = sc.next();
					checker = false;
					break;
				default:
					System.out.println("없는 직업입니다. 다시 선택해주세요");
					// selectJob = sc.nextInt();
					checker = true;
					break;
				}
			}

			System.out.println("전화번호를 입력해주세요");
			// this.phoneNumber = sc.next();
			this.client.setPhoneNumber(phoneNumber);

			System.out.println("주민등록번호를 입력해주세요");
			// this.residentRegistrationNumber = sc.next();
			this.client.setResidentRegistrationNumber(residentRegistrationNumber);

			System.out.println("성별을 선택해주세요");
			System.out.println("1.여자");
			System.out.println("2.남자");

			// this.selectGender = sc.nextInt();
			if (selectGender == 1) {
				this.gender = true;// 여
			} else {
				this.gender = false;// 남
			}

			System.out.println("장기보험 여부를 선택해주세요");
			System.out.println("1.장기보험");
			System.out.println("2.단기보험");

//			if (chooseLongtermInsurance() == true) {
//				System.out.println("장기보험 선택");
//			} else {
//				System.out.println("단기보험 선택");
//			}
			this.clientList.add(waitList, client);
			break;

		default:
			break;
		}
		// this.insuranceID = 0;
	}

}