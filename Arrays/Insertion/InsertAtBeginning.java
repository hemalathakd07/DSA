import java.util.Scanner;

public class InsertAtBeginning{
  static void insertion(int[] arr,int size,int element){
    for(int i=0;i<size;i++){
      arr[i+1]=arr[i];
    }
    arr[0]=element;
  }
  public static void main(String[] args) {
    int[] array=new int[20];
    int size=5;
    System.out.println("Enter array elements:");
    Scanner scanner=new Scanner(System.in);
    for(int i=0;i<size;i++){
      array[i]=scanner.nextInt();
    }
    int element=0;
    insertion(array,size,element);
    size++;
    for(int i=0;i<size;i++){
      System.out.print(array[i]+"\t");
    }

    scanner.close();

    
  }
}