import java.util.Scanner;

public class DeletionAtSpecificPosition {
  void deletion(int[] array,int size,int position){
    for(int i=position-1;i<size-1;i++){
      array[i]=array[i+1];
    }
    array[size-1]=0;

  }
  public static void main(String[] args) {
    DeletionAtSpecificPosition obj=new DeletionAtSpecificPosition();
    int[] array=new int[10];
    System.out.println("Enter the position:");
    Scanner scanner=new Scanner(System.in);
    int position=scanner.nextInt();
    System.out.println("Enter array elements");
    int size=5;
    for(int i=0;i<size;i++){
      array[i]=scanner.nextInt();
    }

    System.out.println("Array elements before deletion:");
    for(int i=0;i<size;i++){
      System.out.print(array[i]+"\t");
    }
    obj.deletion(array,size,position);
    size--;

    System.out.println("\nArray elements after deletion is ");
    for(int i=0;i<size;i++){
      System.out.print(array[i]+"\t");
    }
  }
}
