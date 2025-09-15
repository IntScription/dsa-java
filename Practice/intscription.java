public class intscription {
  public static void main(String[] args) {
    String str = "IntScription";

    // Convert string to char array
    char[] ch = str.toCharArray();

    // Using enhanced for-loop
    for (char c : ch) {
      System.out.println(c);

    }

    // Alternate
    for (int i = 0; i < str.length(); i++) {
      System.out.println(str.charAt(i));
    }
  }
}
