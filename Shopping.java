package a.b.c;

import java.sql.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


public class Shopping {
	public static int i1,i2,i3;
	public static double price1,price2,price3,price4;
	public static double total1,total2,total3,total4,cost;
	
	public static ArrayList electronics()
	{
		ArrayList list = new ArrayList();
		System.out.println("Your selected the Electronic section");
		System.out.println("Enter 1 for Electronics menu");
		Scanner sc1= new Scanner(System.in);
		int num=sc1.nextInt();
		if(num==1)
		{
			Connection connection = ConnectionFactory.getConnection();
	        try {
	        	System.out.println("");
	            Statement statement = connection.createStatement();
	            ResultSet re =statement.executeQuery("SELECT * FROM product_info.electronicsection;");
	            System.out.println("ItemId     Name     cost    quantity");
	            while (re.next()) {
	            	
	                System.out.print(re.getInt(1)+"    ");
	                System.out.print(re.getString(2)+"   ");
	                System.out.print(re.getInt(3)+"    ");
	                System.out.println(re.getInt(4));
	                } 
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }    
	        System.out.println(" ");
			System.out.println("select 11 for Washing Machine,select 22 for Fan,select 33 for Mobile,select 44 for tv");
			Scanner sc= new Scanner(System.in);
			int a=sc.nextInt();
			if(a==11)
             {
				 System.out.println("you select the washing mechine how many you want");
				 int h=sc.nextInt();
                 int cost=20000;
                 int p11 = cost*h;
                 System.out.println(" your bill for WashingMachine "+p11);
                 i1=p11;
                 System.out.println("continue press 1");
             }
			int q=sc.nextInt();
			System.out.println("select 11 for Washing Machine,select 22 for Fan,select 33 for Mobile,select 44 for tv");
            int b=sc.nextInt();
			if(b==22)
             {
				 System.out.println("select Fans how many you want");
				 int h=sc.nextInt();
                 int cost=1500;
                 int p22 = cost*h;
                 System.out.println(" your bill for fans "+p22);
                 i2=p22;
                 System.out.println("continue press 1");
             }
			int r=sc.nextInt();
			System.out.println("select 11 for Washing Machine,select 22 for Fan,select 33 for Mobile,select 44 for tv");

            int c=sc.nextInt();
			if(c==33)
             {
				 System.out.println("select Mobile how many you want");
				 int h=sc.nextInt();
                 int cost=16000;
                 int p33 = cost*h;
                 System.out.println(" your bill for mobile "+p33);
                 i3=p33;
                 System.out.println("select 11 for Washing Machine,select 22 for Fan,select 33 for Mobile,select 44 for tv");
     			int d=sc.nextInt();

     			if(d==44)
                  {
     				 System.out.println("you select the Tv's how many you want");
     				 int g=sc.nextInt();
                      int cost1=26000;
                      int p11 = cost1*g;
                      System.out.println(" your bill for Tv "+p11);
                      i1=p11;
                      System.out.println("enter 11 for yor electronics total bill");

                  }
     			int t=sc.nextInt();
             }
		
		int price1=sc.nextInt();
		System.out.println(" your electronics total bill : "+(price1=(i1+i2+i3)));
		sections();
		total1=price1;

		}
		return list;
	}
	public static ArrayList  bath()
	{
		ArrayList list = new ArrayList();

		System.out.println("Your selected the Bath section");
		Connection connection = ConnectionFactory.getConnection();
        try {
        	System.out.println("");
            Statement statement = connection.createStatement();
            ResultSet re =statement.executeQuery("SELECT * FROM product_info.bathsection;");
            System.out.println("ItemId  Name  cost  Quantity");
            while (re.next()) {
            	
                System.out.print(re.getInt(1)+"    ");
                System.out.print(re.getString(2)+"   ");
                System.out.print(re.getInt(3)+"    ");
                System.out.println(re.getInt(4));
                } 
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }   
        System.out.println(" ");
		System.out.println("select 111 for soap,select 222 for Towel");

		Scanner sc1 = new Scanner(System.in);
		int a=sc1.nextInt();

		if(a==111)
         {
			 System.out.println("select soap how many you want");
			 int h=sc1.nextInt();
             int cost=100;
             int p11 = cost*h;
             System.out.println(" your bill for soaps "+p11);
             i1=p11;
             System.out.println("continue press 1");
         }
		int r=sc1.nextInt();
		System.out.println("select 111 for soap,select 222 for Towel");
		int b=sc1.nextInt();

		if(b==222)
         {
			 System.out.println("select Towel how many you want");
			 int h=sc1.nextInt();
             int cost=200;
             int p11 = cost*h;
             System.out.println(" your bill for soaps "+p11);
             i1=p11;
             System.out.println("enter 22 for yor bath total bill");

         }
		int price2=sc1.nextInt();

		System.out.println(" your bath section total bill : "+(price2=(i1+i2+i3)));
		sections();
		total2=price2;
		return list;

	}
	public static ArrayList kitchen()
	{
		ArrayList list = new ArrayList();
		System.out.println("Your selected the Kithchen section");
		Connection connection = ConnectionFactory.getConnection();
        try {
        	System.out.println("");
            Statement statement = connection.createStatement();
            ResultSet re =statement.executeQuery("SELECT * FROM product_info.kitchensection;");
            System.out.println("ItemId  Name  cost  Availability");
            while (re.next()) {
            	
                System.out.print(re.getInt(1)+"    ");
                System.out.print(re.getString(2)+"   ");
                System.out.print(re.getInt(3)+"    ");
                System.out.println(re.getInt(4));
                } 
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }        

        System.out.println(" ");
		System.out.println("select 44 for onions,select 55 for rice");

		Scanner sc1 = new Scanner(System.in);
		int a=sc1.nextInt();

		if(a==44)
         {
			 System.out.println("enter your kgs");
			 int h=sc1.nextInt();
             int cost=50;
             int p11 = cost*h;
             System.out.println(" your bill for onions "+p11);
             i1=p11;
             System.out.println("continue press 1");
         }
		int r=sc1.nextInt();
		System.out.println("select 44 for onions,select 55 for rice");
		int b=sc1.nextInt();
		if(b==55)
        {
			 System.out.println("enter your kgs");
			 int h=sc1.nextInt();
            int cost=80;
            int p22 = cost*h;
            System.out.println(" your bill for rice "+p22);
            i2=p22;
            System.out.println("enter 33 for yor kitchen total bill");

	}
		int price3=sc1.nextInt();

		System.out.println(" your kitchen section total bill : "+(price3=(i1+i2+i3)));
		sections();
		total3=price3;
		return list;

	}
	public static void cloths()
	{
		System.out.println("Your selected the Cloths section");
		Connection connection = ConnectionFactory.getConnection();
        try {
        	System.out.println("");
            Statement statement = connection.createStatement();
            ResultSet re =statement.executeQuery("SELECT * FROM product_info.clothsection;");
            System.out.println("ItemId  Name  cost  Quantity");
            while (re.next()) {
            	
                System.out.print(re.getInt(1)+"    ");
                System.out.print(re.getString(2)+"   ");
                System.out.print(re.getInt(3)+"    ");
                System.out.println(re.getInt(4));
                } 
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }        

		System.out.println("select 101 for shirt,select 202 for tops");

		Scanner sc1 = new Scanner(System.in);
		int a=sc1.nextInt();

		if(a==101)
         {
			 System.out.println("select shirts how many you want");
			 int h=sc1.nextInt();
             int cost=500;
             int p11 = cost*h;
             System.out.println(" your bill for shirts "+p11);
             i1=p11;
             System.out.println("continue press 1");
         }
		int r=sc1.nextInt();
		System.out.println("select 101 for shirt,select 202 for tops");
		int b=sc1.nextInt();
		if(b==202)
        {
			 System.out.println("select tops how many you want");
			 int h=sc1.nextInt();
            int cost=800;
            int p22 = cost*h;
            System.out.println(" your bill for tops "+p22);
            i2=p22;
            System.out.println("enter 44 for yor cloths total bill");

	}
		int price4=sc1.nextInt();
		System.out.println(" your cloths section total bill : "+(price4=(i1+i2+i3)));
		System.out.println(" ");
		
		sections();
		total4=price4;
	   
	}
	
public static void main(String[] args) 

{
	System.out.println("***welcome to shopping section***");
    System.out.println(" ");
	Shopping.sections();
	 cost=total1+total2+total3+total4;
		System.out.println("TOTAL BILL FOR SHOPPING :  "+cost);
		System.out.println(" ");
		System.out.println("***THANK YOU FOR SHOPPING***");
}
public static void sections()
{
	System.out.println("what you want select the section"); 
	System.out.println(" ");
	System.out.println("choose 1 for Electronics section" );
	System.out.println("choose 2 for Bath section");
	System.out.println("choose 3 for Kitchen section");
	System.out.println("choose 4 for Cloths section");
	System.out.println("choose 5 for exit");
	
	Scanner scan = new Scanner(System.in);
	int choice;
	Scanner sc =new Scanner(System.in);
	choice=sc.nextInt();
	if(choice==1)
	{
		electronics();
		//sections();
	}
	if(choice==2)
	{
		bath();
		//sections();
	}
	if(choice==3)
	{
		kitchen();
		//sections();
	}
	if(choice==4)
	{
		cloths();
		//sections();
	}
	
}
}
