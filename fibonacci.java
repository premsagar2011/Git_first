package fib;

public class fibonacci 
{

	public static void main(String[] args)
	{
		int a=0;
		int b=1;
		int sum=a+b;
		for(int i=1;i<=10;i=i+1) 
		{
			a=b;
			b=sum;
			System.out.println(sum);
			sum=a+b;
			
		}
		
		
	}

}
