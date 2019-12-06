package Encrypt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encrypt {
	static MessageDigest md;
	static StringBuffer sb;
	
	public static String getEncryption(String userPw) { //객ㅊㅔ 생성 안하려고 static 준거임. 그럼 클래스명.메소드
		try {
			md = MessageDigest.getInstance("SHA-256");
					
		} catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		md.update(userPw.getBytes());
		byte byteDate[] = md.digest();
		sb = new StringBuffer();
		for(int i = 0; i < byteDate.length; i ++) {
			sb.append(Integer.toString((byteDate[i]&0xff) + 0x100, 16).substring(1));
		}
		return sb.toString();
	}
}
