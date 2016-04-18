import java.util.Scanner;
class Ass3
{
 public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no 1:");
		if(sc.hasNextInt())
		{
			int num1=sc.nextInt();
			System.out.println("Enter no 2:");
			if(sc.hasNextInt())
			{
				int num2=sc.nextInt();
				if(num1>num2)
				{
					System.out.println("Num1 is greater i.e="+num1);
				}
				else if (num1<num2)
				{
					System.out.println("Num2 is greater i.e="+num2);
				}
				else
				{
					System.out.println("Both are equal");
				}

			}
			else
			{
				System.out.println("Please enter only numbers");
				System.exit(0);
			}

		}
		else
		{
		System.out.println("Please enter only numbers");
		System.exit(0);
		}
	}

}