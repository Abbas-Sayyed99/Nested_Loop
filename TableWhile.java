import java.util.*;

class TableWhile
{
	public static void main(String[] args)
	{
		int i=1;
		while(i<=10)
		{
			System.out.println("\t\t\t");
				int j=1;
				while(j<=5)
				{
					System.out.print(i*j+" ");
					j++;
				}
			System.out.println();	
			i++;
		}
	}
}