package ch18.sec08;

import java.io.*;
import java.net.*;
import java.util.*;
public class ServerExample {
	private static ServerSocket severSocket = null;
	
	public static void main(String[] args) {
		System.out.println("------------------------------");
		System.out.println("서버를 종료하려면 q또는 Q를 입력하고 enter키를 입력하ㅔ여");
		System.out.println("------------------------------");
		
		startServer();
			
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String key = sc.nextLine();
			if(key.toLowerCase().equals("q")) break;
		}
		sc.close();
		
		stopServer();
	}

	public static void stopServer() {
		// TODO Auto-generated method stub
		try {
			severSocket.close();
			System.out.println("[서버] 종료됨");
		}catch(IOException e) {}
	}

	public static void startServer() {
		// TODO Auto-generated method stub
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					severSocket= new ServerSocket(50001);
					System.out.println("[서버] 시작됨");
					
					while(true) {
						System.out.println("\n[서버] 연결 요청을 기다림");
						Socket socket=severSocket.accept();
						
						InetSocketAddress isa = 
								(InetSocketAddress) socket.getRemoteSocketAddress();
						System.out.println("[서버] "+isa.getHostString()+ "의 연결 요청을 수락함");
						
						
						//데이터받기
						DataInputStream dis = new DataInputStream(socket.getInputStream());
						String message = dis.readUTF();
						
						//데이터 보내기
						DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
						dos.writeUTF(message);
						dos.flush();
						
						System.out.println("[서버] 받은 데이터를 다시 보냄 "+message);
						
						socket.close();
						System.out.println("[서버] "+isa.getHostString()+ "의 연결 요청을 끊음");
					}
					
				}catch(IOException e) {
					System.out.println("[서버] "+e.getMessage());
				}
			}
		};
		thread.start();
	}
}
