package insurance;

/**
 * @author 박지수
 * @version 1.0
 * @created 11-5-2020 오후 9:35:36
 */
public class onTheSeaInsurance extends insurance {
	public enum seaProperty {
	};

	private String notes;
	private seaProperty seaProperty;
	private String SeaInsurancetype;

	public onTheSeaInsurance() {

	}
	
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public seaProperty getSeaProperty() {
		return seaProperty;
	}

	public void setSeaProperty(seaProperty seaProperty) {
		this.seaProperty = seaProperty;
	}

	public String getSeaInsurancetype() {
		return SeaInsurancetype;
	}

	public void setSeaInsurancetype(String seaInsurancetype) {
		SeaInsurancetype = seaInsurancetype;
	}


}