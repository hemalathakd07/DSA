package Deletion;
import java.util.Scanner;
public class deletion {

  void deleteAtbeginning(int[] array,int size){
    for(int i=0;i<size;i++){
      array[i]=array[i+1];
    }
    array[size-1]=0;
  }

  void deleteAtEnd(int[] array,int size){
    array[size-1]=0;
  }

  void deleteAtSpecificPosition(int[] array,int position,int size){
    for(int i=position-1;i<size;i++){
      array[i]=array[i+1];
    }
  }

  void traversal(int[] array,int size){
    for(int i=0;i<size;i++){
    System.out.print(array[i]+"\t");
  }
}

  public static void main(String[] args) {
    int[] array=new int[10];
    int size=5;
    System.out.println("Enter array elements:");
    Scanner scanner=new Scanner(System.in);
    for(int i=0;i<size;i++){
      array[i]=scanner.nextInt();
    }
  
    deletion obj=new deletion();
    System.out.println("\nArray elements before deletion is");
    obj.traversal(array,size);

    System.out.println("\nArray elements after deleting an element at the beginning");
    obj.deleteAtbeginning(array,size);
    size--;
    obj.traversal(array, size);

    System.out.println("\nArray elements after deleting an element at the end");
    obj.deleteAtEnd(array, size);
    size--;
    obj.traversal(array, size);
    System.out.println("\nArray element after deleting an element at the specific position");
    int position=3;
    obj.deleteAtSpecificPosition(array,position,size);
    size--;
    obj.traversal(array, size);


  }
  
}
