package day3;

import java.util.Scanner;

public class UI {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("phone number");
			String ph = sc.next();
			System.out.println("message");
			String msg = sc.next();
			System.out.println("�Է��� ���� : ��ȭ��ȣ["+ph+"]  ����["+msg+"]");
			System.out.println("���۹�ư Ŭ��");
			Kakao ka = new Kakao();
			ka.setPh(ph);
			ka.setMsg(msg);
			
			System.out.println("��������: ��ȭ��ȣ["+ka.getPh()+"]  ����["+ka.getMsg()+"]");
			
		}
	
	
}


