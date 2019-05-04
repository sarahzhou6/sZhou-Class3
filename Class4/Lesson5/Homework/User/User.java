import java.util.Scanner;
public class User{
  String userId;
  private String password;
  String registerDate;
  public void setUser(String id){
    userId = id;
  }
  public void setPassword(String pw){
    password = pw;
  }
  public boolean login(){
    Scanner login = new Scanner(System.in);
    System.out.println("Username: ");
    String inpUser = login.nextLine();
    System.out.println("Password: ");
    String inpPass = login.nextLine();
    if(inpUser.equals(userId) && inpPass.equals(password)){
        System.out.println("Login successful.");
        return true;
    }
    else{
        System.out.println("Login unseccessful. Check the user ID and password and try again.");
    }
    return false;
  }
}
