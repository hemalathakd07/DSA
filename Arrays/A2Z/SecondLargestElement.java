import java.util.Arrays;

public class SecondLargestElement {
  static int secondLargestElement(int[] array){
    Arrays.sort(array);
    for(int i=array.length-2;i>=0;i--){
      if(array[i]!=array[array.length-1]){
        return array[i];

      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int[] array={23,54,76,22,6,2};
    System.out.println(secondLargestElement(array));
  }
}