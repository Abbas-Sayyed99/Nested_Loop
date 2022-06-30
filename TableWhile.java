import java.util.*;

class TableWhile
{
	public static void main(String[] args)
	{
		System.out.println();	
		int i=1;
		while(i<=10)
		{
			System.out.println("\t\t\t");
				int j=1;
				while(j<=5)
				{
					System.out.print(i*j+"\t");
					j++;
				}
			System.out.println();	
			i++;
		}
	}
}
