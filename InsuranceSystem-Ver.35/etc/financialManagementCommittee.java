package etc;

import javax.mail.PasswordAuthentication;

import insurnaceTool.insuranceApproval;

/**
 * @author ������
 * @version 1.0
 * @created 11-5-2020 ���� 9:35:36
 */
public class financialManagementCommittee {

	private String eMailAddress;
	private int financialManagementCommitteeID;
	private String name;
	public insuranceApproval insuranceApproval;

	public financialManagementCommittee() {

		this.eMailAddress = "be_the_wings@kakao.com";
		this.name = "������";
	}

	public String geteMailAddress() {
		return eMailAddress;
	}

	public void seteMailAddress(String eMailAddress) {
		this.eMailAddress = eMailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}