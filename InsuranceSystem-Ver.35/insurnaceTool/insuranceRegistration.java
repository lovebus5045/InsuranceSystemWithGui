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

	// client ����
	private String accidentHistory;
	private String accountNumber;
	private String address;
	private int age;
	private int clientID;
	private boolean gender;
	private int selectGender;

	// true ���� false ����
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
		this.gender = true; // ����
		this.selectGender = 1;
		this.selectJob = 1;

	}

	public void association(clientListImpl clientListImpl, insuranceListImpl insuranceListImpl) {
		this.clientList = clientListImpl;
		this.insuracnceList = insuranceListImpl;
		this.underWriter = underWriter;
		this.underWriter.association(this.clientList);

	}

	public boolean chooseLongtermInsurance() {// ��⺸�� �����ϴ� ��. ������ 1 �ļ� �ν��ϰ� ������ ���߿� ��ӹڽ� �����ɷ� �����ϴ� ��.
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

		// ����ῡ���������������ͼ� ���� ������ underwirter�� å���� ������ �����ͼ�
		// hashmap���� rate���������ͼ�
		// price*rate �󸶸� �����ϼž��մϴ� -->�����Ͻðڽ��ϱ�?
	}

	public void regist() {

		System.out.println("������ ����ϴ� ������ �������ּ���");
		System.out.println("1. ȭ�纸��");
		System.out.println("2. �ػ���");
		System.out.println("3. �ڵ�������");
		System.out.println("4. Ư������");
		// currentInsuranceList ��� -->switch������ �ش� ��ȣ �����ϸ� �ش� insurnaceID�� return
		// this.insuranceID = Integer.parseInt(this.information.getInformation1());
		// ���⼭ �������� �������̼ǿ��� �ѹ� �����ͼ� �Ǻ�

	//	this.insuranceID = Integer.parseInt(this.information.getInformationAboutRegist2());
		System.out.println(this.insuranceID);
//			this.information.setFourthInfo(true);

		switch (this.insuranceID) {
		case 1: // ȭ�纸��
			this.client.setInsuranceID(this.insuranceID);
			System.out.println(this.insuranceID);
			System.out.println("-- ���� ���� --");

			System.out.println("�̸��� �Է����ּ���");// ���� �̸��� ���� �ؾߵǴϱ�
			System.out.println("Ex. ������ / Michael Jordan");
			// this.name = br.readLine();
			this.client.setName(name);
			System.out.println("���̸� �Է����ּ���");
			System.out.println("Ex)20");
			// this.age = sc.nextInt();
			this.client.setAge(age);

			System.out.println("���¹�ȣ�� �Է����ּ���");
			System.out.println("Ex)���� 67300201333555");
			// this.accountNumber = sc.next();
			this.client.setAccountNumber(accountNumber);

			System.out.println("�ּҸ� �Է����ּ���");
			System.out.println("Ex)����Ư���� ���빮�� �����µ� �źϰ�� 34�� �������б� �ι�ķ�۽� 101ȣ");
			// this.address = br.readLine();
			this.client.setAddress(address);

			/*
			 * System.out.println("������ ���� ���ּ���"); for (eJob eJob : eJob.values()) {
			 * System.out.println(eJob.ordinal() + 1 + "." + eJob.getText()); }
			 * 
			 * // this.selectJob = sc.nextInt(); while (checker) { switch (selectJob) { case
			 * 1: this.client.setJob("������"); checker = false; break; case 2:
			 * this.client.setJob("����"); checker = false; break; case 3:
			 * this.client.setJob("������"); checker = false; break; case 4:
			 * this.client.setJob("����"); checker = false; break; case 5:
			 * this.client.setJob("�¹���"); checker = false; break; case 6:
			 * this.client.setJob("����"); checker = false; break; case 7:
			 * this.client.setJob("����"); checker = false; break; case 8:
			 * this.client.setJob("��Ÿ"); System.out.println("������ �Է����ֽʽÿ�");
			 * System.out.println("Ex)����"); // writeYourJob = sc.next(); checker = false;
			 * break; default: System.out.println("���� �����Դϴ�. �ٽ� �������ּ���"); // selectJob =
			 * sc.nextInt(); checker = true; break; } }
			 * 
			 * System.out.println("��ȭ��ȣ�� �Է����ּ���"); // this.phoneNumber = sc.next();
			 * this.client.setPhoneNumber(phoneNumber);
			 * 
			 * System.out.println("�ֹε�Ϲ�ȣ�� �Է����ּ���"); // this.residentRegistrationNumber =
			 * sc.next();
			 * this.client.setResidentRegistrationNumber(residentRegistrationNumber);
			 * 
			 * System.out.println("������ �������ּ���"); System.out.println("1.����");
			 * System.out.println("2.����");
			 * 
			 * // this.selectGender = sc.nextInt(); if (selectGender == 1) { this.gender =
			 * true;// �� } else { this.gender = false;// �� }
			 * 
			 * System.out.println("��⺸�� ���θ� �������ּ���"); System.out.println("1.��⺸��");
			 * System.out.println("2.�ܱ⺸��");
			 * 
			 * if (chooseLongtermInsurance() == true) { System.out.println("��⺸�� ����"); }
			 * else { System.out.println("�ܱ⺸�� ����"); }
			 */
			this.clientList.add(waitList, client);
			break;

		case 2: // �ػ���
			this.client.setInsuranceID(this.insuranceID);
			System.out.println(this.insuranceID);
			System.out.println("-- ���� ���� --");

			System.out.println("�̸��� �Է����ּ���");// ���� �̸��� ���� �ؾߵǴϱ�
			System.out.println("Ex. ������ / Michael Jordan");
			this.client.setName(name);
			System.out.println("���̸� �Է����ּ���");
			System.out.println("Ex)20");
			// this.age = sc.nextInt();
			this.client.setAge(age);

			System.out.println("���¹�ȣ�� �Է����ּ���");
			System.out.println("Ex)���� 67300201333555");
			// this.accountNumber = sc.next();
			this.client.setAccountNumber(accountNumber);

			System.out.println("�ּҸ� �Է����ּ���");
			System.out.println("Ex)����Ư���� ���빮�� �����µ� �źϰ�� 34�� �������б� �ι�ķ�۽� 101ȣ");
//			try {
////				this.address = br.readLine();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
			this.client.setAddress(address);

			System.out.println("������ ���� ���ּ���");
			for (eJob eJob : eJob.values()) {
				System.out.println(eJob.ordinal() + 1 + "." + eJob.getText());
			}

			// this.selectJob = sc.nextInt();
			while (checker) {
				switch (selectJob) {
				case 1:
					this.client.setJob("������");
					checker = false;
					break;
				case 2:
					this.client.setJob("����");
					checker = false;
					break;
				case 3:
					this.client.setJob("������");

					checker = false;
					break;
				case 4:
					this.client.setJob("����");
					checker = false;
					break;
				case 5:
					this.client.setJob("�¹���");
					checker = false;
					break;
				case 6:
					this.client.setJob("����");
					checker = false;
					break;
				case 7:
					this.client.setJob("����");
					checker = false;
					break;
				case 8:
					this.client.setJob("��Ÿ");
					System.out.println("������ �Է����ֽʽÿ�");
					System.out.println("Ex)����");
					// writeYourJob = sc.next();
					checker = false;
					break;
				default:
					System.out.println("���� �����Դϴ�. �ٽ� �������ּ���");
					// selectJob = sc.nextInt();
					checker = true;
					break;
				}
			}

			System.out.println("��ȭ��ȣ�� �Է����ּ���");
			// this.phoneNumber = sc.next();
			this.client.setPhoneNumber(phoneNumber);

			System.out.println("�ֹε�Ϲ�ȣ�� �Է����ּ���");
			// this.residentRegistrationNumber = sc.next();
			this.client.setResidentRegistrationNumber(residentRegistrationNumber);

			System.out.println("������ �������ּ���");
			System.out.println("1.����");
			System.out.println("2.����");

			// this.selectGender = sc.nextInt();
			if (selectGender == 1) {
				this.gender = true;// ��
			} else {
				this.gender = false;// ��
			}

			System.out.println("��⺸�� ���θ� �������ּ���");
			System.out.println("1.��⺸��");
			System.out.println("2.�ܱ⺸��");
//
//			if (chooseLongtermInsurance() == true) {
//				System.out.println("��⺸�� ����");
//			} else {
//				System.out.println("�ܱ⺸�� ����");
//			}
			this.clientList.add(waitList, client);
			break;

		case 3: // �ڵ�������
			this.client.setInsuranceID(this.insuranceID);
			System.out.println(this.insuranceID);
			System.out.println("-- ���� ���� --");

			System.out.println("�̸��� �Է����ּ���");// ���� �̸��� ���� �ؾߵǴϱ�
			System.out.println("Ex. ������ / Michael Jordan");
//			try {
//				this.name = br.readLine();
//			} catch (IOException e1) {
//				e1.printStackTrace();
//			}
			this.client.setName(name);
			System.out.println("���̸� �Է����ּ���");
			System.out.println("Ex)20");
			// this.age = sc.nextInt();
			this.client.setAge(age);

			System.out.println("���¹�ȣ�� �Է����ּ���");
			System.out.println("Ex)���� 67300201333555");
			// this.accountNumber = sc.next();
			this.client.setAccountNumber(accountNumber);

			System.out.println("�ּҸ� �Է����ּ���");
			System.out.println("Ex)����Ư���� ���빮�� �����µ� �źϰ�� 34�� �������б� �ι�ķ�۽� 101ȣ");
//			try {
//				this.address = br.readLine();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
			this.client.setAddress(address);

			System.out.println("������ ���� ���ּ���");
			for (eJob eJob : eJob.values()) {
				System.out.println(eJob.ordinal() + 1 + "." + eJob.getText());
			}

			// this.selectJob = sc.nextInt();
			while (checker) {
				switch (selectJob) {
				case 1:
					this.client.setJob("������");
					checker = false;
					break;
				case 2:
					this.client.setJob("����");
					checker = false;
					break;
				case 3:
					this.client.setJob("������");
					checker = false;
					break;
				case 4:
					this.client.setJob("����");
					checker = false;
					break;
				case 5:
					this.client.setJob("�¹���");
					checker = false;
					break;
				case 6:
					this.client.setJob("����");
					checker = false;
					break;
				case 7:
					this.client.setJob("����");
					checker = false;
					break;
				case 8:
					this.client.setJob("��Ÿ");
					System.out.println("������ �Է����ֽʽÿ�");
					System.out.println("Ex)����");
					// writeYourJob = sc.next();
					checker = false;
					break;
				default:
					System.out.println("���� �����Դϴ�. �ٽ� �������ּ���");
					// selectJob = sc.nextInt();
					checker = true;
					break;
				}
			}

			System.out.println("��ȭ��ȣ�� �Է����ּ���");
			// this.phoneNumber = sc.next();
			this.client.setPhoneNumber(phoneNumber);

			System.out.println("�ֹε�Ϲ�ȣ�� �Է����ּ���");
			// this.residentRegistrationNumber = sc.next();
			this.client.setResidentRegistrationNumber(residentRegistrationNumber);

			System.out.println("������ �������ּ���");
			System.out.println("1.����");
			System.out.println("2.����");

			// this.selectGender = sc.nextInt();
			if (selectGender == 1) {
				this.gender = true;// ��
			} else {
				this.gender = false;// ��
			}

			System.out.println("��⺸�� ���θ� �������ּ���");
			System.out.println("1.��⺸��");
			System.out.println("2.�ܱ⺸��");

//			if (chooseLongtermInsurance() == true) {
//				System.out.println("��⺸�� ����");
//			} else {
//				System.out.println("�ܱ⺸�� ����");
//			}
			this.clientList.add(waitList, client);
			break;

		case 4: // Ư������
			this.client.setInsuranceID(this.insuranceID);
			System.out.println(this.insuranceID);
			System.out.println("-- ���� ���� --");

			System.out.println("�̸��� �Է����ּ���");// ���� �̸��� ���� �ؾߵǴϱ�
			System.out.println("Ex. ������ / Michael Jordan");
//			try {
//				this.name = br.readLine();
//			} catch (IOException e1) {
//				e1.printStackTrace();
//			}
			this.client.setName(name);
			System.out.println("���̸� �Է����ּ���");
			System.out.println("Ex)20");
			// this.age = sc.nextInt();
			this.client.setAge(age);

			System.out.println("���¹�ȣ�� �Է����ּ���");
			System.out.println("Ex)���� 67300201333555");
			// this.accountNumber = sc.next();
			this.client.setAccountNumber(accountNumber);

			System.out.println("�ּҸ� �Է����ּ���");
			System.out.println("Ex)����Ư���� ���빮�� �����µ� �źϰ�� 34�� �������б� �ι�ķ�۽� 101ȣ");
//			try {
//				this.address = br.readLine();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
			this.client.setAddress(address);

			System.out.println("������ ���� ���ּ���");
			for (eJob eJob : eJob.values()) {
				System.out.println(eJob.ordinal() + 1 + "." + eJob.getText());
			}
//			this.selectJob = sc.nextInt();
			while (checker) {
				switch (selectJob) {
				case 1:
					this.client.setJob("������");
					checker = false;
					break;
				case 2:
					this.client.setJob("����");
					checker = false;
					break;
				case 3:
					this.client.setJob("������");
					checker = false;
					break;
				case 4:
					this.client.setJob("����");
					checker = false;
					break;
				case 5:
					this.client.setJob("�¹���");
					checker = false;
					break;
				case 6:
					this.client.setJob("����");
					checker = false;
					break;
				case 7:
					this.client.setJob("����");
					checker = false;
					break;
				case 8:
					this.client.setJob("��Ÿ");
					System.out.println("������ �Է����ֽʽÿ�");
					System.out.println("Ex)����");
					// writeYourJob = sc.next();
					checker = false;
					break;
				default:
					System.out.println("���� �����Դϴ�. �ٽ� �������ּ���");
					// selectJob = sc.nextInt();
					checker = true;
					break;
				}
			}

			System.out.println("��ȭ��ȣ�� �Է����ּ���");
			// this.phoneNumber = sc.next();
			this.client.setPhoneNumber(phoneNumber);

			System.out.println("�ֹε�Ϲ�ȣ�� �Է����ּ���");
			// this.residentRegistrationNumber = sc.next();
			this.client.setResidentRegistrationNumber(residentRegistrationNumber);

			System.out.println("������ �������ּ���");
			System.out.println("1.����");
			System.out.println("2.����");

			// this.selectGender = sc.nextInt();
			if (selectGender == 1) {
				this.gender = true;// ��
			} else {
				this.gender = false;// ��
			}

			System.out.println("��⺸�� ���θ� �������ּ���");
			System.out.println("1.��⺸��");
			System.out.println("2.�ܱ⺸��");

//			if (chooseLongtermInsurance() == true) {
//				System.out.println("��⺸�� ����");
//			} else {
//				System.out.println("�ܱ⺸�� ����");
//			}
			this.clientList.add(waitList, client);
			break;

		default:
			break;
		}
		// this.insuranceID = 0;
	}

}