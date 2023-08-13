public class hello {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    System.out.print("My name is ");
    System.out.print("Benjamin4k");
    System.out.println();

    String name = "Benjamin4k";
    int age = 20;
    char grade = 'A';

    /*
     * %s - String
     * %d - int
     * %c - char
     */
    System.out.printf("My name is %s, I am %d years old, and I got a %c in my class", name, age, grade);
  }
}