import java.util.Scanner;

public class LinearSearchMoveToFront_originalIndex {
  static int moveToFront(int[] array,int element){
    for(int i=0;i<array.length;i++){
      if(array[i]==element){
        int originalIndex=i;
        if(i>0){
        int temp=array[i];
        array[i]=array[0];
        array[0]=temp;
      }
      return originalIndex;
    }
  }
    return -1;
  }
  public static void main(String[] args) {
    int[] array={110,2,34,45,123};
    System.out.println("Enter an element:");
    Scanner scanner=new Scanner(System.in);
    int element=scanner.nextInt();

    int result=moveToFront(array,element);

    if(result!=-1){
      System.out.println(element+" is found in the index "+result);
    }else{
      System.out.println(element+" is not found in the given array");
    }
    scanner.close();
  } 
}