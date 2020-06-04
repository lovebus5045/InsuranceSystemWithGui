package global;

public class constant {

	public enum eJob {
		driver("운전수"), solider("군인"), fieldJob("현장직"), planeCaptain("기장"), stewardess("승무원"), captain("선장"),
		sailor("선원"), etc("기타");

		private String text;

		private eJob(String text) {
			this.text = text;

		}

		public String getText() {
			return this.text;
		}
	}

	public enum eBoatType {
		// 정보 검색후 수정해야함
		smallShip("소형선"), midShip("중형선"), largeShip("대형선");

		private String text;

		private eBoatType(String text) {
			this.text = text;

		}

		public String getText() {
			return this.text;
		}
	}

	public enum ecarType {
		lightCar("경차"), midSizeCar("중형차"), largeCar("대형차");

		private String text;

		private ecarType(String text) {
			this.text = text;

		}

		public String getText() {
			return this.text;
		}
	}

	public enum eBuildingType {

		wood("나무목재"), etc("기타");

		private String text;

		private eBuildingType(String text) {
			this.text = text;

		}

		public String getText() {
			return this.text;
		}
	}

	public enum eLandType {
		mountain("산"), ricePaddy("논"), field("밭"), farm("목장"), fruitFarm("과수원");

		private String text;

		private eLandType(String text) {
			this.text = text;

		}

		public String getText() {
			return this.text;
		}
	}

	public enum eGender {
		woman("여성"), man("남성");

		private String text;

		private eGender(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
	}

	public enum eLongTerm {
		longTerm("장기보험"), shortTerm("단기보험");

		private String text;

		private eLongTerm(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
	}

	public enum eAccept {
		accept("동의함"), reject("동의하지 않음");

		private String text;

		private eAccept(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
	}

	public enum eOnTheSeaType {
		hullOfShip("선체보험"), shipNavigation("선박항해보험"), excessLiability("초과책임보험"), 
		dryingsheep("건조보험"), nonOperation("선박불가동손실보험"), Freight("운임보험"), war("전쟁보험");

		private String text;

		private eOnTheSeaType(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
	}
	
	public enum eSpecialType {
		injury("상해보험"), compensation("배상책임보험"), theft("도난보험"), leisure("레저종합보험"),
		childhoodEduInstitution("유아교육기관종합보험"), chattel("동산보험"), travel("여행보험"), contingency("컨티전시보험");

		private String text;

		private eSpecialType(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
	}
}