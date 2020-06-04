package view_insuranceRegistration;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import control.cSpecialInsuranceRegistration;
import global.constant.eBuildingType;
import global.constant.eGender;
import global.constant.eJob;
import global.constant.eLongTerm;
import global.constant.eSpecialType;

public class specialInsuranceRegistrationView extends JFrame {
	private static final long serialVersionUID = 1L;

	private JLabel inputLabel;
	private JTextField[] inputText;
	private actionHandler actionHandler;
	private Vector<JRadioButton> buttons;
	private boolean painted = true;
	private ButtonGroup group1, group2, group3, group4, group5;

	private cSpecialInsuranceRegistration cSpecialInsuranceRegistration;

	public specialInsuranceRegistrationView() {
		this.actionHandler = new actionHandler();
		this.inputText = new JTextField[9];
		group1 = new ButtonGroup();
		group2 = new ButtonGroup();
		group3 = new ButtonGroup();
		group4 = new ButtonGroup();
		group5 = new ButtonGroup();
		this.buttons = new Vector<JRadioButton>();
	}

	public void run() {
		if (painted == true) {
			this.setTitle("4. 특종보험");
			this.setSize(1000, 1000);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

			BoxLayout layout = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
			this.setLayout(layout);
			JPanel mainPanel = new JPanel();
			mainPanel.setLayout(new GridLayout(14, 2));

			JPanel panel0 = new JPanel();
			inputLabel = new JLabel("<특종보험 가입>");
			panel0.add(inputLabel);
			panel0.setLayout(new BoxLayout(panel0, BoxLayout.X_AXIS));
			this.add(panel0);

			JPanel panel1 = new JPanel();
			inputLabel = new JLabel("                                                  1. 이름을 입력해주세요");
			panel1.add(inputLabel);
			panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
			mainPanel.add(panel1);

			JPanel panel1_1 = new JPanel();
			inputText[0] = new JTextField(30);
			panel1_1.add(inputText[0]);
			mainPanel.add(panel1_1);

			JPanel panel2 = new JPanel();
			inputLabel = new JLabel("                                                  2. 주민등록번호를 입력해주세요");
			panel2.add(inputLabel);
			panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
			mainPanel.add(panel2);

			JPanel panel2_1 = new JPanel();
			inputText[1] = new JTextField(30);
			panel2_1.add(inputText[1]);
			mainPanel.add(panel2_1);

			JPanel panel3 = new JPanel();
			inputLabel = new JLabel("                                                  3. 나이를 입력해주세요");
			panel3.add(inputLabel);
			panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
			mainPanel.add(panel3);

			JPanel panel3_1 = new JPanel();
			inputText[2] = new JTextField(30);
			panel3_1.add(inputText[2]);
			mainPanel.add(panel3_1);

			JPanel panel4 = new JPanel();
			inputLabel = new JLabel("                                                  4. 성별을 선택해주세요");
			panel4.add(inputLabel);
			panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
			mainPanel.add(panel4);

			JPanel panel4_1 = new JPanel();
			for (eGender eGender : eGender.values()) {
				JRadioButton button = new JRadioButton(eGender.getText());
				button.setActionCommand(eGender.getText());
				button.addActionListener(actionHandler);
				this.buttons.add(button);
				this.add(button);
				group1.add(button);
				panel4_1.add(button);
			}
			mainPanel.add(panel4_1);

			JPanel panel5 = new JPanel();
			inputLabel = new JLabel("                                                  5. 전화번호를 입력해주세요");
			panel5.add(inputLabel);
			panel5.setLayout(new BoxLayout(panel5, BoxLayout.Y_AXIS));
			mainPanel.add(panel5);

			JPanel panel5_1 = new JPanel();
			inputText[3] = new JTextField(30);
			panel5_1.add(inputText[3]);
			mainPanel.add(panel5_1);

			JPanel panel6 = new JPanel();
			inputLabel = new JLabel("                                                  6. 주소를 입력해주세요");
			panel6.add(inputLabel);
			panel6.setLayout(new BoxLayout(panel6, BoxLayout.Y_AXIS));
			mainPanel.add(panel6);

			JPanel panel6_1 = new JPanel();
			inputText[4] = new JTextField(30);
			panel6_1.add(inputText[4]);
			mainPanel.add(panel6_1);

			JPanel panel7 = new JPanel();
			inputLabel = new JLabel("                                                  7. 계좌번호를 입력해주세요");
			panel7.add(inputLabel);
			panel7.setLayout(new BoxLayout(panel7, BoxLayout.Y_AXIS));
			mainPanel.add(panel7);

			JPanel panel7_1 = new JPanel();
			inputText[5] = new JTextField(30);
			panel7_1.add(inputText[5]);
			mainPanel.add(panel7_1);
			
			JPanel panel7_2 = new JPanel();
			inputLabel = new JLabel("                                                  8. 이메일을 입력해주세요");
			panel7_2.add(inputLabel);
			panel7_2.setLayout(new BoxLayout(panel7_2, BoxLayout.Y_AXIS));
			mainPanel.add(panel7_2);

			JPanel panel7_3 = new JPanel();
			inputText[8] = new JTextField(30);
			panel7_3.add(inputText[8]);
			mainPanel.add(panel7_3);

			JPanel panel8 = new JPanel();
			inputLabel = new JLabel("                                                  9. 직업을 선택해주세요");
			panel8.add(inputLabel);
			panel8.setLayout(new BoxLayout(panel8, BoxLayout.Y_AXIS));
			mainPanel.add(panel8);

			JPanel panel8_1 = new JPanel();
			for (eJob eJob : eJob.values()) { // values : object하나하나의 array
				JRadioButton button = new JRadioButton(eJob.getText());
				button.setActionCommand(eJob.getText());
				button.addActionListener(actionHandler);
				this.buttons.add(button);
				this.add(button);
				group2.add(button);
				panel8_1.add(button);
			}
			mainPanel.add(panel8_1);

			JPanel panelT = new JPanel();
			inputLabel = new JLabel("                                                  10. 보험 종류를 선택해주세요");
			panelT.setLayout(new BoxLayout(panelT, BoxLayout.Y_AXIS));
			panelT.add(inputLabel);
			mainPanel.add(panelT);
			
			JPanel panelTT = new JPanel();
			for (eSpecialType eProperty : eSpecialType.values()) {
				JRadioButton button = new JRadioButton(eProperty.getText());
				button.setActionCommand(eProperty.getText());
				button.addActionListener(actionHandler);
				this.buttons.add(button);
				this.add(button);
				group5.add(button);
				panelTT.add(button);
			}
			mainPanel.add(panelTT);
			
			//좀 더 생각해보기
			JPanel panel13 = new JPanel();
			inputLabel = new JLabel("                                                  11. 소유재산을 선택해주세요");
			panel13.add(inputLabel);
			panel13.setLayout(new BoxLayout(panel13, BoxLayout.Y_AXIS));
			mainPanel.add(panel13);

			JPanel panel13_1 = new JPanel();
			for (eBuildingType eProperty : eBuildingType.values()) {
				JRadioButton button = new JRadioButton(eProperty.getText());
				//바꿔야함
				button.setActionCommand(eProperty.getText());
				button.addActionListener(actionHandler);
				this.buttons.add(button);
				this.add(button);
				group3.add(button);
				panel13_1.add(button);
			}
			inputText[6] = new JTextField(10);
			panel13_1.add(inputText[6]);
			mainPanel.add(panel13_1);
			
			JPanel panel9 = new JPanel();
			inputLabel = new JLabel("                                                  12. 장기보험 여부를 선택해주세요");
			panel9.add(inputLabel);
			panel9.setLayout(new BoxLayout(panel9, BoxLayout.Y_AXIS));
			mainPanel.add(panel9);

			JPanel panel9_1 = new JPanel();
			for (eLongTerm eLongTerm : eLongTerm.values()) {
				JRadioButton button = new JRadioButton(eLongTerm.getText());
				button.setActionCommand(eLongTerm.getText());
				button.addActionListener(actionHandler);
				this.buttons.add(button);
				this.add(button);
				group4.add(button);
				panel9_1.add(button);
			}
			mainPanel.add(panel9_1);

			JPanel panel10 = new JPanel();
			inputLabel = new JLabel("                                                  13. 참고사항을 입력해주세요");
			panel10.add(inputLabel);
			panel10.setLayout(new BoxLayout(panel10, BoxLayout.Y_AXIS));
			mainPanel.add(panel10);

			JPanel panel10_1 = new JPanel();
			inputText[6] = new JTextField(30);
			panel10_1.add(inputText[6]);
			mainPanel.add(panel10_1);

			JPanel panel11 = new JPanel();
			JButton bu11 = new JButton("완료");
			bu11.addActionListener(actionHandler);
			bu11.setActionCommand("완료");
			mainPanel.add(panel11);
			panel11.add(bu11);

			JPanel panel12 = new JPanel();
			JButton bu12 = new JButton("취소");
			bu12.addActionListener(actionHandler);
			bu12.setActionCommand("취소");
			mainPanel.add(panel12);
			panel12.add(bu12);
			
			this.add(mainPanel);
			painted = false;
		}
		this.setVisible(true);
	}
	public void putText() {
		cSpecialInsuranceRegistration.setName(inputText[0].getText());
		cSpecialInsuranceRegistration.setResidentRegistrationNumber(inputText[1].getText());
		cSpecialInsuranceRegistration.setAge(Integer.parseInt(inputText[2].getText()));
		cSpecialInsuranceRegistration.setPhoneNumber(inputText[3].getText());
		cSpecialInsuranceRegistration.setAddress(inputText[4].getText());
		cSpecialInsuranceRegistration.setAccountNumber(inputText[5].getText());
		cSpecialInsuranceRegistration.setNote(inputText[6].getText());

		cSpecialInsuranceRegistration.setGender(group1.getSelection().getActionCommand());
		cSpecialInsuranceRegistration.setJob(group2.getSelection().getActionCommand());
//		cSpecialInsuranceRegistration.set
		cSpecialInsuranceRegistration.setLongterm(group4.getSelection().getActionCommand());

		cSpecialInsuranceRegistration.run();
	}
	
	class actionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "완료") {
				// 완료
				putText();
			} else if (e.getActionCommand() == "취소") {
				int result = JOptionPane.showConfirmDialog(null, "취소하시겠습니까?", "Confirm", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					dispose();
					// information.returnInRegist();
				} else if (result == JOptionPane.NO_OPTION) {

				} else if (result == JOptionPane.CLOSED_OPTION) {
					// 그냥 창 닫은 경우
				}
			}
		}
	}

	public void association() {

	}
}
