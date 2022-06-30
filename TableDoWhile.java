import java.util.*;

class TableDoWhile
{
	public static void main(String[] args)
	{
		System.out.println();	
		int i=1;
		do
		{
			System.out.println("\t\t\t");
				int j=1;
				do
				{
					System.out.print(i*j+"\t");
					j++;
				}while(j<=5);
			System.out.println();	
			i++;
		}while(i<=10);
	}
}
