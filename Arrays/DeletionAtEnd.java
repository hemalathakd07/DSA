import java.util.Scanner;

public class DeletionAtEnd {
  void deletion(int[] array,int size){
    array[size-1]=0;
  }
  public static void main(String[] args) {
    int[] array=new int[10];
    System.out.println("Enter elements of the array:");
    Scanner scanner=new Scanner(System.in);
    int size=5;
    for(int i=0;i<size;i++){
      array[i]=scanner.nextInt();
    }

    System.out.println("Array elements before deletion:");
    for(int i=0;i<size;i++){
      System.out.print(array[i]+"\t");
    }

    DeletionAtEnd obj=new DeletionAtEnd();
    obj.deletion(array,size);
    size--;

    System.out.println("\nArray elements after deleting the last element is");
    for(int i=0;i<size;i++){
      System.out.print(array[i]+"\t");
    }
    scanner.close();
  }
}
