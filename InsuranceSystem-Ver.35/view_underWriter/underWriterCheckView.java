package view_underWriter;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import databaseStorage.db;

public class underWriterCheckView extends JFrame {
	private static final long serialVersionUID = 1L;
	
	//GUI
	private JLabel inputLabel;
	private JTextField inputText;
	private actionHandler actionHandler;

	private int UWID;
	
	private db db;
	public underWriterCheckView() {
		this.UWID = 0;
		this.actionHandler = new actionHandler();
		this.db = new db();
	}

	public void run() {
		this.UWID = 1;
		
		this.setTitle("UW 확인중");
		this.setSize(450, 150);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
		setLayout(new GridLayout(2, 2));

		JPanel panel1 = new JPanel();
		inputLabel = new JLabel("UW는 ID를 입력하시오.");
		panel1.add(inputLabel);
		this.add(panel1);

		JPanel panel1_1 = new JPanel();
		inputText = new JTextField(20);

		panel1_1.add(inputText);
		this.add(panel1_1);
		
		JPanel panel10 = new JPanel();
		JButton bu1 = new JButton("확인");
		bu1.addActionListener(actionHandler);
		bu1.setActionCommand("확인");
		this.add(panel10);
		panel10.add(bu1);

		JPanel panel11 = new JPanel();
		JButton bu2 = new JButton("취소");
		bu2.addActionListener(actionHandler);
		bu2.setActionCommand("취소");
		this.add(panel11);
		panel11.add(bu2);
		
		this.setVisible(true);
	}
	
	public void association() {}

	class actionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("확인")) {
				if(Integer.parseInt(inputText.getText()) == UWID) {
					db.run();
				}
			}else if(e.getActionCommand().equals("취소")) {
				int result = JOptionPane.showConfirmDialog(null, "취소하시겠습니까?", "Confirm", JOptionPane.YES_NO_OPTION);

				if (result == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		}
	}

}
