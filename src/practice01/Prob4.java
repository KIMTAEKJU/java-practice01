package practice01;

import java.util.Scanner;

public class Prob4 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner( System.in );
		
		String userInput = "";
		int lenCount = 0; // 문자표시개수 카운트
		
		System.out.print("문자열을 입력하세요. : ");
		userInput = scanner.nextLine();
		
		while (userInput.length() != lenCount)
		{
			for (int i = 0; i <= lenCount; i++)
				System.out.print(userInput.charAt(i)); //하나씩 가져와서 출력
			System.out.println();
			
			lenCount++; // 카운트증가
		}
		
	}

}
