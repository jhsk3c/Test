package Service.ComManagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.compiler.ServletWriter;
import org.springframework.stereotype.Service;

@Service
public class FileSerivce {

	public void upload(String original, String store, HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		try {
			
			String fileName = original;
			String fileName1 = store;
			
			// 서버에 올라간 경로를 가져옴
			ServletContext context = request.getServletContext();
			String uploadFilePath = context.getRealPath("WEB-INF/view/Spot/upload");
			String filePath = uploadFilePath + File.separator + fileName1;
			
			byte[] b = new byte[4096];
			FileInputStream fileInputStream = new FileInputStream(filePath);
			
			String mimeType = request.getServletContext().getMimeType(filePath);
			if(mimeType == null) {
				mimeType = "application/octet-stream";
			}
			response.setContentType(mimeType);
			
	        // 파일명 UTF-8로 인코딩(한글일 경우를 대비)
	        String sEncoding = new String(fileName.getBytes("UTF-8"));
	        response.setHeader("Content-Disposition", "attachment; fileName= " + sEncoding);
	        
	        // 파일 쓰기 OutputStream
	        ServletOutputStream servletOutStream = response.getOutputStream();
	        
	        int read;
	        while((read = fileInputStream.read(b,0,b.length))!= -1){
	            servletOutStream.write(b,0,read);            
	        }
	        servletOutStream.flush();
	        servletOutStream.close();
	        fileInputStream.close();
	        
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
	}

}
