package ch18.sec08;

import java.io.*;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

public class DataIOExample {
	public static void main(String[] args) throws IOException {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP 주소: " + local.getHostAddress());
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress inetAddress : iaArr) {
				System.out.println("www.naver.com IP 주소: " + inetAddress.getHostAddress());

			}

			String url = "https://www.egovframe.go.kr/home/sub.do?menuNo=10";
			URL urlObj = new URL(url);
			System.out.println(urlObj.getProtocol());
			System.out.println(urlObj.getQuery());

			InputStream is = urlObj.openStream();
			
//			Reader reader = new InputStreamReader(is); //보조스트림(byte -> text)
//			int count = 0;
//			while((count=reader.read())!=-1) {
//				System.out.print((char)count);
//			}
		//성능향상
		//바이트기반스트림 -> 텍스트기반으로 변경하는 보조스트림 -> 성능향상보조스트림			
		BufferedReader br = new BufferedReader(new InputStreamReader(urlObj.openStream()));
		String line="";
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		
			
			
			

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
