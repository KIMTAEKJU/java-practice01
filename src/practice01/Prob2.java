package practice01;

public class Prob2 
{
	public static void main(String[] args) 
	{
		int max = 10;
		
		for (int i = 1; i <= 9; i++)
		{
			for (int j = i; j <= max; j++)
				System.out.print(j + " ");
			System.out.println();
			
			max++; // 최댓값 1씩 증가
		}
	}
}
