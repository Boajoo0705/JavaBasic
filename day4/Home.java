package day4;

import java.util.Scanner;

public class Home {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��Է�");
		 String name = sc.next();
		 
		 System.out.println("�����Է�");
		 int age= sc.nextInt();
		 
		 System.out.println("�̸����Է�");
		 String email = sc.next();
		 
		Member mem = new Member();
		mem.setName(name);
		mem.setAge(age);
		mem.setEmail(email);
		System.out.println("�Էµ� ���� �̸�:["+mem.getName()+"] ����:[ "+mem.getAge()+"] �̸���:["+mem.getEmail()+" ]");
	}
	
	

}
