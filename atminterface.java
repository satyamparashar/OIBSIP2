import java.util.*;
class atm 
{
	float balance;
	int enterpin,count=0;
	 
	public void pincheck()
	{
		System.out.println("ENTER FOUR-DIGIT PIN ");
		Scanner sc = new Scanner(System.in);
		int enterpin = sc.nextInt();
		String str = Integer.toString(enterpin);  
        int size = str.length(); 
		if(size==4)
		    {
			   menu();
		    }
		    else
		    {
			   System.out.println("ENTER VALID PIN ");
		    }
	}
	public void menu()
	{
		System.out.println("1. A/C BALANCE");
		System.out.println("2. WITHDRAW MONEY");
		System.out.println("3. DEPOSIT MONEY");
		System.out.println("4. TRANSFER MONEY");
		System.out.println("5. EXIT");
		Scanner sc =  new Scanner(System.in);
		int opt = sc.nextInt();
		if(opt==1)
			checkbalance();
		else if(opt==2)
			withdraw();
		else if(opt==3)
			deposit();
		else if(opt==4){
		    transfer();}
		else if(opt==5){
		    System.out.println("THANKS FOR VISITING ");
		    return;}
		else 
			System.out.println("ENTER VALID CHOICE ");
	}
	public void checkbalance()
	{
		System.out.println("BALANCE: "+balance);
		menu();
	}
	public void withdraw()
	{
		System.out.println("ENTER AMOUNT TO WITHDRAW ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		if(amount>balance)
		{
			System.out.println("INSUFFICIENT BALANCE ");
		}
		else
		{
			balance = balance - amount;
			System.out.println("MONEY WITHDRAWL SUCCESSFUL ");
		}
		menu();
	}
	public void deposit()
	{
		System.out.println("ENTER AMOUNT TO DEPOSIT ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		balance = balance + amount;
		System.out.println("MONEY DEPOSITED SUCCESSFULLY ");
		menu();
	}
	public void transfer()
	{
		System.out.println("ENTER AMOUNT TO TRANSFER ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		if(amount>balance)
		{
			System.out.println("INSUFFICIENT BALANCE TO TRANSFER");
		}
		else
		{
			balance = balance - amount;
			System.out.println("MONEY TRANSFER SUCCESSFUL ");
		}
		menu();
	}
}
public class Main
{
	public static void main(String[] args)
	{
		atm obj = new atm();
		obj.pincheck();
	}
}