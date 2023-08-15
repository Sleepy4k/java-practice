package generic_interface;

public class Phone implements Retriever <String> {
  private String name;

  public Phone(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String retrieveData() {
    return this.name;
  }
}
