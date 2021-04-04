/*
  main 에 있는 코드 함수로 만들기
  권보영 님 코드
  배열 없음 
  코드 부분 깔끔함 연구 해보자 
  
 */
package Grad_Mgt.V_7_0;

import java.util.Scanner;

public class Reference_Grad_Mgt_1 {
	
	static String[][] grade = new String[2][7];
	static int[][] score = new int[4][7];
	
	static double[] avg = new double[7];
	
	public static void input() {	
		Scanner sc= new Scanner(System.in);	
		for(int i =0; i<7; i++) {
			System.out.println("==========================");
			System.out.println("이름 입력");
			grade[0][i] = sc.next(); //이름 입력
			
			do{
				System.out.println("국어, 영어, 전산 점수 입력");
				score[0][i] = sc.nextInt();
				score[1][i] = sc.nextInt();
				score[2][i] = sc.nextInt();
				
				score[3][i] = score[0][i] + score[1][i] + score[2][i];
				
				
			}while((score[0][i]<0 || score[0][i]>100) ||(score[1][i]<0 || score[1][i]>100) ||(score[2][i]<0 || score[2][i]>100));
		}
	}
	
	public static void total() {	
		for(int i =0; i<7; i++) {
			score[3][i] = score[0][i] + score[1][i] + score[2][i];
		}
		
	}
	
	public static void average() {	
		for(int i =0; i<7; i++) {
			avg[i]=score[3][i]/3;
		}
	}
	
	public static void grade() {	
		for(int i =0; i<7; i++) {
			switch ((int)(avg[i]/10)) {
			case 10:  
			case 9: grade[1][i] = "A"; break;
			case 8: grade[1][i] = "B"; break;
			case 7: grade[1][i] = "C"; break;
			case 6: grade[1][i] = "D"; break;
			default: grade[1][i] = "F"; break;

			}
		}
	}
	
	public static void output() {	
		for(int k =0; k <7; k++) {
			System.out.println("==============");
			System.out.println(grade[0][k]+"의 성적표");
			System.out.println("국어 :" + score[0][k] + " 영어 :" + score[1][k]+" 전산 :"+score[2][k]);
			System.out.println("총합 :" + score[3][k]+" 평균 :" + avg[k]);
			System.out.println("성적 : " + grade[1][k]);
		}
	}
	
	public static void main(String[] args) {

		input();
		total();
		average();
		grade();
		output();
	}
}
