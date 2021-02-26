package day3;

import java.util.Scanner;

public class UI {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("phone number");
			String ph = sc.next();
			System.out.println("message");
			String msg = sc.next();
			System.out.println("입력한 정보 : 전화번호["+ph+"]  문자["+msg+"]");
			System.out.println("전송버튼 클릭");
			Kakao ka = new Kakao();
			ka.setPh(ph);
			ka.setMsg(msg);
			
			System.out.println("전송정보: 전화번호["+ka.getPh()+"]  문자["+ka.getMsg()+"]");
			
		}
	
	
}


