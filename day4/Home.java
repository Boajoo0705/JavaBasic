package day4;

import java.util.Scanner;

public class Home {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름입력");
		 String name = sc.next();
		 
		 System.out.println("나이입력");
		 int age= sc.nextInt();
		 
		 System.out.println("이메일입력");
		 String email = sc.next();
		 
		Member mem = new Member();
		mem.setName(name);
		mem.setAge(age);
		mem.setEmail(email);
		System.out.println("입력된 정보 이름:["+mem.getName()+"] 나이:[ "+mem.getAge()+"] 이메일:["+mem.getEmail()+" ]");
	}
	
	

}
