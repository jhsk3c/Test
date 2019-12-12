package Service.Qna;


import java.io.File;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import Command.Qna.QnaCommand;
import CommandMember.MemberCommand;
import Model.DTO.AuthInfo;
import Model.DTO.MemberDTO;
import Model.DTO.QnaDTO;
import Repository.Qna.QnaRepository;

@Service
public class QnaWriterProService {
	
	
	@Autowired 
	private QnaRepository qnaRepository;
	 
	String original = null;
	String originalFileExtension = null;
	String store = null;
	String fileSize = null;
	
	@Transactional //@Transactional 는 insert를 100번을 할 수 있지만 커밋으로  트랜잭션이 끝나야 남이 볼 수 있다.  insert,update,delete를 사용할땐 트랜잭션이 가능하고 select는 불가능하다.
	public Integer qnaWriterPro(QnaCommand qnaCommand , HttpServletRequest request ,HttpSession session) {
		
		QnaDTO qna = new QnaDTO();
	
		System.out.println();
		qna.setQnaBoardSubject(qnaCommand.getQnaSubject());
		qna.setQnaClassiFication(qnaCommand.getQnaClassiFication());
		qna.setQnaBoardContent(qnaCommand.getQnaContent());
		
		//파일을 dto에 담기 
		String originalTotal = "";
		String storeTotal = "";
		String fileSizeTotal ="";
		
		for(MultipartFile multiFile : qnaCommand.getQnaFileName()) {
			
			original = multiFile.getOriginalFilename();
			originalFileExtension = // 확장자 가져오기 
					original.substring(original.lastIndexOf("."));
			store =  UUID.randomUUID().toString().replaceAll("-","")
					+ originalFileExtension;
			fileSize =  Long.toString(multiFile.getSize());
			
			originalTotal += original +"-";
			storeTotal += store +"-";
			fileSizeTotal += fileSize + "-";
			
			String path = request.getServletContext().getRealPath("/");
			System.out.println(path);
			path += "WEB-INF/view/Qna/upload/";
			
			File file = new File(path + store);
			try {
				multiFile.transferTo(file);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		qna.setQnaBoardOriginalFileName(originalTotal);
		qna.setQnaBoardStoryFileName(storeTotal);
		qna.setQnaFileSize(fileSizeTotal);		
		//---------------------------------
	
		return qnaRepository.qnaInsert(qna);
	}

}
