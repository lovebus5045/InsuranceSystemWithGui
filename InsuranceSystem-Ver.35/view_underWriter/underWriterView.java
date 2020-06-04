package view_underWriter;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.cUnderWriter;

public class underWriterView extends JFrame {
	private static final long serialVersionUID = 1L;

	private JLabel inputLabel;
	private JTextField[] inputText;
	private actionHandler actionHandler;
	private boolean painted = true;
	private cUnderWriter cUnderWriter;
	private boolean stopper = true;

	public underWriterView() {
		this.actionHandler = new actionHandler();
		this.inputText = new JTextField[9];
		this.cUnderWriter = new cUnderWriter();
	}

	public void run() {
		if (painted == true) {
			this.setTitle("1. 요율 계산");
			this.setSize(700, 700);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

			BoxLayout layout = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
			this.setLayout(layout);
			JPanel mainPanel = new JPanel();
			mainPanel.setLayout(new GridLayout(9, 2));

			JPanel panel0 = new JPanel();
			inputLabel = new JLabel("<요율 계산>");
			panel0.add(inputLabel);
			panel0.setLayout(new BoxLayout(panel0, BoxLayout.X_AXIS));
			this.add(panel0);

			JPanel panel1 = new JPanel();
			inputLabel = new JLabel("                       1. 운전수의 요율을 입력해주세요");
			panel1.add(inputLabel);
			panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
			mainPanel.add(panel1);

			JPanel panel1_1 = new JPanel();
			inputText[0] = new JTextField(15);
			panel1_1.add(inputText[0]);
			mainPanel.add(panel1_1);

			JPanel panel2 = new JPanel();
			inputLabel = new JLabel("                       2. 군인의 요율을 입력해주세요");
			panel2.add(inputLabel);
			panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
			mainPanel.add(panel2);

			JPanel panel2_1 = new JPanel();
			inputText[1] = new JTextField(15);
			panel2_1.add(inputText[1]);
			mainPanel.add(panel2_1);

			JPanel panel3 = new JPanel();
			inputLabel = new JLabel("                       3. 현장직의 요율을 입력해주세요");
			panel3.add(inputLabel);
			panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
			mainPanel.add(panel3);

			JPanel panel3_1 = new JPanel();
			inputText[2] = new JTextField(15);
			panel3_1.add(inputText[2]);
			mainPanel.add(panel3_1);

			JPanel panel4 = new JPanel();
			inputLabel = new JLabel("                       4. 기장의 요율을 입력해주세요");
			panel4.add(inputLabel);
			panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
			mainPanel.add(panel4);

			JPanel panel4_1 = new JPanel();
			inputText[3] = new JTextField(15);
			panel4_1.add(inputText[3]);
			mainPanel.add(panel4_1);

			JPanel panel5 = new JPanel();
			inputLabel = new JLabel("                       5. 승무원의 요율을 입력해주세요");
			panel5.add(inputLabel);
			panel5.setLayout(new BoxLayout(panel5, BoxLayout.Y_AXIS));
			mainPanel.add(panel5);

			JPanel panel5_1 = new JPanel();
			inputText[4] = new JTextField(15);
			panel5_1.add(inputText[4]);
			mainPanel.add(panel5_1);

			JPanel panel6 = new JPanel();
			inputLabel = new JLabel("                       6. 선장의 요율을 입력해주세요");
			panel6.add(inputLabel);
			panel6.setLayout(new BoxLayout(panel6, BoxLayout.Y_AXIS));
			mainPanel.add(panel6);

			JPanel panel6_1 = new JPanel();
			inputText[5] = new JTextField(15);
			panel6_1.add(inputText[5]);
			mainPanel.add(panel6_1);

			JPanel panel7 = new JPanel();
			inputLabel = new JLabel("                       7. 선원의 요율을 입력해주세요");
			panel7.add(inputLabel);
			panel7.setLayout(new BoxLayout(panel7, BoxLayout.Y_AXIS));
			mainPanel.add(panel7);

			JPanel panel7_1 = new JPanel();
			inputText[6] = new JTextField(15);
			panel7_1.add(inputText[6]);
			mainPanel.add(panel7_1);

			JPanel panel8 = new JPanel();
			inputLabel = new JLabel("                       8. 기타직업의 요율을 입력해주세요");
			panel8.add(inputLabel);
			panel8.setLayout(new BoxLayout(panel8, BoxLayout.Y_AXIS));
			mainPanel.add(panel8);

			JPanel panel8_1 = new JPanel();
			inputText[7] = new JTextField(15);
			panel8_1.add(inputText[7]);
			mainPanel.add(panel8_1);

			JPanel panel10 = new JPanel();
			JButton bu1 = new JButton("완료");
			bu1.addActionListener(actionHandler);
			bu1.setActionCommand("완료");
			mainPanel.add(panel10);
			panel10.add(bu1);

			JPanel panel11 = new JPanel();
			JButton bu2 = new JButton("취소");
			bu2.addActionListener(actionHandler);
			bu2.setActionCommand("취소");
			mainPanel.add(panel11);
			panel11.add(bu2);
			
			this.add(mainPanel);
			painted = false;
		}
		this.setVisible(true);
	}

	private void putText() {
		cUnderWriter.setDriver(this.inputText[0].getText());
		cUnderWriter.setSolider(this.inputText[1].getText());
		cUnderWriter.setFieldJob(this.inputText[2].getText());
		cUnderWriter.setPlaneCaptain(this.inputText[3].getText());
		cUnderWriter.setStewardess(this.inputText[4].getText());
		cUnderWriter.setCaptain(this.inputText[5].getText());
		cUnderWriter.setSailor(this.inputText[6].getText());
		cUnderWriter.setEtc(this.inputText[7].getText());

		cUnderWriter.runUnderWriter();
	}

	public void sendMessage(String message) {
		if (message == "완료") {
			this.cUnderWriter.sendAcceptMessage(1);
		} else {

		}
	}

	public boolean isBlank() {

		String driver = this.inputText[0].getText();
		String solider = this.inputText[1].getText();
		String fieldJob = this.inputText[2].getText();
		String planeCaptain = this.inputText[3].getText();
		String stewardess = this.inputText[4].getText();
		String captain = this.inputText[5].getText();
		String sailor = this.inputText[6].getText();
		String etc = this.inputText[7].getText();

		if (driver.equals("")) {
			JOptionPane.showMessageDialog(null, "운전수의 요율을 입력해주세요!");
		} else if (solider.equals("")) {
			JOptionPane.showMessageDialog(null, "군인의 요율을 입력해주세요!");
		} else if (fieldJob.equals("")) {
			JOptionPane.showMessageDialog(null, "현장직의 요율을 입력해주세요!");
		} else if (planeCaptain.equals("")) {
			JOptionPane.showMessageDialog(null, "기장의 요율을 입력해주세요!");
		} else if (stewardess.equals("")) {
			JOptionPane.showMessageDialog(null, "승무원의 요율을 입력해주세요!");
		} else if (captain.equals("")) {
			JOptionPane.showMessageDialog(null, "선장의 요율을 입력해주세요!");
		} else if (sailor.equals("")) {
			JOptionPane.showMessageDialog(null, "선원의 요율을 입력해주세요!");
		} else if (etc.equals("")) {
			JOptionPane.showMessageDialog(null, "기타직업의 요율을 입력해주세요!");
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
				stopper = isBlank();
				if (stopper == true) {
					System.out.println("?");
					putText();
					sendMessage(e.getActionCommand());
					dispose();
				}

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

	public void association() {

	}

}