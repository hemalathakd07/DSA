package Insertion;
import java.util.Scanner;

public class insertion {
  void insertAtBeginning(int[] array,int element,int size){
    for(int i=size;i>0;i--){
      array[i]=array[i-1];
    }
    array[0]=element;

  }

  void insertAtEnd(int[] array,int element,int size){
    array[size]=element;
  }

  void insertAtPosition(int[] array,int element,int size,int position){
    for(int i=size;i>position-1;i--){
      array[i]=array[i-1];
    }

    array[position-1]=element;

  }

  void traversal(int[] array,int size){
    for(int i=0;i<size;i++){
      System.out.print(array[i]+"\t");
    }
  }
  public static void main(String[] args) {
    int[] array=new int[10];
    
    int size=5;
    int element=0;

    System.out.println("Enter the elements into array:");
    Scanner scanner=new Scanner(System.in);
    for(int i=0;i<size;i++){
      array[i]=scanner.nextInt();
      
    }
  
    insertion obj=new insertion();
    System.out.println("Array elements before insertion:");
    obj.traversal(array,size);
    obj.insertAtBeginning(array,element,size);
    size++;
    System.out.println("\nArray elements after inserting an element at the beginning");
    obj.traversal(array,size);

    obj.insertAtEnd(array,element,size);
    size++;
    System.out.println("\nArray elements after inserting an element at the end is");
    obj.traversal(array,size);

    int position=3;
    obj.insertAtPosition(array,element,size,position);
    size++;
    System.out.println("\nArray elements after inserting an element at the specific position:");
    obj.traversal(array,size);
        
  }
  
}
