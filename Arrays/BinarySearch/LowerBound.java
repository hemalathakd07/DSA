import java.util.Scanner;


public class LowerBound {
  static int lowerBound(int[] array,int element){
    int low=0,high=array.length-1;
    // if(element>array[array.length-1]){
    //   return -1;
    // }
    while(low<=high){
      int mid=low+(high-low)/2;
      if(array[mid]>=element){
        high=mid-1;
      }
      else{
        low=mid+1;
      }
    }
    return low;
  }

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter an element:");
    int element=scanner.nextInt();
    int[] array={1,2,2,2,3,5,10};

    int result=lowerBound(array,element);

    System.out.println("Lower bound of the element "+element+" is "+result);

    scanner.close();
  }
}