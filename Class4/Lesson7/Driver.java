public class Driver {
    public static void main (String[] args) {
      OrderedArrayList<String> ordered = new OrderedArrayList<>(10);
      System.out.println(ordered);
      ordered.add("111");
      ordered.add("222");
      ordered.add("333");
      System.out.println(ordered);
      ordered.set(1, "123");
      System.out.println(ordered);
    }
}
