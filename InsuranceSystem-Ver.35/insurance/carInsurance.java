package insurance;

/**
 * @author 박지수
 * @version 1.0
 * @created 11-5-2020 오후 9:35:35
 */
public class carInsurance extends insurance {
	public enum carModel {

	};

	private carModel carModel;
	private String carNumber;

	public carInsurance() {

	}

	public carModel getCarModel() {
		return carModel;
	}

	public void setCarModel(carModel carModel) {
		this.carModel = carModel;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	
}
