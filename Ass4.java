import java.util.Scanner;
class Ass4
{
	public static void main(String[] args)
	{
		int bill=0;
		//int qt=0;
		String[] food = { "Vad Pav " , "Misal Pav" , "Rice plate" , "Veg Biryani" , "Chicken Biryani" , "Tambda Rassa" , "Pandara Rassa" , "Tandur  " };
		int[] rate = { 10 , 20 , 30 , 40 , 50 , 60 , 70 , 80 };
		int[] qt = new int[8];
		System.out.println("Food Menu :");
		System.out.println("\tVeg:");
		System.out.println("\t\t1. Vada Pav\t\t10");
		System.out.println("\t\t2. Misal Pav\t\t20");
		System.out.println("\t\t3. Rice plate\t\t30");
		System.out.println("\t\t4. Veg Biryani\t\t40");
		System.out.println("\tNon Veg");
		System.out.println("\t\t5. Chicken Biryani\t50");
		System.out.println("\t\t6. Tambada Rassa\t60");
		System.out.println("\t\t7. Pandhara Rassa\t70");
		System.out.println("\t\t8. Tandur\t\t80\n");
		System.out.println("\t\t9. Generete Bill......");
		System.out.println("\t\t10. Cancel order......\n");
		do
		{
		Scanner sc= new Scanner(System.in);
		System.out.print("\nEnter Item no. :\t");
		int opt= sc.nextInt();

		switch(opt)
		{
			case 1:
				System.out.print("Enter Quantity :\t");
				qt[0]= sc.nextInt();
				bill=bill+10*qt[0];
				break;
			case 2:
				System.out.print("Enter Quantity :\t");
				qt[1]= sc.nextInt();
				bill=bill+20*qt[1];
				break;
			case 3:
				System.out.print("Enter Quantity :\t");
				qt[2]= sc.nextInt();
				bill=bill+30*qt[2];
				break;
			case 4:
				System.out.print("Enter Quantity :\t");
				qt[3]= sc.nextInt();
				bill=bill+40*qt[3];
				break;
			case 5:
				System.out.print("Enter Quantity :\t");
				qt[4]= sc.nextInt();
				bill=bill+50*qt[4];
				break;
			case 6:
				System.out.print("Enter Quantity :\t");
				qt[5]= sc.nextInt();
				bill=bill+60*qt[5];
				break;
			case 7:
				System.out.print("Enter Quantity :\t");
				qt[6]= sc.nextInt();
				bill=bill+70*qt[6];
				break;
			case 8:
				System.out.print("Enter Quantity :\t");
				qt[7]= sc.nextInt();
				bill=bill+80*qt[7];
				break;
			case 9:
				System.out.print("\n\t\tFood\t\t\tRate\tQuantity\tAmount\n");
				for(int y=0;y<70;y++)	{System.out.print("_");}
				for (int i=0;i<8 ;i++ )
				{
					if (qt[i]!=0)
					{
						System.out.print("\n\t\t"+food[i]+"\t\t"+rate[i]+"\t"+qt[i]+"\t\t"+(rate[i]*qt[i]));
					}
				}
				System.out.println("\n\nTotal Bill =\t"+bill);
				System.exit(0);
				break;
			case 10:
				System.out.println("Welcome Next time");
				System.exit(0);
				break;
			default:
				System.out.println("Enter 1 to 10 only...........");
				break;
		}
		}
		while (true);
	}

}