import java.util.Scanner;

public class inputConsole {
  public static void main(String[] args) {
    // Scanner is a class that allows us to get input from the user
    Scanner input = new Scanner(System.in);

    /*
     * next() - gets the next word
     * nextLine() - gets the next line (String)
     * nextInt() - gets the next integer
     * nextDouble() - gets the next double
     * nextByte() - gets the next byte
     * nextBoolean() - gets the next boolean
     * nextLong() - gets the next long
     * nextShort() - gets the next short
     */
    System.out.println("What is your name?");
    String name = input.nextLine();

    /*
     * input.hasNext() - returns true if there is another token
     * input.hasNextLine() - returns true if there is another line
     * input.hasNextInt() - returns true if there is another integer
     * input.useDelimiter(",") - sets the delimiter for the input to a comma
     */
    input.useDelimiter(",");
    System.out.printf("Hello %s, Welcome\n", name);

    input.close();
  }
}
