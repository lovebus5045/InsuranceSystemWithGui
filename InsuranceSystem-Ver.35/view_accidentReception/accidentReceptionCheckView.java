package view_accidentReception;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import control.cAccidentReceptionCheck;

public class accidentReceptionCheckView extends JFrame {
	private static final long serialVersionUID = 1L;

	private actionHandler actionHandler;
	private boolean painted = true;
	private cAccidentReceptionCheck cAccidentReceptionCheck;

	public accidentReceptionCheckView() {
		this.actionHandler = new actionHandler();
		this.cAccidentReceptionCheck = new cAccidentReceptionCheck();
	}

	public void run() {
		if (painted == true) {
			this.setTitle("<��� ���� Ȯ��>");
			this.setSize(500, 500);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

			setLayout(new GridLayout(10, 2));

			Container c = getContentPane();
			// ���� ������ �� �ҷ��;� ��
			JList list = new JList(/* ����Ʈ �ҷ��;� �� */);
			c.add(list);

			JList scrollList = new JList(/* ����Ʈ �ҷ��;� �� */);
			c.add(new JScrollPane(scrollList));

			JPanel panel1 = new JPanel();
			JButton bu1 = new JButton("����� ����");
			bu1.addActionListener(actionHandler);
			bu1.setActionCommand("����� ����");

			JButton bu2 = new JButton("����� ���� ����");
			bu2.addActionListener(actionHandler);
			bu2.setActionCommand("����� ���� ����");

			JButton bu3 = new JButton("���");
			bu3.addActionListener(actionHandler);
			bu3.setActionCommand("���");
			panel1.add(bu1);
			panel1.add(bu2);
			panel1.add(bu3);
			this.add(panel1);
			painted = false;
		}
		this.setVisible(true);
	}

	public void sendMessage(String message) {
		if (message == "����� ����") {
			this.cAccidentReceptionCheck.sendAcceptMessage(1);
		} else {
			this.cAccidentReceptionCheck.sendDenialMessage(2);
		}

	}
	
	class actionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "����� ����") {
				sendMessage(e.getActionCommand());
				// ����
			} else if (e.getActionCommand() == "����� ���� ����") {
				// ����
				sendMessage(e.getActionCommand());
			} else if (e.getActionCommand() == "���") {
				int result = JOptionPane.showConfirmDialog(null, "����Ͻðڽ��ϱ�?", "Confirm", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					dispose();
				} else if (result == JOptionPane.NO_OPTION) {

				} else if (result == JOptionPane.CLOSED_OPTION) {
					// �׳� â ���� ���
				}
			}
		}
	}

	public void association() {
		// TODO Auto-generated method stub
		
	}
}
