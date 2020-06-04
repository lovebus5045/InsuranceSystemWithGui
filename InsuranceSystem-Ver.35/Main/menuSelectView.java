package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import view_accidentReception.accidentReceptionCheckView;
import view_insuranceDesigning.insuranceDesigningView;
import view_insuranceTool.insuranceApprovalView;
import view_underWriter.underWriterSelectView;
import view_underWriter.underWriterView;

public class menuSelectView extends JFrame {
	private static final long serialVersionUID = 1L;

	private insuranceDesigningView insuranceDesigningView;
	private underWriterView underWriterView;
	private insuranceApprovalView insuranceApprovalView;
	private accidentReceptionCheckView accidentReceptionCheckView;
	private underWriterSelectView underWriterSelectView;
	private boolean painted = true;
	private actionHandler actionHandler;

	public menuSelectView() {
		// actionHandler
		this.actionHandler = new actionHandler();

		// view
		this.insuranceDesigningView = new insuranceDesigningView();
		this.underWriterView = new underWriterView();
		this.insuranceApprovalView = new insuranceApprovalView();
		this.accidentReceptionCheckView = new accidentReceptionCheckView();
		this.underWriterSelectView = new underWriterSelectView();
	}

	public void initialize() {
		this.insuranceDesigningView.initialize();
	}

	public void run() {
		if (painted == true) {
			this.setTitle("1. 보험사 직원");
			this.setSize(400, 400);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
		
			setLayout(new GridLayout(5, 1));

			JPanel panel1 = new JPanel();
			this.add(panel1);
			JButton bu1 = new JButton("    1. 개발자     ");
			bu1.addActionListener(actionHandler);
			bu1.setActionCommand("1");
			panel1.setBackground(Color.white);
			panel1.add(bu1);

			JPanel panel2 = new JPanel();
			this.add(panel2);
			JButton bu2 = new JButton("2. 언더라이터");
			bu2.addActionListener(actionHandler);
			bu2.setActionCommand("2");
			panel2.setBackground(Color.white);
			panel2.add(bu2);

			JPanel panel3 = new JPanel();
			this.add(panel3);
			JButton bu3 = new JButton("    3. 승인자    ");
			bu3.addActionListener(actionHandler);
			bu3.setActionCommand("3");
			panel3.setBackground(Color.white);
			panel3.add(bu3);

			JPanel panel4 = new JPanel();
			this.add(panel4);
			JButton bu4 = new JButton("4. 사후처리사");
			bu4.addActionListener(actionHandler);
			bu4.setActionCommand("4");
			panel4.setBackground(Color.white);
			panel4.add(bu4);

			JPanel panel5 = new JPanel();
			this.add(panel5);
			JButton bu5 = new JButton("       나가기       ");
			bu5.addActionListener(actionHandler);
			bu5.setActionCommand("5");
			panel5.setBackground(Color.white);
			panel5.add(bu5);
			this.painted = false;
		}
		this.setVisible(true);
		
	}

	class actionHandler implements ActionListener {
		@Override

		public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand() == "1") {
				insuranceDesigningView.run();
			} else if (e.getActionCommand() == "2") {
				underWriterSelectView.run();
			} else if (e.getActionCommand() == "3") {
				insuranceApprovalView.run();
			} else if (e.getActionCommand() == "4") {
				accidentReceptionCheckView.run();
			} else if (e.getActionCommand() == "5") {
				int result = JOptionPane.showConfirmDialog(null, "이 페이지에서 나가시겠습니까?", "Confirm",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					dispose();
				} else if (result == JOptionPane.NO_OPTION) {
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				} else if (result == JOptionPane.CLOSED_OPTION) {

				}
			}
		}
	}

	public void association() {
		this.insuranceDesigningView.association();
		this.underWriterView.association();
		this.insuranceApprovalView.association();
		this.accidentReceptionCheckView.association();
	}
}
