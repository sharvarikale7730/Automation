package practise;

public class OptimizedPrime 
{

	public static void main(String[] args) 
	{
		int n = 2;
		int count =0;
		
		for(int i=1; i<=Math.sqrt(n) ; i++)
		{
			if (n%i == 0)
			{
				if (i==n/i)
				{
					count++;
				}
				else
				{
					count = count +2;
				}
				
			}
		}
		if (count ==2)
		{
			System.out.println("This is a Prime number :" + n);
		}
		else
		{
			System.out.println("This is not a prime number : "+n);
		}

	}

}
