package view_insuranceRegistration;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
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

public class personalInformationAgreementView extends JFrame {
	private static final long serialVersionUID = 1L;

	private actionHandler actionHandler;

	private personalInformationAgreementView2 personalInformationAgreementView2;
	private boolean painted = true;

	private JScrollPane jScrollPane;
	private JScrollPane jScrollPane2;

	private JTextArea personalInformationAgreement;
	private JTextArea personalInformationAgreement2;

	private Vector<JCheckBox> buttons;
	private ButtonGroup group1, group2;

	private String answer1;
	private String answer2;

	public personalInformationAgreementView() {
		this.actionHandler = new actionHandler();
		this.personalInformationAgreementView2 = new personalInformationAgreementView2();

		this.group1 = new ButtonGroup();
		this.group2 = new ButtonGroup();

		this.buttons = new Vector<JCheckBox>();
	}

	public void association() {
		this.personalInformationAgreementView2.association();
	}

	public void run() {
		if (painted == true) {

			this.setTitle("보험금 청구를 위한 필수 동의서");

			this.setSize(1450, 800);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

			JPanel topPanel = new JPanel();
			topPanel.setLayout(new FlowLayout());
			topPanel.setBackground(Color.white);

			JPanel titlePanel = new JPanel();
			titlePanel.setBackground(Color.white);

			JLabel titleLabel = new JLabel("보험금 청구를 위한 필수 동의서");
			titleLabel.setOpaque(true);
			titleLabel.setBackground(new Color(051, 102, 051));
			titleLabel.setFont(new Font("Serif", Font.BOLD, 11));
			titleLabel.setFont(titleLabel.getFont().deriveFont(50.0f));
			titleLabel.setForeground(Color.white);
			titlePanel.add(titleLabel);
			this.add(titlePanel);

			JPanel labelPanel1 = new JPanel();
			labelPanel1.setLayout(new BoxLayout(labelPanel1, BoxLayout.Y_AXIS));
			labelPanel1.setBackground(Color.white);

			JPanel labelPanel2 = new JPanel();
			labelPanel2.setLayout(new BoxLayout(labelPanel2, BoxLayout.Y_AXIS));
			labelPanel2.setBackground(Color.white);

			String sInform1 = "소비자 권익보호에";
			String sInform2 = "관한 사항               ";

			String sInform3 = "동의를 거부하시는 경우에는 보험금 청구가 불가능하며 본 동의서에 의한 ";
			String sInform4 = "개인(신용)정보 조회는 귀하의 신용등급에 영향을 주지 않습니다.               ";

			JLabel inform = new JLabel(sInform1);
			inform.setOpaque(true);
			inform.setBackground(new Color(153, 255, 153));
			inform.setFont(new Font("Serif", Font.BOLD, 11));
			inform.setFont(inform.getFont().deriveFont(15.0f));

			JLabel inform2 = new JLabel(sInform2);
			inform2.setOpaque(true);
			inform2.setBackground(new Color(153, 255, 153));
			inform2.setFont(new Font("Serif", Font.BOLD, 11));
			inform2.setFont(inform2.getFont().deriveFont(15.0f));
			labelPanel1.add(inform);
			labelPanel1.add(inform2);

			JLabel inform3 = new JLabel(sInform3);
			inform3.setOpaque(true);
			inform3.setBackground(new Color(255, 255, 204));
			inform3.setFont(new Font("Serif", Font.BOLD, 11));
			inform3.setFont(inform3.getFont().deriveFont(15.0f));
			JLabel inform4 = new JLabel(sInform4);
			inform4.setOpaque(true);
			inform4.setBackground(new Color(255, 255, 204));
			inform4.setFont(new Font("Serif", Font.BOLD, 11));
			inform4.setFont(inform4.getFont().deriveFont(15.0f));
			labelPanel2.add(inform3);

			labelPanel2.add(inform4);
			topPanel.add(labelPanel1);
			topPanel.add(labelPanel2);

			this.add(topPanel);

			String context = "1. 개인(신용)정보 수집 이용에 관한 동의사항";
			String context2 = "당사 및 당사 업무수탁자는「개인정보보호법」 및 「신용정보의 이용 및 보호에 관한 법률」에 " + "\n\r"
					+ "따라 귀하의 개인(신용)정보를 다음과 같이 수집·이용하고자 합니다.이에 대하여 동의하십니까?";

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

			String context3 = "● 개인(신용)정보의 수집·이용 목적";
			String context4 = "- 보험금지급·심사(보험금청구서류 접수대행 서비스 포함) 및 보험사고 조사(보험사기 조사 포함), 보험금지급관련 민원처리 및 분쟁대응 ";
			String context5 = " - 금융거래 업무(보험료 및 보험금 등 출·수납";
			String context6 = "● 수집·이용할 개인(신용)정보의 내용";
			String context7 = "● 수집·이용할 개인(신용)정보의 내용";
			String context8 = "- 개인식별정보(성명, 주민등록번호, 외국인등록번호, 운전면허정보(운전면허번호 포함), 주소, 직업, 전화번호, 전자우편주소 등), 계좌정보";
			String context9 = " - 보험사고 조사(보험사기 조사 포함) 및 손해사정업무 수행과 관련하여 취득한 개인(신용)정보[경찰, 공공기관, 의료기관 등으로부터 본인의 위임을 받아 취득한 각종 조사서, 증명서, 진료기록 등에 포함된 개인(신용)정보 포함]";
			String context10 = "● 개인(신용)정보의 보유·이용 기간";
			String context11 = "수집·이용 동의일로부터 거래종료 후 5년까지(단, 거래종료 후 5년이 경과한 후에는 보험금 지급, 금융사고 조사, 보험사기 방지·적발, 민원처리, 법령상 의무이행을 위한 경우에 한하여 보유·이용하며, 별도 보관)";
			String context12 = "● 거래종료일 용어 정의";
			String context13 = "  -거래 종료일은 관계법령, 약관 또는 합의 등에 따라 계약기간의 만료, 해지권·해제권·취소권의 행사, \r\n"
					+ "소멸시효의 완성, 변제 등으로 인한 채권의 소멸, 그 밖의 사유로 종료된 날";

			JLabel jLabel3 = new JLabel(context3);
			JLabel jLabel4 = new JLabel(context4);
			JLabel jLabel5 = new JLabel(context5);
			JLabel jLabel6 = new JLabel(context6);
			JLabel jLabel7 = new JLabel(context7);
			JLabel jLabel8 = new JLabel(context8);
			JLabel jLabel9 = new JLabel(context9);
			JLabel jLabel10 = new JLabel(context10);
			JLabel jLabel11 = new JLabel(context11);
			JLabel jLabel12 = new JLabel(context12);
			JLabel jLabel13 = new JLabel(context13);

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

			String sInfor3 = "2. 개인(신용)정보의 조회에 관한 사항";
			String sInfor4 = "당사는「신용정보의 이용 및 보호에 관한 법률」에 따라 귀하의 개인(신용)정보를 " + "\n\r"
					+ "다음과 같이 신용정보집중기관 및 보험요율산출기관으로부터 조회하고자 합니다. 이에 대하여 동의하십니까?";

			JLabel jLabel2 = new JLabel(sInfor3);
			jLabel2.setFont(new Font("Serif", Font.BOLD, 11));
			jLabel2.setFont(jLabel.getFont().deriveFont(20.0f));

			this.personalInformationAgreement2 = new JTextArea(sInfor4, 3, 10);
			this.jScrollPane2 = new JScrollPane(personalInformationAgreement2, jScrollPane2.VERTICAL_SCROLLBAR_ALWAYS,
					jScrollPane2.HORIZONTAL_SCROLLBAR_AS_NEEDED);

			Panel01.add(jLabel2);
			Panel01.add(jScrollPane2);

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
			Panel01.add(buttonPanel2);

			String context14 = "● 개인(신용)정보 조회목적";
			String context15 = "- 보험금지급·심사(보험금청구서류 접수대행 서비스 포함) 및 보험사고 조사(보험사기 조사 포함";
			String context16 = "● 조회할 개인(신용)정보";
			String context17 = "- 보험계약정보, 보험금지급 관련 정보(이전 사고정보 포함), 질병 및 상해 관련 정보";
			String context18 = "● 수집·이용 동의일로부터 거래종료 후 5년까지(단, 보험금 지급, 금융사고 조사, 보험사기 방지 적발, 민원처리, 법령상 의무이행을 위한 경우에 한하여 보유 이용 및 별도 보관)";

			JLabel jLabel14 = new JLabel(context14);
			JLabel jLabel15 = new JLabel(context15);
			JLabel jLabel16 = new JLabel(context16);
			JLabel jLabel17 = new JLabel(context17);
			JLabel jLabel18 = new JLabel(context18);

			Panel01.add(jLabel14);
			Panel01.add(jLabel15);
			Panel01.add(jLabel16);
			Panel01.add(jLabel17);
			Panel01.add(jLabel18);

			JPanel panel11 = new JPanel();
			panel11.setBackground(Color.white);

			JButton bu11 = new JButton("다음");
			bu11.addActionListener(actionHandler);
			bu11.setActionCommand("다음");
			panel11.add(bu11);
			MainPanel01.add(panel11);

			JPanel panel12 = new JPanel();
			panel12.setBackground(Color.white);
			JButton bu12 = new JButton("취소");
			bu12.addActionListener(actionHandler);
			bu12.setActionCommand("취소");
			panel12.add(bu12);
			MainPanel01.add(panel12);
			this.add(MainPanel01);
			painted = false;
		}
		this.setVisible(true);
	}

	class actionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand() == "다음") {
				System.out.println(answer2);
				if (answer1 != "동의1" || answer2 != "동의2") {
					JOptionPane.showMessageDialog(null, "전부 동의하지 않으셨습니다.");
				} else {
					personalInformationAgreementView2.run();
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
			}
		}
	}
}
