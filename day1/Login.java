package day1;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		System.out.println("login");
		Scanner scan = new Scanner(System.in);

		System.out.println("ID : [    ]");
		String id = scan.next();

		System.out.println("PW: [    ]");
		String pw = scan.next();
		final String WRONG = "Ʋ���ϴ�";
		
		if (id.equals("kim") && pw.equals("1")) {
			System.out.println("�α��μ���");
		} else if (!id.equals("kim") && pw.equals("1")) {
			System.out.println("ID�� "+ WRONG);
		} else if (id.equals("kim") && !pw.equals("1")) {
			System.out.println("ID��" + WRONG);
		}

		else {
			System.out.println("ID PW ��� "+ WRONG);
			
		}

	}
}
