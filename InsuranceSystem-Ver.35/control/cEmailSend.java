package control;

import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import etc.financialManagementCommittee;

public class cEmailSend {

	private String host;
	private String userEmail;
	private String Userpw;

	private String toEmail;
	private String toName;
	private String subject;
	private String content;
	private financialManagementCommittee financialManagementCommittee;

	public cEmailSend() {
		this.host = "smtp.gmail.com";
		this.userEmail = "lovebus5050@gmail.com";
		this.Userpw = "126479dd";
		// 메일내용
		this.financialManagementCommittee = new financialManagementCommittee();
		this.toEmail = financialManagementCommittee.geteMailAddress();
		this.toName = financialManagementCommittee.getName();
		this.subject = "제목";
		this.content = toName + "씨 아래의 보험을 승인해주세요";

	}

	public void sendEmail() {

		Properties properties = new Properties();
		properties.put("mail.smtps.auth",true);
		
		Session session = Session.getDefaultInstance(properties);
		MimeMessage msg = new MimeMessage(session);
		
		try {
			msg.setSubject(subject);
			msg.setText(content);
			msg.setFrom(new InternetAddress(userEmail));
			msg.addRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(toEmail));
			
			Transport transport = session.getTransport("smtps");
			transport.connect(host, userEmail,Userpw);
			transport.sendMessage(msg,msg.getAllRecipients());
			transport.close();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
