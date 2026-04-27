import java.util.Scanner;

public class InsertionAtEnd {
  static void insertion(int[] arr,int element,int size){
    arr[size]=element;
  }
  public static void main(String[] args) {
    int[] array=new int[20];
    System.out.println("Enter the elements of the array:");
    int size=5;
    Scanner scanner=new Scanner(System.in);
    for(int i=0;i<size;i++){
      array[i]=scanner.nextInt();

    }
    int element=200;
    if (size < array.length) {
    insertion(array, element, size);
    size++;
} else {
    System.out.println("Array is full, cannot insert");
}
    System.out.println("Array elements after insertion is ");
    for(int i=0;i<size;i++){
      System.out.print(array[i]+"\t");
    }
    scanner.close();
  }
}
