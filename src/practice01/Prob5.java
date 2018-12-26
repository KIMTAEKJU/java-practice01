package practice01;

import java.util.Scanner;

public class Prob5 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner( System.in );
		String charValue = "";
		int count = 0; // 3, 6, 9 세는 카운트
		
		for (int i = 1; i <= 999; i++)
		{
			charValue = String.valueOf(i);
			
			for (int j = 0; j < charValue.length(); j++)
				// 3 6 9가 있다면 카운트 증가
				if (charValue.charAt(j) == '3' || charValue.charAt(j) == '6' || charValue.charAt(j) == '9')
					count++;
			
			
			if (count != 0) // 3 6 9가 하나라도 있을때
			{
				System.out.print(i + " ");
			
				for (int k = 0; k < count; k++) //카운트수만큼 짝 출력
					System.out.print("짝");
				System.out.println();
			}
			
			count = 0;
		}
	}
}
