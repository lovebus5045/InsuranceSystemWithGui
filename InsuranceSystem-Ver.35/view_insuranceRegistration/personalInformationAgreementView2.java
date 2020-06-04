package view_insuranceRegistration;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class personalInformationAgreementView2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private insuranceRegistrationView insuranceRegistrationView;
	private JTextArea personalInformationAgreement;
	private JTextArea personalInformationAgreement2;

	private Vector<JCheckBox> buttons;
	private ButtonGroup group1, group2, group3, group4;
	private JScrollPane jScrollPane;
	private JScrollPane jScrollPane2;
	private JTextField[] inputText;

	private boolean painted = true;
	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	private actionHandler actionHandler;

	public personalInformationAgreementView2() {
		this.actionHandler = new actionHandler();
		this.insuranceRegistrationView = new insuranceRegistrationView();
		this.inputText = new JTextField[10];
		this.group1 = new ButtonGroup();
		this.group2 = new ButtonGroup();
		this.group3 = new ButtonGroup();
		this.group4 = new ButtonGroup();

		this.buttons = new Vector<JCheckBox>();

	}

	public void association() {
		this.insuranceRegistrationView.association();

	}

	public void run() {

		if (painted == true) {
			this.setTitle("보험금 청구를 위한 필수 동의서2");

			this.setSize(1900, 700);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

			String context = "3. 개인(신용)정보의 제공에 관한 사항";
			String context2 = "당사는 「개인정보 보호법」 및 「신용정보의 이용 및 보호에 관한 법률」 에 따라 " + "\n\r"
					+ " 귀하의 개인(신용)정보를 다음과 같이 제3자에게 제공하고자 합니다. 이에 대하여 동의하십니까?";

			BoxLayout layout = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
			this.setLayout(layout);

			JPanel MainPanel01 = new JPanel();
			MainPanel01.setLayout(new FlowLayout());
			MainPanel01.setBackground(Color.white);

			JPanel Panel01 = new JPanel();
			Panel01.setLayout(new BoxLayout(Panel01, BoxLayout.Y_AXIS));
			Panel01.setBackground(Color.white);

			JLabel jLabel = new JLabel(context);
			jLabel.setFont(new Font("Serif", Font.BOLD, 11));
			jLabel.setFont(jLabel.getFont().deriveFont(20.0f));

			this.personalInformationAgreement = new JTextArea(context2, 3, 20);
			this.jScrollPane = new JScrollPane(personalInformationAgreement, jScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
					jScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

			Panel01.add(jLabel);
			Panel01.add(jScrollPane);

			MainPanel01.add(Panel01);

			JPanel buttonPanel = new JPanel();
			buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
			buttonPanel.setBackground(Color.white);

			JCheckBox button1 = new JCheckBox("동의");
			button1.setBackground(new Color(255, 255, 153));
			button1.setActionCommand("동의1");
			button1.addActionListener(actionHandler);
			this.buttons.add(button1);
			group1.add(button1);
			buttonPanel.add(button1);
			JCheckBox button2 = new JCheckBox("동의하지 않는다.");
			button2.setBackground(new Color(255, 255, 153));
			button2.setActionCommand("동의X");
			button2.addActionListener(actionHandler);
			this.buttons.add(button2);
			group1.add(button2);
			buttonPanel.add(button2);
			Panel01.add(buttonPanel);

			String context3 = "● 개인(신용)정보를 제공받는 자";
			String context4 = "● 신용정보집중기관 : 한국신용정보원";
			String context5 = "● 공공기관 등 : ● 금융위원회, 국토해양부, 금융감독원, 보험요율 산출기관 등 공공기관, 법령상 업무 수행기관●(위탁사업자 포함)";
			String context6 = "● 보험회사 등 : ● 생명보험사, 손해보험사, 국내·국외 재보험사, 공제사업자, 체신관서(우체국보험), 금융거래 관련, 계좌개설금융기관, 금융결제원 ";
			String context7 = "● 업무수탁자 등 : ● 보험금지급·심사 및 보험사고조사 등에 필요한 업무를 위탁 받은 자 (보험사고조사업체, 손해사정업체, 의료기관·의사, 변호사, 위탁 콜센타, 그 외 자동차보험의 경우 건강보험심사평가원, 자동차보험진료수가분쟁심의회, 손해보험협회 등)";
			String context8 = "● 개인(신용)정보를 제공받는 자의 이용목적";
			String context9 = "● 신용정보집중기관 : 보험계약 및 보험금지급 관련 정보의 집중관리 및 활용 등 신용정보집중기관의 업무";
			String context10 = "● 공공기관 등 : 보험업법 및 민법 등 법령에 따른 업무수행 (공동인수 및 위탁업무 포함)";
			String context11 = "● 보험회사 등 : ● 보험사고조사(보험사기 조사 포함) 및 손해사정서비스 등 계약이행에 필요한 업무, 보험금청구서류 접수대행 서비스, 진료비심사, 의료심사 및 자문";
			String context12 = "● 금융거래 업무(보험료 및 보험금 등 출·수납)";
			String context13 = "● 제공할 개인(신용)정보의 내용";

			String context14 = " - 1. 개인(신용)정보의 수집·이용에 관한 사항」 의 정보내용(단, 각 제공받는 자의 이용 목적을 위해 필요한 정보에 한함)";

			String context15 = "● 제공받는 자의 개인(신용)정보 보유·이용기간";
			String context16 = "● 개인(신용)정보를 제공받는 자의 이용목적을 달성할 때까지(최대 거래종료 후 5년까지)";
			String context17 = "● ※ 각 제공대상기관 및 이용목적의 구체적인 정보는 당사 홈페이지[www.idbins.com]에서 확인할 수 있습니다.";

			JLabel jLabel3 = new JLabel(context3);
			jLabel3.setFont(new Font("Serif", Font.BOLD, 11));
			jLabel3.setFont(jLabel3.getFont().deriveFont(15.0f));
			JLabel jLabel4 = new JLabel(context4);
			jLabel4.setFont(new Font("Serif", Font.BOLD, 11));
			jLabel4.setFont(jLabel4.getFont().deriveFont(15.0f));
			JLabel jLabel5 = new JLabel(context5);
			jLabel5.setFont(new Font("Serif", Font.BOLD, 11));
			jLabel5.setFont(jLabel5.getFont().deriveFont(15.0f));
			JLabel jLabel6 = new JLabel(context6);
			jLabel6.setFont(new Font("Serif", Font.BOLD, 11));
			jLabel6.setFont(jLabel6.getFont().deriveFont(15.0f));
			JLabel jLabel7 = new JLabel(context7);
			jLabel7.setFont(new Font("Serif", Font.BOLD, 11));
			jLabel7.setFont(jLabel7.getFont().deriveFont(15.0f));
			JLabel jLabel8 = new JLabel(context8);
			jLabel8.setFont(new Font("Serif", Font.BOLD, 11));
			jLabel8.setFont(jLabel8.getFont().deriveFont(15.0f));
			JLabel jLabel9 = new JLabel(context9);
			jLabel9.setFont(new Font("Serif", Font.BOLD, 11));
			jLabel9.setFont(jLabel9.getFont().deriveFont(15.0f));
			JLabel jLabel10 = new JLabel(context10);
			jLabel10.setFont(new Font("Serif", Font.BOLD, 11));
			jLabel10.setFont(jLabel10.getFont().deriveFont(15.0f));
			JLabel jLabel11 = new JLabel(context11);
			jLabel11.setFont(new Font("Serif", Font.BOLD, 11));
			jLabel11.setFont(jLabel11.getFont().deriveFont(15.0f));
			JLabel jLabel12 = new JLabel(context12);
			jLabel12.setFont(new Font("Serif", Font.BOLD, 11));
			jLabel12.setFont(jLabel12.getFont().deriveFont(15.0f));
			JLabel jLabel13 = new JLabel(context13);
			jLabel13.setFont(new Font("Serif", Font.BOLD, 11));
			jLabel13.setFont(jLabel13.getFont().deriveFont(15.0f));
			JLabel jLabel14 = new JLabel(context14);
			jLabel14.setFont(jLabel14.getFont().deriveFont(12.0f));
			JLabel jLabel15 = new JLabel(context15);
			jLabel15.setFont(new Font("Serif", Font.BOLD, 11));
			jLabel15.setFont(jLabel15.getFont().deriveFont(15.0f));
			JLabel jLabel16 = new JLabel(context16);
			jLabel16.setFont(new Font("Serif", Font.BOLD, 11));
			jLabel16.setFont(jLabel16.getFont().deriveFont(15.0f));
			JLabel jLabel17 = new JLabel(context17);
			jLabel17.setFont(new Font("Serif", Font.BOLD, 11));
			jLabel17.setFont(jLabel17.getFont().deriveFont(15.0f));

			Panel01.add(jLabel3);
			Panel01.add(jLabel4);
			Panel01.add(jLabel5);
			Panel01.add(jLabel6);
			Panel01.add(jLabel7);
			Panel01.add(jLabel8);
			Panel01.add(jLabel9);
			Panel01.add(jLabel10);
			Panel01.add(jLabel11);
			Panel01.add(jLabel12);
			Panel01.add(jLabel13);
			Panel01.add(jLabel14);
			Panel01.add(jLabel15);
			Panel01.add(jLabel16);
			Panel01.add(jLabel17);

			String sInfor1 = "4. 당사 및 당사 업무수탁자는「개인정보보호법」 및 「신용정보의 이용 및 보호에 관한 법률」 에 따라" + "\r\n"
					+ "상기의 개인(신용)정보에 대한 개별 동의사항에 대하여 다음과 같이 귀하의 민감정보(질병·상해정보) 및 " + "\r\n"
					+ "고유식별정보(주민등록번호·외국인등록번호, 운전면허번호)를 처리(수집·이용, 조회, 제공) 하고자 합니다." + "\r\n" + " 이에 대하여 동의하십니까?";

			this.personalInformationAgreement2 = new JTextArea(sInfor1, 3, 10);
			this.jScrollPane2 = new JScrollPane(personalInformationAgreement2, jScrollPane2.VERTICAL_SCROLLBAR_ALWAYS,
					jScrollPane2.HORIZONTAL_SCROLLBAR_AS_NEEDED);

			Panel01.add(jScrollPane2);

			JPanel botPanel = new JPanel();
			botPanel.setLayout(new GridLayout(2, 2));
			botPanel.setBackground(Color.white);
			String context18 = "질병·상해정보 처리";
			JLabel jLabel18 = new JLabel(context18);
			jLabel18.setFont(new Font("Serif", Font.BOLD, 11));
			jLabel18.setFont(jLabel18.getFont().deriveFont(15.0f));

			JPanel buttonPanel2 = new JPanel();
			buttonPanel2.setLayout(new BoxLayout(buttonPanel2, BoxLayout.X_AXIS));
			buttonPanel2.setBackground(Color.white);
			JCheckBox button3 = new JCheckBox("동의");

			button3.setBackground(new Color(255, 255, 153));
			button3.setActionCommand("동의2");
			button3.addActionListener(actionHandler);
			this.buttons.add(button3);
			group2.add(button3);
			buttonPanel2.add(button3);

			JCheckBox button4 = new JCheckBox("동의하지 않는다.");
			button4.setBackground(new Color(255, 255, 153));
			button4.setActionCommand("동의X");
			button4.addActionListener(actionHandler);
			this.buttons.add(button4);
			group2.add(button4);
			buttonPanel2.add(button4);

			String context19 = "주민등록번호, 외국인등록번호, 운전면허증번호 처리";
			JLabel jLabel19 = new JLabel(context19);
			jLabel19.setFont(new Font("Serif", Font.BOLD, 11));
			jLabel19.setFont(jLabel19.getFont().deriveFont(15.0f));

			JPanel buttonPanel3 = new JPanel();
			buttonPanel3.setLayout(new BoxLayout(buttonPanel3, BoxLayout.X_AXIS));
			buttonPanel3.setBackground(Color.white);
			JCheckBox button5 = new JCheckBox("동의");
			button5.setBackground(new Color(255, 255, 153));
			button5.setActionCommand("동의3");
			button5.addActionListener(actionHandler);
			this.buttons.add(button5);
			group3.add(button5);
			buttonPanel3.add(button5);
			JCheckBox button6 = new JCheckBox("동의하지 않는다.");
			button6.setBackground(new Color(255, 255, 153));
			button6.setActionCommand("동의X");
			button6.addActionListener(actionHandler);
			this.buttons.add(button6);
			group3.add(button6);
			buttonPanel3.add(button6);

			botPanel.add(jLabel18);
			botPanel.add(buttonPanel2);
			botPanel.add(jLabel19);
			botPanel.add(buttonPanel3);

			MainPanel01.add(botPanel);

			JPanel signPanel = new JPanel();
			signPanel.setLayout(new GridLayout(1, 4));
			signPanel.setBackground(Color.white);
			String context20 = "작성일자";
			JLabel jLabel20 = new JLabel(context20);
			jLabel20.setFont(new Font("Serif", Font.BOLD, 11));
			jLabel20.setFont(jLabel20.getFont().deriveFont(15.0f));
			// 이거는 지워도 됨
			inputText[0] = new JTextField(10);

			String context21 = "동의자";
			JLabel jLabel21 = new JLabel(context21);
			jLabel21.setFont(new Font("Serif", Font.BOLD, 11));
			jLabel21.setFont(jLabel21.getFont().deriveFont(15.0f));
			inputText[1] = new JTextField(6);

			signPanel.add(jLabel20);
			signPanel.add(inputText[0]);
			signPanel.add(jLabel21);
			signPanel.add(inputText[1]);

			MainPanel01.add(signPanel);

			JPanel panel13 = new JPanel();
			panel13.setLayout(new BoxLayout(panel13, BoxLayout.X_AXIS));

			JPanel panel11 = new JPanel();
			panel11.setBackground(Color.white);
			JButton bu11 = new JButton("동의");
			bu11.addActionListener(actionHandler);
			bu11.setActionCommand("다음");
			panel11.add(bu11);
			panel13.add(panel11);

			JPanel panel12 = new JPanel();
			panel12.setBackground(Color.white);
			JButton bu12 = new JButton("동의하지 않는다");
			bu12.addActionListener(actionHandler);
			bu12.setActionCommand("취소");
			panel12.add(bu12);
			panel13.add(panel12);

			this.add(MainPanel01);
			this.add(panel13);
			painted = false;
		}
		this.setVisible(true);
	}

	public void sendInformation() {

//서약서 복사기능용 information 구현할지 말지는 여러분에 선택 ^^
	}

	class actionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand() == "다음") {
				System.out.println(answer2);
				if (answer1 != "동의1" || answer2 != "동의2") {
					JOptionPane.showMessageDialog(null, "전부 동의하지 않으셨습니다.");
				} else {
					insuranceRegistrationView.run();
					sendInformation();
					dispose();
				}

			} else if (e.getActionCommand() == "취소") {
				int result = JOptionPane.showConfirmDialog(null, "이 페이지에서 나가시겠습니까?", "Confirm",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					dispose();
					// information.returnMainFrame();
				} else if (result == JOptionPane.NO_OPTION) {

				} else if (result == JOptionPane.CLOSED_OPTION) {
					// 그냥 창 닫은 경우
				}

			} else if (e.getActionCommand() == "동의2") {
				answer2 = "동의2";
			} else if (e.getActionCommand() == "동의1") {
				answer1 = "동의1";
			} else if (e.getActionCommand() == "동의3") {
				answer3 = "동의3";
			} else if (e.getActionCommand() == "동의4") {
				answer4 = "동의4";
			}
		}
	}

}
