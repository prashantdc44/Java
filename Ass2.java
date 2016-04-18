import java.util.Scanner;
class  Ass2
{
	//Variables declared here are initialized to  Default
	public static void main(String[] args) 
	{
			//Variables declared here are  Uninitialized
		Scanner instance=new Scanner(System.in);
		System.out.println("Enter Num1:");
		
		if(instance.hasNextInt())
		{
			int num1= instance.nextInt();
			System.out.println("Enter Num2:");
			if(instance.hasNextInt())
			{
				int num2= instance.nextInt();
				int sum=num1+num2;
				int avg=sum/2;
				System.out.println("Average="+avg);
			}
			else
			{
				System.out.println("Enter only Number");		
				System.exit(0);
			}
		}
		else
		{
			System.out.println("Enter only Number");
			System.exit(0);
		}
	}
}
