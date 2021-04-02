/*
 Grad_Mgt.V_2_1
 클래스로 구분하기
 코드 작성중
 */

//package Grad_Mgt.V_2_1;
//
//import java.util.Scanner;
//
//public class MainEntry {
//	public static void main(String[] args) {
//		// 다음을 입력 받아서 출력하는 프로그램 작성 이름,국어,영어,전산, 점수 입력 받아서 총점,평균 까지
//					//출력하는 프로그램 작성 
//					
////					rusult>
////					이도연님의 성적표 
////					국어 : 100 , 영어 :100 ,전산 : 100
////					총점 : 300 , 평균 :100.00
//					
//					System.out.println("성적관리 프로그램_v2.0");
//					//생성자를 만들어준다
//					Scanner sc = new Scanner(System.in);
//					//sc 객체에 입력된 값들이 임시로 저장된다
//			        //입력시작
//					System.out.println("이름을 입력하세요:");
//			        // 이름은 String 이기에 nextLine();
//					String name = sc.nextLine();
//					System.out.println("국어점수를 입력하세요:");
//			        //점수는 int 형 nextInt()
//					int kor = sc.nextInt();
//					System.out.println("영어 점수를 입력하세요:");
//					int eng = sc.nextInt();
//					System.out.println("전산 점수를 입력하세요:");
//					int com = sc.nextInt();
//
//					// 점수 합계 구하는 코드 
//					int total = (kor+eng+com);
//			        //점수 평균을 구하는 코드 
//					float avg =(((float)total)/3);
//
//
//					System.out.println(name+"님의 성적표 *********");
//
//					System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
//
//					System.out.print("총점 : " + total);
//					
//			        //100.00 을 위해서 %.2f 를 붙인다 없으면 100.0 나온다 
//					System.out.printf(" 평균 : %.2f" , avg );
//	}
//	
//}
