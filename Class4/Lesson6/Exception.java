class Exception {
  public static void main (String[] args){
    try {
      int[]arr= new int[1];
      arr[3]=2;
      /*System.out.println(4/0);*/
    }
    catch(ArithmeticException e){
      System.out.println("Divide by 0 error");
    }
    catch(ArrayIndexOutofBoundsException e){
      System.out.println(e.getMessage());
    }
  }
}
