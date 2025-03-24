package ex06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {

	public static void main(String[] args) {

//		String originalpath = "c:/data/dog.jpg";
//		String targetpath = "c:/test/dog.jpg";
		
//		String originalpath = "c:/data/git.mp4";
//		String targetpath = "c:/test/test.mp4";
		
		String originalpath = "c:/data/new.txt";
		String targetpath = "c:/test/new.txt";
		int count = 0;
	
		try {
			InputStream is = new FileInputStream(originalpath);
			OutputStream os = new FileOutputStream(targetpath);
			
			byte[] data = new byte[1024];
			
			while(true) {
				int num = is.read(data);
				System.out.println(num + " : " + count++);
				
				if(num == -1) break;
				
//				os.write(data, 0, num);
				os.write(data);
			}
			os.flush();
			is.close();
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
