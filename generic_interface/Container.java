package generic_interface;

public class Container <T> implements Retriever <T> {
  private T data;

  public Container(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  @Override
  public T retrieveData() {
    return data;
  }
}
