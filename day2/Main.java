package day2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("#######  ȸ������  #######");
		join();
		
	}
	
	public static void join() {
		Scanner sc = new Scanner(System.in);
		System.out.println("********ȸ������******** â");
		System.out.println("���̵� �Է�");
		String id = sc.next();
		
		System.out.println("��� �Է�");
		String pw = sc.next();
		
		User u = new User();
		u.setId(id);
		u.setPw(pw);
		System.out.println("[���� ����] ID: "+u.getId()+", PW: "+u.getPw());
		login(u);
		
	}
	
	public static void login(User u) {
		Scanner sc = new Scanner(System.in);
		System.out.println("login â");
		//System.out.println("ID�� �Է��Ͻÿ�");//ID:kim
		//String id = sc.next();
		//System.out.println("PW�� �Է��Ͻÿ�");//pw:123
		//String pw = sc.next();
		String id = u.getId();
		String pw= u.getPw();
		System.out.println("[���� ����] ID: "+id+", PW: "+pw);
		
		if(id.equals("kim") && pw.equals("123")) {System.out.println("�α��μ���");}
		else if(!id.equals("kim") && pw.equals("123")) {System.out.println("�α��� ����");}
		else if(id.equals("kim") && !pw.equals("123")) {System.out.println("�α��� ����");}
		else {System.out.println("ID�� PW ��� ����");}
		
	}
	
}
