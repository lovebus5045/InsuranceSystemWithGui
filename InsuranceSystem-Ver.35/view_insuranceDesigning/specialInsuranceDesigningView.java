package view_insuranceDesigning;

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

import control.cSpecialInsurnaceDesigning;

public class specialInsuranceDesigningView extends JFrame {
	private static final long serialVersionUID = 1L;

	private JLabel inputLabel;
	private JTextField[] inputText;
	private actionHandler actionHandler;
	private boolean painted = true;
	private cSpecialInsurnaceDesigning cSpecialInsurnaceDesigning;
	private boolean stopper;

	public specialInsuranceDesigningView() {
		this.actionHandler = new actionHandler();
		this.inputText = new JTextField[9];
		this.cSpecialInsurnaceDesigning = new cSpecialInsurnaceDesigning();
	}

	public void run() {
		if (painted == true) {
			this.setTitle("4. Ư������");
			this.setSize(1000, 700);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

			BoxLayout layout = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
			this.setLayout(layout);
			JPanel mainPanel = new JPanel();
			mainPanel.setLayout(new GridLayout(11, 2));

			JPanel panel0_0 = new JPanel();
			inputLabel = new JLabel("<Ư������ ����>");
			panel0_0.add(inputLabel);
			panel0_0.setLayout(new BoxLayout(panel0_0, BoxLayout.X_AXIS));
			this.add(panel0_0);

			JPanel panel1 = new JPanel();
			inputLabel = new JLabel("                                                  1. ���Դ���� �Է����ּ���");
			panel1.add(inputLabel);
			panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
			mainPanel.add(panel1);

			JPanel panel1_1 = new JPanel();
			inputText[0] = new JTextField(30);
			panel1_1.add(inputText[0]);
			mainPanel.add(panel1_1);

			JPanel panel2 = new JPanel();
			inputLabel = new JLabel("                                                  2. ���Ժ� �Է����ּ���");
			panel2.add(inputLabel);
			panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
			mainPanel.add(panel2);

			JPanel panel2_1 = new JPanel();
			inputText[1] = new JTextField(30);
			panel2_1.add(inputText[1]);
			mainPanel.add(panel2_1);

			JPanel panel3 = new JPanel();
			inputLabel = new JLabel("                                                  3. ���� �Ⱓ�� �Է����ּ���");
			panel3.add(inputLabel);
			panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
			mainPanel.add(panel3);

			JPanel panel3_1 = new JPanel();
			inputText[2] = new JTextField(30);
			panel3_1.add(inputText[2]);
			mainPanel.add(panel3_1);

			JPanel panel4 = new JPanel();
			inputLabel = new JLabel("                                                  4. ���� ����� �Է����ּ���");
			panel4.add(inputLabel);
			panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
			mainPanel.add(panel4);

			JPanel panel4_1 = new JPanel();
			inputText[3] = new JTextField(30);
			panel4_1.add(inputText[3]);
			mainPanel.add(panel4_1);

			JPanel panel5 = new JPanel();
			inputLabel = new JLabel("                                                  5. ������� �Է����ּ���");
			panel5.add(inputLabel);
			panel5.setLayout(new BoxLayout(panel5, BoxLayout.Y_AXIS));
			mainPanel.add(panel5);

			JPanel panel5_1 = new JPanel();
			inputText[4] = new JTextField(30);
			panel5_1.add(inputText[4]);
			mainPanel.add(panel5_1);

			JPanel panel6 = new JPanel();
			inputLabel = new JLabel("                                                  6. ����Ƚ���� �Է����ּ���");
			panel6.add(inputLabel);
			panel6.setLayout(new BoxLayout(panel6, BoxLayout.Y_AXIS));
			mainPanel.add(panel6);

			JPanel panel6_1 = new JPanel();
			inputText[5] = new JTextField(30);
			panel6_1.add(inputText[5]);
			mainPanel.add(panel6_1);

			JPanel panel7 = new JPanel();
			inputLabel = new JLabel("                                                  7. ��������� �Է����ּ���");
			panel7.add(inputLabel);
			panel7.setLayout(new BoxLayout(panel7, BoxLayout.Y_AXIS));
			mainPanel.add(panel7);

			JPanel panel7_1 = new JPanel();
			inputText[6] = new JTextField(30);
			panel7_1.add(inputText[6]);
			mainPanel.add(panel7_1);

			JPanel panel8 = new JPanel();
			inputLabel = new JLabel("                                                  8. ���� Ư���� �Է����ּ���");
			panel8.add(inputLabel);
			panel8.setLayout(new BoxLayout(panel8, BoxLayout.Y_AXIS));
			mainPanel.add(panel8);

			JPanel panel8_1 = new JPanel();
			inputText[7] = new JTextField(30);
			panel8_1.add(inputText[7]);
			mainPanel.add(panel8_1);

			JPanel panel9 = new JPanel();
			inputLabel = new JLabel("                                                  9. ��⺸�� �Ⱓ�� �Է����ּ���");
			panel9.add(inputLabel);
			panel9.setLayout(new BoxLayout(panel9, BoxLayout.Y_AXIS));
			mainPanel.add(panel9);

			JPanel panel9_1 = new JPanel();
			inputText[8] = new JTextField(30);
			panel9_1.add(inputText[8]);
			mainPanel.add(panel9_1);

			JPanel panel10 = new JPanel();
			JButton bu1 = new JButton("�Ϸ�");
			bu1.addActionListener(actionHandler);
			bu1.setActionCommand("�Ϸ�");
			mainPanel.add(panel10);
			panel10.add(bu1);

			JPanel panel11 = new JPanel();
			JButton bu2 = new JButton("���");
			bu2.addActionListener(actionHandler);
			bu2.setActionCommand("���");
			mainPanel.add(panel11);
			panel11.add(bu2);

			this.add(mainPanel);
			painted = false;
		}
		this.setVisible(true);
	}

	public boolean isBlank() {

		String subScriptionTarget = this.inputText[0].getText();
		String payment = this.inputText[1].getText();
		String period = this.inputText[2].getText();
		String paymentMethod = this.inputText[3].getText();
		String insurnaceMoney = this.inputText[4].getText();
		String compensationAmount = this.inputText[5].getText();
		String notes = this.inputText[6].getText();
		String specialSubscription = this.inputText[7].getText();
		String LongtermPeriod = this.inputText[8].getText();
		if (subScriptionTarget.equals("")) {
			JOptionPane.showMessageDialog(null, "���Դ���� �Է����ּ���!");
		} else if (payment.equals("")) {
			JOptionPane.showMessageDialog(null, "���Ժ� �Է����ּ���!");
		} else if (period.equals("")) {
			JOptionPane.showMessageDialog(null, "���� �Ⱓ�� �Է����ּ���!");
		} else if (paymentMethod.equals("")) {
			JOptionPane.showMessageDialog(null, "���� ����� �Է����ּ���!");
		} else if (insurnaceMoney.equals("")) {
			JOptionPane.showMessageDialog(null, "������� �Է����ּ���!");
		} else if (compensationAmount.equals("")) {
			JOptionPane.showMessageDialog(null, "����Ƚ���� �Է����ּ���!");
		} else if (notes.equals("")) {
			JOptionPane.showMessageDialog(null, "��������� �Է����ּ���!");
		} else if (specialSubscription.equals("")) {
			JOptionPane.showMessageDialog(null, "���� Ư���� �Է����ּ���!");
		} else if (LongtermPeriod.equals("")) {
			JOptionPane.showMessageDialog(null, "��⺸�� �Ⱓ�� �Է����ּ���!");
		} else if (LongtermPeriod.equals("1") || LongtermPeriod.equals("2")) {
			JOptionPane.showMessageDialog(null, "��⺸�� �Ⱓ�� 3����� �����մϴ�!");
		} else {
			return true;
		}
		return false;

	}

	private void putText() {
		cSpecialInsurnaceDesigning.setSubscriptionTarget(this.inputText[0].getText());
		cSpecialInsurnaceDesigning.setPayment(this.inputText[1].getText());
		cSpecialInsurnaceDesigning.setPeriod(this.inputText[2].getText());
		cSpecialInsurnaceDesigning.setPaymentMethod(this.inputText[3].getText());
		cSpecialInsurnaceDesigning.setInsurnaceMoney(this.inputText[4].getText());
		cSpecialInsurnaceDesigning.setCompensationAmount(this.inputText[5].getText());
		cSpecialInsurnaceDesigning.setNotes(this.inputText[6].getText());
		cSpecialInsurnaceDesigning.setSpecialSubscription(this.inputText[7].getText());
		cSpecialInsurnaceDesigning.setLongterPeriod(this.inputText[8].getText());

		cSpecialInsurnaceDesigning.runcSpecialInsurnace();
	}

	class actionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "�Ϸ�") {
				stopper = isBlank();

				if (stopper == true) {
					putText();
					dispose();
				}

			} else if (e.getActionCommand() == "���") {
				int result = JOptionPane.showConfirmDialog(null, "����Ͻðڽ��ϱ�?", "Confirm", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					dispose();
					// information.returnInDesign();

				} else if (result == JOptionPane.NO_OPTION) {

				} else if (result == JOptionPane.CLOSED_OPTION) {
					// �׳� â ���� ���
				}
			}
		}
	}

	public void association() {

	}

	public void initialize() {
		// TODO Auto-generated method stub

	}

}
