public class classes {
  String personName;
  int personAge;
  double personHeight;
  boolean personIsAdult;

  public classes(String name, int age, double height, boolean isAdult) {
    personName = name;
    personAge = age;
    personHeight = height;
    personIsAdult = isAdult;
  }

  public static void main(String[] args) {
    classes person1 = new classes("Benjamin", 18, 1.82, true);
    classes person2 = new classes("4k", 18, 1.82, true);

    System.out.println("My name is " + person1.personName);
    System.out.println("My last name is " + person2.personName);
    System.out.println("I am " + person1.personAge + " years old");
    System.out.println("I am " + person2.personHeight + " meters tall");
    System.out.println("I am an adult: " + person1.personIsAdult);
    System.out.println("My first initial is " + person2.personIsAdult);
  }
}
