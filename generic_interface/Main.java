package generic_interface;

public class Main {
  public static void main(String[] args) {
    String myPhoneName = "Lamsung";
    Integer myPhonePrice = 1000;

    Retriever<Integer> integerRetriever = new Container<Integer>(myPhonePrice);
    Retriever<String> stringRetriever = new Phone(myPhoneName);

    System.out.println("My phone name is " + stringRetriever.retrieveData());
    System.out.println("My phone price is " + integerRetriever.retrieveData());
  }
}
