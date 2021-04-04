/*
  main 에 있는 코드 함수로 만들기
  박규민 님 코드
  배열 없음 
  코드 부분 깔끔함 연구 해보자 
  
 */
package Grad_Mgt.V_7_0;

import java.util.Scanner;

public class Reference_Grad_Mgt_2 {
	
	static Scanner scan = new Scanner(System.in);
	static String name;
	static int korScore;
	static int engScore;
	static int csScore;
	static int totalScore;
	static double AvgScore;
	static String grade;
	
	
	
	public static void setTotalScore() {
		totalScore = csScore + engScore + csScore;
	}
	
	public static void setAvgScore() {
		AvgScore = totalScore/3.0;
	}
	public static void setGrade() {
		
		switch ((int)(AvgScore)/10) {
		
			case 10: grade = "A+"; break;
			case 9: grade = "A"; break;
			case 8: grade = "B"; break;
			case 7: grade = "C"; break;
			case 6: grade = "D"; break;
			default: grade = "F";
		
		}
	}
	
	public static void getGradeCard() {
		System.out.println("\n********************"+name+"님의 성적표 *******************\n");
		System.out.println("국어 : " + korScore + "\t 영어 : " + engScore + "\t 전산 : " + csScore); 
		System.out.println("총점 : " + totalScore + "\t 평균 : " + String.format("%.2f", AvgScore) + "\t 평점 : " + grade);
		System.out.println("\n****************************************************************\n");
		
	}

	public static void setStudentInfo() {
		
		System.out.print("이름을 입력해주세요 :  ");
		name = scan.next();

		do {
			System.out.print("국어 성적을 입력해주세요 :  ");
			korScore = scan.nextInt();
		} while (korScore > 100 || korScore < 0);

		do {
			System.out.print("영어 성적을 입력해주세요 :  ");
			engScore = scan.nextInt();
		} while (engScore > 100 || engScore < 0);

		do {
			System.out.print("전산 성적을 입력해주세요 :  ");
			csScore = scan.nextInt();
		} while (csScore > 100 || csScore < 0);
		
		setTotalScore();
		setAvgScore();
		setGrade();
		getGradeCard();
		
	}
	
	
	public static void main(String[] args) {

		setStudentInfo();
	}
}
