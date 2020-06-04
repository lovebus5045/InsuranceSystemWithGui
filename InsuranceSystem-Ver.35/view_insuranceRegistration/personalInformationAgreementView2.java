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
			this.setTitle("����� û���� ���� �ʼ� ���Ǽ�2");

			this.setSize(1900, 700);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

			String context = "3. ����(�ſ�)������ ������ ���� ����";
			String context2 = "���� ���������� ��ȣ���� �� ���ſ������� �̿� �� ��ȣ�� ���� ������ �� ���� " + "\n\r"
					+ " ������ ����(�ſ�)������ ������ ���� ��3�ڿ��� �����ϰ��� �մϴ�. �̿� ���Ͽ� �����Ͻʴϱ�?";

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

			JCheckBox button1 = new JCheckBox("����");
			button1.setBackground(new Color(255, 255, 153));
			button1.setActionCommand("����1");
			button1.addActionListener(actionHandler);
			this.buttons.add(button1);
			group1.add(button1);
			buttonPanel.add(button1);
			JCheckBox button2 = new JCheckBox("�������� �ʴ´�.");
			button2.setBackground(new Color(255, 255, 153));
			button2.setActionCommand("����X");
			button2.addActionListener(actionHandler);
			this.buttons.add(button2);
			group1.add(button2);
			buttonPanel.add(button2);
			Panel01.add(buttonPanel);

			String context3 = "�� ����(�ſ�)������ �����޴� ��";
			String context4 = "�� �ſ��������߱�� : �ѱ��ſ�������";
			String context5 = "�� ������� �� : �� ��������ȸ, �����ؾ��, ����������, ������� ������ �� �������, ���ɻ� ���� ��������(��Ź����� ����)";
			String context6 = "�� ����ȸ�� �� : �� �������, ���غ����, ���������� �纸���, ���������, ü�Ű���(��ü������), �����ŷ� ����, ���°����������, ���������� ";
			String context7 = "�� ������Ź�� �� : �� ��������ޡ��ɻ� �� ���������� � �ʿ��� ������ ��Ź ���� �� (�����������ü, ���ػ�����ü, �Ƿ������ǻ�, ��ȣ��, ��Ź �ݼ�Ÿ, �� �� �ڵ��������� ��� �ǰ�����ɻ��򰡿�, �ڵ���������������������ȸ, ���غ�����ȸ ��)";
			String context8 = "�� ����(�ſ�)������ �����޴� ���� �̿����";
			String context9 = "�� �ſ��������߱�� : ������ �� ��������� ���� ������ ���߰��� �� Ȱ�� �� �ſ��������߱���� ����";
			String context10 = "�� ������� �� : ������� �� �ι� �� ���ɿ� ���� �������� (�����μ� �� ��Ź���� ����)";
			String context11 = "�� ����ȸ�� �� : �� ����������(������ ���� ����) �� ���ػ������� �� ������࿡ �ʿ��� ����, �����û������ �������� ����, �����ɻ�, �Ƿ�ɻ� �� �ڹ�";
			String context12 = "�� �����ŷ� ����(����� �� ����� �� �⡤����)";
			String context13 = "�� ������ ����(�ſ�)������ ����";

			String context14 = " - 1. ����(�ſ�)������ �������̿뿡 ���� ���ס� �� ��������(��, �� �����޴� ���� �̿� ������ ���� �ʿ��� ������ ����)";

			String context15 = "�� �����޴� ���� ����(�ſ�)���� �������̿�Ⱓ";
			String context16 = "�� ����(�ſ�)������ �����޴� ���� �̿������ �޼��� ������(�ִ� �ŷ����� �� 5�����)";
			String context17 = "�� �� �� ��������� �� �̿������ ��ü���� ������ ��� Ȩ������[www.idbins.com]���� Ȯ���� �� �ֽ��ϴ�.";

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

			String sInfor1 = "4. ��� �� ��� ������Ź�ڴ¡�����������ȣ���� �� ���ſ������� �̿� �� ��ȣ�� ���� ������ �� ����" + "\r\n"
					+ "����� ����(�ſ�)������ ���� ���� ���ǻ��׿� ���Ͽ� ������ ���� ������ �ΰ�����(��������������) �� " + "\r\n"
					+ "�����ĺ�����(�ֹε�Ϲ�ȣ���ܱ��ε�Ϲ�ȣ, ���������ȣ)�� ó��(�������̿�, ��ȸ, ����) �ϰ��� �մϴ�." + "\r\n" + " �̿� ���Ͽ� �����Ͻʴϱ�?";

			this.personalInformationAgreement2 = new JTextArea(sInfor1, 3, 10);
			this.jScrollPane2 = new JScrollPane(personalInformationAgreement2, jScrollPane2.VERTICAL_SCROLLBAR_ALWAYS,
					jScrollPane2.HORIZONTAL_SCROLLBAR_AS_NEEDED);

			Panel01.add(jScrollPane2);

			JPanel botPanel = new JPanel();
			botPanel.setLayout(new GridLayout(2, 2));
			botPanel.setBackground(Color.white);
			String context18 = "�������������� ó��";
			JLabel jLabel18 = new JLabel(context18);
			jLabel18.setFont(new Font("Serif", Font.BOLD, 11));
			jLabel18.setFont(jLabel18.getFont().deriveFont(15.0f));

			JPanel buttonPanel2 = new JPanel();
			buttonPanel2.setLayout(new BoxLayout(buttonPanel2, BoxLayout.X_AXIS));
			buttonPanel2.setBackground(Color.white);
			JCheckBox button3 = new JCheckBox("����");

			button3.setBackground(new Color(255, 255, 153));
			button3.setActionCommand("����2");
			button3.addActionListener(actionHandler);
			this.buttons.add(button3);
			group2.add(button3);
			buttonPanel2.add(button3);

			JCheckBox button4 = new JCheckBox("�������� �ʴ´�.");
			button4.setBackground(new Color(255, 255, 153));
			button4.setActionCommand("����X");
			button4.addActionListener(actionHandler);
			this.buttons.add(button4);
			group2.add(button4);
			buttonPanel2.add(button4);

			String context19 = "�ֹε�Ϲ�ȣ, �ܱ��ε�Ϲ�ȣ, ������������ȣ ó��";
			JLabel jLabel19 = new JLabel(context19);
			jLabel19.setFont(new Font("Serif", Font.BOLD, 11));
			jLabel19.setFont(jLabel19.getFont().deriveFont(15.0f));

			JPanel buttonPanel3 = new JPanel();
			buttonPanel3.setLayout(new BoxLayout(buttonPanel3, BoxLayout.X_AXIS));
			buttonPanel3.setBackground(Color.white);
			JCheckBox button5 = new JCheckBox("����");
			button5.setBackground(new Color(255, 255, 153));
			button5.setActionCommand("����3");
			button5.addActionListener(actionHandler);
			this.buttons.add(button5);
			group3.add(button5);
			buttonPanel3.add(button5);
			JCheckBox button6 = new JCheckBox("�������� �ʴ´�.");
			button6.setBackground(new Color(255, 255, 153));
			button6.setActionCommand("����X");
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
			String context20 = "�ۼ�����";
			JLabel jLabel20 = new JLabel(context20);
			jLabel20.setFont(new Font("Serif", Font.BOLD, 11));
			jLabel20.setFont(jLabel20.getFont().deriveFont(15.0f));
			// �̰Ŵ� ������ ��
			inputText[0] = new JTextField(10);

			String context21 = "������";
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
			JButton bu11 = new JButton("����");
			bu11.addActionListener(actionHandler);
			bu11.setActionCommand("����");
			panel11.add(bu11);
			panel13.add(panel11);

			JPanel panel12 = new JPanel();
			panel12.setBackground(Color.white);
			JButton bu12 = new JButton("�������� �ʴ´�");
			bu12.addActionListener(actionHandler);
			bu12.setActionCommand("���");
			panel12.add(bu12);
			panel13.add(panel12);

			this.add(MainPanel01);
			this.add(panel13);
			painted = false;
		}
		this.setVisible(true);
	}

	public void sendInformation() {

//���༭ �����ɿ� information �������� ������ �����п� ���� ^^
	}

	class actionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand() == "����") {
				System.out.println(answer2);
				if (answer1 != "����1" || answer2 != "����2") {
					JOptionPane.showMessageDialog(null, "���� �������� �����̽��ϴ�.");
				} else {
					insuranceRegistrationView.run();
					sendInformation();
					dispose();
				}

			} else if (e.getActionCommand() == "���") {
				int result = JOptionPane.showConfirmDialog(null, "�� ���������� �����ðڽ��ϱ�?", "Confirm",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					dispose();
					// information.returnMainFrame();
				} else if (result == JOptionPane.NO_OPTION) {

				} else if (result == JOptionPane.CLOSED_OPTION) {
					// �׳� â ���� ���
				}

			} else if (e.getActionCommand() == "����2") {
				answer2 = "����2";
			} else if (e.getActionCommand() == "����1") {
				answer1 = "����1";
			} else if (e.getActionCommand() == "����3") {
				answer3 = "����3";
			} else if (e.getActionCommand() == "����4") {
				answer4 = "����4";
			}
		}
	}

}
