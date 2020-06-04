package global;

public class constant {

	public enum eJob {
		driver("������"), solider("����"), fieldJob("������"), planeCaptain("����"), stewardess("�¹���"), captain("����"),
		sailor("����"), etc("��Ÿ");

		private String text;

		private eJob(String text) {
			this.text = text;

		}

		public String getText() {
			return this.text;
		}
	}

	public enum eBoatType {
		// ���� �˻��� �����ؾ���
		smallShip("������"), midShip("������"), largeShip("������");

		private String text;

		private eBoatType(String text) {
			this.text = text;

		}

		public String getText() {
			return this.text;
		}
	}

	public enum ecarType {
		lightCar("����"), midSizeCar("������"), largeCar("������");

		private String text;

		private ecarType(String text) {
			this.text = text;

		}

		public String getText() {
			return this.text;
		}
	}

	public enum eBuildingType {

		wood("��������"), etc("��Ÿ");

		private String text;

		private eBuildingType(String text) {
			this.text = text;

		}

		public String getText() {
			return this.text;
		}
	}

	public enum eLandType {
		mountain("��"), ricePaddy("��"), field("��"), farm("����"), fruitFarm("������");

		private String text;

		private eLandType(String text) {
			this.text = text;

		}

		public String getText() {
			return this.text;
		}
	}

	public enum eGender {
		woman("����"), man("����");

		private String text;

		private eGender(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
	}

	public enum eLongTerm {
		longTerm("��⺸��"), shortTerm("�ܱ⺸��");

		private String text;

		private eLongTerm(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
	}

	public enum eAccept {
		accept("������"), reject("�������� ����");

		private String text;

		private eAccept(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
	}

	public enum eOnTheSeaType {
		hullOfShip("��ü����"), shipNavigation("�������غ���"), excessLiability("�ʰ�å�Ӻ���"), 
		dryingsheep("��������"), nonOperation("���ںҰ����սǺ���"), Freight("���Ӻ���"), war("���ﺸ��");

		private String text;

		private eOnTheSeaType(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
	}
	
	public enum eSpecialType {
		injury("���غ���"), compensation("���å�Ӻ���"), theft("��������"), leisure("�������պ���"),
		childhoodEduInstitution("���Ʊ���������պ���"), chattel("���꺸��"), travel("���ຸ��"), contingency("��Ƽ���ú���");

		private String text;

		private eSpecialType(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
	}
}