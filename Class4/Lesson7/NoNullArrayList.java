import java.util.*;

public class NoNullArrayList<E> extends ArrayList<E> {
  public NoNullArrayList() {
    super();
  }
  public NoNullArrayList(int startCaps) {
    super(startCaps);
  }
  @Override
  public boolean add (E element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    return super.add(element);
  }
  @Override
  public void add (int index, E element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
  super.add(index, element);
  }
  @Override
  public E set (int index, E element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    return super.set(index, element);
  }
}
