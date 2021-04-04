/*
성적관리프로그램_V_7_0
subject: 함수로 구분 하기
update list:
배열 처리 하기 

 Date : 04_02_21
//		rusult>
//		국어 : 100 , 영어 :100 ,전산 : 100
//		총점 : 300 , 평균 :100.00 , 학점 :
		// 성적관리 프로그램_V_6.0 //

		/*
		 * 변수 선언 kor(int) = 국어 eng(int) = 영어 com(int) = 전산 / total(int) = 점수 합계 grade
		 * (char) = 학점
		 * 
		 */



package Grad_Mgt.V_7_0;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {


		
		
		


		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("성적관리 프로그램_V_6.0 _ 배열");
		// V_5_0
		// 수정 사항//배열
		
		// 몇명의 성적표를 만들건지 
		System.out.println("몇명의 성적표를 만들까요?");
		 int grade_card_num = sc.nextInt();
		 
		String[][]name = new String[grade_card_num][1];
		int kor, eng, com, total,i = 0, j=0;
		int[][] score = new int[grade_card_num][4];
		char[][] grade = new char[grade_card_num][1];
		//double[] avg = new double[2];
		float[] avg = new float[2];
	
		
		while (i < grade_card_num) { 
			 j = 0;
			System.out.print((i+1)+"번째 학생 "+"이름을 입력 해주세요 ");
				name[i][0] = sc.next();

			do {
				System.out.print("국어 점수 입력 해주세요 : ");
				kor = sc.nextInt();
				score[i][j] = kor;
			} while (kor < 0 || kor > 100);
			j++;
			do 
			{
				System.out.print("영어 입력 해주세요 : ");
				eng = sc.nextInt();
				score[i][j] = eng;
			} while (eng < 0 || eng > 100);
			j++;
			do 
			{
				System.out.print("컴퓨터 입력 해주세요 : ");
				com = sc.nextInt();
				score[i][j] = com;
			} while (com < 0 || com > 100);
			j++;
			
			total = kor + eng + com;
			score[i][j] = total;

			avg[i] = (float) (score[i][j] / 3.0); 

			//avg = (((float) total) / 3);
//
//			if (avg[i] >= 90) {
//				grade[grade_card_num][1] = 'A';
//			} else if (avg[i] >= 80) {
//				grade[grade_card_num][1] = 'B';
//			} else if (avg[i] >= 70) {
//				grade[grade_card_num][1] = 'C';
//			} else if (avg[i] >= 60) {
//				grade[grade_card_num][1] = 'D';
//			} else {
//				grade[grade_card_num][1] = 'F';
//			}
			i++;
		}//while out
		
		//System.out.println("*****성적표******");
		for (int k = 0; k < grade_card_num; k++) {
			System.out.println((k+1)+"번 학생 "+name[k][0]+" 성적표 *********");
			System.out.println("국어 : " + score[k][0] + " 영어 : " + score[k][1] + " 전산 : " + score[k][2]);
	//
			System.out.print("총점 : " + score[k][3]+ "\n");
			//
			//System.out.printf(" 평균 : %.2f",  avg[k]+ "\n");
			//System.out.print(" 학점" +grade[k][0]);
//			
//			System.out.println();
		}// for from k out
	
	}
}