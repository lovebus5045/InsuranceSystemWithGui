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
			this.setTitle("<사고 접수 확인>");
			this.setSize(500, 500);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

			setLayout(new GridLayout(10, 2));

			Container c = getContentPane();
			// 보험 설계한 거 불러와야 함
			JList list = new JList(/* 리스트 불러와야 함 */);
			c.add(list);

			JList scrollList = new JList(/* 리스트 불러와야 함 */);
			c.add(new JScrollPane(scrollList));

			JPanel panel1 = new JPanel();
			JButton bu1 = new JButton("보험금 지급");
			bu1.addActionListener(actionHandler);
			bu1.setActionCommand("보험금 지급");

			JButton bu2 = new JButton("보험금 지급 거절");
			bu2.addActionListener(actionHandler);
			bu2.setActionCommand("보험금 지급 거절");

			JButton bu3 = new JButton("취소");
			bu3.addActionListener(actionHandler);
			bu3.setActionCommand("취소");
			panel1.add(bu1);
			panel1.add(bu2);
			panel1.add(bu3);
			this.add(panel1);
			painted = false;
		}
		this.setVisible(true);
	}

	public void sendMessage(String message) {
		if (message == "보험금 지급") {
			this.cAccidentReceptionCheck.sendAcceptMessage(1);
		} else {
			this.cAccidentReceptionCheck.sendDenialMessage(2);
		}

	}
	
	class actionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "보험금 지급") {
				sendMessage(e.getActionCommand());
				// 승인
			} else if (e.getActionCommand() == "보험금 지급 거절") {
				// 거절
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

	public void association() {
		// TODO Auto-generated method stub
		
	}
}
