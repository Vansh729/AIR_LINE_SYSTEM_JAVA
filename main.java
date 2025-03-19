import java.util.*;

 class va {
    static boolean[] seats = new boolean[50];
	static int sum=0;
	static int eco=50000,eco1=40000;
	static int biss=150000,biss1=135000;
	static String name,gender,m_no;
	static int seatNum,age;
	static int flight_no;
	static String flight_time;
	static int  airline_name;
	static int payment_no;
    public static void main(String[] args)
	{
		System.out.println("....welcome in airline booking system....");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Reserve a seat");
            System.out.println("2. View all seats");
            System.out.println("3. Exit");
            int choice = sc.nextInt();
            if (choice == 1)
			{
				flight();
				flight_no=sc.nextInt();
				time();
				flight_time=sc.next();
				air();
				airline_name=sc.nextInt();
                reserveSeat();
            }
			else if (choice == 2)
			{
                viewSeats();
            }
			
			else if (choice == 3)
			{
				display();
				payment();
				System.out.println("___________________________________________");
				System.out.println("_____________(: thank you :)_______________");
				System.out.println("___________________________________________");
                break;
            }
			else 
			{
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
	static void display()
	{
		System.out.println("your grand toatal is :"+sum);
	}

     static void reserveSeat() 
	 {
        Scanner sc = new Scanner(System.in);
		System.out.println("enter passenger name :");
		name=sc.next();
		System.out.println("Enter passenger age :");
		age=sc.nextInt();
		System.out.println("Enter passenger gender :");
		gender=sc.next();
		System.out.println("Enter your mobile number :");
		m_no=sc.next();
		for(int i=0;m_no.length()!=10;i++)
		{
			System.out.println("......Enter valid 10 digit mobile number...... ");
			m_no=sc.next();
		}
	    System.out.println("1-25 seatNum are inclueded in economy class");
	    System.out.println("26-50 seatNum are inclueded in business class ");
        System.out.print("Enter seat number: ");
        seatNum = sc.nextInt();
        if (seats[seatNum - 1] == false) 
		{
            seats[seatNum - 1] = true;
			if(seatNum<=25)
			{
				if(age<=18)
				{
					sum= sum+eco1;
					System.out.println("|----------------------------------------------------|");
					System.out.println("|  Economy class :)...your ticket price is :" +eco1+"    ");
				}
				else
				{
				sum=sum+eco;
					System.out.println("|---------------------------------------------------|");
					System.out.println("|  Economy class :)...your ticket price is :" +eco1+"    ");				
				}
			}
			else if(seatNum>25)
			{
				if(age<=18)
				{
					sum=sum+biss1;
					System.out.println("|----------------------------------------------------|");
					System.out.println("|bissness class :)...your ticket price is :" +biss1+"");
				}
				else
				{
				sum= sum+biss;	
				System.out.println("|----------------------------------------------------|");
				System.out.println("| bissness class :)...your ticket price is :" +biss+"");
				}
			}
			if(flight_no==1)
			{
				System.out.println("|             BHAVNAGAR ----> AHEMDABAD             ");
			}
			else if(flight_no==2)
			{
				System.out.println("|             AHEMDABAD ----> BHAVNAGAR             ");
			}
			else if(flight_no==3)
			{
				System.out.println("|             AHEMDABAD ----> MUMBAI                ");
			}
			else if(flight_no==4)
			{
				System.out.println("|             MUMBAI ----> AHEMDABAD                ");
			}
			else
			{
				System.out.println("Enter the valid flight");
			}
			switch(flight_time)
			{
				case "A":
					System.out.println("|      your flight timing is : 02.30 AM        ");
					System.out.println("|      reporting time : 1.45 AM                ");
					break;
				case "B":
					System.out.println("|      your flight timing is : 10.30 AM        ");
					System.out.println("|      reporting time : 09.45 AM               ");
					break;
				case "C":
					System.out.println("|      your flight timing is : 01.30 PM        ");
					System.out.println("|      reporting time : 12.45 PM               ");
					break;
				case "D":
					System.out.println("|      your flight timing is : 04.30 PM        ");
					System.out.println("|      reporting time : 03.45 PM               ");
					break;
				case "E":
					System.out.println("|      your flight timing is : 06.30 PM        ");
					System.out.println("|      reporting time : 05.45 PM               ");
					break;
				case "F":
					System.out.println("|      your flight timing is : 10.30 PM        ");
					System.out.println("|      reporting time : 09.45 AM               ");
					break;
				case "G":
					System.out.println("|      your flight timing is : 11.30 PM        ");
					System.out.println("|      reporting time : 10.45 PM               ");
					break;
				case "a":
					System.out.println("|      your flight timing is : 02.30 AM        ");
					System.out.println("|      reporting time : 1.45 AM                ");
					break;
				case "b":
					System.out.println("|      your flight timing is : 10.30 AM        ");
					System.out.println("|      reporting time : 09.45 AM               ");
					break;
				case "c":
					System.out.println("|      your flight timing is : 01.30 PM        ");
					System.out.println("|      reporting time : 12.45 PM               ");
					break;
				case "d":
					System.out.println("|      your flight timing is : 04.30 PM        ");
					System.out.println("|      reporting time : 03.45 PM               ");
					break;
				case "e":
					System.out.println("|      your flight timing is : 06.30 PM        ");
					System.out.println("|      reporting time : 05.45 PM               ");
					break;
				case "f":
					System.out.println("|      your flight timing is : 10.30 PM        ");
					System.out.println("|      reporting time : 09.45 AM               ");
					break;
				case "g":
					System.out.println("|      your flight timing is : 11.30 PM        ");
					System.out.println("|      reporting time : 10.45 PM              ");
					break;
				default :
					System.out.println("pls enter valid timing ");
				break;
			    }
				switch(airline_name)
				{
					case 1:
						System.out.println("|                   AIR_INDIA                       ");
						System.out.println("|___________________________________________________|");
						break;
					case 2:
						System.out.println("INDIGO");
						break;
					case 3:
						System.out.println("GO FIRST");
						break;
					default :
						System.out.println("Enter valid airline");
						break;	
				}
				System.out.println("|---------------------------------------------|");
				System.out.println("|     < your ticket has been ganreted >       |");
				System.out.println("|---------------------------------------------|");
				System.out.println("|              name : "+name+"                   ");
				System.out.println("|              gender : "+gender+"                  ");
				System.out.println("|              age : "+age+"                       ");
				System.out.println("|              seatNum :" +seatNum+"                     ");
				System.out.println("|         .Seat reserved. Thank you.          ");
				System.out.println("|_____________________________________________|");
        }
		else
		{
            System.out.println("Sorry, this seat is already reserved. :(");
			System.out.println("plss....[reserved again]....");
			reserveSeat();
			
        }
    }
	static void number()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter mobile number :");
		m_no=sc.next();
		
	}
	 static void flight()
	 {
		 System.out.println("Choose your flight : ");
		 System.out.println("1).BHAVNAGAR ----> AHEMDABAD");
		 System.out.println("2).AHEMDABAD ----> BHAVNAGAR");
		 System.out.println("3).AHEMDABAD ----> MUMBAI");
		 System.out.println("4).MUMBAI ----> AHEMDABAD");
	 }
	 static void time()
	 {
		 System.out.println("Choose your flight timing : ");
		 System.out.println("A] 2:30 AM");
		 System.out.println("B] 10:30 AM");
		 System.out.println("C] 1:30 PM");
		 System.out.println("D] 4:30 PM");
		 System.out.println("E] 6:30 PM");
		 System.out.println("F] 10:30 PM");
		 System.out.println("D] 11:30 PM");
	 }
	 static void air()
	 {
		 System.out.println("Choose your flight type : ");
		 System.out.println("1]. AIR_INDIA");
		 System.out.println("2]. INDIGO");
		 System.out.println("3]. GO FIRST");
	 }
     static void viewSeats() 
	 {
        for (int i = 0; i < seats.length; i++)
		{
            System.out.print("Seat " + (i + 1) + ": ");
            if (seats[i] == true) 
			{
                System.out.println("Reserved");
            }
			else
			{
                System.out.println("Available");
            }
        }
    }
	static void payment()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
		System.out.println("|     select payment method     |");
		System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
		System.out.println("1.Google pay");
		System.out.println("2.Paytm");
		System.out.println("3.Net Banking");
		System.out.println("4.Cash");
		payment_no=sc.nextInt();
		switch(payment_no)
		{
			case 1:
			System.out.println("your selected payment method is Google pay");
			System.out.println("you payable amount is  :" +sum);
			break;
			case 2:
			System.out.println("your selected payment method is Paytm");
			System.out.println("you payable amount is  :" +sum);
			break;
			case 3:
			System.out.println("your selected payment method is Banking");
			System.out.println("you payable amount is  :" +sum);
			break;
			case 4:
			System.out.println("your selected payment method is Cash");
			System.out.println("you payable amount is  :" +sum);
			break;
			default :
			System.out.println("pls enter valid payment method");
			otp();
			payment();
			break;
		}
		
	}
	static void otp()
	{
		Random rand = new Random();
        System.out.printf("%04d%n", rand.nextInt(10000));	
	    
    }
	
}