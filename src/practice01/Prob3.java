package practice01;

import java.util.Scanner;

public class Prob3 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner( System.in );

		int userInput = 0; // 유저인풋값
		int sum = 0; // 합계
		
		System.out.print("숫자를 입력하세요 : ");
		userInput = scanner.nextInt();
		
		if (userInput % 2 == 0) // 짝수
			for (int i = 2; i <= userInput; i+=2)
				sum += i;
		
		else // 홀수
			for (int i = 1; i <= userInput; i+=2)
				sum += i;
		
		System.out.println("결과 값 : " + sum);
		scanner.close();
	}
}
