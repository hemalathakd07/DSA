import java.util.Scanner;

public class LinearSearchTransposition {
  static int transposition(int[] arr,int element){
    for(int i=0;i<arr.length;i++){
      if(arr[i]==element){
        if(i>0){
          int temp=arr[i];
          arr[i]=arr[i-1];
          arr[i-1]=temp;
          return i-1;
        }
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int[] array={1,3,41,25,621,56,12};
    System.out.println("Enter an element to find it's index:");
    int element=scanner.nextInt();
    int result=transposition(array,element);

    if(result!=-1){
      System.out.println(element+" is found in the index "+result);
    }else{
      System.out.println(element+" is not found in the given array");
    }
    scanner.close();
  } 
}