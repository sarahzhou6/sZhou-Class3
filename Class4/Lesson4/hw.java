public class hw{
    public static void main(String[] args){
        Account n = new Account(12345, 9);
          System.out.println(n.getAccount());
          System.out.println(n.getBalance());
          n.debit(250);
          n.credit(75);
          System.out.println(n);
          n.debit(10000);
          System.out.println(n);
      }
}
class Account{
    int accountNumber;
    double balance;
    double amount;
    public Account(int p){
        accountNumber = p;
    }
    public Account(int x, double y){
        accountNumber = x;
        balance = y;
    }
    public int getAccount(){
        return accountNumber;
      }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        balance=balance;
    }
    public void credit(double amount){
        balance=balance+amount;
    }
    public void debit(double amount){
        if (balance >= amount){
            balance=balance-amount;
        }
        else{
            System.out.println("Amount withdrawn exceeds the current balance.");
        }
    }
    public String toString(){
        return "A/C no:"+accountNumber+", Balance=$"+balance;
    }
}
