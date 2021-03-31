package Grad_Mgt.V_4_0;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		//문제2 다음을 입력 받아서 출력하는 프로그램 작성 이름,국어,영어,전산, 점수 입력 받아서 총점,평균 까지
		//출력하는 프로그램 작성 //점수 평균에 대한 평점 A B C 
		//swich 문 이용하여 
//		rusult>
//		이도연님의 성적표 
//		국어 : 100 , 영어 :100 ,전산 : 100
//		총점 : 300 , 평균 :100.00 , 학점 :
		
		//성적관리 프로그램_V_4.0 // used switch  
		
		//변수 선언
		String grade =null;
		int kor = 0;
		int eng = 0;
		int com = 0;
		int total = 0;
		

		System.out.println("성적관리 프로그램_V_4.0");
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("이름을 입력하세요:");
//		String name = sc.nextLine();
		
		System.out.println("국어점수를 입력하세요:");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요:");
		eng = sc.nextInt();
		System.out.println("전산 점수를 입력하세요:");
		com = sc.nextInt();

		
		total = (kor+eng+com);
		float avg =(((float)total)/3);

		// 평점 구하기 swich-case문 이용 
		
		switch((int)avg/10) {
		case (10) :
			grade = "A";
			break;
		case (8) :
			grade = "B";
			break;
		case (7) :
			grade = "C";
			break;
		case (6) :
			grade = "D";
			break;
		default: grade = "F";
			break;
		}
		
		
		//System.out.println(name+"님의 성적표 *********");

		System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);

		System.out.print("총점 : " + total);

		System.out.printf(" 평균 : %.2f" , avg );
		System.out.printf("학점" + grade);
		
		System.out.println();
	}
}