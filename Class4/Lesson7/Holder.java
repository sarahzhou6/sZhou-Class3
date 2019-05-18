/*

Generics:

  Using the format
  public class ClassName<VARIABLE_TYPE>{

  }

  Restriction: It must be an OBJECT type, no primitives!
  You may now use that VARIABLE_TYPE as a type throughout your code.


  public class ThingThatHolds<T>{
  public T value;
  }

*/
/*

  public class Holder<T>{
    public T value;

    public static void main(String[]args){
      Holder<String> name = new Holder<String>();
      name.value = "Whoa!";

      Holder<Integer> data = new Holder<Integer>();
      data.value = 5;

      System.out.println(name.value+" "+data.value);
    }
  }

*/

  public class Holder<T>{
    private T value;
    public Holder(){ //NOTICE NO <> here!!!
    }
    public Holder(T start){ //NOTICE NO <> here!!!
        value = start;
    }
    public T getValue(){
      return value;
    }

    public void setValue(T newVal){
      value = newVal;
    }

    public static void main(String[]args){
      Holder<String> name = new Holder<String>();
      name.setValue("Whoa!");

      Holder<Integer> data = new Holder<Integer>();
      data.setValue(5);

      System.out.println(name.getValue()+" "+data.getValue());
    }
  }

/////
  public static void main(String[]args){
    Holder<String> name = new Holder<String>("Whoa!");

    Holder<Integer> data = new Holder<Integer>();
    data.setValue(5);

    System.out.println(name.getValue()+" "+data.getValue());
    name.setValue("name string");


    System.out.println(name.getValue()+" "+data.getValue());
  }
}


// https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
/*

ArrayList (built in class - your super array)
     \
      NoNullArrayList (not built in)
            \
             OrderedArrayList (not built in)
*/


import java.util.*;

/*

NoNullArrayList<T> extends ArrayList<T>
  is an ArrayList of T that cannot take a null as a value.

  Override set and both add methods -> throw an IllegalArgumentException when null is added,
                                     otherwise call the old add method.


  Only have 2 constructors:  default + startingCapacity.

  public boolean add(E element)
  public void add(int index, E element)
  public E set(int index, E element)
  + TWO CONSTRUCTORS
*/
