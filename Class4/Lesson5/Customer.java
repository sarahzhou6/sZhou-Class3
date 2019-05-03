import java.util.Scanner;
public class Customer extends User{
	String name;
	String address;
	String email;
	String customerId;
	private double accountBalance = 0;


	public void register(){
		Scanner register = new Scanner(System.in);
		System.out.println("set username:");
		super.setUser(register.nextLine());
		System.out.println("address:");
		address = register.nextLine();
		System.out.println("email:");
		email = register.nextLine();
		System.out.println("set password: ");
  }

	public void setBal(int x){
		accountBalance = x;
	}
	public void getBal(){
		System.out.println("Balance: " + accountBalance);
	}

	public void purchase(){
		Scanner buy = new Scanner(System.in);
		getBal();
		System.out.println("item price:");
		double price = buy.nextDouble();
		if(accountBalance < price){
			System.out.println("low on funds");
			return;
		}
		accountBalance -= price;
		System.out.println("purchase successful");
	}
	public String toString(){
		return "name: " + name + " balance:" + accountBalance;
	}
}
