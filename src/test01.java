/*
성적관리프로그램_V_6_0
subject: 성적처리를 배열로 입력 받아 3명의 점수를 출력
update list:
배열 처리 하기 
 Date : 04_01_21
*/
//		rusult>
//		국어 : 100 , 영어 :100 ,전산 : 100
//		총점 : 300 , 평균 :100.00 , 학점 :
// 성적관리 프로그램_V_6.0 //

/*
 * 변수 선언 kor(int) = 국어 eng(int) = 영어 com(int) = 전산 / total(int) = 점수 합계 grade
 * (char) = 학점
 * 
 * 		// 수정 사항//배열
 */



import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
		// 몇명의 성적표를 만들건지 
		System.out.println("몇명의 성적표를 만들까요?");
		Scanner sc = new Scanner(System.in);
		int grade_card_num;
		grade_card_num = sc.nextInt();
		
		String[]name = new String[grade_card_num];
		String[] grade = new String[grade_card_num];
		int[][] score = new int[grade_card_num][3];
		int[] total = new int[grade_card_num];
		double[] avg = new double[grade_card_num];
		
		System.out.println("성적관리 프로그램_V_6.0 _ 배열");
	
	
		for (int i = 0; i < grade_card_num ; i++) {
			System.out.print((i+1)+"번째 학생 "+"이름을 입력 해주세요 ");			
			name[i] = sc.next();
			System.out.println("성적을 입력 해주세요");
			
			for (int k = 0; k < score[i].length; k++) {
				if (k == 0) {
					System.out.println("국어 점수 입력 해주세요 :");
				}
				else if(k == 1) 
					{
					System.out.println("영어 점수 입력 해주세요 :");
					}
				else 
					{
					System.out.println("전산 점수 입력 해주세요 :");
					}
				do 
				{
					
				}while(score[i][k] < 0 || score[i][k] > 100);
			}
			
		}

		
	
		
			//avg[i] = (total / 3.0); 

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
			
		
		//System.out.println("*****성적표******");
		for (int k = 0; k < grade_card_num; k++) {
			System.out.println((k+1)+"번 학생 "+name+" 성적표 *********");
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


// 지워도 됨
////try 문 안으로 들어 //합격여부
//
//try {
//
//	total = (kor + eng + com);
//	avg = (((float) total) / 3);
//
//	if (avg < 60) {
//		System.out.println("불합격 입니다");
//	}
//	if (kor < 40) {
//		System.out.println("국어 불합격" + kor + "점");
//	}
//	if (eng < 40) {
//		System.out.println("영어 불합격" + eng + "점");
//	}
//	if (com < 40) {
//		System.out.println("전산 불합격" + com + "점");
//	} else {
//		System.out.println("축하드립니다 평균 점수" + avg + "점 으로 합격 입니다");
//	}
//} catch (Exception e) {
//	System.out.println("숫자만 입력 해주세요");
//}