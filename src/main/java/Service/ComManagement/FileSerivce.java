package Service.ComManagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.compiler.ServletWriter;
import org.springframework.stereotype.Service;

@Service
public class FileSerivce {

	public void upload(String vspotStore, HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		try {
			
			//store = UUID.randomUUID().toString().replaceAll("-", "") + originalFileExtension; 
			// 서버에 올라간 경로를 가져옴
			ServletContext context = request.getServletContext();
			String uploadFilePath = context.getRealPath("WEB-INF/view/Spot/upload");
			String filePath = uploadFilePath + File.separator + vspotStore.replaceAll("-", "");
			System.out.println(context);
			System.out.println(uploadFilePath);
			System.out.println(filePath);
			
			byte[] b = new byte[4096];
			FileInputStream fileInputStream = new FileInputStream(filePath);
			
			String mimeType = request.getServletContext().getMimeType(filePath);
			if(mimeType == null) {
				mimeType = "application/octet-stream";
			}
			response.setContentType(mimeType);
			
	        // 파일명 UTF-8로 인코딩(한글일 경우를 대비)
	        String sEncoding = new String(vspotStore.getBytes("UTF-8"));
	        response.setHeader("Content-Disposition", "attachment; fileName= " + sEncoding);
	        
	        // 파일 쓰기 OutputStream
	        PrintWriter servletOutStream = response.getWriter();
	        
	        
	        int read;
	        while((read = fileInputStream.read(b,0,b.length))!= -1){
	            servletOutStream.write(0);            
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
