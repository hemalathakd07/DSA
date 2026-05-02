import java.util.Scanner;

public class LinearSearchTransposition_originalIndex {
  static int Transposition(int[] arr,int element){
    for(int i=0;i<arr.length;i++){
      if(arr[i]==element){
        int originalIndex=i;
        if(i>0){
          int temp=arr[i];
          arr[i]=arr[i-1];
          arr[i-1]=temp;
        }
        return originalIndex;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int[] array={5,110,6,20,3,4};
    System.out.println("Enter an element:");
    Scanner scanner=new Scanner(System.in);
    int element=scanner.nextInt();
    int result=Transposition(array,element);

    if(result!=-1){
      System.out.println(element+" is found in the index "+result);
    }else{
      System.out.println(element+" is not found i  the given array");
    }
  }
}