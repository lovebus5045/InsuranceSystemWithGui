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

			this.setTitle("����� û���� ���� �ʼ� ���Ǽ�");

			this.setSize(1450, 800);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

			JPanel topPanel = new JPanel();
			topPanel.setLayout(new FlowLayout());
			topPanel.setBackground(Color.white);

			JPanel titlePanel = new JPanel();
			titlePanel.setBackground(Color.white);

			JLabel titleLabel = new JLabel("����� û���� ���� �ʼ� ���Ǽ�");
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

			String sInform1 = "�Һ��� ���ͺ�ȣ��";
			String sInform2 = "���� ����               ";

			String sInform3 = "���Ǹ� �ź��Ͻô� ��쿡�� ����� û���� �Ұ����ϸ� �� ���Ǽ��� ���� ";
			String sInform4 = "����(�ſ�)���� ��ȸ�� ������ �ſ��޿� ������ ���� �ʽ��ϴ�.               ";

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

			String context = "1. ����(�ſ�)���� ���� �̿뿡 ���� ���ǻ���";
			String context2 = "��� �� ��� ������Ź�ڴ¡�����������ȣ���� �� ���ſ������� �̿� �� ��ȣ�� ���� �������� " + "\n\r"
					+ "���� ������ ����(�ſ�)������ ������ ���� �������̿��ϰ��� �մϴ�.�̿� ���Ͽ� �����Ͻʴϱ�?";

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

			String context3 = "�� ����(�ſ�)������ �������̿� ����";
			String context4 = "- ��������ޡ��ɻ�(�����û������ �������� ���� ����) �� ������ ����(������ ���� ����), ��������ް��� �ο�ó�� �� ������� ";
			String context5 = " - �����ŷ� ����(����� �� ����� �� �⡤����";
			String context6 = "�� �������̿��� ����(�ſ�)������ ����";
			String context7 = "�� �������̿��� ����(�ſ�)������ ����";
			String context8 = "- ���νĺ�����(����, �ֹε�Ϲ�ȣ, �ܱ��ε�Ϲ�ȣ, ������������(���������ȣ ����), �ּ�, ����, ��ȭ��ȣ, ���ڿ����ּ� ��), ��������";
			String context9 = " - ������ ����(������ ���� ����) �� ���ػ������� ����� �����Ͽ� ����� ����(�ſ�)����[����, �������, �Ƿ��� �����κ��� ������ ������ �޾� ����� ���� ���缭, ����, ������ � ���Ե� ����(�ſ�)���� ����]";
			String context10 = "�� ����(�ſ�)������ �������̿� �Ⱓ";
			String context11 = "�������̿� �����Ϸκ��� �ŷ����� �� 5�����(��, �ŷ����� �� 5���� ����� �Ŀ��� ����� ����, ������� ����, ������ ����������, �ο�ó��, ���ɻ� �ǹ������� ���� ��쿡 ���Ͽ� �������̿��ϸ�, ���� ����)";
			String context12 = "�� �ŷ������� ��� ����";
			String context13 = "  -�ŷ� �������� �������, ��� �Ǵ� ���� � ���� ���Ⱓ�� ����, �����ǡ������ǡ���ұ��� ���, \r\n"
					+ "�Ҹ��ȿ�� �ϼ�, ���� ������ ���� ä���� �Ҹ�, �� ���� ������ ����� ��";

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

			String sInfor3 = "2. ����(�ſ�)������ ��ȸ�� ���� ����";
			String sInfor4 = "���¡��ſ������� �̿� �� ��ȣ�� ���� �������� ���� ������ ����(�ſ�)������ " + "\n\r"
					+ "������ ���� �ſ��������߱�� �� ����������������κ��� ��ȸ�ϰ��� �մϴ�. �̿� ���Ͽ� �����Ͻʴϱ�?";

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
			Panel01.add(buttonPanel2);

			String context14 = "�� ����(�ſ�)���� ��ȸ����";
			String context15 = "- ��������ޡ��ɻ�(�����û������ �������� ���� ����) �� ������ ����(������ ���� ����";
			String context16 = "�� ��ȸ�� ����(�ſ�)����";
			String context17 = "- ����������, ��������� ���� ����(���� ������� ����), ���� �� ���� ���� ����";
			String context18 = "�� �������̿� �����Ϸκ��� �ŷ����� �� 5�����(��, ����� ����, ������� ����, ������ ���� ����, �ο�ó��, ���ɻ� �ǹ������� ���� ��쿡 ���Ͽ� ���� �̿� �� ���� ����)";

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

			JButton bu11 = new JButton("����");
			bu11.addActionListener(actionHandler);
			bu11.setActionCommand("����");
			panel11.add(bu11);
			MainPanel01.add(panel11);

			JPanel panel12 = new JPanel();
			panel12.setBackground(Color.white);
			JButton bu12 = new JButton("���");
			bu12.addActionListener(actionHandler);
			bu12.setActionCommand("���");
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

			if (e.getActionCommand() == "����") {
				System.out.println(answer2);
				if (answer1 != "����1" || answer2 != "����2") {
					JOptionPane.showMessageDialog(null, "���� �������� �����̽��ϴ�.");
				} else {
					personalInformationAgreementView2.run();
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
			}
		}
	}
}
