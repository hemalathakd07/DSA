import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
  static int removeDuplicateElements(int[] array){
    int i=0;
    for(int j=1;j<array.length;j++){
      if(array[j]!=array[i]){
        i++;
        array[i]=array[j];
      }
    }
    return i+1;
  }
  public static void main(String[] args) {
    int[] array={2,4,4,5,6,6};
    System.out.println(Arrays.toString(array));
    System.out.println(removeDuplicateElements(array));
  }
  
}
