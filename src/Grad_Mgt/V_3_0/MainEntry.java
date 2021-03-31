package Grad_Mgt.V_3_0;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		//문제2 다음을 입력 받아서 출력하는 프로그램 작성 이름,국어,영어,전산, 점수 입력 받아서 총점,평균 까지
		//출력하는 프로그램 작성 //점수 평균에 대한 평점 A B C

		
//		rusult>
//		이도연님의 성적표 
//		국어 : 100 , 영어 :100 ,전산 : 100
//		총점 : 300 , 평균 :100.00 , 학점 :
		//성적관리 프로그램_V_3.0 // IF 문 추가
		
		//변수 선언
		String grade =null;

		System.out.println("성적관리 프로그램_V_3.0");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요:");
		String name = sc.nextLine();
		
		System.out.println("국어점수를 입력하세요:");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요:");
		int eng = sc.nextInt();
		System.out.println("전산 점수를 입력하세요:");
		int com = sc.nextInt();

		
		int total = (kor+eng+com);
		float avg =(((float)total)/3);

		if (avg>=90) {
			grade = "A";
		} 
		else if (avg>=80)
		{
			grade = "B";
		}
		else if (avg>=70)
		{
			grade = "C";
		}
		else if (avg>=60)
		{
			grade = "D";
		}
		else 
		{
			grade = "F";
		}
		
		
		
		System.out.println(name+"님의 성적표 *********");

		System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);

		System.out.print("총점 : " + total);

		System.out.printf(" 평균 : %.2f" , avg );
		System.out.print("학점" + grade);
		
		System.out.println();
	}
}