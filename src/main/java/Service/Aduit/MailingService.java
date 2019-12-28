package Service.Aduit;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MailingService {
	@Autowired
	JavaMailSender mailSender;
	
	@Transactional
	public void sendMail(String memEmail, String memId) {
		String setfrom = "ho980719@gmail.com";
		String title = "아토 공모전에서 합격을 축하드립니다."; // 제목
		String content = "<h2>ㅊㅋ</h2><br />" 
					+ "상품화를 진행하기 원하시면 아래 링크를 클릭해주세요.<br />"
					+ "<a href='http://localhost:8080/FinalProjectFile/goodsInsert?memId=" + memId + "'>클릭</a>"; // 내용
		try {
			MimeMessage message = mailSender.createMimeMessage();
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");
			messageHelper.setFrom(setfrom); // 보내는사람 생략하거나 하면 정상작동을 안함
			System.out.println("받는사람 이메일 : : " + memEmail);
			messageHelper.setTo(memEmail); // 받는사람 이메일
			messageHelper.setSubject(title); // 메일제목은 생략이 가능하다
			messageHelper.setText("text/html; charset=UTF-8", content); // 메일 내용

			mailSender.send(message);
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
