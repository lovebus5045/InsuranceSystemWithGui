package insurance;

public class specialInsurance extends insurance {
	public enum specialProperty {
	};

	private String notes;
	private specialProperty specialProperty;
	private String SpecialType;
	
	public specialInsurance() {

	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public specialProperty getSpecialProperty() {
		return specialProperty;
	}

	public void setSpecialProperty(specialProperty specialProperty) {
		this.specialProperty = specialProperty;
	}

	public String getSpecialType() {
		return SpecialType;
	}

	public void setSpecialType(String specialType) {
		SpecialType = specialType;
	}

}