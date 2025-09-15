public class array {
  public static void main(String args[]) {
    int[] nums = { 1, 2, 3, 4, 5 }; // array with initial values
    System.out.println(nums[0]); // prints 1
    System.out.println(nums[4]); // prints 5

    // Traversing Arrays
    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i] + " ");
    }

    for (int n : nums) { // enhanced for-loop
      System.out.println(n + " ");
    }
  }
}
