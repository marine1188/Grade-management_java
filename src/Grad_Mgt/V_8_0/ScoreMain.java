/*
 * 성적 메인 선택문 까지ㅇㅇㄴㄴ
 */
package Grad_Mgt.V_8_0;

import java.util.Scanner;

public class ScoreMain {
	public static void main(String[] args) {
		System.out.println("1.일반객체 생성, 2. 객체 배열생성");
		int no = new Scanner(System.in).nextInt();
		switch (no) {
		case 1: Score score = new Score();
					score.input();		score.input();
					break;		
		case 2:  
			      System.out.println("학생 수 원하는 만큼? ");
			      int inwon = new Scanner(System.in).nextInt();
			       Score[] s = new Score[inwon];
					for (int i = 0; i < s.length; i++) {
						s[i].input();	
					}
					for (int i = 0; i < s.length; i++) {
						s[i].input();
					}
					break;

		default: System.out.println("없는 번호야~ 확인해요.");
			break;
		}
		
		
		
	}
	
	
}