package debugging;

public class Exceptions {
  public static void main(String[] args) {
    try {
      int[] myArray = {1, 2, 3};
      System.out.println(myArray[10]);
    } catch (Exception e) {
      System.err.println("The element you are trying to access does not exist.");
    }

    try {
      String str = null;
      System.out.println(str.length()); // ignore this error
    } catch (Exception e) {
      System.err.println("The string is null.");
    }

    try {
      int width = -1;
      int length = 2;

      if (width < 0 || length < 0) {
        throw new IllegalArgumentException("The width or length cannot be negative.");
      }

      System.out.println(width * length);
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }

    try {
      int[] myArray = {1, 2, 3};
      System.out.println(myArray[10]);
    } catch (Exception e) {
      System.err.println("The element you are trying to access does not exist.");
    } finally {
      System.out.println("This is the finally block.");
    }
  }
}
