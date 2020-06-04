package insurnaceTool;

import etc.employee;
import insurnaceDesinging.insuranceDesigning;

/**
 * @author 박지수
 * @version 1.0
 * @created 11-5-2020 오후 9:35:36
 */
public class insuranceApprover extends employee {

	private int insuranceApproverID;
	public insuranceDesigning insuranceDesigning;
	public insuranceApproval insuranceApproval;

	public insuranceApprover() {

	}

	public int getInsuranceApproverID() {
		return insuranceApproverID;
	}

	public void setInsuranceApproverID(int insuranceApproverID) {
		this.insuranceApproverID = insuranceApproverID;
	}

	public insuranceDesigning getInsuranceDesigning() {
		return insuranceDesigning;
	}

	public void setInsuranceDesigning(insuranceDesigning insuranceDesigning) {
		this.insuranceDesigning = insuranceDesigning;
	}

	public insuranceApproval getInsuranceApproval() {
		return insuranceApproval;
	}

	public void setInsuranceApproval(insuranceApproval insuranceApproval) {
		this.insuranceApproval = insuranceApproval;
	}

}