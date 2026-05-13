import java.util.Arrays;

public class largestElement1 {
  static int largest(int[] array){
    Arrays.sort(array);
    int largest_element=array[array.length-1];
    return largest_element;
  }
  public static void main(String[] args) {
    int[] array={2,45,1,7,10};
    System.out.println(largest(array));
  }
}