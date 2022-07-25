
public class Bank 
{
	public static void main(String[] args)
	{	
		System.out.println("Banking started....");
		BankAccount bankObj1=new BankAccount();
		BankAccount bankObj2=new BankAccount();
		
		bankObj1.setBankAccount(01, "Aikansh", 75000);
		bankObj2.setBankAccount(02, "Kuldeep", 50000);
		System.out.println("Transfer Initiated");
		bankObj1.withdraw(5000);
		bankObj2.deposit(5000);
		System.out.println("Transfer Completed");
		double b1=bankObj1.getBalance();
		System.out.println("New updated balance is:"+b1);
		bankObj2.printAccount();
	}
}

class BankAccount
{
	int accNo;
	String accHolderName;
	double balance;
	
	void setBankAccount(int x, String y,double b) 
	{
		System.out.println("Set bank account(int,string,double");
		accNo=x;
		accHolderName=y;
		balance=b;
	}
	double getBalance()
	{	
		return balance;
	}
	void withdraw(double amountToWithdraw) 
	{
		System.out.println("Withdrawing..."+amountToWithdraw);
		balance=balance-amountToWithdraw;
	}
	double calculateSI(int rateOfInterest,int period)
	{
		double simpleInterest=(balance*rateOfInterest*period)/100f;
		return simpleInterest;
	}
	void deposit(double amountToDeposit) 
	{
		System.out.println("Depositing..."+amountToDeposit);
		balance=balance+amountToDeposit;
	}
	void printAccount()
	{
		System.out.println("AccNo :"+accNo);
		System.out.println("Acc Holder Name :"+accHolderName);
		System.out.println("balance :"+balance);
		System.out.println("-----------------");
	}
	
}
