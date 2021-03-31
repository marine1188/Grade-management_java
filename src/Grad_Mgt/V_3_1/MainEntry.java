/*
성적관리프로그램_V_3_1
Date : 03_31_21
subject:
update list:

*/
package Grad_Mgt.V_3_1;

import java.util.Scanner;
public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("integer su1, su2 data input : ");
		int su1 = sc.nextInt();		int su2 = sc.nextInt();
		int avg = (su1 + su2) / 2 ;   // 평균점수
		String msg = null;
		
		// 불합격 - 40, 1회 기회 제공 - 75 , 2회 기회 제공 - 60
		if( avg <= 40 ) msg = "불합격";
		else if( avg > 75 ) msg = "합격";
		else if(  (avg > 40 ) && (avg <= 60) ) msg = "1회 기회 제공";
		else if(  (avg > 60 )  ) 	msg = "2회 기회 제공";
	
		System.out.println("\n\n" + avg + " ====> " + msg);
		
	}

}
