package ch17.sec01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyEx {
	public static void main(String[] args) throws Exception {
		String originFileName = "C:/Temp/test.txt";
		String targetFileName = "C:/Temp/test2.txt";
		
		InputStream is = new FileInputStream(originFileName);
		OutputStream os = new FileOutputStream(targetFileName);
		byte[] data = new byte[1024];
		while(true) {
			int num = is.read(data);
			if(num==-1) break;
			os.write(data,0,num);
		}
		os.flush();
		os.close();
		is.close();
		System.out.println("복사됨");
	}
}
