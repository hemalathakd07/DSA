import java.util.Scanner;

public class LinearSearch {
  static int findIndex(int[] arr,int element){
    for(int i=0;i<arr.length;i++){
      if(arr[i]==element){
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int[] array={2,43,12,56,65,134};
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter an element to find it's index:");
    int element=scanner.nextInt();
    int result=findIndex(array,element);

    if(result!=-1){
      System.out.println(element +" is found in the index "+result);
    }else{
      System.out.println(element+" is not found in the giiven array");
    }
    scanner.close();

  }
}
