package client;

import java.util.ArrayList;

public class clientListImpl implements clientList {

	private int clidnetJob;
	private ArrayList<String> clientAccidentHistory;
	private String clientAccountNumber;
	private int clientAge;
	private boolean clientGender;
	private int clientID;
	private ArrayList<client> clientList;
	private ArrayList<client> clientWaitList;
	private String clientName;
	private ArrayList<String> clientProperty;
	private int clientResidentRegistrationNumber;
	private String clinetAddress;
	private String clinetPhoneNumber;
	public client m_client;

	public clientListImpl() {
		this.clientList = new ArrayList<client>();
		this.clientWaitList = new ArrayList<client>();
	}

	public boolean apply(int clientID) {
		return false;
	}

	public void delete() {

		
	}

	public boolean lookUpClientInformation(String clientName, String clientPhoneNumber) {
		if (clientName == this.clientName && clientPhoneNumber == this.clinetPhoneNumber) {// 이름 전번이 고객 리스트에 있으면

			System.out.println(this.clientName);
			System.out.println(this.clinetPhoneNumber);
			System.out.println(this.clientResidentRegistrationNumber);
			// 더 많이 있을텐데 귀찮아서 안쓴거임.

			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean add(boolean waitList, client client) {
		if (client != null && waitList) {
			this.clientWaitList.add(client);
			System.out.println("입력이 완료되었습니다.");

			return true;
		} else if (client != null && !waitList && clientWaitList != null) {
			System.out.println("가입 승인 완료 되었습니다.");
			this.clientList.add(this.clientWaitList.get(0));
			this.clientWaitList.remove(0);
			return true;
		} else {
			System.out.println("고객 정보 저장에 오류가 있습니다.");
			return false;
		}
	}

	public boolean delete(boolean waitList, client client) {
		if (client != null && waitList) {
			System.out.println("삭제가 완료되었습니다.");
			this.clientWaitList.remove(0);
			return true;
		} else if (client != null && !waitList && clientWaitList != null) {
			this.clientList.remove(0);
			return true;
		} else {
			System.out.println("삭제에 실패 하였습니다.");
			return false;
		}
	}

	@Override
	public boolean modify(client client) {

		return false;
	}

	public ArrayList<client> getClientWaitList() {
		return clientWaitList;
	}

	public ArrayList<client> getClientList() {
		return clientList;
	}
}