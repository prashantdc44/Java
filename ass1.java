class Ass1
{
	public static void main(String[] arg)
	{
		if (arg.length>=2)
		{
			int a=Integer.parseInt(arg[0]);
			int b=Integer.parseInt(arg[1]);
			System.out.println("Addition="+(a+b));
			System.out.println("Average="+((a+b)/2));			
		}
		else
		{
			System.out.println("Please enter 2 arguments");
			System.exit(0);
		}
	}
}