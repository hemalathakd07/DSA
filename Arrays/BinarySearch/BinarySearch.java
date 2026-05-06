import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
  static int search(int[] array,int element){
    Arrays.sort(array);
    int low=0,high=array.length-1;
    while(low<=high){
      int mid=low+(high-low/2);
      if(array[mid] == element){
        return mid;
      }else{
        if(array[mid]>element){
          high=mid-1;
        }else{
          low=mid+1;
        }
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int[] array={12,34,1,2,4,5,44};
    System.out.println("Array elements before sorting:");
    System.out.println(Arrays.toString(array));
    Scanner scanner =new Scanner(System.in);
    System.out.println("Enter a search element:");
    int element=scanner.nextInt();
    int result=search(array,element);
    System.out.println("Array elements after sorting:");
    System.out.println(Arrays.toString(array));
    if(result!=-1){
      System.out.println(element+" is found in the index "+result);
    }else{
      System.out.println(element+" is not found in the given array");
    }

    scanner.close();

  }
  
}
