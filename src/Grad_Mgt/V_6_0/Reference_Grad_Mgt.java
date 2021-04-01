
package Grad_Mgt.V_6_0;

import java.util.Scanner;

public class Reference_Grad_Mgt {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("몇명의 성적표를 만들까요?");
		 int grade_card_num = sc.nextInt();
		 
		String[][] name_grade = new String[grade_card_num][2];
		int kor, eng, com, sum = 0;
		int[][] score = new int[grade_card_num][4];
		double[] avg = new double[2];

		int i = 0;

		
		while (i < grade_card_num) {
			int j = 0;

			System.out.print("이름 : ");
			name_grade[i][0] = sc.next();
			do {
				System.out.print("당신의 국어 점수는? >> ");
				kor = new Scanner(System.in).nextInt();
				score[i][j] = kor;

			} while (kor < 0 || kor > 100);
			j++;

			do {
				System.out.print("당신의 영어 점수는? >> ");
				eng = new Scanner(System.in).nextInt();
				score[i][j] = eng;
			} while (eng < 0 || eng > 100);
			j++;

			do {
				System.out.print("당신의 전산 점수는? >> ");
				com = new Scanner(System.in).nextInt();
				score[i][j] = com;
			} while (com < 0 || com > 100);
			j++;

			sum = kor + eng + com;
			score[i][j] = sum;

			avg[i] = score[i][j] / 3.0; // sum을 double로 형변환 해도 됨

			// switch - case를 이용한 학점 구하기
			switch ((int) avg[i] / 10) {
			case 9:
				name_grade[i][1] = "A";
				break;
			case 8:
				name_grade[i][1] = "B";
				break;
			case 7:
				name_grade[i][1] = "C";
				break;
			case 6:
				name_grade[i][1] = "D";
				break;
			default:
				name_grade[i][1] = "F";
				break;
			} // switch case end

			i++;
		} // input end

		for (int k = 0; k < grade_card_num; k++) {
			System.out.println(" --- " + name_grade[k][0] + "님의 성적표 --- ");
			System.out.println("국어 : " + score[k][0] + " 영어 : " + score[k][1] + " 전산 : " + score[k][2]);
			System.out.println("총점 : " + score[k][3] + " 평균 : " + String.format("%.2f", avg[k]) + " 학점 : "
					+ name_grade[k][1] + "\n");
		}
	}
}
