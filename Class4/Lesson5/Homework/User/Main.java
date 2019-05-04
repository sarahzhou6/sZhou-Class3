public class Main{
  public static void main(String[] args){
    OrderDetails d1 = new OrderDetails();
    d1.setProduct("towel", 3, 2);
    Order o1 = new Order();
    o1.setOrder("10101xyz", "2/21/2019");
    Customer c1 = new Customer();
    c1.register();
    c1.setBal(10000);
    if(c1.login() == true){
      c1.purchase();
    }
  }
}
