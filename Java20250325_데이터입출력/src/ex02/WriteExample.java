package ex02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//단축키 ctrl+2 L입력
public class WriteExample {

	public static void main(String[] args) {
		
		String path = "c:/data/test2.db";
		
		OutputStream os = null;
		
		try {
			os = new FileOutputStream(path); //경로가 잘못되었을때
			byte[] arr = {10,20,30};

			os.write(arr);

			os.flush();
			
			os.close();
			
		} catch (FileNotFoundException e) { //경로가 ...
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		

	}

}
