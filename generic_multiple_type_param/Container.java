package generic_multiple_type_param;

public class Container <T, S> {
  private T item1;
  private S item2;

  public Container(T item1, S item2) {
    this.item1 = item1;
    this.item2 = item2;
  }

  public T getItem1() {
    return item1;
  }

  public S getItem2() {
    return item2;
  }
}
