package valueObject;

import insurance.insuranceListImpl;

public class mInsurnaceListImpl {

	private insuranceListImpl insuranceListImpl;

	private int Insuranceid;

	public mInsurnaceListImpl() {

		this.insuranceListImpl = new insuranceListImpl();

	}


	public int getInsuranceid() {
		if (this.insuranceListImpl.getInsuranceList().size() == 0) {
			this.Insuranceid = 1;
		} else {
			for (int i = 0; i < this.insuranceListImpl.getInsuranceList().size(); i++) {
				this.Insuranceid = this.insuranceListImpl.getInsuranceList().get(i).getInsuranceID();
			}
		}
		return this.Insuranceid;
	}

	public void setInsuranceid(int insuranceid) {
		Insuranceid = insuranceid;
	}

}
