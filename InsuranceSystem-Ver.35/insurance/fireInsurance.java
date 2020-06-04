package insurance;

import global.constant.eLandType;

public class fireInsurance extends insurance {
	private String notes;
	private eLandType property;

	public fireInsurance() {

	}

	public eLandType getProperty() {
		return property;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}