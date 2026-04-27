import java.util.Scanner;

public class Arrays{
  static void insertionAtBeginning(int[] arr,int size,int element){
    for(int i=size;i>0;i--){
      arr[i]=arr[i-1];
    }
    arr[0]=element;

  }
  public static void main(String[] args) {
    int[] array=new int[20];
    int size=5;
    int element=0;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter array elements:");
    for(int i=0;i<size;i++){
      array[i]=scanner.nextInt();

    }
    insertionAtBeginning(array, size, element);
    size++;
    System.out.println("Array is :");
    for(int i=0;i<size;i++){
      System.out.print(array[i]+"\t");
    }
    scanner.close();
  }
}