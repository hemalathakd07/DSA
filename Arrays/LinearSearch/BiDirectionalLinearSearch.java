import java.util.Scanner;

public class BiDirectionalLinearSearch {
  static int Search(int[] array,int element){
    int left=0,right=array.length-1;
    while(left<=right){
      if(array[left]==element){
        return left;
      }
      if(array[right]==element){
        return right;
      }
      left++;
      right--;
    }
    return -1;
  }
  public static void main(String[] args) {
    int[] array={5,10,231,54,62,52};
    System.out.println("Enter an element:");
    Scanner scanner=new Scanner(System.in);
    int element=scanner.nextInt();
    int result=Search(array,element);

    if(result!=-1){
      System.out.println(element+" is found in the index "+result);
    }else{
      System.out.println(element+" is not found in the array");
    }    
  }
}