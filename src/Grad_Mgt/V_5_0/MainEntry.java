/*
성적관리프로그램_V_5_0
subject:do ~ while
update list:
do ~ while 문 추가 입력 값이 101 이 넘으면 다시 입력하게 하는 코드

 Date : 03_31_21


*/

package Grad_Mgt.V_5_0;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {

//		rusult>
//		국어 : 100 , 영어 :100 ,전산 : 100
//		총점 : 300 , 평균 :100.00 , 학점 :
		// 성적관리 프로그램_V_4.0 //

		/*
		 * 변수 선언 kor(int) = 국어 eng(int) = 영어 com(int) = 전산 / total(int) = 점수 합계 grade
		 * (char) = 학점
		 * 
		 */
		String name = "";
		char ch = ' ', grade = ' ';
		int kor = 0, eng = 0, com = 0, total = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("성적관리 프로그램_V_5.0");

	

//		System.out.println("이름을 입력하세요:");
//		String name = sc.nextLine();
//		//v_2_0 코드 
//		System.out.println("국어점수를 입력하세요:");
//			kor = sc.nextInt();
//		System.out.println("영어 점수를 입력하세요:");
//			eng = sc.nextInt();
//		System.out.println("전산 점수를 입력하세요:");
//			com = sc.nextInt();

		// V_5_0
		// 수정 사항//do while
//		do {
//			System.out.println("국어점수를 입력하세요:");
//			kor = sc.nextInt();
//			System.out.println("영어 점수를 입력하세요:");
//			eng = sc.nextInt();
//			System.out.println("전산 점수를 입력하세요:");
//			com = sc.nextInt();
//		} while ((kor < 0 || kor > 100) || (eng < 0 || eng > 100) || (com < 0 || com > 100));
		
		while (true) { // 무한루프
			System.out.print("이름을 입력 해주세요 ");
			name = sc.next();

			do {
				System.out.print("국어 점수 입력 해주세요 : ");
				kor = sc.nextInt();
			} while (kor < 0 || kor > 100);
			do {
				System.out.print("영어 입력 해주세요 : ");
				eng = sc.nextInt();
			} while (eng < 0 || eng > 100);
			do {
				System.out.print("컴퓨터 입력 해주세요 : ");
				com = sc.nextInt();
			} while (com < 0 || com > 100);
			total = (kor + eng + com);
			float avg = (((float) total) / 3);

			if (avg >= 90) {
				grade = 'A';
			} else if (avg >= 80) {
				grade = 'B';
			} else if (avg >= 70) {
				grade = 'C';
			} else if (avg >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}

//			전산,영어,국어 점수 입력 받아서 평균 60점이상이고,
//		    각 과목 과락 40점이하면 과목 불합격 처리하는 프로그램 작성
//			- 무슨 과목이 몇점이라서 과락 했는지 포함

//		try 문 안으로 들어

			try {

				total = (kor + eng + com);
				avg = (((float) total) / 3);

				if (avg < 60) {
					System.out.println("불합격 입니다");
				}
				if (kor < 40) {
					System.out.println("국어 불합격" + kor + "점");
				}
				if (eng < 40) {
					System.out.println("영어 불합격" + eng + "점");
				}
				if (com < 40) {
					System.out.println("전산 불합격" + com + "점");
				} else {
					System.out.println("축하드립니다 평균 점수" + avg + "점 으로 합격 입니다");
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력 해주세요");
			}

//			System.out.println(name+"님의 성적표 *********");
			System.out.println("*****성적표******");
			System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
	//
			System.out.print("총점 : " + total);
			//
			System.out.printf(" 평균 : %.2f", avg);
			System.out.print(" 학점" + grade);
//			
//			System.out.println();
		}//while out
// 
//	점수대 별 학점 부여	
	
	}
}