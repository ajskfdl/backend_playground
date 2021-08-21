package Condition;

public class Main08 {

	public static void main(String[] args) {
		/*
		 * if문을 활용
		 */
		
		// 1. 만약 3000원 이상의 돈을 가지고 있으면 택시를 타고, 그렇지 않으면 걸어가라
		int money = 2500;
		if( money >= 3000 ) {
			System.out.println("택시를 타고 가라");
		} else {
			System.out.println("걸어 가라");
		}
		
		
		System.out.println("-----------------------------");
		// 2. 만약 돈이 3000원 이상 있거나, 카드가 있다면 택시를 타고, 그렇지 않으면 걸어가라
		int money1 = 1500;
		boolean hasCard = false;
		if( money1 >= 3000 || hasCard ) {
			System.out.println("택시를 타고가라");
		} else {
			System.out.println("걸어가라");
		}
		
		if( money1 >= 3000 ) {
			System.out.println("택시를 타고가라");
		} else if( hasCard ){
			System.out.println("택시를 타고가라");
		} else {
			System.out.println("걸어가라");
		}
		
		if( money1 >= 3000 ) {
			System.out.println("택시를 타고가라");
		} else {
			if(hasCard) {
				System.out.println("택시를 타고가라");				
			} else {
				System.out.println("걸어 가라");
			}
		}
		
		System.out.println("-----------------------------");
		// 3. 어떤 특정 정수값 a가 짝수면 "짝수", 홀수면 "홀수"를 출력하라
		int a = 5;
		if( a%2 == 0 ) {	// 짝수
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		System.out.println("-----------------------------");
		// 4. 어떤 특정 서로다른 정수값 a1,b1,c1의 최대값을 구하여라
		int a1 = 100, b1 = 20, c1 = 90;
		int max = 0;
		
		if(a1 > b1 && a1 > c1) {
			max = a1;
		} else {
			if( b1 > c1) {
				max = b1;
			} else {
				max = c1;
			}
		}
		System.out.println("최대값은 : " + max);
	}

}


