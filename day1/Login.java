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
		final String WRONG = "틀립니다";
		
		if (id.equals("kim") && pw.equals("1")) {
			System.out.println("로그인성공");
		} else if (!id.equals("kim") && pw.equals("1")) {
			System.out.println("ID가 "+ WRONG);
		} else if (id.equals("kim") && !pw.equals("1")) {
			System.out.println("ID가" + WRONG);
		}

		else {
			System.out.println("ID PW 모두 "+ WRONG);
			
		}

	}
}
