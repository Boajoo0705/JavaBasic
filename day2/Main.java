package day2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("#######  회원관리  #######");
		join();
		
	}
	
	public static void join() {
		Scanner sc = new Scanner(System.in);
		System.out.println("********회원가입******** 창");
		System.out.println("아이디 입력");
		String id = sc.next();
		
		System.out.println("비번 입력");
		String pw = sc.next();
		
		User u = new User();
		u.setId(id);
		u.setPw(pw);
		System.out.println("[가입 정보] ID: "+u.getId()+", PW: "+u.getPw());
		login(u);
		
	}
	
	public static void login(User u) {
		Scanner sc = new Scanner(System.in);
		System.out.println("login 창");
		//System.out.println("ID를 입력하시오");//ID:kim
		//String id = sc.next();
		//System.out.println("PW를 입력하시오");//pw:123
		//String pw = sc.next();
		String id = u.getId();
		String pw= u.getPw();
		System.out.println("[가입 정보] ID: "+id+", PW: "+pw);
		
		if(id.equals("kim") && pw.equals("123")) {System.out.println("로그인성공");}
		else if(!id.equals("kim") && pw.equals("123")) {System.out.println("로그인 실패");}
		else if(id.equals("kim") && !pw.equals("123")) {System.out.println("로그인 실패");}
		else {System.out.println("ID와 PW 모두 실패");}
		
	}
	
}
