import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray1 {
  static int removeDuplicateElements(int[] array){
    int[] temp=new int[array.length];
    temp[0]=array[0];
    int j=1;
    for(int i=1;i<array.length;i++){
      if(array[i]!=temp[j-1]){
        temp[j]=array[i];
        j++;
      }
    }

    for(int i=0;i<j;i++){
      array[i]=temp[j];
    }
    return j;
  }
  public static void main(String[] args) {
    int[] array={2,4,4,5,6,6};
    System.out.println(Arrays.toString(array));
    System.out.println(removeDuplicateElements(array));
  }
}
