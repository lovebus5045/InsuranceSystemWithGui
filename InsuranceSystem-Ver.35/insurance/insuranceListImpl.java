package insurance;

import java.util.ArrayList;

public class insuranceListImpl implements insuranceList {

	private ArrayList<insurance> insuranceWaitList;
	private ArrayList<insurance> insuranceList;

	public insurance insurance;

	public insuranceListImpl() {
		this.insurance = new insurance();
		this.insuranceWaitList = new ArrayList<insurance>();
		this.insuranceList = new ArrayList<insurance>();
	}

	public boolean add(boolean waitList, insurance insurance) {
		if (insurance != null && waitList) {
			System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
			this.insuranceWaitList.add(insurance);
			return true;
		} else if (insurance != null && !waitList && insuranceWaitList != null) {
			System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
			this.insuranceList.add(this.insuranceWaitList.get(0));
			this.insuranceWaitList.remove(0);
			return true;
		} else {
			System.out.println("���� ���忡 �����Ͽ����ϴ�.");
			return false;
		}
	}

	public boolean delete(boolean waitList, insurance insurance) {

		if (insurance != null && waitList) {
			System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
			this.insuranceWaitList.remove(0);
			return true;
		} else if (insurance != null && !waitList && insuranceWaitList != null) {
			// ���߿� �κп� ���� ������ �� �ֵ��� ������ ��
			this.insuranceList.remove(0);
			return true;
		} else {
			System.out.println("������ ���� �Ͽ����ϴ�.");
			return false;
		}

	}

	public boolean modify(insurance insurance) {

		if (insurance != null) {
			System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
			return true;
		} else {
			System.out.println("���� ������ �����߽��ϴ�.");
			return false;
		}

	}

	public ArrayList<insurance> getInsuranceWaitList() {
		return insuranceWaitList;
	}


	public ArrayList<insurance> getInsuranceList() {
		return insuranceList;
	}

}