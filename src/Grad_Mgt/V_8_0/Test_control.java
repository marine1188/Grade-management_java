package Grad_Mgt.V_8_0;

import java.util.Scanner;

public class Test_control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("몇명의 성적표를 만들까요?");
		int su = sc.nextInt();

		int[] su2 = new int[su];
		int cont = 0;

		for (int i = 0; i < su2.length; i++) {
			System.out.println("원하는 숫자 입력하세요");
			su2[i] = sc.nextInt();
		}
		for (int k : su2) {
			System.out.println(k);
		}

	}

}
