import java.util.*;

public class OrderedArrayList<E extends Comparable<E>> extends NoNullArrayList<E> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int j) {
    super(j);
  }
  private int findPos (E e) {
    int position = 0;
    for (int i = 0; i < super.size(); i++) {
      if (e.compareTo(super.get(i)) < 0 ) {
        break;
      }
      position++;
    }
    return position;
  }
  @Override
  public boolean add (E e) {
    int position = findPos(e);
    System.out.println("add element " + e + " to position " + position);
    super.add(position, e);
    return true;
  }
  @Override
  public void add (int index, E e) {
    this.add (e);
  }
  @Override
  public E set (int index, E e) {
    super.remove(index);
    System.out.println(this);
    this.add(e);
    return e;
  }
}
