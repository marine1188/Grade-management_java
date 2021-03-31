/*
성적관리프로그램_V_4_0
subject:
update list:
점수에 따른 합격 불합격 출력 추가 
어떠한 과목이 과락인지 와 과목점수 출력 

 Date : 03_31_21


*/

package Grad_Mgt.V_4_0;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
//		rusult>
//		국어 : 100 , 영어 :100 ,전산 : 100
//		총점 : 300 , 평균 :100.00 , 학점 :
		//성적관리 프로그램_V_4.0 // 
		
/*
		변수 선언
		kor(int) = 국어
		eng(int) = 영어
		com(int) = 전사
		total(int) = 점수 합계
		grade (String) = 학점
		
*/
/*
		String grade =null;
		int kor,eng,com,total = 0;

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
		*/
		
		
//		전산,영어,국어 점수 입력 받아서 평균 60점이상이고,
//	    각 과목 과락 40점이하면 과목 불합격 처리하는 프로그램 작성
//		- 무슨 과목이 몇점이라서 과락 했는지 포함
		
		Scanner sc = new Scanner(System.in);
		String grade =null;
		int kor = 0,eng = 0,com = 0,total = 0;
		
//	try 문 안으로 들어
		
		try {
			
//			System.out.println("이름을 입력하세요:");
//			String name = sc.nextLine();
			
			System.out.println("국어점수를 입력하세요:");
				kor = sc.nextInt();
			System.out.println("영어 점수를 입력하세요:");
				eng = sc.nextInt();
			System.out.println("전산 점수를 입력하세요:");
				com = sc.nextInt();

			total = (kor+eng+com);
			float avg =(((float)total)/3);
			
			if (avg<60) {
				System.out.println("불합격 입니다");
			} 
			 if(kor<40) 
				{
						System.out.println("국어 불합격"+kor+"점");
				}
			 if(eng<40) 
				{
						System.out.println("영어 불합격"+eng+"점");
				}
			 if(com<40) 
				{
						System.out.println("전산 불합격"+com+"점");
				}
			else {
						System.out.println("합격 입니다");
			}
		} catch (Exception e) {
			System.out.println("숫자만 입력 해주세요");
		}
		
		System.out.println(kor+""+ eng + "" +com);
	
		
//		System.out.println(name+"님의 성적표 *********");
//		System.out.println("*****성적표******");
//		System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
//
//		System.out.print("총점 : " + total);
//
//		System.out.printf(" 평균 : %.2f" , avg );
//		System.out.print("학점" + grade);
//		
//		System.out.println();
	}
}