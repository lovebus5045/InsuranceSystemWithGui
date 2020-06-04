package view_accidentReception;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextArea;
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

import control.cAccidentReceptionApplication;
import global.constant.eGender;

public class accidentReceptionApplicationView extends JFrame {
	private static final long serialVersionUID = 1L;

	private JLabel inputLabel;
	private JTextField[] inputText;
	private TextArea textArea;
	private actionHandler actionHandler;
	private Vector<JRadioButton> buttons;
	private cAccidentReceptionApplication cAccidentReceptionApplication;
	private boolean painted = true;
	private boolean stopper = true;
	private ButtonGroup group;

	public accidentReceptionApplicationView() {
		this.actionHandler = new actionHandler();
		this.buttons = new Vector<JRadioButton>();
		this.group = new ButtonGroup();
		this.cAccidentReceptionApplication = new cAccidentReceptionApplication();
		this.inputText = new JTextField[5];
	}

	public void run() {
		if (painted == true) {

			this.setTitle("1. 사고접수");
			this.setSize(1000, 700);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

			BoxLayout layout = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
			this.setLayout(layout);
			JPanel mainPanel = new JPanel();
			mainPanel.setLayout(new GridLayout(10, 2));

			JPanel panel0_0 = new JPanel();
			inputLabel = new JLabel("<사고접수>");
			panel0_0.add(inputLabel);
			panel0_0.setLayout(new BoxLayout(panel0_0, BoxLayout.Y_AXIS));
			this.add(panel0_0);

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
			inputLabel = new JLabel("                                                  3. 성별을 선택해주세요");
			panel3.add(inputLabel);
			panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
			mainPanel.add(panel3);

			JPanel panel3_1 = new JPanel();
			for (eGender eGender : eGender.values()) {
				JRadioButton button = new JRadioButton(eGender.getText());
				button.setActionCommand(eGender.getText());
				button.addActionListener(actionHandler);
				this.buttons.add(button);
				this.add(button);
				group.add(button);
				panel3_1.add(button);
			}
			mainPanel.add(panel3_1);

			JPanel panel4 = new JPanel();
			inputLabel = new JLabel("                                                  4. 전화번호를 입력해주세요");
			panel4.add(inputLabel);
			panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
			mainPanel.add(panel4);

			JPanel panel4_1 = new JPanel();
			inputText[2] = new JTextField(30);
			panel4_1.add(inputText[2]);
			mainPanel.add(panel4_1);

			JPanel panel7_2 = new JPanel();
			inputLabel = new JLabel("                                                  5. 이메일을 입력해주세요");
			panel7_2.add(inputLabel);
			panel7_2.setLayout(new BoxLayout(panel7_2, BoxLayout.Y_AXIS));
			mainPanel.add(panel7_2);

			JPanel panel7_3 = new JPanel();
			inputText[3] = new JTextField(30);
			panel7_3.add(inputText[3]);
			mainPanel.add(panel7_3);

			JPanel panel5 = new JPanel();
			inputLabel = new JLabel("                                                  6. 사고 내용을 입력해주세요");
			panel5.add(inputLabel);
			panel5.setLayout(new BoxLayout(panel5, BoxLayout.Y_AXIS));
			mainPanel.add(panel5);

			JPanel panel5_1 = new JPanel();
//			inputText[4] = new JTextField(100);
//			panel5_1.add(inputText[4]);
			textArea = new TextArea();
			panel5_1.add(textArea);
			mainPanel.add(panel5_1);

			JPanel panel6 = new JPanel();
			JButton bu1 = new JButton("완료");
			bu1.addActionListener(actionHandler);
			bu1.setActionCommand("완료");
			mainPanel.add(panel6);
			panel6.add(bu1);

			JPanel panel7 = new JPanel();
			JButton bu2 = new JButton("취소");
			bu2.addActionListener(actionHandler);
			bu2.setActionCommand("취소");
			mainPanel.add(panel7);
			panel7.add(bu2);

			this.add(mainPanel);
			painted = false;
		}
		this.setVisible(true);
	}

	private void putText() {
		cAccidentReceptionApplication.setName(this.inputText[0].getText());
		cAccidentReceptionApplication.setIdNumber(this.inputText[1].getText());
		cAccidentReceptionApplication.setPhoneNumber(this.inputText[2].getText());
		cAccidentReceptionApplication.setEmail(this.inputText[3].getText());

		cAccidentReceptionApplication.runAccidentReceptionApplication();
	}

	public void sendMessage(String message) {
		if (message == "완료") {
			this.cAccidentReceptionApplication.sendAcceptMessage(1);
		} else {

		}
	}

	public boolean isBlank() {

		String name = this.inputText[0].getText();
		String idNumber = this.inputText[1].getText();
		String phoneNumber = this.inputText[2].getText();
		String eMail = this.inputText[3].getText();
		String accident = this.textArea.getText();

		if (name.equals("")) {
			JOptionPane.showMessageDialog(null, "이름을 입력해주세요!");
		} else if (idNumber.equals("")) {
			JOptionPane.showMessageDialog(null, "주민번호를 입력해주세요!");
		} else if (phoneNumber.equals("")) {
			JOptionPane.showMessageDialog(null, "전화번호를 입력해주세요!");
		} else if (accident.equals("")) {
			JOptionPane.showMessageDialog(null, "사고내용을 입력해주세요!");
		} else if (eMail.equals("")) {
			JOptionPane.showMessageDialog(null, "이메일을 입력해주세요!");
		} else {
			return true;
		}
		return false;
	}

	class actionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "완료") {
				// 완료
				for (int i = 0; i < inputText.length; i++) {
					System.out.println(inputText[i].getText());
				}
				System.out.println(textArea.getText());

				stopper = isBlank();
				if (stopper == true) {
					putText();
					dispose();
				}
				sendMessage(e.getActionCommand());
			} else if (e.getActionCommand() == "취소") {
				int result = JOptionPane.showConfirmDialog(null, "취소하시겠습니까?", "Confirm", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					dispose();
				} else if (result == JOptionPane.NO_OPTION) {

				} else if (result == JOptionPane.CLOSED_OPTION) {
					// 그냥 창 닫은 경우
				}
			}
		}
	}
}