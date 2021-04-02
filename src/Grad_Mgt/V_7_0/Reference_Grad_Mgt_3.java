/*
  main 에 있는 코드 함수로 만들기
  조민수 님 코드
  배열 없음 
  코드 부분 깔끔함 연구 해보자 
  
 */
package Grad_Mgt.V_7_0;

import java.util.Scanner;

public class Reference_Grad_Mgt_3 {
	static int kor, eng, com, sum = 0;
	static double avg = 0;
	static String name, grade = "";

	// input 함수
	public static void score_input() {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		name = sc.next();
		do {
			System.out.print("당신의 국어 점수는? >> ");
			kor = new Scanner(System.in).nextInt();
		} while (kor < 0 || kor > 100);

		do {
			System.out.print("당신의 영어 점수는? >> ");
			eng = new Scanner(System.in).nextInt();
		} while (eng < 0 || eng > 100);

		do {
			System.out.print("당신의 전산 점수는? >> ");
			com = new Scanner(System.in).nextInt();
		} while (com < 0 || com > 100);
	}// score_input end

	// score sum 함수
	public static int score_sum(int kor, int eng, int com) {
		sum = kor + eng + com;
		return sum;
	}// score_sum end

	// score avg 함수
	public static double score_avg(int sum) {
		avg = sum / 3.0;
		return avg;
	} // score_avg end

	// grade 함수
	public static String score_grade(double avg) {

		switch ((int) avg / 10) {
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		} // switch case end

		return grade;
	} // score_grade end

	// output 함수
	public static void score_output() {
		System.out.println(" --- " + name + "님의 성적표 --- ");
		System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
		System.out.println("총점 : " + sum + " 평균 : " + String.format("%.2f", avg) + " 학점 : " + grade + "\n");
	} // score_output end

	public static void main(String[] args) {

		score_input();

		score_sum(kor, eng, com);

		score_avg(sum);

		score_grade(avg);

		score_output();
	}
}
