package Grad_Mgt.V_1_0;

public class MainEntry {
	public static void main(String[] args) {
		// 성적관리프로그램 v1_0
		//국어,영어,전산 점수 임의적으로 부여하고 총점 / 평균 까지 출력
	    //kor = 국어 / en = 영어 / com = 전산
			int kor = 90;
			int en = 100;
			int com = 70;
			// 국어,영어,전산 점수의 총점을 나타 내는 변수 생성 // total
			int total = (kor+en+com);
			
			System.out.println("성적관리 프로그램_v1.0");
			System.out.println("----------------");
			System.out.println("국어 점수" +"=" +kor);
			System.out.println("영어 점수" +"=" +en);
			System.out.println("전산 점수" +"=" +com);
			System.out.println("----------------");
			System.out.println("점수 총점"+"="+ total);
			System.out.println("점수 평균"+"="+(total/3));
			
	}
}
